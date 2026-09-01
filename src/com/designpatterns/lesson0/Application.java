package com.designpatterns.lesson0;

public final class Application {
    private Application() {
        // This class is not meant to be instantiated.
    }

    public static void main(String[] args) {
        System.out.println("Lesson 0 is ready.");

        var calculator = new ShippingCalculator();
        var shippingCost = calculator.calculate(10.0);

        System.out.printf("Shipping cost: $%.2f%n", shippingCost);

    }
}