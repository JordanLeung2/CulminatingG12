/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jordan
 */
public class MainCourse extends Recipe {
    private String cookware;
    public MainCourse(String name, String category, String[] ingredients, String[] steps, double calories, int time, String cookware){
        super(name,category,ingredients,steps,calories,time);
        this.cookware = cookware;
    }
    public String getCookware(){
        return "this recipe uses " + cookware;
    }
}
