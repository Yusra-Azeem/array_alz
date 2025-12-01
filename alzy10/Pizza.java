class Pizza
{
    String pizzaSize;
    int cheese;
    int peperroni;
    int mushroom;
    
    Pizza(String pizzaSize,int cheese,int peperroni,int mushroom){
        this.pizzaSize=pizzaSize;
        this.cheese=cheese;
        this.peperroni=peperroni;
        this.mushroom=mushroom;
        
    }

    double CalculateCost(){
        double cost;
        if(pizzaSize.equalsIgnoreCase("small")){
            cost=500+(25*cheese)+(25*peperroni)+(25*mushroom);
        }
        else if(pizzaSize.equalsIgnoreCase("medium")){
            cost=650+(25*cheese)+(25*peperroni)+(25*mushroom);
        }
        else{
            cost=800+(25*cheese)+(25*peperroni)+(25*mushroom);
        }
        return cost;
    }

    public String PizzaDescription(double cost){
        return "Pizza Size: "+pizzaSize+" Num of cheese: "+cheese+" Num of mushroom: "+mushroom+" Num of peperroni: "+peperroni+" Total Cost: "+cost;
    }

    public static void main(String args[]){
        Pizza ob=new Pizza("Small",1,2,1);
        double c=ob.CalculateCost();
        String p=ob.PizzaDescription(c);
        System.out.println(p);
    }
}