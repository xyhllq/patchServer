package me.xyh.patchserver.exception;

/**
 * Created by: xuyuhang
 * Created time:    2021/6/14 15:18
 * Description:
 */
public class JacksonException extends FormativeException{
    private static final long serialVersionUID = -7699177038668159397L;

    public JacksonException() {
        super();
    }

    public JacksonException(String message) {
        super(message);
    }

    public JacksonException(Throwable cause) {
        super(cause);
    }

    public JacksonException(String format, Object... arguments) {
        super(format, arguments);
    }
}
