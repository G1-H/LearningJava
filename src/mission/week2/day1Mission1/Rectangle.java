package mission.week2.day1Mission1;

public class Rectangle extends Shape{
    private double width;
    private double height;

    @Override
    public double calculateRound() {
        return 2*(width+height);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    public double calculateDiagonal(){
        return Math.sqrt(Math.pow(height, 2.0) + Math.pow(width, 2.0));
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Rectangle(double width, double height){
        super();
        this.width = width;
        this.height = height;
    }
}
