package org.backendless.test.app;

import org.backendless.test.app.animals.Cow;
import org.backendless.test.app.animals.Goat;
import org.backendless.test.app.food.Grass;
import org.backendless.test.app.animals.Tiger;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Cow cow = new Cow();
        Goat goat = new Goat();

        tiger.eat(cow);
        cow.eat(cow);
        cow.eat(new Grass());
        goat.eat(goat);
        goat.eat(new Grass());
        tiger.eat(goat);
    }
}
