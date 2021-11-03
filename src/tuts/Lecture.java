package tuts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lecture {
    private List<Student> students;

    public Lecture(){
        this.students = new ArrayList<>();
    }

    public Double averageStudent(){
//        var highest = students.stream().map(student->student.getGrades())
//                .flatMap(Collection::stream).collect(Collectors.toList());
//        return highest.stream().mapToDouble(g->g).average().getAsDouble();
        return students.stream()
                .map(student->student.getGrades())
                .flatMap(Collection::stream)
                .mapToDouble(g->g)
                .average()
                .getAsDouble();
    }

    public void  enter (Student student){
        this.students.add(student);
    }

    public Double getHighestAverageGrade(){
        return  students.stream().mapToDouble(s->s.getAverageGrade()).max().getAsDouble();
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "students=" + students +
                '}';
    }
}
