public class PlateServing implements ServingMethod {
    @Override
    public void serve(String foodName) {
        System.out.println(foodName + " is served on a plate.");
    }
}
