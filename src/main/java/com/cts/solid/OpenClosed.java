package com.cts.solid;

public class OpenClosed{
	
}

interface Entity {

    public double CalculateBMI();

}

//John entity
class John implements Entity {

    int height;
    int weight;

    public double CalculateBMI() {

          return height/weight;
    }
}

//Jane entity
class Jane implements Entity {

    int height;
    int weight;

    public double CalculateBMI() {

          return height/weight;
    }
}

//Dog entity
class Dog implements Entity {

    int height;
    int weight;

    public double CalculateBMI() {

          return height/weight;
    }
}
