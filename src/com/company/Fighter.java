package com.company;

class Fighter extends Human implements Infighting {

    Fighter(String name, String specialization) {
        super(name, specialization);
    }

    @Override
    protected void running() {
        System.out.println(getSpecialization() + " " + getName() + " убегает");
    }

    public void punch() {
        System.out.println(getSpecialization() + " " + getName() + " бьёт");
    }

    public void defend() {
        System.out.println(getSpecialization() + " " + getName() + " обороняется");
    }
}