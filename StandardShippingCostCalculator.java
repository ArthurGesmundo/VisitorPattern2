class StandardShippingCostCalculator implements ShippingCostCalculator {
    @Override
    public void visit(Chair chair) {
        double cost = 5.0; // Flat rate for chairs
        System.out.println("Shipping cost for Chair: $" + cost);
    }

    @Override
    public void visit(Table table) {
        double cost = (table.getWidth() * table.getHeight()) * 5; // Based on surface area
        System.out.println("Shipping cost for Table: $" + cost);
    }

    @Override
    public void visit(Sofa sofa) {
        double cost = (sofa.getVolume() * 0.5) + (sofa.getDistance() * 0.2); // Based on volume and distance
        System.out.println("Shipping cost for Sofa: $" + cost);
    }
}
