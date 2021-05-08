package com.study.ladder.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/**
 * 压缩包工具测试
 *
 * @author suxin
 * @since 2020-07-02
 */
public class ZipHelper {


    public static void main(String[] args) {

        try {
            File zipFile = new File("/Users/suxin/Desktop/测试压缩.zip");
            if (!zipFile.exists()) {
                boolean isSuccess = zipFile.createNewFile();
                if (!isSuccess) {
                    System.out.println("创建压缩文件失败！");
                    return;
                }
            }
            ZipOutputStream zos = null;
            FileOutputStream out = null;
            out = new FileOutputStream(zipFile);
            zos = new ZipOutputStream(out);
            byte[] buf = new byte[1024 * 1024 * 10];
            File srcFile = new File("/Users/suxin/Desktop/测试压缩/数据质量监控_20190903_v1.xmind");
            zos.putNextEntry(new ZipEntry(srcFile.getName()));
            int len;
            FileInputStream in = new FileInputStream(srcFile);
            while ((len = in.read(buf)) != -1) {
                zos.write(buf, 0, len);
            }
            zos.setComment("我是注释");
            in.close();
            zos.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
