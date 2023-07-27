package javaexam.factorypattern;

import java.util.*;
import java.security.*;

interface Food {
    public String getType();
}
class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}
class FoodFactory {
    public Food getFood(String order) {
        Food food = null;
        switch(order) {
            case "cake":
                food = new Cake();
                break;
            case "pizza":
                food = new Pizza();
                break;
            default:
                throw new RuntimeException("food type is none");
        }
        return food;

    }//End of getFood method

}//End of factory class

public class Solution {

    public static void main(String args[]){
        try{

            Scanner sc=new Scanner(System.in);
            //creating the factory
            FoodFactory foodFactory = new FoodFactory();

            //factory instantiates an object
            Food food = foodFactory.getFood(sc.nextLine());
            System.out.println("The factory returned "+food.getClass());
            System.out.println(food.getType());
        }
        catch (Exception e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }

}