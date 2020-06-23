package com.study.ladder.sample;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 用MD5加密字符串
 *
 * @author LuoGang
 * @since 2020-06-05
 */
public class Md5Helper {
    /**
     * MD5加密算法
     */
    private static final String ALGORITHM = "MD5";

    /**
     * 对字符串进行MD5加密
     *
     * @param text     明文
     * @param encoding 明文使用的编码
     * @return 密文
     */
    public static String encode(String text, String encoding) {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance(ALGORITHM);
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
        }
        text = text == null ? "" : text;
        try {
            md5.update(isEmpty(encoding) ? text.getBytes() : text.getBytes(encoding));
        } catch (UnsupportedEncodingException e) {
            md5.update(text.getBytes());
        }

        byte[] bytes = md5.digest();

        return toHexString(bytes);
    }

    /**
     * 将bytes数组转换为16进制字符串，每个byte数字仅保留2位数字
     *
     * @param bytes bytes
     * @return String
     */
    public static String toHexString(byte[] bytes) {
        StringBuilder buffer = new StringBuilder();
        for (byte b : bytes) {
            buffer.append(toHexString(b));
        }
        return buffer.toString();
    }

    /**
     * 将byte数字b转换为16进制数字,注意byte数字仅保留2位数字
     *
     * @param value value
     * @return String
     */
    public static String toHexString(byte value) {
        String text = Integer.toHexString(value & 0xFF);
        return prefix(text, 2, "0");
    }

    /**
     * 判断字符串是否为null或空,如果为全空白字符串，此方法也返回true
     *
     * @param value value
     * @return boolean
     */
    public static boolean isEmpty(String value) {
        return value == null || "".equals(value);
    }

    /**
     * 将str转为固定长度的字符串,字符串的截取和添加都是在字符串头部进行
     *
     * @param value  value
     * @param length length
     * @param ch     如果小于固定长度,则在字符串头部添加ch字符直到满足长度为止
     * @return String
     */
    public static String prefix(String value, int length, String ch) {
        if (value.length() < length) {
            value = copy(ch, (int) Math.ceil((length - value.length()) / ch.length())) + value;
        }
        if (value.length() > length) {
            value = value.substring(value.length() - length, value.length());
        }
        return value;
    }

    /**
     * 复制value对象times次
     *
     * @param value 被复制的对象，如果为null或空字符串则仅返回空字符串
     * @param times times
     * @return String
     */
    public static String copy(Object value, int times) {
        // 复制0次则返回空
        if (times <= 0) {
            return "";
        }
        // value为null返回空
        if (value == null) {
            return "";
        }
        // value为空字符串返回空
        if (value instanceof String && ((String) value).length() == 0) {
            return "";
        }

        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < times; i++) {
            buffer.append(value);
        }

        return buffer.toString();
    }
}
