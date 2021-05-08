package com.study.ladder.sample.excel;

import java.io.InputStream;

/**
 * Excel 读操作配置类
 *
 * @author suxin
 * @since 2020-07-30
 */
public class ExcelReadConfig {

    /**
     * 读取模式
     *
     * @see com.study.ladder.sample.excel.ExcelReadConfig.ExcelReadModel
     */
    private ExcelReadModel readModel = ExcelReadModel.DEFAULT;

    /**
     * 文件名
     */
    private String fileName;

    /**
     * 文件流
     */
    private InputStream excelStream;

    public ExcelReadModel getReadModel() {
        return readModel;
    }

    public void setReadModel(ExcelReadModel readModel) {
        this.readModel = readModel;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public InputStream getExcelStream() {
        return excelStream;
    }

    public void setExcelStream(InputStream excelStream) {
        this.excelStream = excelStream;
    }

    /**
     * Excel读取模式
     */
    public enum ExcelReadModel {

        /**
         * 默认
         */
        DEFAULT,

        /**
         * 物理存在模式
         */
        PHYSICS;
    }

}
