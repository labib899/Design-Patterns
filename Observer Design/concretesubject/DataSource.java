package concretesubject;

import java.util.*;
import subject.*;
import observer.Observer;

public class DataSource implements Subject
{
    private int data;
    private List<Observer> observers = new ArrayList<>();

    public int getData() 
    {
        return this.data;
    }

    public void setData(int data) 
    {
        this.data = data;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) 
    {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) 
    {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() 
    {
        for (Observer observer : observers) observer.update();
    }
}
