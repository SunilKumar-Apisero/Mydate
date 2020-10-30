


import java.util.*;
class MyDate
{
 private int day,month,year;
MyDate()
{
day=20; month=10;year=2020;
}
MyDate(int d,int m,int y)
{
day=d; month=m;year=y;
}
void display()
{
System.out.println(day+"/"+month+"/"+year);
}

public static void main(String args[])
{

MyDate d=new MyDate();
MyDate d1=new MyDate(19,10,2020);
d.display();
d1.display();
}
}
