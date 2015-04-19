package com.kadet.memberGenerator.service;

import com.kadet.memberGenerator.entity.Member;
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

    private FileOutputStream getOrCreateOutputStream(String path) throws IOException {
        File yourFile = new File(path);
        if(!yourFile.exists()) {
            yourFile.createNewFile();
        }
        return new FileOutputStream(yourFile);
    }

    public void fillExcel (String excelPath, List<Member> members) throws IOException {
        FileOutputStream outputStream = getOrCreateOutputStream(excelPath);
        Workbook workbook = new HSSFWorkbook();
        fillWorkbook(workbook, members);
        workbook.write(outputStream);
        outputStream.close();
    }

    private void fillWorkbook (Workbook workbook, List<Member> members) {
        Sheet sheet = workbook.createSheet();
        for (int i = 0; i < members.size(); ++i) {
            fillRowByMember(sheet.createRow(i), members.get(i));
        }
    }

    private Row fillRowByMember(Row row, Member member) {
        row.createCell(0).setCellValue(member.getFirstName());
        row.createCell(1).setCellValue(member.getLastName());
        row.createCell(2).setCellValue(member.getTitle());
        row.createCell(3).setCellValue(member.getCompany());
        row.createCell(4).setCellValue(member.getEmail());
        row.createCell(5).setCellValue(member.getPhone());
        row.createCell(6).setCellValue(member.getMobile());
        row.createCell(7).setCellValue(member.getRole());
        return row;
    }


}
