package Module3.Strategy.Impl;

import Module3.Strategy.AreaCalculationStrategy;

public class CircleAreaStrategy implements AreaCalculationStrategy {

    private double radius;

    public CircleAreaStrategy(double radius){
        this.radius=radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
