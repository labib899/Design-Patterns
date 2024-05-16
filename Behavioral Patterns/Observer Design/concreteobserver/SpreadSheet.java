package concreteobserver;

import observer.*;
import concretesubject.DataSource;

public class SpreadSheet implements Observer
{
    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) 
    {
        this.dataSource = dataSource;
        dataSource.addObserver(this);
    }

    @Override
    public void update() 
    {
        System.out.println("Spreadsheet updated: " + dataSource.getData());
    }
}
