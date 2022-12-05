package ru.otus.spring01.service;

import ru.otus.spring01.model.TestResult;

import java.util.List;


public interface Tester {

    void testStudents();

    void close();

    List<TestResult> getTestResults();
}
