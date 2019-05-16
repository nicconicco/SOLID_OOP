package com.nicconicco.github.solid.v1_open_closed_principle.correct.examplereal;

// O Login comecou com o Login do systema, mas logo apos um tempo precisamos fazer login via twitter, logo tmb surgiu a necessidade de
// fazer o login via Facebook, e apos mais um tempo surgiu a opcao de fazer login pelo facebook PLUS.
abstract class LoginFacebook extends Login {

    String user = "";

    void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    @Override
    public void fazerLogin() {
        setUser("LoginFacebook");
    }
}
