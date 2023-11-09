public class Operators {

    static  int initialProsperity;
    static  int initialFood;
    static  int initialMaterials ;
    static  int initialEnergy ;

    static int unitPriceFood ;
    static int unitPriceMaterials ;
    static int unitPriceEnergy ;
    static int amountRequestFood ;
    static int delayRequestFood ;
    static int amountRequestMaterials ;
    static int delayRequestMaterials ;
    static int amountRequestEnergy ;
    static int delayRequestEnergy ;
    static int priceBUILD1 ;
    static int foodUseBUILD1 ;
    static int materialsUseBUILD1 ;
    static int energyUseBUILD1 ;
    static int prosperityBUILD1 ;
    static int priceBUILD2 ;
    static int foodUseBUILD2 ;
    static int materialsUseBUILD2 ;
    static int energyUseBUILD2 ;
    static int prosperityBUILD2 ;
    private static int startBudget = 100000;
    private static boolean request = false;

    private static int requestBudget = 0;
    private static int build1Budget = 0;
    private static int build2Budget = 0;

        // Getter for initialProsperity
        public int getInitialProsperity() {
            return initialProsperity;
        }
    
        // Setter for initialProsperity
        public void setInitialProsperity(int initialProsperity) {
            this.initialProsperity = initialProsperity;
        }
            // Getter for initialFood
    public int getInitialFood() {
        return initialFood;
    }

    // Setter for initialFood
    public void setInitialFood(int initialFood) {
        this.initialFood = initialFood;
    }
        // Getter for initialMaterials
        public int getInitialMaterials() {
            return initialMaterials;
        }
    
        // Setter for initialMaterials
        public void setInitialMaterials(int initialMaterials) {
            this.initialMaterials = initialMaterials;
        }
    
        // Getter for initialEnergy
        public int getInitialEnergy() {
            return initialEnergy;
        }
    
        // Setter for initialEnergy
        public void setInitialEnergy(int initialEnergy) {
            this.initialEnergy = initialEnergy;
        }

    // fillin the initial values and fill the values with the givens
    public static void parse (String initialState){
        String[] parts = initialState.split(";");
        if (parts.length == 8) {
            initialProsperity=Integer.parseInt(parts[0]);
            String[] initialFoodParts = parts[1].split(",");
            initialFood = Integer.parseInt(initialFoodParts[0]);
            initialMaterials = Integer.parseInt(initialFoodParts[1]);
            initialEnergy = Integer.parseInt(initialFoodParts[2]);

            String[] unitPriceFoodParts = parts[2].split(",");
            unitPriceFood = Integer.parseInt(unitPriceFoodParts[0]);
            unitPriceMaterials = Integer.parseInt(unitPriceFoodParts[1]);
            unitPriceEnergy = Integer.parseInt(unitPriceFoodParts[2]);

            String[] amountRequestFoodParts = parts[3].split(",");
            amountRequestFood = Integer.parseInt(amountRequestFoodParts[0]);
            delayRequestFood = Integer.parseInt(amountRequestFoodParts[1]);

            String[] amountRequestMaterialsParts = parts[4].split(",");
            amountRequestMaterials = Integer.parseInt(amountRequestMaterialsParts[0]);
            delayRequestMaterials = Integer.parseInt(amountRequestMaterialsParts[1]);

            String[] amountRequestEnergyParts = parts[5].split(",");
            amountRequestEnergy = Integer.parseInt(amountRequestEnergyParts[0]);
            delayRequestEnergy = Integer.parseInt(amountRequestEnergyParts[1]);

            String[] build1Parts = parts[6].split(",");
            priceBUILD1 = Integer.parseInt(build1Parts[0]);
            foodUseBUILD1 = Integer.parseInt(build1Parts[1]);
            materialsUseBUILD1 = Integer.parseInt(build1Parts[2]);
            energyUseBUILD1 = Integer.parseInt(build1Parts[3]);
            prosperityBUILD1 = Integer.parseInt(build1Parts[4]);

            String[] build2Parts = parts[7].split(",");
            priceBUILD2 = Integer.parseInt(build2Parts[0]);
            foodUseBUILD2 = Integer.parseInt(build2Parts[1]);
            materialsUseBUILD2 = Integer.parseInt(build2Parts[2]);
            energyUseBUILD2 = Integer.parseInt(build2Parts[3]);
            prosperityBUILD2 = Integer.parseInt(build2Parts[4]);

            requestBudget=unitPriceFood + unitPriceEnergy + unitPriceMaterials;
            build1Budget=priceBUILD1 + unitPriceFood*foodUseBUILD1 + unitPriceEnergy*energyUseBUILD1 + unitPriceMaterials*materialsUseBUILD1;
            build2Budget=priceBUILD2 + unitPriceFood*foodUseBUILD2 + unitPriceEnergy*energyUseBUILD2 + unitPriceMaterials*materialsUseBUILD2;
            // Now you have all the values assigned to their respective variables.
            // You can use these variables in your Java code as needed.
        } else {
            System.out.println("Invalid input format.");
        }
    }



    public static void RequestFood(Node node)
    {
            // System.out.println(startBudget);
            // initialFood--;
            // initialMaterials--;
            // initialEnergy--;
        
            if(startBudget>requestBudget && node.getState().getEnergy()>1 && node.getState().getFood()>1 && node.getState().getMaterials()>1 && node.getTimeofdelay()==0){
                startBudget -= requestBudget;
                node.setFoodDelay(true); 
                node.setTimeofdelay(delayRequestFood);
                node.getState().setEnergy(node.getState().getEnergy()-1);
                node.getState().setFood(node.getState().getFood()-1);
                node.getState().setMaterials(node.getState().getMaterials()-1);
            }else if (node.getTimeofdelay()>0) {
                
            }
            else{
                node.setinvalidAction(1);
            }


    }
    public static void RequestMaterials(Node node)
    {
            // initialFood--;
            // initialEnergy--;
            // initialMaterials--;
            if(startBudget>requestBudget && node.getState().getEnergy()>1 && node.getState().getFood()>1 && node.getState().getMaterials()>1 && node.getTimeofdelay()==0){
                startBudget -= requestBudget;
                node.setMaterialsDelay(true); 
                node.setTimeofdelay(delayRequestMaterials);
                node.getState().setEnergy(node.getState().getEnergy()-1);
                node.getState().setFood(node.getState().getFood()-1);
                node.getState().setMaterials(node.getState().getMaterials()-1);
            }else if (node.getTimeofdelay()>0) {
                
            }else{
                node.setinvalidAction(1);
            } // System.out.println(node.getState().getEnergy());

    }

    public static void RequestEnergy(Node node)
    {
            // initialFood--;
            // initialMaterials--;
            // initialEnergy--;
            if(startBudget>requestBudget && node.getState().getEnergy()>1 && node.getState().getFood()>1 && node.getState().getMaterials()>1 && node.getTimeofdelay()==0){
                startBudget -= requestBudget;
                node.setEnergyDelay(true); 
                node.setTimeofdelay(delayRequestEnergy); 
                node.getState().setEnergy(node.getState().getEnergy()-1);
                node.getState().setFood(node.getState().getFood()-1);
                node.getState().setMaterials(node.getState().getMaterials()-1);
            }else if (node.getTimeofdelay()>0) {
                
            }else{
                node.setinvalidAction(1);
            }
            // System.out.println(startBudget);

    }

    public static void WAIT(Node node)
    {

            if(startBudget>requestBudget && node.getState().getEnergy()>1 && node.getState().getFood()>1 && node.getState().getMaterials()>1){
                startBudget -= requestBudget;
                node.getState().setEnergy(node.getState().getEnergy()-1);
                node.getState().setFood(node.getState().getFood()-1);
                node.getState().setMaterials(node.getState().getMaterials()-1);
                if(node.getTimeofdelay()>0){
                   
                    if(node.getTimeofdelay()==0&& node.getFoodDelay()==true){
                        node.getState().setFood(node.getState().getFood()+amountRequestFood);
                        node.setFoodDelay(false);
                    }
                    if(node.getTimeofdelay()==0&& node.getMaterialsDelay()==true){
                        node.getState().setMaterials(node.getState().getMaterials()+amountRequestMaterials);
                        node.setMaterialsDelay(false);
                    }
                    if(node.getTimeofdelay()==0&& node.getEnergyDelay()==true){
                        node.getState().setEnergy(node.getState().getEnergy()+amountRequestEnergy);
                        node.setEnergyDelay(false);
                    }
                }
            }else{
                node.setinvalidAction(1);
            }
            // startBudget -= unitPriceFood + unitPriceEnergy + unitPriceMaterials;
            // System.out.println(startBudget);

        // if (request == true){
        //     startBudget -= Resources.getUnitPriceFood() + Resources.getUnitPriceEnegry() + Resources.getUnitPriceMaterials();
        // }else{
        //     System.out.println("no requests");
        // }
    }

    public static void BUILD1(Node node)
    {   if(startBudget>build1Budget && node.getState().getEnergy()>energyUseBUILD1 && node.getState().getFood()>foodUseBUILD1 && node.getState().getMaterials()>materialsUseBUILD1){
            startBudget -=build1Budget;
            node.getState().setEnergy(node.getState().getEnergy()-energyUseBUILD1);
            node.getState().setFood(node.getState().getFood()-foodUseBUILD1);
            node.getState().setMaterials(node.getState().getMaterials()-materialsUseBUILD1);
            node.getState().setProsperity(node.getState().getProsperity()+prosperityBUILD1);
            if(node.getTimeofdelay()>0){
                if(node.getTimeofdelay()==0 && node.getFoodDelay()==true){
                    node.getState().setFood(node.getState().getFood()+amountRequestFood);
                    node.setFoodDelay(false);
                }
                if(node.getTimeofdelay()==0 && node.getMaterialsDelay()==true){
                    node.getState().setMaterials(node.getState().getMaterials()+amountRequestMaterials);
                    node.setMaterialsDelay(false);
                }
                if(node.getTimeofdelay()==0 && node.getEnergyDelay()==true){
                    node.getState().setEnergy(node.getState().getEnergy()+amountRequestEnergy);
                    node.setEnergyDelay(false);
                }
            }
    }else{
                node.setinvalidAction(1);
            }
}
    public static void BUILD2(Node node)
    {   if(startBudget>build2Budget && node.getState().getEnergy()>energyUseBUILD2 && node.getState().getFood()>foodUseBUILD2 && node.getState().getMaterials()>materialsUseBUILD2){
            startBudget -=build2Budget;
            node.getState().setEnergy(node.getState().getEnergy()-energyUseBUILD2);
            node.getState().setFood(node.getState().getFood()-foodUseBUILD2);
            node.getState().setMaterials(node.getState().getMaterials()-materialsUseBUILD2);
            node.getState().setProsperity(node.getState().getProsperity()+prosperityBUILD2);
            if(node.getTimeofdelay()>0){
                if(node.getTimeofdelay()==0&& node.getFoodDelay()==true){
                    node.getState().setFood(node.getState().getFood()+amountRequestFood);
                    node.setFoodDelay(false);
                }
                if(node.getTimeofdelay()==0&& node.getMaterialsDelay()==true){
                    node.getState().setMaterials(node.getState().getMaterials()+amountRequestMaterials);
                    node.setMaterialsDelay(false);
                }
                if(node.getTimeofdelay()==0&& node.getEnergyDelay()==true){
                    node.getState().setEnergy(node.getState().getEnergy()+amountRequestEnergy);
                    node.setEnergyDelay(false);
                }
            }
    }  else{
                node.setinvalidAction(1);
            }
    }
    public static int getStartBudget() {
        return startBudget;
    }

    public static void setStartBudget(int startBudget) {
        Operators.startBudget = startBudget;
    }
    public static void main(String[] args) {
        System.out.println(LLAPSearch.getLLAPInitialState());
    }
}
