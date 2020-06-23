package com.study.ladder.sample;

/**
 * 引进的包都是Java自带的jar包
 * 秘钥相关包
 * base64 编解码
 * 这里只用到了编码
 */

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.util.StringUtils;

import javax.crypto.Cipher;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

/**
 * @author suxin
 * @since 2020-06-05
 */
public class RsaHelper {

    private static final String ENCODING = "UTF-8";
    private static final String ALGORITHM = "RSA";
    private static final String PUBLIC_KEY = "RSAPublicKey";
    private static final String PRIVATE_KEY = "RSAPrivateKey";

    /**
     * 获得公钥
     *
     * @param keyMap keyMap
     * @return String
     */
    public static String getPublicKey(Map<String, Key> keyMap) {
        //获得map中的公钥对象 转为key对象
        Key key = keyMap.get(PUBLIC_KEY);
        //编码返回字符串
        return Base64Helper.encode(key.getEncoded());
    }

    /**
     * 获得私钥
     *
     * @param keyMap keyMap
     * @return String
     */
    public static String getPrivateKey(Map<String, Key> keyMap) {
        //获得map中的私钥对象 转为key对象
        Key key = keyMap.get(PRIVATE_KEY);
        //编码返回字符串
        return Base64Helper.encode(key.getEncoded());
    }

    /**
     * map对象中存放公私钥
     *
     * @return Map<String, Key>
     * @throws Exception 异常
     */
    public static Map<String, Key> initKey() throws Exception {
        //获得对象 KeyPairGenerator 参数 RSA 1024个字节
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance(ALGORITHM);
        keyPairGen.initialize(512, new SecureRandom());
        //通过对象 KeyPairGenerator 获取对象KeyPair
        KeyPair keyPair = keyPairGen.generateKeyPair();
        //通过对象 KeyPair 获取RSA公私钥对象RSAPublicKey RSAPrivateKey
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
        //公私钥对象存入map中
        Map<String, Key> keyMap = new HashMap<>(2);
        keyMap.put(PUBLIC_KEY, publicKey);
        keyMap.put(PRIVATE_KEY, privateKey);

        return keyMap;
    }

    /**
     * RSA公钥加密
     *
     * @param value     加密字符串
     * @param publicKey 公钥
     * @return 密文
     * @throws Exception 加密过程中的异常信息
     */
    public static String encrypt(String value, String publicKey) throws Exception {
        //base64编码的公钥
        byte[] decoded = Base64Helper.decode(publicKey);
        Key pubKey = KeyFactory.getInstance(ALGORITHM).generatePublic(new X509EncodedKeySpec(decoded));
        //RSA加密
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, pubKey);
        return Base64Helper.encode(cipher.doFinal(value.getBytes(ENCODING)));
    }

    /**
     * RSA私钥解密
     *
     * @param value      加密字符串
     * @param privateKey 私钥
     * @return 铭文
     * @throws Exception 解密过程中的异常信息
     */
    public static String decrypt(String value, String privateKey) throws Exception {
        //64位解码加密后的字符串
        byte[] inputByte = Base64Helper.decode(new String(value.getBytes(ENCODING)));
        //base64编码的私钥
        byte[] decoded = Base64Helper.decode(privateKey);
        Key priKey = KeyFactory.getInstance(ALGORITHM).generatePrivate(new PKCS8EncodedKeySpec(decoded));
        //RSA解密
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, priKey);
        return new String(cipher.doFinal(inputByte));
    }

    public static void main(String[] args) {
        // Map<String, Key> keyMap;
        // try {
        //     keyMap = initKey();
        //     String publicKey = getPublicKey(keyMap);
        //     String a = encrypt("「tetststsatasta}", publicKey);
        //     System.out.println("+++++++++" + a);
        //     String privateKey = getPrivateKey(keyMap);
        //     System.out.println("------------" + decrypt(a, privateKey));
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        JSONObject json = new JSONObject();
        try {
            json.put("code", 1);

            System.out.println("1".equals(json.getString("code")));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}