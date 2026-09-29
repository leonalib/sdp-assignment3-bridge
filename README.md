# Assignment 3 - Bridge Pattern

Topic: Food orders.

This Java program has two types of food: pizza and burger. Both can be served
on a plate or packed for takeaway.

## Bridge pattern

The food type and the serving method are separate.

- FoodOrder is the abstraction. It has a ServingMethod field.
- PizzaOrder and BurgerOrder extend FoodOrder.
- ServingMethod is the implementor interface.
- PlateServing and TakeawayServing implement this interface.
- Main creates the orders and runs the example.

In Main, pizza is first served on a plate. Then setServingMethod() changes
it to takeaway. The burger changes from takeaway to a plate. The order objects
stay the same. This shows how the bridge works.

## Five Clean Code principles

1. Clear names: names like PizzaOrder show what the class is for.
2. Small methods: each serve() method is short and easy to read.
3. One responsibility: food classes describe the food, and serving classes
   handle the serving method.
4. No repeated serving code: pizza and burger use the same serving classes.
5. Easy to extend: a new serving class can implement ServingMethod without
   changing the food classes.

## How to run

Use JDK 17 or newer.

1. Open the project folder in IntelliJ IDEA.
2. Open src/Main.java.
3. Click the green Run button.

The result appears in the Run panel. It shows pizza and burger with both
serving methods.
