package com.nicconicco.github.solid.v1_open_closed_principle.correct.examplereal;
// O Login comecou com o Login do systema, mas logo apos um tempo precisamos fazer login via twitter, logo tmb surgiu a necessidade de
// fazer o login via Facebook
public class LoginTwitter extends Login {
    @Override
    public void fazerLogin() {
        // faco meu login diferente do Login comum
    }
}
