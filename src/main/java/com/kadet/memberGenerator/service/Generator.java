package com.kadet.memberGenerator.service;

import com.kadet.memberGenerator.entity.Member;
import com.kadet.memberGenerator.util.Constants;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by AlexSoroka on 4/17/2015.
 */
public class Generator {

    private final static Random random = new Random();

    public static List<Member> generateRandomMembers (int count) {
        List<Member> members = new ArrayList<Member>();
        while (count-- > 0) {
            members.add(generateRandomMember());
        }
        return members;
    }

    public static Member generateRandomMember () {
        return new Member(
                generateText(),
                generateText(),
                generateText(),
                generateText(),
                generateEmail(),
                generateText(),
                generateText(),
                generateRole(),
                generateGroups()
        );
    }

    public static String generateEmail () {
        return generateText() + "@" + getRandomValueFromList(Constants.mails);
    }

    public static String generateText () {
        return RandomStringUtils.randomAlphanumeric(random.nextInt(20));
    }

    public static String generateRole () {
        return getRandomValueFromList(Constants.roles);
    }

    public static String getRandomValueFromList(List<String> list) {
        return list.get(random.nextInt(list.size()));
    }

    public static List<String> generateGroups () {
        List<String> groups = new ArrayList<String>();
        int randomSize = random.nextInt(5);
        while (randomSize-- > 0) {
            groups.add(generateText());
        }
        return groups;
    }

}
