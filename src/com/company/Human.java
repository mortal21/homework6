package com.company;

abstract class Human {
    private final String name;
    private final String specialization;

    protected Human(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    protected String getName() {
        return name;
    }

    protected String getSpecialization() {
        return specialization;
    }

    protected abstract void running();

    protected void died() {
        System.out.println(specialization + " " + name + " погиб");
    }
}