public class TakeawayServing implements ServingMethod {
    @Override
    public void serve(String foodName) {
        System.out.println(foodName + " is packed in a takeaway box.");
    }
}
