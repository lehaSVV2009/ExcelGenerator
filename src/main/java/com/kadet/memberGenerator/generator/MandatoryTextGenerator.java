package com.kadet.memberGenerator.generator;

import com.kadet.memberGenerator.util.GeneratorUtil;

/**
 * Created by AlexSoroka on 4/19/2015.
 */
public class MandatoryTextGenerator extends TextGenerator {

    @Override
    public String generate() {
        return GeneratorUtil.generateMandatoryText();
    }
    
}
