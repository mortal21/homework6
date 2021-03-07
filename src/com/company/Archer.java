package com.company;

class Archer extends Human implements Shooting {

    Archer(String name, String specialization) {
        super(name, specialization);
    }

    @Override
    protected void running() {
        System.out.println(getSpecialization() + " " + getName() + " убегает");
    }

    public void shoot() {
        System.out.println(getSpecialization() + " " + getName() + " стреляет из лука");
    }

    public void evade() {
        System.out.println(getSpecialization() + " " + getName() + " защищается");
    }
}