package DSA;

import java.util.HashMap;

public class HashmapInventory {

    HashMap<String, Integer>inventoryMap;

    public HashmapInventory(){
        inventoryMap = new HashMap<>();
    }

    // Method to add a new product to the inventory
//    public HashMap<String, Integer> updateInventory(String productName, int quantity) {
    public void addInventory(String productName, int quantity){

        if(inventoryMap.containsKey(productName)){
            System.out.println("Product already exists. Updating quantity instead.");
        updateInventory(productName,inventoryMap.get(productName)+quantity);

        //return inventoryMap;
    }
        else
        {
            inventoryMap.put(productName,quantity);
            System.out.println("Added product: " + productName + ", Quantity: " + quantity);
        }
    }

    // Method to update the quantity of an existing product
    public void updateInventory(String productName, int quantity){
        inventoryMap.put(productName,quantity);
        System.out.println("Updated product: " + productName + ", Quantity: " + quantity);
    }

    public void displayInventory(){
        inventoryMap.forEach((key, value) -> System.out.println("ProductName : "+key+" , Quantity : "+value));
    }

    public boolean checkoutQuantity(String productName, int quantity){
        if(!inventoryMap.containsKey(productName)){
            System.out.println("Product " + productName + " not found in inventory.");
            return false;
        }
        int remainingQuantity=inventoryMap.get(productName)-quantity;
        int currentQuantity =inventoryMap.get(productName);
        if(currentQuantity<quantity){
            System.out.println("Insufficient quantity "+quantity+" for product: " + productName);
            return false;
        }
        updateInventory(productName,remainingQuantity);
        System.out.println("Checked out " + quantity + " of " + productName + ". Remaining quantity: " +remainingQuantity);
        return true;

    }


    public static void main(String[] args){
        HashmapInventory inventory = new HashmapInventory();

        inventory.addInventory("Laptop",10);
        inventory.addInventory("Mobile",20);
        //inventory.updateInventory("Laptop",5);
        //inventory.addInventory("Laptop",20);
        inventory.checkoutQuantity("Mobile",50);
        inventory.checkoutQuantity("Mobile",20);
        inventory.displayInventory();
    }
}
