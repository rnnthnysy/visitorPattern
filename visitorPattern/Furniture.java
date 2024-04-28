package visitorPattern;

public interface Furniture {
    void accept(FurnitureVisitor visitor);
}
