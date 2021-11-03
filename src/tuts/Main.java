package tuts;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Double> grade1 = List.of(1.0, 1.00,1.0,11.0);
//        List<Double> grade2 = List.of(70.0, 88.5,67.0,45.0);
        List<Double> grade3 = List.of(1.0, 1.0,1.0,1.0);


        Student std = new Student(grade1, "Ama", Level.Beginner);
//        Student std1 = new Student(grade2, "Kofi", Level.Advanced);
        Student std2= new Student(grade3, "Esi", Level.Intermediate);
        Student std4= new Student(List.of(1.00, 1.00,1.00), "Jude", Level.Advanced);
        NaughtyStudent nstd = new NaughtyStudent(List.of(20.00,20.00,20.00), "Lays", Level.Beginner);

        System.out.println("Naughty student:" + nstd.getAverageGrade());

        System.out.println(std.getAverageGrade());

        System.out.println("Stream of Grades: "+std.getGradesS());


       Lecture lct = new Lecture();

//       lct.enter(std1);
       lct.enter(std);
       lct.enter(std4);
       lct.enter(std2);
       lct.enter(nstd);

        System.out.println("Stream of Alll: "+lct.averageStudent());



       Double grade = lct.getHighestAverageGrade();
        System.out.println(grade);

//        Generics and Bags of Students and Lecturers



    }
}
