package com.study.ladder.sample;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * 使用BASE64对字符串的加解密
 *
 * @author suxin
 * @since 2020-06-05
 */
public class Base64Helper {

    /**
     * 将byte数组编码为字符串
     *
     * @param bytes bytes
     * @return String
     */
    public static String encode(byte[] bytes) {

        return new BASE64Encoder().encodeBuffer(bytes);
    }

    /**
     * 将字符串还原为byte数组
     *
     * @param text text
     * @return byte[]
     */
    public static byte[] decode(String text) {
        try {
            return new BASE64Decoder().decodeBuffer(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
