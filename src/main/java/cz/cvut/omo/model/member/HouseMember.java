package cz.cvut.omo.model.member;

public abstract class HouseMember {
    private final String name;
    private final String surname;
    private final int age;

    public HouseMember(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getFullName(){
        return name + " " + surname;
    }

    public int getAge() {
        return age;
    }

}
