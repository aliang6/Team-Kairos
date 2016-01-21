public class Cards{
    private boolean isUsed;
    private int newArmies;
    private String name;
    
    public Cards(){
        isUsed=true;
        newArmies=0;
        
    }
    public Cards(String x, int troops){
        name=x;
        newArmies=troops;
        
    }
    public int getTroops(){
        return newArmies;
    }
    
    
}