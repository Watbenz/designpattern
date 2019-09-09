package duck;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int quackCount;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        quackCount++;
    }

    public static int getQuackCount() {
        return quackCount;
    }
}
