package com.kadet.memberGenerator.parser;

import com.kadet.memberGenerator.generator.Generator;
import com.kadet.memberGenerator.generator.GeneratorFactory;
import com.kadet.memberGenerator.util.GeneratorUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by AlexSoroka on 4/19/2015.
 */
public class ColumnsParser {

    public static List<Generator> parse (String columnsText) {
        List<Generator> generators = new ArrayList<Generator>();
        List<String> columns = Arrays.asList(columnsText.split(", "));
        columns = GeneratorUtil.trimList(columns);
        for (String column : columns) {
            generators.add(GeneratorFactory.createGenerator(column));
        }
        return generators;
    }

}
