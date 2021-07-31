package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        
        ArrayList<String> sampleList = new ArrayList<String>();
        
        sampleList.add("Fruits");
        sampleList.add("Vegetables");
        sampleList.add("Groceries");
        sampleList.add(3, "Utensils");
        sampleList.add(1, "Provisions");
        
        System.out.println("Display all the Objects:");
        for(String s:sampleList){
            System.out.println(s);
        }
        
        System.out.println("3rd element in the list is: " + sampleList.get(2));
        System.out.println("Is Vessels is in list: " + sampleList.contains("Vessels"));
        System.out.println("Size of ArrayList: " + sampleList.size());
        
        sampleList.remove("Provisions");
        
        System.out.println("New Size of ArrayList: " + sampleList.size());
    }
}
