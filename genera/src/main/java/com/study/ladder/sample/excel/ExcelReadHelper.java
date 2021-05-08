package com.study.ladder.sample.excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Excel 读操作类
 *
 * @author suxin
 * @since 2020-07-30
 */
class ExcelReadHelper {

    /**
     * 2003版 excel
     */
    private final String excel2003 = "xls";

    /**
     * 2007及以后版本 excel
     */
    private final String excel2007 = "xlsx";

    /**
     * 配置
     */
    private ExcelReadConfig excelReadConfig;

    private ExcelReadHelper(ExcelReadConfig excelReadConfig) {

        this.excelReadConfig = excelReadConfig;
    }

    /**
     * 根据文件名创建 Workbook
     *
     * @return 类型相关的 Workbook
     */
    protected Workbook createWorkbook() throws IOException {
        // 默认最后一个 . 不存在
        int lastPosDot;
        String dot = ".";
        // 后缀
        String suffix;
        // 获取文件名后缀
        String fileName = excelReadConfig.getFileName();
        if (fileName != null && (lastPosDot = fileName.lastIndexOf(dot)) > 0) {
            suffix = fileName.substring(lastPosDot);
        } else {
            System.out.println("文件名格式错误！");
            return null;
        }
        // 根据文件名创建 Workbook
        InputStream excelStream = excelReadConfig.getExcelStream();
        Workbook workbook = null;
        if (suffix.equalsIgnoreCase(excel2003)) {
            workbook = new HSSFWorkbook(excelStream);
        } else if (suffix.equalsIgnoreCase(excel2007)) {
            workbook = new XSSFWorkbook(excelStream);
        }

        return workbook;
    }

    protected static <T> T readExcelHeader(ExcelReadConfig excelReadConfig, T cla) {

        return null;
    }

    protected static <T> List<T> readExcelBody(ExcelReadConfig excelReadConfig, T cla) {

        return null;
    }
}
