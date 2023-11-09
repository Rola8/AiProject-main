public class Resources {
    private static int food;
    private static int materials;
    private static int energy;

    private static int unitPriceFood ;
    private static int unitPriceMaterials ;
    private static int unitPriceEnergy ;

    private static int amountRequestFood ;
    private static int amountRequestMaterials ;
    private static int amountRequestEnergy ;

    private static int delayRequestFood ;
    private static int delayRequestMaterials ;
    private static int delayRequestEnergy ;

    public Resources(int food , int materials , int energy ,
                    int unitPriceEnergy , int unitPriceFood, int unitPriceMaterials,
                    int amountRequestFood, int delayRequestFood, int amountRequestMaterials,
                    int delayRequestMaterials, int amountRequestEnergy, int delayRequestEnergy)
    {
        this.food = food;
        this.materials = materials;
        this.energy = energy;
        this.unitPriceFood = unitPriceFood;
        this.unitPriceEnergy = unitPriceEnergy;
        this.unitPriceMaterials = unitPriceMaterials;
        this.amountRequestFood = amountRequestFood;
        this.amountRequestEnergy = amountRequestEnergy;
        this.amountRequestMaterials = amountRequestMaterials;
        this.delayRequestEnergy = delayRequestEnergy;
        this.delayRequestFood = delayRequestFood;
        this.delayRequestMaterials = delayRequestMaterials;
    }
    public static int getFood(){
        return food;
    }
    public static int getMaterials(){
        return materials;
    }
    public static int getEnegry(){
        return energy;
    }
    public static int getUnitPriceFood(){
        return unitPriceFood;
    }
    public static int getUnitPriceMaterials(){
        return unitPriceMaterials;
    }
    public static int getUnitPriceEnegry(){
        return unitPriceEnergy;
    }
    public static int getamountRequestFood(){
        return amountRequestFood;
    }
    public static int getamountRequestMaterials(){
        return amountRequestMaterials;
    }
    public static int getamountRequestEnergy(){
        return amountRequestEnergy;
    }
    public static int getdelayRequestFood(){
        return delayRequestFood;
    }
    public static int getdelayRequestMaterials(){
        return delayRequestMaterials;
    }
    public static int getdelayRequestEnergy(){
        return delayRequestEnergy;
    }
    public void setFood(int food){
        this.food = food;
    }
    public void setMaterials(int materials){
        this.materials = materials;
    }
    public void setEnegry(int energy){
        this.energy = energy;
    }

}
