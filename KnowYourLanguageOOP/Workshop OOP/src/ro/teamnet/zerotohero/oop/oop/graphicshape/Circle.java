package ro.teamnet.zerotohero.oop.oop.graphicshape;

import ro.teamnet.zerotohero.oop.oop.exceptions.MyException;

/**
 * Created by Silviu.Marin on 04-Jul-17.
 */
public class Circle extends Shape {
    private int xPos, yPos, radius;

    public Circle(int xPos, int yPos, int radius) throws MyException {
        this.xPos = xPos;
        this.yPos = yPos;

        if (radius < 0)
            throw new MyException();
        else
            this.radius = radius;

        //this.radius = radius;
    }

    public Circle(int xPos, int yPos) {
        this.xPos = 5;
        this.yPos = 5;
    }

    public Circle(int i) {
        this.xPos = 5;
    }

    public Circle() {
    }

    @Override
    public String toString() {
        return "center = (" + xPos + ", " + yPos + ") and radius = " + radius ;
    }

    @Override
    public double area() {
        double a = 2 * Math.PI * (radius * radius);
        return a;
    }

    public void fillColour(){
        System.out.println("Culoarea este: " + super.color);
    }

    public void fillColour(int param){
        setColor(param);
        System.out.println("Culoarea a fost setata la: " + color);

    }

    public void fillColour(float param){
        setSaturation(param);
        System.out.println("Saturatia a fost setata la: " + saturation);
    }
}
