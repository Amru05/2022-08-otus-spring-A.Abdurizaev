package ru.otus.spring01.controller;


public interface Messenger {

    String askQuestion(String question);

    void textMessage(String message);

    void close();
}
