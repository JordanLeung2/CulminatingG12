/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jordan
 */
public class Drinks extends Recipe {
    private boolean hasMilk;
    private int volume;
    
    public Drinks(String name, String category, String[] ingredients, String[] steps, double calories, int time, boolean hasMilk, int volume){
        super(name,category,ingredients,steps,calories,time);
        this.hasMilk = hasMilk;
        this.volume = volume;
    }
    
    public String getHasMilk(){
        if (hasMilk == true){
            return "This recipe contains milk";
        }
        else{
            return "This recipe contains no milk";
        }
    }
    
    public int volume(){
        return volume;
    }
}
