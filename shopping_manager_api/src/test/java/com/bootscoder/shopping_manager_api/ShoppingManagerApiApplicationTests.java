package com.bootscoder.shopping_manager_api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class ShoppingManagerApiApplicationTests {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Test
    void contextLoads() {
        String baizhan = passwordEncoder.encode("baizhan");
        System.out.println(baizhan);
    }

}
