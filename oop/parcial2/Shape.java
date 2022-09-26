package oop.parcial2;

public class Shape {

    //Only for Circle use
    protected double pi = 3.1416;
    private String name;
    private int sidesCount;
    private double perimeter;
    private double area;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSidesCount() {
        return sidesCount;
    }

    public void setSidesCount(int sidesCount) {
        this.sidesCount = sidesCount;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
