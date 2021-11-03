package tuts;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Register {

    private List<Student> students;

    public Register(List<Student> students) {
        this.students = students;
    }

    public List<String> getRegisteredStudents(){

//       Better Implementation using Streams
//        List <String> registeredStudents = new ArrayList<>();
//       for(Nameable name: names ){
//           registeredStudents.add(name.getName());
//       }

//        Streams
        List <String> registeredStudents = students.stream().map(Student::getName).collect(Collectors.toList());

       return registeredStudents;
    }

    public List<String> getRegisterByLevel(Level level){
        List<String> studentLevel = students.stream().filter(name->name.getLevel() == level)
                .map(nameable -> nameable.getName()).collect(Collectors.toList());
        return studentLevel;
    }

    public String PrintReport(){
        String s = students.stream().collect(groupingBy(Nameable::getLevel)).toString();
        return s;
                
    }



}
