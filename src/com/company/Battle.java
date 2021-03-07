package com.company;

class Battle {
    void start() {
        Archer archer = new Archer("Варус", "Лучник");
        Fighter fighter = new Fighter("Талон", "Ассасин");
        System.out.println("Битва началась!!!");
        archer.shoot();
        fighter.defend();
        fighter.punch();
        archer.evade();
        archer.shoot();
        fighter.died();
        archer.running();
        System.out.print("Битва закончилась...");
    }
}