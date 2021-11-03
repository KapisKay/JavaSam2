package tuts;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class test {

    @Test
    public void AverageTest(){

        Student s1 = new Student(List.of(2.00,2.00,2.00),"Kofi", Level.Beginner);
        var expected = 2.00;
        assertEquals(expected,s1.getAverageGrade().doubleValue());
    }

    @Test
    public void HighestAverageTest(){
        Student studentMock = mock(Student.class);
        when(studentMock.getAverageGrade()).thenReturn(5.00);

        Student std=  mock(Student.class);
        when(std.getAverageGrade()).thenReturn(4.00);


        Lecture lt = new Lecture();
        lt.enter(studentMock);
        lt.enter(std);

        assertEquals(5.00,lt.getHighestAverageGrade().doubleValue());

    }

     @Test
    public void NaughtyStudentTest(){
//        Test for type
         Student s = new Student(List.of(2.00,2.00,2.00,2.00), "Ama", Level.Advanced);
         NaughtyStudent ns = new NaughtyStudent(List.of(2.00,2.00,2.00), "Lays", Level.Intermediate);

         assertTrue(ns instanceof Student);

//         Test Average of Naughty Student average is 10% higher
         var expected = 2.00 * 1.1;
         assertEquals(expected, ns.getAverageGrade().doubleValue());

//         Test Naughty Student has High Grade
         assertTrue(ns.getAverageGrade() > s.getAverageGrade());
     }


     @Test
    public void TestGenericType(){
        Bag<Student> s = new Bag<>();

         Student std = new Student(List.of(2.00,2.00,2.00), "sweetie", Level.Intermediate);
         NaughtyStudent nstd = new NaughtyStudent(List.of(2.00,2.00,2.00), "Lippo", Level.Beginner);

        s.addBag(std);
        s.addBag(nstd);

//         Test add functionality
         var expected = 2;
         assertEquals(2, s.getBags().size());

//         Test remove functionality
         s.removeBag(std);
         assertEquals(1, s.getBags().size());

//         Test Clear
         s.clearBag();
         assertEquals(0, s.getBags().size());

     }

     @Test

    public void RegisterTest(){
        List<Student> regS = new ArrayList<>();
         Student std = new Student(List.of(2.00,2.00,2.00), "sweetie", Level.Intermediate);
         NaughtyStudent nstd = new NaughtyStudent(List.of(2.00,2.00,2.00), "Lippo", Level.Beginner);
         regS.add(std);
         regS.add(nstd);

         Register register = new Register(regS);
         register.getRegisteredStudents();
         System.out.println(register.PrintReport());


         assertTrue("Lippo".equals(register.getRegisteredStudents().get(1)));
         assertTrue( 1 == register.getRegisterByLevel(Level.Beginner).size());
     }

}