//Team Kairos - Shariar Kabir, Andy Liang
//APCS1 Final Project
import java.util.ArrayList;
public class Player{
    public String symbol;
    public int armytotal, turns, territories,North1,South1,Asia1,Europe1,Russia1,Oceana1;
    public boolean winner;
    public boolean North, South, Asia, Europe, Russia, Oceana;
    public ArrayList<String> territory=new ArrayList<String>();
    public ArrayList<String> cards=new ArrayList<String>();
    

    
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
        North1=0;
        South1=0;
        Asia1=0;
        Europe1=0;
        Russia1=0;
        Oceana1=0;
        
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
    
    public void setNorth(boolean x){
        North = x;
    }
    public void armyUpdate(){
        int tempHolding;
        tempHolding=5;
        if (North == true){
            tempHolding+=5;
        }
        if (South == true){
            tempHolding+=5;
        }
        if (Asia == true){
            tempHolding+=5;
        }
        if (Oceana == true){
            tempHolding+=5;
        }
        if (Russia == true){
            tempHolding+=5;
        }
        
        armytotal=tempHolding;
    }
    
    public void setSouth(boolean x){
        South = x;
    }
    
    public void setAsia(boolean x){
        Asia = x;
    }
    
    public void setEurope(boolean x){
        Europe = x;
    }
    
    public void setRussia(boolean x){
        Russia = x;
    }
    
    public void setOceana(boolean x){
        Oceana = x;
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
    public void remCard(String x){
        cards.remove(x);
    }
    
    public void removeArmy(int x){
        armytotal-=x;
        
    }
    public void useCard(Cards x){
        armytotal+=x.getTroops();
        
    }
    public boolean doIhave(String y){
        return territory.contains(y);
    }
    public boolean doIhaveCard(String y){
        return cards.contains(y);
    }
     public void subArmy(int x){
        armytotal-=x;
        
            
    }
     public String retCards(){
        String retCard = "";
        for (int x = 0 ; x < cards.size() ; x++){
            retCard += "You have the "+cards.get(x)+" card.";
            
        }
        return retCard;
    }
        public void addCards(String x){
        cards.add(x);
        
    
    }
    public String whatDoIown(){
        String retString="You own these territories ";
        for (int x = 0 ; x < territory.size() ; x++){
            retString+=territory.get(x)+" ";
        }
        return retString;
        
        
    }   
    

        
    }

  
