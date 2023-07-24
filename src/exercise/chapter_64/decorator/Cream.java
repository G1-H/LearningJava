package exercise.chapter_64.decorator;

public class Cream extends BeverageDecorator {

    public Cream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", cream";
    }

    @Override
    public double cost() {
        return super.cost()+0.2;
    }

}
