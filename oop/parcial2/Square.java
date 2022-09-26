package oop.parcial2;

public class Square extends  Shape {
    //Constructor
    public Square(int side){
        setName("Square");
        setSidesCount(4);
        setPerimeter(side+side+side+side);
        setArea(2*side);
    }


}
