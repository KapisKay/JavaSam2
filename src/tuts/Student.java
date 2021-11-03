package tuts;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Student implements Nameable{
    private List<Double> grades;
    private String name;
    private Level level;

    public List<Double> getGrades() {
        return grades;
    }

    public DoubleStream getGradesS(){
         return grades.stream().mapToDouble(g->g);

    }

    public OptionalDouble highestGrades(){
        return grades.stream().mapToDouble(g->g).max();
    }


    public Student(List<Double> grades, String name, Level level) {
        this.grades = grades;
        this.name = name;
        this.level = level;
    }

    public Double getAverageGrade(){
        return grades.stream().mapToDouble(g->g).average().getAsDouble();
    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + grades +
                '}';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Level getLevel() {
        return level;
    }
}
