package ua.lvlup.homework;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetAndOwnerReader {


    public Pet[] getPetAndOwnerList(){
        List<Pet> listOfPetsAndOwners = new ArrayList<>();

       try (Scanner scan = new Scanner(Paths.get("petsAndOwners.txt"))) {
           while (scan.hasNextLine()){
               String line = scan.nextLine();
               String[] petAndOwnerInfo = line.split("\\s");

               String petName = petAndOwnerInfo[0];
               int petAge = Integer.parseInt(petAndOwnerInfo[1]);

               String ownerFirstName = petAndOwnerInfo[2];
               String ownerLastName = petAndOwnerInfo[3];
               int ownerAge = Integer.parseInt(petAndOwnerInfo[4]);
               String ownerAddress = refactorAddress(petAndOwnerInfo[5]);
               String ownerPhoneNumber = petAndOwnerInfo[6];

               Owner owner = new Owner(ownerFirstName, ownerLastName, ownerAge, ownerAddress, ownerPhoneNumber);
               listOfPetsAndOwners.add(new Pet(petName, petAge, owner));
           }
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
       Pet[] petsAndOwnersArray = new Pet[listOfPetsAndOwners.size()];
       return listOfPetsAndOwners.toArray(petsAndOwnersArray);
    }

    private String refactorAddress(String rawAddress){
        return rawAddress.replace('_', ' ');
    }
}
//Charlie 12 John Brown 34 London,_Downing_str,_10 +380983412657