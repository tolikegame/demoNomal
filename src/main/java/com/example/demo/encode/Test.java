package com.example.demo.encode;

//import org.apache.commons.codec.binary.Base32;
import org.jboss.aerogear.security.otp.api.Base32;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
//        Base32 base32 = new Base32();
//        System.out.println(base32.encodeAsString("8nz@^W3YP3UKE#ecKFLw".getBytes()));

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String psw = "tgfc045";
        String encode = passwordEncoder.encode(psw);
        System.out.println("BCrypt==>"+encode);

        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        String password = "tgfc045";
        String encoder2 = encoder.encode(password);
        System.out.println("BCrypt==>"+encoder2);


        String secret = Base32.random();
        System.out.println("Base32==>"+secret);

        final Base64.Decoder decoder64 = Base64.getDecoder();
        final Base64.Encoder encoder64 = Base64.getEncoder();
        final String text = "字串文字";
        byte[] textByte = new byte[0];
        try {
            textByte = text.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
//編碼
        final String encodedText = encoder64.encodeToString(textByte);
        System.out.println("Base64==>"+encodedText);
//解碼
        try {
            System.out.println("Base64解碼==>"+new String(decoder64.decode(encodedText), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
