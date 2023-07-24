package mission.day5.mission2;

public class Circle extends Shape{
    private static final double PI = 3.14;
    private double r;

    @Override
    public double getArea() {
        double result = Math.pow(this.r,2)*(PI);
        return result;
    }

    protected void printCircleInfo() {
        super.printInfo();
        System.out.println("원의 반지름: " + this.r);
    }

    public Circle(String color, double r){
        super(color);
        this.r = r;
    }
}
