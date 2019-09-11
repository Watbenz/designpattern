import duck.*;

public class Main {
    public static void main(String[] args) {
        simulate();
    }

    private static void simulate() {
        DuckFactory factory = new DuckFactory();
        Flock flock = new Flock();
        Quackable mallardDuck = factory.getQuackable("mallard", "counter");
        Quackable redheadDuck = factory.getQuackable("redhead", "counter");
        Quackable duckCall = factory.getQuackable("duckcall", "echo");;
        Quackable rubberDuck = factory.getQuackable("rubber", "counterEcho");
        Quackable goose = factory.getQuackable("goose", "echoCounter");
        Quackable pigeon = factory.getQuackable("pigeon");

        System.out.println("Duck Simulator\n");
        flock.addQuackable(mallardDuck);
        flock.addQuackable(redheadDuck);
        flock.addQuackable(duckCall);
        flock.addQuackable(rubberDuck);
        flock.addQuackable(goose);
        flock.addQuackable(pigeon);
        flock.quack();
        System.out.println(QuackCounter.getQuackCount());
    }
}
