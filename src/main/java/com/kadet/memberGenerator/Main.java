package com.kadet.memberGenerator;

import com.kadet.memberGenerator.entity.Member;
import com.kadet.memberGenerator.service.ExcelService;
import com.kadet.memberGenerator.service.Generator;

import java.io.IOException;
import java.util.List;

/**
 * Created by AlexSoroka on 4/17/2015.
 */
public class Main {

    public static void main(String[] args) {
        try {
            List<Member> members = Generator.generateRandomMembers(20);
            new ExcelService().fillExcel("generated.xls", members);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
