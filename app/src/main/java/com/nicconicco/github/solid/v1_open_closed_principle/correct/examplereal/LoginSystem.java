package com.nicconicco.github.solid.v1_open_closed_principle.correct.examplereal;

// O Login comecou com o Login do systema, mas logo apos um tempo precisamos fazer login via twitter
public class LoginSystem extends Login {
    @Override
    public void fazerLogin() {
        // faco meu login pelo sistema
    }
}
