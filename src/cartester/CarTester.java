/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;
import java.util.*;

/**
 *
 * @author evrob0095
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car car1;
        Scanner input = new Scanner(System.in);
        String brand;
        String modelOfCar;
        int yearOfMake;
        double money;
        String SunRoofStr = "";
        String hotTubStr = "";
        boolean SunRoof = false;
        boolean hotTub = false;
        System.out.println("Type random here to generate a random car");
        System.out.println("What is brand of car comrade?");
        brand = input.nextLine();
        if (brand.equalsIgnoreCase("random")) {
            car1 = new Car();
        }
        else {
            System.out.println("What is model of car comrade?");
            modelOfCar = input.nextLine();
            System.out.println("What is year car made in Comrade?");
            yearOfMake = Integer.parseInt(input.nextLine());
            System.out.println("What is price of car comrade?");
            money = Double.parseDouble(input.nextLine());
            System.out.println("Does vehicle have a roof for sun comrade? (true or false)");
            SunRoofStr  = input.nextLine();
            System.out.println("Type WE HOT here to generate the hottub mobile");
            System.out.println("Does vehicle have a a built in tub of heat comrade? (true or false)");
            hotTubStr = input.nextLine();
            if (hotTubStr.equalsIgnoreCase("WE HOT")){
            car1 = new Car(hotTub);
            }
            else {
                if (SunRoofStr.equalsIgnoreCase("true")) {
                    SunRoof = true;
                }
                else {
                    SunRoof = false;
                }
                if (hotTubStr.equalsIgnoreCase("true")) {
                    hotTub = true;
                }
                else {
                    hotTub = false;
                }
                car1 = new Car(brand, modelOfCar, yearOfMake, money, SunRoof, hotTub);
            }
        }
        
        
        
        
        System.out.println(car1);
        
    }
    
}
            
  
  