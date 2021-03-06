package me.xyh.patchserver.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by: xuyuhang
 * Created time:    2021/6/14 15:18
 * Description:
 */
public class FormativeException extends RuntimeException{
    private static final long serialVersionUID = -4643863306854932474L;
    private int[] indices;
    private int usedCount;
    private String message;
    private transient Throwable throwable;

    public FormativeException() {
        super();
    }

    public FormativeException(String message) {
        this.message = message;
    }

    public FormativeException(Throwable cause) {
        this.throwable = cause;
        this.message = getStackTrace(throwable);
    }

    public FormativeException(String format, Object... arguments) {
        init(format, arguments);
        fillInStackTrace();
        this.message = formatMessage(format, arguments);
        if (throwable != null) {
            this.message += System.lineSeparator() + getStackTrace(throwable);
        }
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        String s = getClass().getName();
        String message = getMessage();
        return (message != null) ? (s + ": " + message) : s;
    }

    private static String getStackTrace(final Throwable throwable) {
        final StringWriter sw = new StringWriter();
        final PrintWriter pw = new PrintWriter(sw, true);
        throwable.printStackTrace(pw);
        return sw.getBuffer().toString();
    }

    private void init(String format, Object... arguments) {
        final int len = Math.max(1, format == null ? 0 : format.length() >> 1); // divide by 2
        this.indices = new int[len]; // LOG4J2-1542 ensure non-zero array length
        final int placeholders = ParameterFormatter.countArgumentPlaceholders2(format, indices);
        initThrowable(arguments, placeholders);
        this.usedCount = Math.min(placeholders, arguments == null ? 0 : arguments.length);
    }

    private void initThrowable(final Object[] params, final int usedParams) {
        if (params != null) {
            final int argCount = params.length;
            if (usedParams < argCount && this.throwable == null && params[argCount - 1] instanceof Throwable) {
                this.throwable = (Throwable) params[argCount - 1];
            }
        }
    }

    private String formatMessage(String format, Object... arguments) {
        StringBuilder stringBuilder = new StringBuilder();
        if (indices[0] < 0) {
            ParameterFormatter.formatMessage(stringBuilder, format, arguments, usedCount);
        } else {
            ParameterFormatter.formatMessage2(stringBuilder, format, arguments, usedCount, indices);
        }
        return stringBuilder.toString();
    }
}
