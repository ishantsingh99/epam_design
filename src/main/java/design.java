import java.util.ArrayList;
import java.util.List;
/*MEDIATOR PATTERN*/
class aa
{
    int no;
    aa(int num)
    {
        no=num;
    }
    protected void print()
    {
        System.out.println("HI this is"+no);
    }
}
class bb extends aa
{
    bb(int num)
    {
        super(num);
    }
}
/*ABSTRACT FACTORY METHOD*/
interface ComputerAbstractFactory
{
    Computer createComputer();
}
class PcFactory implements ComputerAbstractFactory
{
    String ram;
    PcFactory(String r)
    {
        ram=r;
    }

    @Override
    public Computer createComputer() {
        return new Pc(ram);
    }
}
abstract class Computer
{
    public abstract String getRam();
}
class Pc extends Computer
{
    String ram;
    Pc(String r)
    {
        ram=r;
    }
    public String getRam()
    {
        return ram;
    }
}
/*COMPOSITE*/ /*AND*/ /*TEMPLATE METHOD*/
interface Shape
{
    void draw(String color);
}
class Triangle implements Shape
{
    @Override
    public void draw(String color) {
        System.out.println("Color in Triangle is:-"+color);
    }
}
class Circle implements Shape
{
    @Override
    public void draw(String color) {
        System.out.println("Color in Circle is:-"+color);
    }
}
class Drawing implements Shape
{
    List<Shape> shapeList=new ArrayList<Shape>();

    @Override
    public void draw(String color) {
        for (Shape sh: shapeList)
        {
            sh.draw("Red");
        }
    }
}
class Color
{
    String co()
    {
        return "red";
    }
}
/*SINGLETON METHOD*/
public class design
{
    public static final design design=new design();
    private design()
    {}
    public static design DesignInstance()
    {
        return design;
    }
    public static void main(String args[])
    {
        Drawing draw=new Drawing();
        Color column=new Color();
        draw.draw(column.co());//BRIDGE METHOD
        bb abc=new bb(5);
        abc.print();
    }
}
