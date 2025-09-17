package Module3.Strategy;

public class ShapeCalculator {

    private AreaCalculationStrategy strategy;

    public ShapeCalculator(AreaCalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(AreaCalculationStrategy strategy){
        this.strategy=strategy;
    }

    public double calcuclate(){
        return strategy.calculateArea();
    }

}
