import concretesubject.*;
import concreteobserver.*;
import subject.*;
import observer.*;

public class Sample 
{
    public static void main(String[] args) 
    {
        DataSource dataSource = new DataSource();

        SpreadSheet spreadsheet = new SpreadSheet(dataSource);
        BarChart barChart = new BarChart(dataSource);

        dataSource.setData(19);
        dataSource.setData(22);
    }
}