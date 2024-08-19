/*Design and create a class named Retail Item that holds data about an item in a retail store. The class should have the following fields:
•	Description - The description field references a String object that holds a brief description of the item.
•	Units - The units field is an int variable that holds the number of units currently in inventory.
•	Price - The price field is a double that holds the item’s retail price.
Write a constructor that accepts arguments for each field, appropriate mutator methods that store values in these fields, and accessor methods that return the values in these fields. Write the main method which creates three Retail Item objects and invokes appropriate methods.
 */

/**
 * RetailItem
 */
import java.util.*;
public class RetailItem {

    String Description;
    int units;
    double Price;

    RetailItem(String Description,int units,double Price){
        this.Description=Description;
        this.units=units;
        this.Price=Price;   
    }

    public void setDescription(String description) {
        Description = description;
    }
    public void setPrice(double price) {
        Price = price;
    }
    public void setUnits(int units) {
        this.units = units;
    }
    public String getDescription() {
        return Description;
    }
    public double getPrice() {
        return Price;
    }
    public int getUnits() {
        return units;
    }

    public static void main(String args[]){
        RetailItem item1=new RetailItem("soap", 1, 10);
        Scanner sc=new Scanner(System.in);
        String t=sc.next();
        sc.close();
        
        item1.setDescription(t);
        System.out.println(item1.getDescription());
    }


}