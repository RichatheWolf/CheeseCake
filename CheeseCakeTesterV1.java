/**
 * @purpose
 *
 * @author (enter your name)
 * @version (enter today's date)
 *
 */
import java.util.ArrayList;

public class CheeseCakeTesterV1 {
    public static void main(String[] args) {
        //initializing and declareing an ArrayList and adding in objects as elements
        ArrayList<CheeseCakeV1> cake = new ArrayList<CheeseCakeV1>();
            // add CheeseCake to the ArrayList
        cake.add(new CheeseCakeV1("Blueberry",5));
        cake.add(new CheeseCakeV1("Cherry", 6));
        cake.add(new CheeseCakeV1("Red Velvet", 1));
        cake.add(new CheeseCakeV1("Pumpkin Pie", 3));
        cake.add(new CheeseCakeV1(" Chocolate", 4));
        cake.add(new CheeseCakeV1("New York", 2));
        
        //calls several method for each object to perform calculations
        for(CheeseCakeV1 dataRecord : cake) {
            // invoke methods
            dataRecord.calcCreamCheese();
            dataRecord.calcSugar();
            dataRecord.calcTotalServings();
            dataRecord.calcVanilla();
        }
        
        //printing the format of the table
        System.out.println("|       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println("| Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println("|-------|----------|---------------|--------------|----------|-----------|-----------|");

        CheeseCakeV1 dataRecord;
        
        //using a for loop to print out the objects' data
        for(int index = 0; index < cake.size(); index ++) {
            // print each CheeseCake's data
            String line = String.format("|%7d|", index);
            System.out.print(line);
            System.out.println(cake.get(index));
        }
    }
}
