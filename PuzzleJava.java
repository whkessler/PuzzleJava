import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

public class PuzzleJava{
    public ArrayList<Object> greaterThanTen(){
        int [] myArray = {3,5,1,2,7,9,8,13,25,32};
        int sum = 0;
        ArrayList<Object> newArray = new ArrayList<Object>();
        for(int i = 0 ;i < myArray.length; i++){
            sum += myArray[i];
            System.out.println(sum);
            if(myArray[i] > 10){
                newArray.add(myArray[i]);
            }
        }
        return newArray;
    }
    public ArrayList<String> names(){
    String [] manyNames = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
    ArrayList<String> newNames = new ArrayList<String>();
    ArrayList<String> newNames2 = new ArrayList<String>();
    for(int i = 0 ;i < manyNames.length; i++){
        newNames2.add(manyNames[i]);
        if(manyNames[i].length() > 5){
            newNames.add(manyNames[i]);
            }
        }
        Collections.shuffle(newNames2);
        System.out.println(newNames2);
        return newNames;
    }
    public ArrayList<String> alphaB(){
        String [] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        ArrayList<String> newArray = new ArrayList<String>();
        for(int i = 0 ;i < alpha.length; i++){
            newArray.add(alpha[i]);
        }
        Collections.shuffle(newArray);
        System.out.println(newArray.get(25));
        System.out.println(newArray.get(0));
        if(newArray.get(0) == "a"){
            System.out.println("This is a vowel");
        }
        else if(newArray.get(0) == "e"){
            System.out.println("This is a vowel");
        }
        else if(newArray.get(0) == "i"){
            System.out.println("This is a vowel");
        }
        else if(newArray.get(0) == "o"){
            System.out.println("This is a vowel");
        }
        else if(newArray.get(0) == "u"){
            System.out.println("This is a vowel");
        }
        return newArray;
    }
    public ArrayList<Integer> randNumber() {
        ArrayList<Integer> randNums = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            int num = ThreadLocalRandom.current().nextInt(55, 100);
            randNums.add(num);
        }
        System.out.println(randNums);
        return randNums;
    }
    public ArrayList<Integer> randNumber2(){
        ArrayList<Integer> randNums2 = new ArrayList<Integer>();
        int max = 55;
        int min = 100;
        for(int i = 0; i < 10; i++){
            int num2 = ThreadLocalRandom.current().nextInt(55, 100);
            randNums2.add(num2);
            if(num2 < min){
                min = num2;
            }
            if(num2 > max){
                max= num2;
            }
        }
        Collections.sort(randNums2);
        System.out.println(randNums2);
        System.out.println("Smallest number is: " + min);
        System.out.println("Largest number is: " + max);
        return randNums2;
    }


}