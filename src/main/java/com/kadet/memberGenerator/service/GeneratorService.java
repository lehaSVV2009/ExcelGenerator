package com.kadet.memberGenerator.service;

import com.kadet.memberGenerator.generator.Generator;
import com.kadet.memberGenerator.util.AppState;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AlexSoroka on 4/19/2015.
 */
public class GeneratorService {

    public List<List<String>> runGenerators (List<Generator> generators, int rowsNumber) {
        List<List<String>> rowValues = new ArrayList<List<String>>();
        for (int i = 0; i < rowsNumber; ++i) {
            List<String> cellValues = new ArrayList<String>();
            for (Generator generator : generators) {
                cellValues.add(generator.generate());
            }
            rowValues.add(cellValues);
        }
        return rowValues;
    }

}
