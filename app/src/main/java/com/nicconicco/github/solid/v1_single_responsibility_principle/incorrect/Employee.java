package com.nicconicco.github.solid.v1_single_responsibility_principle.incorrect;
/**
 * Writed by Carlos Nicolau Galves May-2919
 *
 * Reference: https://www.udemy.com/solid-principles-object-oriented-design-architecture/learn/v4/t/lecture/12782173?start=0
 *
 * Single Responsibility Principle - SRP
 *
 * Cant come up with more than one reason for a class to change
 *
 * Solution:
 *
 * 1 - List all steps and flows according to the requierements
 * 2 - Analyze each item in the list to identify potential future changes
 * 3 - Extract functionalities that change due to different reasons into standalone classes
 *
 * Lego Analogy:
 * Small, focused and easy to inter-connect classes open options
 */
public class Employee {
    // Excess coupling responsability
    public void calculatePay() {}
    public void reportHours() {}
    public void save() {}
}
