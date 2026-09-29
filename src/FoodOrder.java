public abstract class FoodOrder {
    protected ServingMethod servingMethod;

    protected FoodOrder(ServingMethod servingMethod) {
        this.servingMethod = servingMethod;
    }

    public void setServingMethod(ServingMethod servingMethod) {
        this.servingMethod = servingMethod;
    }

    public abstract void serve();
}
