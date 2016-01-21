import java.util.ArrayList;
public class Territory{
    private String[] N = {"N1", "N2", "N3", "N4", "N5", "N6", "N7", "N8"};
    private String[] S = {"S1", "S2", "S3", "S4"};
    private String[] E = {"E1", "E2", "E3", "E4", "E5", "E6", "E7"};
    private String[] R = {"R1", "R2", "R3", "R4", "R5", "R6", "R7", "R8", "R9", "R10", "R11", "R12"};
    private String[] A = {"A1", "A2", "A3", "A4", "A5", "A6"};
    private String[] O = {"O1", "O2", "O3", "O4"}; 
    String terrName;
    String owner;
    public int armytotal;
    String[] nearby;

    public Territory(){
        armytotal = 5;
    }
    public Territory(String x){
        nearby = Nearby.getNearby(Nearby.convert(x));
        owner="*";
        armytotal= 5; //(int)(Math.random() * 5) + 1;
        terrName = x;  
    }
    public String getOwner(){
        return owner;
            
    }
    public int getarmy(){
        return armytotal;
            
    }
    public void setOwner(String x){
        owner=x;
        
    }
    public String getName(){
        return terrName;
    }
    public void addArmy(int x){
        armytotal+=x;
    }
    public void subArmy(int x){
        armytotal-=x;
    }
    
    public String display(){ //Displays symbol of owner and the number of troops in the territory e.g. @025
        String x = "owner";
        String troops = armytotal+"";
        if (troops.length() > 3){
            troops = "999"; //Maximum amount of troops in a territory is 999
        }
        else{ 
            while(troops.length() != 3){ //This is so that each display occupies four spaces, preserving the shape of the map
                troops = "0" + troops;
            }
        }
        return x + troops; 
    }
    public String toString(){
        String retStr="";
        retStr+=armytotal +"";
        return retStr;
        
    }
    
    
    
    
}
