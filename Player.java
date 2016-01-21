import java.util.ArrayList;
public class Player{
    public String symbol;
    public int armytotal, turns, territories;
    public boolean winner;
    public boolean North, South, Asia, Europe, Russia, Oceana;
    public ArrayList<String> territory=new ArrayList<String>();
    

    
    public Player(){
        armytotal=5;
        symbol = "#";
        turns = 0;
        winner = false;
        territories = 0;
        
    }
    public Player(int x){
        if (x==1){
            symbol = "@";
        }
        else if (x==2){
            symbol ="%";
            
        }
        armytotal=5;
        North=false;
        South=false;
        Asia=false;
        Europe=false;
        Russia=false;
        Oceana=false;
        winner = false;
        turns = 0;
        
    }
    
    public String getName(){
        return symbol;
        
    }
    
    public int getArmyT(){
        return armytotal;
    }
    
    public int getTurns(){
        return turns;
    }
    
    public void addTerritory(String x){
        territory.add(x);
        territories += 1;
    
    }
    public void removeTerritory(String x){
        territory.remove(x);
        territories -= 1;
    }
    public void addArmy(int x){
        armytotal+=x;
        
            
    }
    
    public void removeArmy(int x){
        armytotal-=x;
        
    }
    public void useCard(Cards x){
        armytotal+=x.getTroops();
        
    }

  
}