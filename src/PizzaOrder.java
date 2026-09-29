public class PizzaOrder extends FoodOrder {
    public PizzaOrder(ServingMethod servingMethod) {
        super(servingMethod);
    }

    @Override
    public void serve() {
        servingMethod.serve("Pizza");
    }
}
