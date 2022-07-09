package ua.lvlup.homework;

public class Main {
    public static void main(String[] args) {
        PetAndOwnerReader reader = new PetAndOwnerReader();
        Object[] petsAndOwners = reader.getPetAndOwnerList();
        for (Object pet : petsAndOwners){
            System.out.println(pet.toString());
        }
    }
}
