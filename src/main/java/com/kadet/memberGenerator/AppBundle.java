package com.kadet.memberGenerator;

import com.kadet.memberGenerator.generator.Generator;
import com.kadet.memberGenerator.parser.ColumnsParser;
import com.kadet.memberGenerator.service.ExcelService;
import com.kadet.memberGenerator.service.GeneratorService;
import com.kadet.memberGenerator.util.AppState;
import com.kadet.memberGenerator.util.Constants;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

/**
 * Created by AlexSoroka on 4/19/2015.
 */
public class AppBundle {

    public static void initState () throws IOException {
        Properties properties = new Properties();
        properties.load(Main.class.getResourceAsStream(Constants.CONFIG_PATH));
        AppState.getInstance().load(properties);
    }

    public static void start () throws IOException {
        if (!AppState.isLoaded()) {
            throw new IOException("Application State was not loaded!");
        }
        GeneratorService generatorService = new GeneratorService();
        ExcelService excelService = new ExcelService();

        List<Generator> generators = ColumnsParser.parse(AppState.getColumns());
        List<List<String>> rowValues = generatorService.runGenerators(generators, AppState.getRowsNumber());
        excelService.fillExcel(AppState.getFileName(), rowValues);
    }


}
