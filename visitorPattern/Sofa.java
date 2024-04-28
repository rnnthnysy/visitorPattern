package visitorPattern;

public class Sofa implements Furniture{
    @Override
    public void accept(FurnitureVisitor visitor) {
        visitor.visit(this);
    }
}
