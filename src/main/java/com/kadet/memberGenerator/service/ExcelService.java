package com.kadet.memberGenerator.service;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by AlexSoroka on 4/17/2015.
 */
public class ExcelService {

    public void fillExcel (String excelPath, List<List<String>> values) throws IOException {
        FileOutputStream outputStream = getOrCreateOutputStream(excelPath);
        Workbook workbook = new HSSFWorkbook();
        fillWorkbook(workbook, values);
        workbook.write(outputStream);
        outputStream.close();
    }

    private FileOutputStream getOrCreateOutputStream(String path) throws IOException {
        File yourFile = new File(path);
        if(!yourFile.exists()) {
            yourFile.createNewFile();
        }
        return new FileOutputStream(yourFile);
    }

    private void fillWorkbook (Workbook workbook, List<List<String>> values) {
        Sheet sheet = workbook.createSheet();
        for (int i = 0; i < values.size(); ++i) {
            fillRowByValues(sheet.createRow(i), values.get(i));
        }
    }

    private Row fillRowByValues(Row row, List<String> values) {
        for (int i = 0; i < values.size(); ++i) {
            row.createCell(i).setCellValue(values.get(i));
        }
        return row;
    }


}
