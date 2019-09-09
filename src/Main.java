import duck.*;
import goose.*;
import pigeon.*;

public class Main {
    public static void main(String[] args) {
        simulate();
    }

    private static void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable goose = new QuackCounter(new GooseAdapter(new Goose()));
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        System.out.println("Duck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);
        simulate(pigeon);
        System.out.println(QuackCounter.getQuackCount());
    }

    private static void simulate(Quackable q) {
        q.quack();
    }
}
