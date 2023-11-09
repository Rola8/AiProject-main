
import java.security.PrivateKey;
import java.util.*;
public class Town {

    private static int prosperity;
    private Resources resources;
    private int amountRequestFood;
    private int delayRequestFood;
    private int amountRequestEnergy;
    private int delayRequestEnergy;
    private int amountRequestMaterials;
    private int delayRequestMaterials;
    private static int priceBuild1 ;
    private static int foodUseBUILD1;
    private static int energyUseBUILD1; 
    private static int prosperityBUILD1; 
    private static int priceBUILD2;
    private static int foodUseBUILD2;
    private static int materialsUseBUILD2;
    private static int energyUseBUILD2;
    private static int prosperityBUILD2;
    private static int materialsUseBUILD1;


    public Town(int prosperity,Resources resources, int amountRequestFood ,
                int delayRequestFood , int amountRequestEnergy , int delayRequestEnergy,
                int amountRequestMaterials, int delayRequestMaterials, 
                int priceBuild1 , int foodUseBUILD1, int energyUseBUILD1, 
                int prosperityBUILD1, int priceBUILD2, int foodUseBUILD2,
                int materialsUseBUILD1,int materialsUseBUILD2, int energyUseBUILD2, int prosperityBUILD2)
    {
        this.prosperity = prosperity;
        this.resources = resources;
        this.amountRequestEnergy = amountRequestEnergy;
        this.amountRequestFood = amountRequestFood;
        this.amountRequestMaterials = amountRequestMaterials;
        this.delayRequestEnergy=delayRequestEnergy;
        this.delayRequestFood = delayRequestFood;
        this.delayRequestMaterials = delayRequestMaterials;
        this.priceBuild1 = priceBuild1;
        this.foodUseBUILD1 = foodUseBUILD1;
        this.energyUseBUILD1 = energyUseBUILD1;
        this.prosperityBUILD1 = prosperityBUILD1;
        this.materialsUseBUILD1 = materialsUseBUILD1;
        this.priceBUILD2 = priceBUILD2;
        this.foodUseBUILD2 = foodUseBUILD2;
        this.materialsUseBUILD2 = materialsUseBUILD2;
        this.energyUseBUILD2 = energyUseBUILD2;
        this.prosperityBUILD2 = prosperityBUILD2;
    }
    public static int getProsperity() {
        return prosperity;
    }

    // Setter method for prosperity
   public static void setProsperity(int prosperity)
   {
       Town.prosperity = prosperity;
   }
    public static int getPriceBuild1() {
        return priceBuild1;
    }

    public static int getFoodUseBUILD1() {
        return foodUseBUILD1;
    }

    public static int getEnergyUseBUILD1() {
        return energyUseBUILD1;
    }

    public static int getProsperityBUILD1() {
        return prosperityBUILD1;
    }

    public static int getPriceBUILD2() {
        return priceBUILD2;
    }

    public static int getFoodUseBUILD2() {
        return foodUseBUILD2;
    }

    public static int getMaterialsUseBUILD2() {
        return materialsUseBUILD2;
    }

    public static int getEnergyUseBUILD2() {
        return energyUseBUILD2;
    }

    public static int getProsperityBUILD2() {
        return prosperityBUILD2;
    }

    public static  int getMaterialsUseBUILD1() {
        return materialsUseBUILD1;
    }

    public static void main(String[] args) {
        String init = "";

        Resources resources = new Resources(22, 22, 22, 
                                            70,50, 60,
                                            30,2,
                                            19,1,
                                            15,1);
        Town t = new Town(50 , resources,
                            30 , 2 ,
                            19, 1 ,
                            15,1,
                            300,5,
                            7,3,20,
                            500,8,
                            6,3,40
                            );
        
        
    }
}
