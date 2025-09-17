package Module3.Strategy;

import Module3.Strategy.Impl.CircleAreaStrategy;
import Module3.Strategy.Impl.RectangleAreaStrategy;
import Module3.Strategy.Impl.SquareAreaStrategy;

public class Main {
    public static void main (String[] args){
        ShapeCalculator calculator = new ShapeCalculator(new CircleAreaStrategy(5.0));
        System.out.println("Площадь круга: "+calculator.calcuclate());
        calculator.setStrategy(new RectangleAreaStrategy(5,10));
        System.out.println("Площадь треугольника: "+calculator.calcuclate());
        calculator.setStrategy(new SquareAreaStrategy(25));
        System.out.println("Площадь квадрата: "+calculator.calcuclate());
    }
}
