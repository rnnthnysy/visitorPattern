package visitorPattern;

public class ShippingCostCalculator implements FurnitureVisitor{
    private double totalShippingCost;

    @Override
    public void visit(Chair chair) {
        totalShippingCost += 10.0; // Example flat rate for chairs
    }

    @Override
    public void visit(Table table) {
        totalShippingCost += 20.0; // Example flat rate for tables
    }

    @Override
    public void visit(Sofa sofa) {
        totalShippingCost += 30.0; // Example flat rate for sofas
    }

    public double getTotalShippingCost() {
        return totalShippingCost;
    }
}
