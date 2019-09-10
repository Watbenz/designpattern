package duck;

public abstract class AbstractFactory {
    public abstract Quackable getQuackable(String type);
    public abstract Quackable getQuackable(String type, String prop);
}
