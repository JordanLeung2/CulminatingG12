/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jordan
 */
public class Desert extends Recipe{
    private boolean cold;
    
    public Desert(String name, String category, String[] ingredients, String[] steps, double calories, int time, boolean cold){
        super(name,category,ingredients,steps,calories,time);
        this.cold = cold;
    }
    public String getCold(){
        if(cold == true){
            return "this drink is cold";
        }
        else{
            return "this drink is not cold";
        }
    }
}
