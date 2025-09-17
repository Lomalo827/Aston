package Module3.Strategy.Impl;

import Module3.Strategy.AreaCalculationStrategy;

public class RectangleAreaStrategy implements AreaCalculationStrategy {

    private int height;
    private int size;

    public RectangleAreaStrategy(int height, int size){
        this.height=height;
        this.size=size;
    }

    @Override
    public double calculateArea() {
        return 0.5*height*size;
    }
}
