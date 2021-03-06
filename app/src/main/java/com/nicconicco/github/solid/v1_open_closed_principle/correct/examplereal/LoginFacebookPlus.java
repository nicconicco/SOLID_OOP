package com.nicconicco.github.solid.v1_open_closed_principle.correct.examplereal;

// O Login comecou com o Login do systema, mas logo apos um tempo precisamos fazer login via twitter, logo tmb surgiu a necessidade de
// fazer o login via Facebook, e apos mais um tempo surgiu a opcao de fazer login pelo facebook PLUS.

// Visualizando esta situacao temos a segurança de que o antigo código não foi tocado.
public class LoginFacebookPlus extends LoginFacebook {

    @Override
    public void fazerLogin() {
        setUser("LoginFacebookPlus");
    }

    @Override
    public String getUser() {
        return super.getUser();
    }
}
