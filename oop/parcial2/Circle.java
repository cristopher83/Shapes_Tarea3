package oop.parcial2;

public class Circle extends Shape{
    //Constructor
    public Circle(int radio){
        setName("Circle");
        setSidesCount(1);
        setPerimeter((int) (pi*radio/2));
        setArea((int) (pi*(radio^2)/2));
    }
}
