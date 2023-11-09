public class State {
    private  int Prosperity;
    private  int Food;
    private  int Materials ;
    private  int Energy ;

    public State(){
        this.Prosperity=Operators.initialProsperity;
        this.Energy=Operators.initialEnergy;
        this.Food=Operators.initialFood;
        this.Materials=Operators.initialMaterials;
    }


    public  int getProsperity() {
        return Prosperity;
    }

    public  int getFood() {
        return Food;
    }

    public  int getMaterials() {
        return Materials;
    }

    public  int getEnergy() {
        return Energy;
    }

    // Setters
    public  void setProsperity(int prosperity) {
        this.Prosperity = prosperity;
    }

    public  void setFood(int food) {
        this.Food = food;
    }

    public  void setMaterials(int materials) {
        this.Materials = materials;
    }

    public  void setEnergy(int energy) {
        this.Energy = energy;
    }

}
