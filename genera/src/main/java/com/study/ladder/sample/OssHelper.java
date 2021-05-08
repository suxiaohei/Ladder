package com.study.ladder.sample;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;

import java.io.File;

/**
 * 阿里云oss上传下载文件支持
 *
 * @author mingfangxu
 * @date 2020年2月10日
 */
public class OssHelper {

    // OSS 测试地址
    private static String endpoint = "http://oss-cn-shanghai-finance-1-pub.aliyuncs.com";
    // accessKeyId和accessKeySecret是OSS的访问密钥
    private static String accessKeyIdTest = "LTAI4FnTu5zAQu7C8KaANjPq";
    private static String accessKeySecretTest = "YN1kZWMtqkOi3j6P0ZSlraWBF0KF3g";

    public static void main(String[] args) {
        ossUpload();
//		ossDownload();
    }

    public static void ossUpload() {
        String bucketName = "hn-fcoss-pub";
        // <yourObjectName>上传文件到OSS时需要指定包含文件后缀在内的完整路径，例如abc/efg/123.jpg。
        String filePath = "/Users/suxin/Documents/需求/华农-码上保/insured2714.xlsx";
        String objectName = "fcchannel-test/baozhunniu/2020/06/24/BZN202005281101.xlsx";
        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyIdTest, accessKeySecretTest);

        // 上传内容到指定的存储空间（bucketName）并保存为指定的文件名称（objectName）。
        ossClient.putObject(bucketName, objectName, new File(filePath));

        // 关闭OSSClient。
        ossClient.shutdown();
    }
}
