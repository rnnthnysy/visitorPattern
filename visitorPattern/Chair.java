package visitorPattern;

public class Chair implements Furniture{
    @Override
    public void accept(FurnitureVisitor visitor) {
        visitor.visit(this);
    }
}
