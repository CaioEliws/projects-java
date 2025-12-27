package br.com.caio.challengue.models;

public class Aluno {
    private String name;
    private float grades;
    int totalGrades;

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(float grades) {
        this.grades += grades;
        totalGrades++;
    }

    public String getName() {
        return name;
    }

    public float getGrades() {
        return grades;
    }

    public float average() {
        return grades / totalGrades;
    }
}
