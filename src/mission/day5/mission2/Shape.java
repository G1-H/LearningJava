package mission.day5.mission2;

public class Shape {
    protected String color;

    public double getArea(){
        return 0.0;
    }
    protected void printInfo(){
        System.out.println("도형의 색상: " + color);
        System.out.println("도형의 면적: " + getArea());
    }

    protected Shape(String color){
        this.color = color;
    }
}
