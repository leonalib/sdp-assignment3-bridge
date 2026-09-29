public class BurgerOrder extends FoodOrder {
    public BurgerOrder(ServingMethod servingMethod) {
        super(servingMethod);
    }

    @Override
    public void serve() {
        servingMethod.serve("Burger");
    }
}
