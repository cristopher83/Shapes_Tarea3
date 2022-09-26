package oop.parcial2;

public class Rectangle extends Shape{
    //Constructor
    public Rectangle(int base,int height){
        setName("Rectangle");
        setSidesCount(4);
        setPerimeter(base+base+height+height);
        setArea(base*height);
    }
}
