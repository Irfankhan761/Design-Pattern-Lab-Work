package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> Observers = new ArrayList<Observer>();
    private int state;
   public int getState(){
        return state;
    }
    public void setState(int state){
     this.state=state;
        notifyAllObservers();
    }
    public void attach(Observer observer){
    Observers.add(observer);
    }
    public void dettach(Observer observer){
    Observers.remove(observer);
    }
    public void notifyAllObservers(){
    for (Observer observer : Observers){
     observer.update();
     
     } 
    }
}
