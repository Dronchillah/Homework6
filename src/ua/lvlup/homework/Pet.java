package ua.lvlup.homework;

import java.util.Objects;

public class Pet {
    private String name;
    private int age;
    Owner owner;


    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pet(String name, int age, Owner owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "ua.lvlup.homework.Pet name is " +
                name +
                ", its age is " + age +
                ", and " + owner +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        Pet pet = (Pet) o;
        return age == pet.age
                && Objects.equals(name, pet.name)
                && Objects.equals(owner, pet.owner);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
