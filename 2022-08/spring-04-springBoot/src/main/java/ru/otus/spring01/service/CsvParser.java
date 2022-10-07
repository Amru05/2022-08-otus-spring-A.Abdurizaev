package ru.otus.spring01.service;

import java.util.Map;


public interface CsvParser {
    Map<String,String> parseQuestionsFromFile(String fileName);
}
