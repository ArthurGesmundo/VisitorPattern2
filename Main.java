public class Main {
    public static void main(String[] args) {
        Furniture[] furnitureItems = {
            new Chair(10),
            new Table(2, 3),
            new Sofa(5, 100)
        };

        ShippingCostCalculator calculator = new StandardShippingCostCalculator();

        for (Furniture furniture : furnitureItems) {
            furniture.accept(calculator);
        }
    }
}
