package cz.cvut.omo.model.member;

public class Pet extends HouseMember{


    private final String typeOfAnimal;
    private final Boolean hungry;
    private final Boolean thirsty;
    private int hoursWithoutFood;
    private int hoursWithoutWater;

    public Pet(String name, String surnamae, int age, String typeOfAnimal) {
        super(name, surnamae, age);
        this.typeOfAnimal = typeOfAnimal;
        this.hungry = false;
        this.thirsty = false;
    }

    public String getTypeOfAnimal(){
        return typeOfAnimal;
    }

    public boolean isHungry(){
        return hungry;
    }

    public boolean isThirsty(){
        return thirsty;
    }

    public int getHoursWithoutFood() {
        return hoursWithoutFood;
    }
    public int getHoursWithoutWater() {
        return hoursWithoutWater;
    }
}
