package com.nicconicco.github.solid.v1_interface_substitution_principle.incorrect;
/**
 * Writed by Carlos Nicolau Galves May-2919
 * <p>
 * https://www.udemy.com/solid-principles-object-oriented-design-architecture/learn/v4/t/lecture/12798473?start=0
 * <p>
 * Interface substitution principle - ISP
 * <p>
 * Clients shouldn`t be forced to depend on methods they don`t use
 */
public class Client2 implements Service {
    @Override
    public void method1() {
        // Hey, I dont need this method here..
    }

    @Override
    public void method2() {
        // using method
    }
}
