package tuts;

import java.util.LinkedList;

public class BagOfStudents {
    private LinkedList <Student> bagStudent;

    public BagOfStudents() {
        bagStudent = new LinkedList<>();
    }

    public void addBag(Student student){
       this.bagStudent.add(student);
    }

    public void removeBag(Student student){
        this.bagStudent.remove(student);
    }

    public void clearBag(){
        this.bagStudent.clear();
    }
}
