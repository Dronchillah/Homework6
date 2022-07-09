package ua.lvlup.homework;

import java.util.Objects;

public class Owner {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String address;
    private final String phone;


    public Owner(String firstName, String lastName, int age, String address, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "ua.lvlup.homework.Owner's firstName is " + firstName +
                ", lastName is " + lastName +
                ", age " + age +
                ", address " + address +
                ", phone " + phone;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null){
            return false;
        }
        if (this.getClass() != o.getClass()){
            return false;
        }
        Owner owner = (Owner) o;
        return age == owner.age
                && Objects.equals(firstName, owner.firstName)
                && Objects.equals(lastName, owner.lastName)
                && Objects.equals(address, owner.address)
                && Objects.equals(phone, owner.phone);
    }
}
