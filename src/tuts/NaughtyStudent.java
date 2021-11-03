package tuts;

import java.util.List;

public class NaughtyStudent extends Student{

    public NaughtyStudent(List<Double> grades, String name, Level level) {
        super(grades, name, level);
    }


    @Override
    public List<Double> getGrades() {
        return super.getGrades();
    }

    @Override
    public Double getAverageGrade() {
        return super.getAverageGrade() * 1.1  ;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
