import cs1.Keyboard;


public class Play{
    public int whoturn;
    private String[] N = {"N1", "N2", "N3", "N4", "N5", "N6", "N7", "N8"};
    private String[] S = {"S1", "S2", "S3", "S4"};
    private String[] E = {"E1", "E2", "E3", "E4", "E5", "E6", "E7"};
    private String[] R = {"R1", "R2", "R3", "R4", "R5", "R6", "R7", "R8", "R9", "R10", "R11", "R12"};
    private String[] A = {"A1", "A2", "A3", "A4", "A5", "A6"};
    private String[] O = {"O1", "O2", "O3", "O4"}; 
    private static Territory N1, N2, N3, N4, N5, N6, N7, N8, S1, S2, S3, S4, E1, E2, E3, E4, E5, E6, E7, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, A1, A2, A3, A4, A5, A6, O1, O2, O3, O4 ;

 

    
    public static void main(String[] args){
        int stuff=0;
        N1 = new Territory("N1");
        N2 = new Territory("N2");
        N3 = new Territory("N3");
        N4 = new Territory("N4");
        N5 = new Territory("N5");
        N6 = new Territory("N6");
        N7 = new Territory("N7");
        N8 = new Territory("N8");
        S1 = new Territory("S1");
        S2 = new Territory("S2");
        S3 = new Territory("S3");
        S4 = new Territory("S4");
        E1 = new Territory("E1");
        E2 = new Territory("E2");
        E3 = new Territory("E3");
        E4 = new Territory("E4");
        E5 = new Territory("E5");
        E6 = new Territory("E6");
        E7 = new Territory("E7");
        R1 = new Territory("R1");
        R2 = new Territory("R2");
        R3 = new Territory("R3");
        R4 = new Territory("R4");
        R5 = new Territory("R5");
        R6 = new Territory("R6");
        R7 = new Territory("R7");
        R8 = new Territory("R8");
        R9 = new Territory("R9");
        R10 = new Territory("R10");
        R11 = new Territory("R11");
        R12 = new Territory("R12");
        A1 = new Territory("A1");
        A2 = new Territory("A2");
        A3 = new Territory("A3");
        A4 = new Territory("A4");
        A5 = new Territory("A5");
        A6 = new Territory("A6");
        O1 = new Territory("O1");
        O2 = new Territory("O2");
        O3 = new Territory("O3");
        O4 = new Territory("O4");
        World map = new World();
        Player one = new Player(1);
        Player two = new Player(2);
        two.addTerritory("N1");
        one.addTerritory("N2");
        one.addTerritory("N3");
        one.addTerritory("N4");
        one.addTerritory("N5");
        one.addTerritory("N6");
        one.addTerritory("N7");
        one.addTerritory("N8");
        one.addTerritory("S1");
        one.addTerritory("S2");
        one.addTerritory("S3");
        one.addTerritory("S4");
        one.addTerritory("E1");
        one.addTerritory("E2");
        one.addTerritory("E3");
        one.addTerritory("E4");
        one.addTerritory("E5");
        one.addTerritory("E6");
        one.addTerritory("N2");
        one.addTerritory("E7");
        one.addTerritory("R1");
        one.addTerritory("R2");
        one.addTerritory("R3");
        one.addTerritory("R4");
        one.addTerritory("R5");
        one.addTerritory("R6");
        one.addTerritory("R7");
        one.addTerritory("R8");
        one.addTerritory("R9");
        one.addTerritory("R10");
        one.addTerritory("R11");
        one.addTerritory("R12");
        one.addTerritory("A1");
        one.addTerritory("A2");
        one.addTerritory("A3");
        one.addTerritory("A4");
        one.addTerritory("A5");
        one.addTerritory("A6");
        one.addTerritory("O1");
        one.addTerritory("O2");
        one.addTerritory("O3");
        one.addTerritory("O4");
        String chosenTerr ;
        String targetTerr;
        Territory mine;
        Territory take;
     
        int deployedTroops ;
    
        mine=returnATerr("N2");
     
        N2.addArmy(30);
        mine=returnATerr("N2");

        while ((one.territory).size() <= 41){
            // Player 1
            map.showMap();
            System.out.println("Player 1 is starting with almost all of the map besides N2");
            System.out.println("Player 1 also gets 30 troop bonus to insure they win :)");
            System.out.println("Player 1: Turn" + one.getTurns());
            System.out.println("You have " + one.getArmyT() + " troops. Which territory would you like to place them in? Hint: CHOOSE N2");
            chosenTerr = Keyboard.readString();
            System.out.println("How many troops would you like to deploy?");
            deployedTroops = Integer.parseInt(Keyboard.readString());
            (returnATerr(chosenTerr)).addArmy(deployedTroops);
            System.out.println("These are your neighboring territories:");
            System.out.println(Nearby.displayNearby(chosenTerr));
            System.out.println("Choose one to attack .HINT ONLY CHOOSE N1");
            targetTerr=Keyboard.readString();
         
            
            
       
            battle(one, two,chosenTerr, targetTerr );
            
        }
   
        System.out.println("Player 1 wins! He got all the regions!");
        
    }
      public static void battle(Player myturn, Player attacked, String attack, String defend){
        
        int randomy, armytotalmine, armytotalother;
        Territory mine = returnATerr(attack);
        Territory take=returnATerr(defend);
        armytotalmine = mine.getarmy();
        armytotalother = take.getarmy();
        boolean battleover=false;
        while (battleover==false){
            System.out.println("They have " +take.getarmy());
            System.out.println("I Have "+mine.getarmy());
            
            if (take.getarmy() == 0){
                take.setOwner(myturn.symbol);
                myturn.addTerritory(take.getName());
                System.out.println("you win");
                battleover=true;
               
            }
            else if (mine.getarmy()==0){
                mine.setOwner("*");
                attacked.addTerritory(mine.getName());
                battleover=true;
            }
            else {
                randomy=(int)(Math.random()*100);
                if (randomy <= 50){ 
                    mine.subArmy(1);
                    
                }
                else{
                    take.subArmy(1);
                    
                }
                
                
            }
         
        }
        

    }

    public static Territory returnATerr(String x){
        if (x.equals("N1")){
            return N1;
            
        }
        if (x.equals("N2")){
            return N2;
            
        }
        if (x == "N3"){
            return N3;
            
        }
        if (x == "N4"){
            return N4;
            
        }
        if (x == "N5"){
            return N5;
            
        }
        if (x == "N6"){
            return N6;
            
        }
        if (x == "N7"){
            return N7;
            
        }
        if (x == "N8"){
            return N8;
            
        }
        if (x == "S1"){
            return S1;
            
        }
        if (x == "S2"){
            return S2;
            
        }
        if (x == "S3"){
            return S3;
            
        }
        if (x == "S4"){
            return S4;
            
        }
        if (x == "E1"){
            return E1;
            
        }
        if (x == "E2"){
            return E2;
            
        }if (x == "E3"){
            return E3;
            
        }
        if (x == "E4"){
            return E4;
            
        }
        if (x == "E5"){
            return E5;
            
        }
        if (x == "E6"){
            return E6;
            
        }
        if (x == "E7"){
            return E7;
            
        }
        if (x.equals("R1")){
            return R1;
            
        }
        if (x.equals("R2")){
            return R2;
            
        }
        if (x.equals("R3")){
            return R3;
            
        }
        if (x.equals("R4")){
            return R4;
            
        }
        if (x.equals("R5")){
            return R5;
            
        }
        if (x.equals("R6")){
            return R6;
            
        }
        if (x.equals("R7")){
            return R7;
            
        }
        if (x.equals("R8")){
            return R8;
            
        }
        if (x.equals("R9")){
            return R9;
            
        }
        if (x.equals("R10")){
            return R10;
            
        }
        if (x.equals("R11")){
            return R11;
            
        }
        if (x.equals("R12")){
            return R12;
            
        }
        if (x.equals("A1")){
            return A1;
            
        }
        if (x.equals("A2")){
            return A2;
            
        }
        if (x.equals("A3")){
            return A3;
            
        }
        if (x.equals("A4")){
            return A4;
            
        }
        if (x.equals("A5")){
            return A5;
            
        }
        if (x.equals("A6")){
            return A6;
            
        }
        if (x.equals("O1")){
            return O1;
            
        }
        if (x.equals("O2")){
            return O2;
            
        }
        if (x.equals("O3")){
            return O3;
            
        }
        if (x.equals("O4")){
            return O4;
            
        }
        return N1;
    }
    
    
    
    
}