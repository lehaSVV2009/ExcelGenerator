package com.kadet.memberGenerator.util;

import java.util.Properties;

/**
 * Created by AlexSoroka on 4/19/2015.
 */
public class AppState {

    private static final String FILE_NAME = "FILE_NAME";
    private static final String ROWS_NUMBER = "ROWS_NUMBER";
    private static final String COLUMNS = "COLUMNS";
    private static final String UPDATE = "UPDATE";

    private static final AppState instance = new AppState();

    private AppState() {}

    public static AppState getInstance () {
        return instance;
    }

    public void load (final Properties properties) {
        fileName = properties.getProperty(FILE_NAME);
        rowsNumber = Integer.parseInt(properties.getProperty(ROWS_NUMBER));
        columns = properties.getProperty(COLUMNS);
        loaded = true;
    }

    private static boolean loaded;

    private static String fileName;
    private static int rowsNumber;
    private static String columns;

    public static boolean isLoaded() {
        return loaded;
    }

    public static String getFileName() {
        return fileName;
    }

    public static int getRowsNumber() {
        return rowsNumber;
    }

    public static String getColumns() {
        return columns;
    }
}
