package Module3.Strategy.Impl;

import Module3.Strategy.AreaCalculationStrategy;

public class SquareAreaStrategy implements AreaCalculationStrategy {
    private int size;

    public SquareAreaStrategy(int size){
        this.size=size;
    }

    @Override
    public double calculateArea() {
        return Math.pow(size,2);
    }
}
