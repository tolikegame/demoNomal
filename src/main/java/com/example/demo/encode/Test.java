package com.example.demo.encode;

//import org.apache.commons.codec.binary.Base32;
import org.jboss.aerogear.security.otp.api.Base32;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Base64;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
//        Base32 base32 = new Base32();
//        System.out.println(base32.encodeAsString("8nz@^W3YP3UKE#ecKFLw".getBytes()));

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String psw = "!qazzaq1";
        String encode = passwordEncoder.encode(psw);
        System.out.println(encode);

        String secret = Base32.random();
        System.out.println(secret);

    }
}
