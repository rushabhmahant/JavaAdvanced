package com.cts.solid;

public class InterfaceSeggregation {

}

interface Teacher {

    void Teach();

}

interface ScienceTeacher extends Teacher {

    void Science();

}

interface EnglishTeacher extends Teacher {

    void English();

}

interface FrenchTeacher extends Teacher {

    void French();

}