package concreteobserver;

import observer.*;
import concretesubject.*;

public class BarChart implements Observer
{
    private DataSource dataSource;

    public BarChart(DataSource dataSource) 
    {
        this.dataSource = dataSource;
        dataSource.addObserver(this);
    }

    @Override
    public void update() 
    {
        System.out.println("Bar Chart updated: " + dataSource.getData());
    }
}
