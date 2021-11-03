package tuts;

import java.util.LinkedList;

public class BagOfLecturers {

    private LinkedList<Lecture> bagLecturer ;

    public BagOfLecturers() {
        bagLecturer = new LinkedList<>();
    }

    public void addLecturer(Lecture lecturer){
        this.bagLecturer.add(lecturer);
    }

    public void removeLecturer(Lecture lecturer){
        this.bagLecturer.remove(lecturer);
    }

    public void clearLecturer(){
        this.bagLecturer.clear();
    }
}
