package mission.week2.day1Mission1;

public class Circle extends Shape{
    final static double PI = Math.PI;
    private double radius;
    @Override
    public double calculateRound() {

        return 2*radius*PI;
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius,2)*PI;
    }

    public double calculateDiameter(){
        return 2*radius;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
