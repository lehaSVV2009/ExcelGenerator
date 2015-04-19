package com.kadet.memberGenerator.generator;

import com.kadet.memberGenerator.util.Constants;
import com.kadet.memberGenerator.util.GeneratorUtil;

import java.util.List;
import java.util.Random;

/**
 * Created by AlexSoroka on 4/19/2015.
 */
public class EmailGenerator implements Generator {

    @Override
    public String generate() {
        return GeneratorUtil.generateEmail();
    }


}
