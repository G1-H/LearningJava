package mission.week2.day1Mission1;

public abstract class Shape {
    protected String color;
    protected int dimension;

    public abstract double calculateRound();
    public abstract double calculateArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public Shape() {
        this.color = "기본값";
        this.dimension = 2;
    }
}
