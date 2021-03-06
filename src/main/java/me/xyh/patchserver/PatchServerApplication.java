package me.xyh.patchserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("me.xyh.patchserver.*.mapper")
public class PatchServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatchServerApplication.class, args);
    }

}
