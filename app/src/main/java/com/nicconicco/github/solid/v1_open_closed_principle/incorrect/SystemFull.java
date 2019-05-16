package com.nicconicco.github.solid.v1_open_closed_principle.incorrect;

/**
 * Writed by Carlos Nicolau Galves May-2919
 * <p>
 * https://www.udemy.com/solid-principles-object-oriented-design-architecture/learn/v4/t/lecture/13027552?start=0
 * <p>
 * Open Closed principle - OCP
 * <p>
 * Proper use of abstractions to hide complexity
 *
 * Software entities should be open for extension, but closed for modification
 *
 * Protect your existing code from subset of future changes that you can predict
 *
 */
public class SystemFull {
    // SystemFull have Source code with methods with clazz with modules with application
    // Accopling responsabilities make hard to manutance this
    // do Login switch case if isLoginFacebook, isLoginTwitter, etc.
}

