/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jordan
 */
public class Recipe {
    
    private String name;
    private String category;
    private String[] ingredients;
    private String[] steps;
    private double calories;
    private int time;
    
    public Recipe(String name,String category, String[] ingredients, String[] steps, double calories, int time){
        this.name = name;
        this.category = category;
        this.ingredients = ingredients;
        this.steps = steps;
        this.calories = calories;
        this.time = time;
}
    public String getName(){
        return name;
    }
    
    public String getCategory(){
        return category;
    }
    
    public String getIngredients(){
        String toString = "";
        for (int i=0;i<ingredients.length;i++){
            toString = toString + ingredients[i] + ",";
        }
        return toString;
    }
    
    public String getSteps(){
        String toString = "";
        for (int i=0; i<steps.length; i++){
            toString = toString + steps[i] + ",";
        }
        return toString;
    }
    
    public double getCalories(){
        return calories;
    }
    
    public String getTime(){
        return time + " minutes";
    }
    
}
