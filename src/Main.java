import duck.*;

public class Main {
    public static void main(String[] args) {
        simulate();
    }

    private static void simulate() {
        DuckFactory factory = new DuckFactory();
        Quackable mallardDuck = factory.getQuackable("mallard", "counter");
        Quackable redheadDuck = factory.getQuackable("redhead", "counter");
        Quackable duckCall = factory.getQuackable("duckcall", "echo");;
        Quackable rubberDuck = factory.getQuackable("rubber", "counterEcho");
        Quackable goose = factory.getQuackable("goose", "echoCounter");
        Quackable pigeon = factory.getQuackable("pigeon");

        System.out.println("Duck Simulator\n");
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
