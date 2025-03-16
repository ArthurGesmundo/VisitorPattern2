class Table implements Furniture {
    private double width;
    private double height;

    public Table(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void accept(ShippingCostCalculator visitor) {
        visitor.visit(this);
    }
}
