public class Main {
    public static void main(String[] args) {
        ServingMethod plateServing = new PlateServing();
        ServingMethod takeawayServing = new TakeawayServing();

        FoodOrder pizzaOrder = new PizzaOrder(plateServing);
        FoodOrder burgerOrder = new BurgerOrder(takeawayServing);

        System.out.println("Initial orders:");
        pizzaOrder.serve();
        burgerOrder.serve();

        System.out.println("\nSwitching pizza to takeaway:");
        pizzaOrder.setServingMethod(takeawayServing);
        pizzaOrder.serve();

        System.out.println("\nSwitching burger to a plate:");
        burgerOrder.setServingMethod(plateServing);
        burgerOrder.serve();
    }
}
