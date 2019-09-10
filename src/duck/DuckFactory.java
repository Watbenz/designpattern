package duck;

import goose.*;
import pigeon.*;

public class DuckFactory extends AbstractFactory {

    @Override
    public Quackable getQuackable(String type) {
        return getQuackable(type, "none");
    }

    @Override
    public Quackable getQuackable(String type, String prop) {
        Quackable q;

        switch (type.toLowerCase()) {
            case "duck":
                q = new Duck();
                break;
            case "duckcall":
                q = new DuckCall();
                break;
            case "mallard":
                q = new MallardDuck();
                break;
            case "redhead":
                q = new RedheadDuck();
                break;
            case "rubber":
                q = new RubberDuck();
                break;
            case "goose":
                q = new GooseAdapter(new Goose());
                break;
            case "pigeon":
                q = new PigeonAdapter(new Pigeon());
                break;
            default:
                throw new IllegalArgumentException("error type");
        }

        switch (prop.toLowerCase()) {
            case "none":
                return q;
            case "echo":
                return new QuackEcho(q);
            case "counter":
                return new QuackCounter(q);
            case "counterecho":     // Counter ก่อนแล้ว Echo แปลว่าจะ counter 2 ครั้งเมื่อ quack เพราะรวมกับ echo
                return new QuackEcho(new QuackCounter(q));
            case "echocounter":     // Echo ก่อนแล้ว Counter
                return new QuackCounter(new QuackEcho(q));
            default:
                throw new IllegalArgumentException("error property");
        }
    }
}
