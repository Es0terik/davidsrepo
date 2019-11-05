package com.company;

class Client {
    private IServer_A x = new Server();
    void a() {
        System.out.println("Methode a");
    }
    void Server_b() {
        x.b();
    }
}
