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
        Car car2;
        Car car3;
        Scanner input = new Scanner(System.in);
        String brand;
        String modelOfCar;
        int yearOfMake;
        double money;
        boolean SunRoof;
        boolean hotTub;
        System.out.println("Type skip at any moment to skip question");
        System.out.println("What is brand of car comrade?");
        brand = input.nextLine();
        System.out.println("What is model of car comrade?");
        modelOfCar = input.nextLine();
        System.out.println("What is year car made in Comrade?");
        yearOfMake = Integer.parseInt(input.nextLine());
        System.out.println("What is price of car comrade?");
        money = Double.parseDouble(input.nextLine());
        System.out.println("");
        
        car1 = new Car();
    }
    
}
