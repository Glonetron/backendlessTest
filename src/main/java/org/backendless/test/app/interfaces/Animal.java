package org.backendless.test.app.interfaces;

public interface Animal<T extends Food> {
    default void eat(T food){
        System.out.println(food.getClass()==this.getClass()?"No":"Yes");
    }
}
