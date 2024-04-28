package visitorPattern;

public class Table implements Furniture{
    @Override
    public void accept(FurnitureVisitor visitor) {
        visitor.visit(this);
    }
}
