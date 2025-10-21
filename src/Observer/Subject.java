package Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Subject {
    private List<Observer> lista;

    public Subject() {
        lista = new ArrayList<Observer>();
    }

    public void addObserver(Observer o) {
        lista.add(o);
    }
    public void removeObserver(Observer o) {
        lista.remove(o);
    }
    public void notifyObservers() {
        Iterator<Observer> itmalia = lista.iterator();
        while (itmalia.hasNext()) {
            Observer o = itmalia.next();
            o.update(this);
        }
    }
}