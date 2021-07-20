package com.company;

import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private String name;

    public Person(int id,String name){
        this.name = name;
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public String toString(){
        return id + " : " + name;
    }
}


