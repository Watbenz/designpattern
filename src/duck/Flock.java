package duck;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    private List<Quackable> duckFlock = new ArrayList<>();

    @Override
    public void quack() {
        for (int i = 0; i < duckFlock.size(); i++) {
            if (i == 0) {
                duckFlock.get(0).quack();
                duckFlock.get(0).quack();
            }
            duckFlock.get(i).quack();
        }
    }

    public void addQuackable(Quackable q) {
        duckFlock.add(q);
    }

    public void removeQuackable(Quackable q) {
        duckFlock.remove(q);
    }
}
