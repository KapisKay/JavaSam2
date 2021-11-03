package tuts;

import java.util.LinkedList;

public class  Bag <T> {

    private LinkedList<T> bags;

    public LinkedList<T> getBags() {
        return bags;
    }

    public Bag() {
        bags = new LinkedList<>();
    }


    public void addBag(T t){
        this.bags.add(t);
    }
    public void removeBag(T t){
        this.bags.remove(t);
    }
    public void clearBag(){
        this.bags.remove();
    }


}
