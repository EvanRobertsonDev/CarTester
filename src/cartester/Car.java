/*
 * Evan Robertson
 * 
 * 
 * 
 */

package cartester;

/**
 *
 * @author evrob0095
 */
public class Car {
    private String make;
    private String model;
    private int year;
    private double price;
    private boolean hasSunroof;
    private boolean hasHotTub;
    
    public Car(){
        int randType = (int) (Math.random() * 3 + 1);
        if (randType == 1) {
            make = "LADA";
        }
        else if (randType == 2) {
            make = "Volvo";
        }
        else {
            make = "Fiat";
        }
        int randModel = (int) (Math.random() * 3 + 1);
        if(randType == 1){
            if (randModel == 1) {
                model = "Granta Sedan";
            }
            else if (randModel == 2) {
                model = "Granta Liftback";
            }
            else {
                model = "Granta Cross";
            }
        }
        else if (randType == 2) {
            if (randModel == 1) {
                model = "Volvo XC90";
            }
            else if (randModel == 2) {
                model = "Volvo XC60";
            }
            else {
                model = "Volvo XC40";
            }
        }else {
            if (randModel == 1) {
                model = "Fiat 500L";
            }
            else if (randModel == 2) {
                model = "Fiat 500X";
            }
            else {
                model = "Fiat 500 Cabrino";
            }
        }
        int randYear = (int) (Math.random() * 2020) + 1900;
        year = randYear;
        double randPrice = (double) (Math.random() * 1000000 + 5000);
        randPrice = Math.round(randPrice);
        price = randPrice;
        hasSunroof = false;
        hasHotTub = true;
    }
    public Car(String brand, String carModel, int yearOfMake, double money, boolean sunRoof, boolean hotTub){
        make = brand;
        model = carModel;
        year = yearOfMake;
        price = money;
        hasSunroof = sunRoof;
        hasHotTub = hotTub;
    }
    public Car(boolean hotTub) {
        make = "The Hot Tub Bus Bois";
        model = "HotTub Model X";
        year = 1763;
        price = 0.003;
        hasSunroof = true;
        hasHotTub = true;
    }
    public String toString() {
        String output = "Make: " + make + "\n"
                + "Model: " + model + "\n"
                + "Year: " + year + "\n"
                + "Price: " + price + "\n"
                + "Sunroof? " + hasSunroof + "\n"
                + "Hottub? " + hasHotTub;
        return output;
    }
    
}
