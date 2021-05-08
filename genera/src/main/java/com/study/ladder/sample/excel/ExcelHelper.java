package com.study.ladder.sample.excel;

import java.util.Collections;
import java.util.List;

/**
 * Excel 写操作配置类
 *
 * @author suxin
 * @since 2020-07-30
 */
public class ExcelHelper {

    /**
     * 读取 Excel
     *
     * @param excelReadConfig excelReadConfig
     */
    public <T> List<T> readExcel(ExcelReadConfig excelReadConfig, Class<T> cls) {
        // ExcelReadHelper.readExcelBody(excelReadConfig, cls);

        return Collections.emptyList();
    }

    /**
     * 修改 Excel
     *
     * @param excelReadConfig excelReadConfig
     */
    public boolean modifyExcel(ExcelReadConfig excelReadConfig) {

        return true;
    }

    /**
     * 写 Excel
     *
     * @param excelWriteConfig excelWriteConfig
     */
    public boolean writeExcel(ExcelWriteConfig excelWriteConfig) {

        return true;
    }
}
