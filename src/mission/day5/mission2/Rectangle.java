package mission.day5.mission2;

public class Rectangle extends Shape{
    private double side1;
    private double side2;

    @Override
    public double getArea() {
        double result = this.side1 * this.side2;
        return result;
    }

    protected void printRectangleInfo() {
        super.printInfo();
        System.out.println("사각형의 가로 길이:"+side1);
        System.out.println("사각형의 세로 길이:"+side2);
    }

    public Rectangle(String color, double side1, double side2){
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

}
