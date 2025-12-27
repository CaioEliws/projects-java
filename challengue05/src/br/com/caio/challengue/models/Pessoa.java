package br.com.caio.challengue.models;

import java.util.ArrayList;

public class Pessoa {
    private String name;
    private int age;

    ArrayList<Pessoa> people = new ArrayList<Pessoa>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Pessoa: " + this.name + " (Idade: " + this.age + ")";
    }
}
