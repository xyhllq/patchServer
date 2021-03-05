package me.xyh.patchserver;

import com.alibaba.druid.filter.config.ConfigTools;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PatchServerApplicationTests {

    @Test
    void contextLoads() throws Exception {
        String pasword = "123456789";
        ConfigTools.main(new String[]{pasword});


    }
}
