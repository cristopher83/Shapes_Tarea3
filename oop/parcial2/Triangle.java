package oop.parcial2;

public class Triangle extends Shape{
    //Constructor
    public Triangle(int base, int height){
        setName("Triangle");
        setSidesCount(3);
        setPerimeter(base+base+base);
        setArea(base*height/2);
    }
}
