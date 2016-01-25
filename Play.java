//Team Kairos - Shariar Kabir, Andy Liang
//APCS1 Final Project
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
  private static Cards airSupport;
  private static Cards navySupport;
  private static Cards groundSupport;
  
  
  
  
  public static void main(String[] args){
    airSupport= new airSupport("airSupport", 10);
    groundSupport= new groundSupport("groundSupport", 10);
    navySupport= new navySupport("navySupport", 10);
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
    String[] map        ={"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~____________~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~_________________________~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|     N3     |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~___|    R2    |    R3        |~~~~~~~~~~~~\n",
      "~~~_______~~~~~~~~~~~~~~~~~~~~~~|             |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~| R1 |         |         _____|____~~~~~~~~\n",
      "~~|   N1  |_____________________|___  "+ N3.display()+"    |~~~~~~~~~~~~~~~______________|     |         | "+ R3.display()+"   |    R4    |~~~~~~~\n",
      "~~|       |   N2                    |        |~~~~~~~~~~~~~__|  E2  |  E3   |      |   "+ R2.display()+" |       |          _|~~~~~~~\n",
      "~~|  "+ N1.display()+" |      "+ N2.display()+"        ________|___ ___|_~~~~~~~~~~~|         |       |       |       |_____ |   "+ R4.display()+"  _|~~~~~~~~~\n",
      "~~|        |________________|    N4      |~~~~~|_________|          |       |        |      | R5  |         |~~~~~~~~~~~\n",
      "~~|_______  |  N5           |            |~~~~~~_|  E1    |  "+ E2.display()+"   |       | "+ R1.display()+"   |      |     |     ___|~~~~~~~~~~~~\n",
      "~~~~~~~~~~|_|                |  "+ N4.display()+"   __|~~~~~|          |         | "+ E3.display()+"  |        |      |"+ R5.display()+" |    | R6 |~~~~~~~~~~~\n",
      "~~~~~~~~~~~~|      "+ N5.display()+"       |       |~~~~~~~~|   "+ E1.display()+"   |__       |       |        |      |    |     |    |_~~~~~~~~~~\n",
      "~~~~~~~~~~~~| _________________|____ _|~~~~~~~|__________|   | ____|__      |        |      |    |_____| "+ R6.display()+" |~~~~~~~~~\n",
      "~~~~~~~~~~~~~|    N6      |   N7    |~~~~~~~~~|     E4        |   E5  |     |         |     |   |  R7  |     __|~~~~~~~~\n",
      "~~~~~~~~~~~~|            |          |~~~~~~~~|                 |      |     |__        |    |_ |       |     |~~~~~~~~~~\n",
      "~~~~~~~~~~~~|    "+ N6.display()+"   |          |~~~~~~~~|     "+ E4.display()+"         |      |     |  |___     |     |        |_____|~~~~~~~~~~\n",
      "~~~~~~~~~~~~|           |    "+ N7.display()+"  |~~~~~~~~|                 |  "+ E5.display()+" |    |  R9   |___ _|____|   "+ R7.display()+"        |~~~~~~~~~\n",
      "~~~~~~~~~~~~| _______ _|        ___|~~~~~~~|_____ _____      |        |    |           |  R8  |              _|~~~~~~~~~\n",
      "~~~~~~~~~~~~~|  N8   |         |~~~~~~~~~~~~~~~~~|  E6 |____|         |   |   "+ R9.display()+"    |        |____________|~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~|        |       |~~~~~~~~~~~~~~~~~|           |_ _______|   |           |                    |~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~| "+ N8.display()+"  _|_____|~~~~~~~~~~~~~~~~~__|            |   E7  |___|______     |____   "+ R8.display()+"      __|~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~|     |~~~~~~~~~~~~~~~~~~~~~~~~|     "+ E6.display()+"      |          |  R10  |__ | R11 |           |~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~|    |~~~~~~~~~~~~~~~~~~~~~~~~~~|              |   "+ E7.display()+"    |         |      |          |~~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~|__  |__~~~~~~~~~~~~~~~~~~~~~~~~|     __________|          |  "+ R10.display()+"   | "+ R11.display()+" |_________ |~~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~|_   |~~~~~~~~~~~~~~~~~~~~~~|___ _|    A1     |_________|         |      |   R12   |~~~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~|  |~~~~~~~~~~~~~~~~~~~~~~~~~~|             |    A2   |_____    |       |        |~~~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~|_|_________~~~~~~~~~~~~~~~~~|             |               |____|     _| "+ R12.display()+"   |~~~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~|    S1    |__~~~~~~~~~~~~~~|             |    "+ A2.display()+"       |~~~~|    |~~|      |~~~~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~|_      "+ S1.display()+" |_~~~~~~~~~~~|      "+ A1.display()+"     |              |~~~~|    |~~~|     |~~~~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~|  |____        |_____~~~~|                 |____________ |~~~~|   |~~~~~|     |~~~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~|  S2    |_______| S3  |~~/|                  |    A3     |~~~~~~|  |~~~~~~|   |~~~~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~|          |            |/~|                   |         |~~~~~~~~| |~~~~~~~|_ |_________~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~|_ "+ S2.display()+"    |    "+ S3.display()+"  |~~~|                   | "+ A3.display()+"   |~~~~~~~~~~|~~~~~~~~~~|    O1    |~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~|         |        |~~~~~|_                 |         |~~~~~~~~~~~~~~______|           |_~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~|__        |      |~~~~~~~~|_______________|        _|~~~~~~~~~~~~~~|_  O2  |_   "+ O1.display()+"    |~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~|       |      |~~~~~~~~~~~~~~~~~|   A4  |      |~~~~~~~~~~~~~~~~~~|       |_     ____|~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~|        |_ __|~~~~~~~~~~~~~~~~~|         |___ |~~~~~~~~~~~~~~~~~~~|_  "+ O2.display()+"  |___|~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~|_____     |~~~~~~~~~~~~~~~~~~~~~|            |~~~~~~~~~~~~~~~~~~~~~~|_          |_____~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~| S4  |___ |~~~~~~~~~~~~~~~~~~~~~~|  "+ A4.display()+"     |~~~~~~~~~~~~~~~~~~~~~~~~|____ ___|  O4  |~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~|         |~~~~~~~~~~~~~~~~~~~~~~~|           |~~~~~~~~~~~~~~~~~~~~~~~~~~~~_| O3|       |~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~| "+ S4.display()+"  _|~~~~~~~~~~~~~~~~~~~~~~~~|_____      |________~~~~~~~~~~~~~~~~~ _|      |       |~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~|      |~~~~~~~~~~~~~~~~~~~~~~~~~~|  A5 |_____|   A6   |~~~~~~~~~~~~~~~~|        |  "+ O4.display()+"  |~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~|     _|~~~~~~~~~~~~~~~~~~~~~~~~~~|            |_      |~~~~~~~~~~~~~~~~~|   "+ O3.display()+"  |        |~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~|   |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|  "+ A5.display()+"    |~| "+ A6.display()+" |~~~~~~~~~~~~~~~~~|          |       |~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~|    |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|        |~~|     |~~~~~~~~~~~~~~~~~~~|          |      |~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~|   |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|       |~~~|    _|~~~~~~~~~~~~~~~~~~~|   _______|    |~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~|  |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|     |~~~~|___|~~~~~~~~~~~~~~~~~~~~~|__|~~~~~~~|    |~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~|__ |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~| ____|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|____|~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|_|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"};
    Player one = new Player(1);
    Player two = new Player(2);
    one.addTerritory("N1");
    N1.setOwner("@");
    one.addTerritory("N2");
    N2.setOwner("@");
    one.addTerritory("N3");
    N3.setOwner("@");
    one.addTerritory("N5");
    N5.setOwner("@");
    one.addTerritory("S3");
    S3.setOwner("@");
    one.addTerritory("S4");
    S4.setOwner("@");
    two.addTerritory("R3");
    R3.setOwner("%");
    two.addTerritory("R4");
    R4.setOwner("%");
    two.addTerritory("R5");
    R5.setOwner("%");
    two.addTerritory("R6");
    R6.setOwner("%");
    two.addTerritory("O3");
    O3.setOwner("%");
    two.addTerritory("O4");
    O4.setOwner("%");
    
    String targetTerr;
    Territory mine;
    Territory take;
    //-------------------------------------------------------------------------------------Variables ----------------------------------------------------------------------
    int deployedTroops ;
    
    mine=returnATerr("N2");
    mine=returnATerr("N2");
    int turny=0;
    int remArmy=0;
    boolean finishChoose=false;
    boolean troopGone=false;
    boolean finishTransfer=false;
    boolean useCard=false;
    boolean finishCard=false;
    int theTurn=0;
    String response;
    String OneTer;
    String TwoTer;
    int transferAmount;
    boolean fullDeploy=false;
    String chosenTerr="a";
    int myTotalArmy;
    boolean attackFinished=false;
    System.out.println("Team Kairos, Shariar Kabir and Andy Liang, like to present to you - Risk!");
    //-------------------------------------------------------------------------------------Variables ----------------------------------------------------------------------
    while (((one.territory).size() <= 41) || ((two.territory).size() <= 41)){
      remArmy=0; 
      finishChoose=false;
      troopGone=false;
      finishTransfer=false;
      useCard=false;
      finishCard=false;
      fullDeploy=false;
      attackFinished=false;
      
      //----------------------------------------------------------------------Player one----------------------------------------------
      if (theTurn==0){
        one.armyUpdate();
        myTotalArmy=one.getArmyT();
        // Player 1
        map=updateMap();
        showMap(map);
        
        System.out.println("Player 1: Turn " + one.getTurns());
        System.out.println(one.whatDoIown());
        
        
        while (fullDeploy!=true && troopGone!=true){
          while (finishCard!=true){
            if (one.cards.size()<=0){
              finishCard=true;
            }
            else if (one.cards.size() > 0 ){
              System.out.println(one.retCards());
              System.out.println("Would you like to use one of your cards? Type in the card name, or type No to go to next phase");
              chosenTerr = Keyboard.readString();
              if (chosenTerr.equals("No")){
                finishCard=true;
              }
              else if (!(chosenTerr.equals("No"))){
                if (one.doIhaveCard(chosenTerr)==true){
                  remArmy=(returnACard(chosenTerr)).getTroops();
                  one.addArmy(remArmy);
                  System.out.println("You now have "+ one.getArmyT()+ " troops");
                  myTotalArmy=one.getArmyT();
                  one.remCard(chosenTerr);
                  finishCard=true;
                  
                }
                else{System.out.println("Please type in the name as you see it");
                }
                
              }
            }
          }
          //------------------------------------------------------------------Choosing Territory---------------------------------------------------------------
          while (finishChoose != true){
            
            
            System.out.println("You have " + one.getArmyT() + " troops. Which territory would you like to place them in? ");
            chosenTerr = Keyboard.readString();
            if (one.doIhave(chosenTerr)==true){
              finishChoose=true;
              
            }
            else if (one.doIhave(chosenTerr)==false){
              System.out.println("You do not own this territory, go conquer it first!");
              
              
            }
            
            
          }
          //------------------------------------------------------------------Choosing Territory---------------------------------------------------------------
          
          //------------------------------------------------------------------DEPLOYMENT CODE---------------------------------------------------------------
          while (troopGone != true){
            if (myTotalArmy <= 0){
              troopGone=true;
              fullDeploy=true;
            }
            System.out.println("How many troops would you like to deploy?");
            
            deployedTroops = Integer.parseInt(Keyboard.readString());
            if (deployedTroops <= 0 || deployedTroops > myTotalArmy){
              System.out.println("You do not have that many troops, please retry");
            }
            else if (deployedTroops > 0 || deployedTroops <= myTotalArmy){
              
              System.out.println("You troops have been deployed general");
              
              (returnATerr(chosenTerr)).addArmy(deployedTroops);
              myTotalArmy-=deployedTroops;
              troopGone=true;
            }
            
            
            
            
          }
          if (myTotalArmy >0){
            troopGone=false;
            finishChoose=false;
            
          }
          
          else if (myTotalArmy <=0){
            fullDeploy=true;
            troopGone=true;
          }
          
          //------------------------------------------------------------------DEPLOYMENT CODE---------------------------------------------------------------
          
          
        }
        
        
        
        
        
        
        
        
        
        //------------------------------------------------------------------Transfer Troops--------------------------------------------------------------
        System.out.println("Would you like to transfer troops? Y or N");
        response="";
        response = Keyboard.readString();
        
        if (response.equals("Y") || response.equals("y")){
          
          while (finishTransfer!=true){
            System.out.println("What territory do you want to transfer from? Type End to stop transfer stage"); 
            OneTer = Keyboard.readString();
            if (OneTer.equals( "End")){
              finishTransfer=true;
            }
            else if (OneTer!="End"){
              
              if (one.doIhave(OneTer)==false){
                System.out.println("You do not have this, please retry");
                
              }
              else if (one.doIhave(OneTer)==true){
                System.out.println("What territory do you want to transfer to?"); 
                TwoTer = Keyboard.readString();
                if (one.doIhave(TwoTer)==false){
                  System.out.println("You do not have this, please retry");
                }
                else if (one.doIhave(TwoTer)== true){
                  if (Nearby.near(OneTer,TwoTer)==false){
                    System.out.println("Illegal move, please retry");
                  }
                  else if (Nearby.near(OneTer,TwoTer)==true){
                    System.out.println(OneTer+" has "+ returnATerr(OneTer).getarmy() + " troops"); 
                    System.out.println("How many troops do you want to send? If its greator then your total amount, we will send total-2");
                    transferAmount=Integer.parseInt(Keyboard.readString());
                    if (transferAmount < returnATerr(OneTer).getarmy()){
                      returnATerr(OneTer).subArmy(transferAmount);
                      returnATerr(TwoTer).addArmy(transferAmount);
                      System.out.println("Now "+ OneTer+" has " +(returnATerr(OneTer)).getarmy()+" troops.");
                      System.out.println("Now "+ TwoTer+" has " +(returnATerr(TwoTer)).getarmy()+" troops.");
                      finishTransfer=true;
                    }
                    else if (transferAmount >= returnATerr(OneTer).getarmy()){
                      
                      transferAmount=returnATerr(OneTer).getarmy();
                      (returnATerr(OneTer)).subArmy(transferAmount-2);
                      returnATerr(TwoTer).addArmy(transferAmount-2);
                      System.out.println("Now "+ OneTer+" has " +(returnATerr(OneTer)).getarmy()+" troops.");
                      System.out.println("Now "+ TwoTer+" has " +(returnATerr(TwoTer)).getarmy()+" troops.");
                    }
                    finishTransfer=true;
                    
                  }
                }
              }
              
              
            }
            
          }
          
        }
        
        
        
        
        
        
        //------------------------------------------------------------------Transfer Troops--------------------------------------------------------------
        //------------------------------------------------------------------Battle Stage--------------------------------------------------------------
        finishChoose=false;
        while (attackFinished!=true){
          
          while (finishChoose != true){
            System.out.println("Which territory would you like to attack with? Type End to not attack");
            chosenTerr=Keyboard.readString();
            if (chosenTerr.equals("End")==true){
              finishChoose=true;
              attackFinished=true;
            }
            
            
            else if (one.doIhave(chosenTerr)==true){
              finishChoose=true;
              
            }
            else if (one.doIhave(chosenTerr)==false){
              System.out.println("You do not own this territory, go conquer it first! two");
              
              
            }
            
            
          }
          if (attackFinished==false){
            System.out.println("These are your neighboring territories:");
            System.out.println(Nearby.displayNearby(chosenTerr));
            System.out.println("Choose one to attack.");
            targetTerr=Keyboard.readString();
            if (one.doIhave(targetTerr)==true){
              System.out.println("This is your own territory, you cannot attack this.");
            }
            else if (Nearby.near(chosenTerr,targetTerr)==true){
              System.out.println("How many troops would you like to send?");
              deployedTroops=Integer.parseInt(Keyboard.readString());
              System.out.println("Would you like to see a simulation of the battle beforehand? Say Yes to see simulation, say No to not see simulation");
              response = Keyboard.readString();
              if (response.equals("Yes")==true){
                statGraph(deployedTroops, targetTerr);
                
              }
              if (response.equals("No")==true){
                System.out.println("Please continue with the battle");
                
              }
              System.out.println("Would you like to continue with this battle? Say Yes to continue, or End to stop battle phase");
              response=Keyboard.readString();  
              
              if (response.equals("End")==true){
                attackFinished=true;
              }
              
              
              else if (deployedTroops<returnATerr(chosenTerr).getarmy()){
                
                battle(one, two,chosenTerr, targetTerr, deployedTroops );
                
              }
              
              else if (deployedTroops>=returnATerr(chosenTerr).getarmy()){
                
                System.out.println("Command issues failed. You cannot send out your total troops or more than you own.");
                
                
              }
              
              
            }
            else{
              System.out.println("This is not a neighboring territory, please try again");
              
            }
            finishChoose=false;
            
          }
          one.subArmy(remArmy); 
          one.armyUpdate();
          contConquer(one);
        }
        //----------------------------------------------------------------------Player one----------------------------------------------
        theTurn=1;
        finishChoose=false;
        troopGone=false;
        finishTransfer=false;
        useCard=false;
        finishCard=false;
        fullDeploy=false;
        attackFinished=false;
        //----------------------------------------------------------------------Player Two-------------------------------------------------------------------------------------------------------------------
        if (theTurn==1){
          two.armyUpdate();
          myTotalArmy=two.getArmyT();
          // Player 2
          map=updateMap();
          showMap(map);
          System.out.println("Player 2: Turn " + two.getTurns());
          System.out.println(two.whatDoIown());
          while (fullDeploy!=true && troopGone!=true){
            while (finishCard!=true){
              if (two.cards.size()<=0){
                finishCard=true;
              }
              else if (two.cards.size() > 0 ){
                System.out.println(two.retCards());
                System.out.println("Would you like to use one of your cards? Type in the card name, or type No to go to next phase");
                chosenTerr = Keyboard.readString();
                if (chosenTerr.equals("No")){
                  finishCard=true;
                }
                else if (!(chosenTerr.equals("No"))){
                  if (two.doIhaveCard(chosenTerr)==true){
                    remArmy=(returnACard(chosenTerr)).getTroops();
                    two.addArmy(remArmy);
                    System.out.println("You now have "+ two.getArmyT()+ " troops");
                    myTotalArmy=two.getArmyT();
                    two.remCard(chosenTerr);
                    finishCard=true;
                    
                  }
                  else{System.out.println("Please type in the name as you see it");
                  }
                  
                }
              }
            }
            //------------------------------------------------------------------Choosing Territory---------------------------------------------------------------
            while (finishChoose != true){
              
              
              System.out.println("You have " + two.getArmyT() + " troops. Which territory would you like to place them in?");
              chosenTerr = Keyboard.readString();
              if (two.doIhave(chosenTerr)==true){
                finishChoose=true;
                
              }
              else if (two.doIhave(chosenTerr)==false){
                System.out.println("You do not own this territory, go conquer it first!");
                
                
              }
              
              
            }
            //------------------------------------------------------------------Choosing Territory---------------------------------------------------------------
            
            //------------------------------------------------------------------DEPLOYMENT CODE---------------------------------------------------------------
            while (troopGone != true){
              if (myTotalArmy <= 0){
                troopGone=true;
                fullDeploy=true;
              }
              System.out.println("How many troops would you like to deploy?");
              
              deployedTroops = Integer.parseInt(Keyboard.readString());
              if (deployedTroops <= 0 || deployedTroops > myTotalArmy){
                System.out.println("You do not have that many troops, please retry");
              }
              else if (deployedTroops > 0 || deployedTroops <= myTotalArmy){
                
                System.out.println("You troops have been deployed general");
                
                (returnATerr(chosenTerr)).addArmy(deployedTroops);
                myTotalArmy-=deployedTroops;
                System.out.println((returnATerr(chosenTerr)).getarmy());
                troopGone=true;
              }
              
              
              
              
            }
            if (myTotalArmy >0){
              troopGone=false;
              finishChoose=false;
              
            }
            
            else if (myTotalArmy <=0){
              fullDeploy=true;
              troopGone=true;
            }
            
            //------------------------------------------------------------------DEPLOYMENT CODE---------------------------------------------------------------
            
            
          }
          
          
          
          
          
          
          
          
          
          //------------------------------------------------------------------Transfer Troops--------------------------------------------------------------
          System.out.println("Would you like to transfer troops? Y or N");
          response="";
          response = Keyboard.readString();
          
          if (response.equals("Y") || response.equals("y")){
            
            while (finishTransfer!=true){
              System.out.println("What territory do you want to transfer from? Type End to stop transfer stage"); 
              OneTer = Keyboard.readString();
              if (OneTer.equals( "End")){
                finishTransfer=true;
              }
              else if (OneTer!="End"){
                
                if (two.doIhave(OneTer)==false){
                  System.out.println("You do not have this, please retry");
                  //Did you do the 2 fxn's
                }
                else if (two.doIhave(OneTer)==true){
                  System.out.println("What territory do you want to transfer to?"); 
                  TwoTer = Keyboard.readString();
                  if (two.doIhave(TwoTer)==false){
                    System.out.println("You do not have this, please retry");
                  }
                  else if (two.doIhave(TwoTer)== true){
                    if (Nearby.near(OneTer,TwoTer)==false){
                      System.out.println("Illegal move, please retry");
                    }
                    else if (Nearby.near(OneTer,TwoTer)==true){
                      System.out.println(OneTer+" has "+ returnATerr(OneTer).getarmy() + " troops"); 
                      System.out.println("How many troops do you want to send? If its greator then your total amount, we will send total-2");
                      transferAmount=Integer.parseInt(Keyboard.readString());
                      if (transferAmount < returnATerr(OneTer).getarmy()){
                        returnATerr(OneTer).subArmy(transferAmount);
                        returnATerr(TwoTer).addArmy(transferAmount);
                        System.out.println("Now "+ OneTer+" has " +(returnATerr(OneTer)).getarmy()+" troops.");
                        System.out.println("Now "+ TwoTer+" has " +(returnATerr(TwoTer)).getarmy()+" troops.");
                        finishTransfer=true;
                      }
                      else if (transferAmount >= returnATerr(OneTer).getarmy()){
                        
                        transferAmount=returnATerr(OneTer).getarmy();
                        (returnATerr(OneTer)).subArmy(transferAmount-2);
                        returnATerr(TwoTer).addArmy(transferAmount-2);
                        System.out.println("Now "+ OneTer+" has " +(returnATerr(OneTer)).getarmy()+" troops.");
                        System.out.println("Now "+ TwoTer+" has " +(returnATerr(TwoTer)).getarmy()+" troops.");
                      }
                      finishTransfer=true;
                      
                    }
                  }
                }
                
                
              }
              
            }
            
          }
          
          
          
          
          
          
          //------------------------------------------------------------------Transfer Troops--------------------------------------------------------------
          //------------------------------------------------------------------Battle Stage--------------------------------------------------------------
          finishChoose=false;
          while (attackFinished!=true){
            
            while (finishChoose != true){
              System.out.println("Which territory would you like to attack with? Type End to not attack");
              chosenTerr=Keyboard.readString();
              if (chosenTerr.equals("End")==true){
                finishChoose=true;
                attackFinished=true;
              }
              
              
              else if (two.doIhave(chosenTerr)==true){
                finishChoose=true;
                
              }
              else if (two.doIhave(chosenTerr)==false){
                System.out.println("You do not own this territory, go conquer it first!");
                
                
              }
              
              
            }
            if (attackFinished==false){
              System.out.println("These are your neighboring territories:");
              System.out.println(Nearby.displayNearby(chosenTerr));
              System.out.println("Choose one to attack .HINT ONLY CHOOSE N1");
              targetTerr=Keyboard.readString();
              if (two.doIhave(targetTerr)==true){
                System.out.println("This is your own territory, you cannot attack this.");
              }
              else if (Nearby.near(chosenTerr,targetTerr)==true){
                System.out.println("How many troops would you like to send?");
                deployedTroops=Integer.parseInt(Keyboard.readString());
                System.out.println("Would you like to see a simulation of the battle beforehand? Say Yes to see simulation, say No to not see simulation");
                response = Keyboard.readString();
                if (response.equals("Yes")==true){
                  statGraph(deployedTroops, targetTerr);
                  
                }
                if (response.equals("No")==true){
                  System.out.println("Please continue with the battle");
                  
                }
                System.out.println("Would you like to continue with this battle? Say Yes to continue, or End to stop battle phase");
                response=Keyboard.readString();  
                
                if (response.equals("End")==true){
                  attackFinished=true;
                }
                
                if (response.equals("Yes")==true){
                  if (deployedTroops<returnATerr(chosenTerr).getarmy()){
                    
                    battle(two, one,chosenTerr, targetTerr, deployedTroops );
                    
                  }
                  
                  else if (deployedTroops>=returnATerr(chosenTerr).getarmy()){
                    
                    System.out.println("Command issues failed. You cannot send out your total troops or more than you own.");
                    
                    
                  }
                  
                  
                }}
              else{
                System.out.println("This is not a neighboring territory, please try again");
                
              }
              finishChoose=false;
              
            }
            
            
            
          }
          two.subArmy(remArmy);
          two.armyUpdate();
          contConquer(two);
        }
        theTurn=0; }}}
  
  
  
  
  
  
  
  
  
  
  
  //----------------------------------------------------------------------Player Two----------------------------------------------
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public static void battle(Player myturn, Player attacked, String attack, String defend, int deployed){
    
    int randomy, armytotalmine, armytotalother, placeHold;
    Territory mine = returnATerr(attack);
    Territory take = returnATerr(defend);
    armytotalmine = deployed;
    placeHold=armytotalmine;
    armytotalother = (returnATerr(defend)).getarmy();
    boolean battleover=false;
    while (battleover==false){
      System.out.println("You have "+ armytotalmine+ " troops remaining");
      System.out.println("Enemy has "+ (returnATerr(defend)).getarmy()+ " troops remaining");
      if ((returnATerr(defend)).getarmy() == 0){
        (returnATerr(defend)).setOwner(myturn.symbol);
        myturn.addTerritory((returnATerr(defend)).getName());
        System.out.println("You have conquered " + (returnATerr(defend)).getOwner());
        (returnATerr(attack)).subArmy(placeHold);
        (returnATerr(defend)).addArmy(armytotalmine);
        battleover=true;
        attacked.removeTerritory((returnATerr(defend)).getName());
        System.out.println("The attacking land has " + (returnATerr(attack)).getarmy()+ " remaining.");
        System.out.println("The conquered land now has " + (returnATerr(defend)).getarmy()+ " troops there.");
        
        randomy=(int)(Math.random()*50);
        if (randomy <= 5){
          myturn.addCards("airSupport");
          System.out.println("This conquered land has a air field, you received the airSupport card, good for 10 troops!");
          
        }
        else if (randomy <= 10 && randomy >= 5){
          myturn.addCards("groundSupport");
          System.out.println("This conquered land has storm trooper army, you received the airSupport card, good for 10 troops!");
          
        }
        else if (randomy <= 15 && randomy >= 10 ){
          myturn.addCards("navySupport");
          System.out.println("This conquered land has a ship base, you received the navySupport card, good for 10 troops!");
          
        }
        
        
        
        
      }
      else if (armytotalmine<=0){
        (returnATerr(attack)).subArmy(placeHold);
        (returnATerr(attack)).addArmy(1);
        battleover=true;
      }
      else {
        randomy=(int)(Math.random()*100);
        if (randomy <= 50){
          armytotalmine-=1;  
          
          
        }
        else{
          (returnATerr(defend)).subArmy(1);
          
        }
        
        
      }
    }
    
    
  }
  
  
  public static void contConquer(Player x){
    if (x.doIhave("N1") && x.doIhave("N2") && x.doIhave("N3") && x.doIhave("N4") && x.doIhave("N5") && x.doIhave("N6") && x.doIhave("N7") && x.doIhave("N8"))
      x.setNorth(true);
    if (!(x.doIhave("N1") && x.doIhave("N2") && x.doIhave("N3") && x.doIhave("N4") && x.doIhave("N5") && x.doIhave("N6") && x.doIhave("N7") && x.doIhave("N8")))
      x.setNorth(false);  
    if (x.doIhave("S1") && x.doIhave("S2") && x.doIhave("S3") && x.doIhave("S4"))
      x.setSouth(true);
    if (!(x.doIhave("S1") && x.doIhave("S2") && x.doIhave("S3") && x.doIhave("S4")))
      x.setSouth(false);
    if (x.doIhave("A1") && x.doIhave("A2") && x.doIhave("A3") && x.doIhave("A4") && x.doIhave("A5") && x.doIhave("A6"))
      x.setAsia(true);
    if (!(x.doIhave("A1") && x.doIhave("A2") && x.doIhave("A3") && x.doIhave("A4") && x.doIhave("A5") && x.doIhave("A6")))
      x.setAsia(false);
    if (x.doIhave("R1") && x.doIhave("R2") && x.doIhave("R3") && x.doIhave("R4") && x.doIhave("R5") && x.doIhave("R6") && x.doIhave("R7") && x.doIhave("R8") && x.doIhave("R9") && x.doIhave("R10") && x.doIhave("R11") && x.doIhave("R12"))
      x.setRussia(true);
    if (!(x.doIhave("R1") && x.doIhave("R2") && x.doIhave("R3") && x.doIhave("R4") && x.doIhave("R5") && x.doIhave("R6") && x.doIhave("R7") && x.doIhave("R8") && x.doIhave("R9") && x.doIhave("R10") && x.doIhave("R11") && x.doIhave("R12")))
      x.setRussia(false);
    if (x.doIhave("E1") && x.doIhave("E2") && x.doIhave("E3") && x.doIhave("E4") && x.doIhave("E5") && x.doIhave("E6") && x.doIhave("E7"))
      x.setEurope(true);
    if (!(x.doIhave("E1") && x.doIhave("E2") && x.doIhave("E3") && x.doIhave("E4") && x.doIhave("E5") && x.doIhave("E6") && x.doIhave("E7")))
      x.setEurope(false);
    if (x.doIhave("O1") && x.doIhave("O2") && x.doIhave("O3") && x.doIhave("O4"))
      x.setOceana(true);
    if (!(x.doIhave("O1") && x.doIhave("O2") && x.doIhave("O3") && x.doIhave("O4")))
      x.setOceana(false);
  }
  
  public static void statGraph(int deployed, String defend){
    int defending = (returnATerr(defend)).getarmy();
    if (defending == 0)
      System.out.println("You have a 100% chance of conquering this territory " + returnATerr(defend));
    else{
      int deployedP = deployed; //Placeholders for statistics afterwards
      int defendingP = defending; 
      while(defending >= 1 && deployed >= 1){
        int y = (int)(Math.random() * 100);
        if(y >= 50){
          defending -= 1;
        }
        else{
          deployed -= 1;
        }
      }
      int deployedD = deployedP - deployed; //How many deaths in the deployed troops
      int defendingD = defendingP - defending; // How many deaths in the defending troops
      System.out.println("Estimated troops remaining: " + deployed + "\n");
      for(int x = 0; x < deployed; x++){
        System.out.print("*");
      }
      System.out.println("\n");
      System.out.println("Estimated troops lost: " + deployedD + "\n");
      for(int x = 0; x < deployedD; x++){
        System.out.print("*");
      }
      System.out.println("\n");
      System.out.println("Estimated enemy troops destroyed: " + defendingD + "\n");
      for(int x = 0; x < defendingD; x++){
        System.out.print("*");
      }
      System.out.println("\n");
      System.out.println("Estimated enemy troops remaining: " + defending + "\n");
      for(int x = 0; x < defending; x++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  
  public static String[] updateMap(){
    String[] map2 = {"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~____________~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~_________________________~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|     N3     |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~___|    R2    |    R3        |~~~~~~~~~~~~\n",
      "~~~_______~~~~~~~~~~~~~~~~~~~~~~|             |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~| R1 |         |         _____|____~~~~~~~~\n",
      "~~|   N1  |_____________________|___  "+ N3.display()+"    |~~~~~~~~~~~~~~~______________|     |         | "+ R3.display()+"   |    R4    |~~~~~~~\n",
      "~~|       |   N2                    |        |~~~~~~~~~~~~~__|  E2  |  E3   |      |   "+ R2.display()+" |       |          _|~~~~~~~\n",
      "~~|  "+ N1.display()+" |      "+ N2.display()+"        ________|___ ___|_~~~~~~~~~~~|         |       |       |       |_____ |   "+ R4.display()+"  _|~~~~~~~~~\n",
      "~~|        |________________|    N4      |~~~~~|_________|          |       |        |      | R5  |         |~~~~~~~~~~~\n",
      "~~|_______  |  N5           |            |~~~~~~_|  E1    |  "+ E2.display()+"   |       | "+ R1.display()+"   |      |     |     ___|~~~~~~~~~~~~\n",
      "~~~~~~~~~~|_|                |  "+ N4.display()+"   __|~~~~~|          |         | "+ E3.display()+"  |        |      |"+ R5.display()+" |    | R6 |~~~~~~~~~~~\n",
      "~~~~~~~~~~~~|      "+ N5.display()+"       |       |~~~~~~~~|   "+ E1.display()+"   |__       |       |        |      |    |     |    |_~~~~~~~~~~\n",
      "~~~~~~~~~~~~| _________________|____ _|~~~~~~~|__________|   | ____|__      |        |      |    |_____| "+ R6.display()+" |~~~~~~~~~\n",
      "~~~~~~~~~~~~~|    N6      |   N7    |~~~~~~~~~|     E4        |   E5  |     |         |     |   |  R7  |     __|~~~~~~~~\n",
      "~~~~~~~~~~~~|            |          |~~~~~~~~|                 |      |     |__        |    |_ |       |     |~~~~~~~~~~\n",
      "~~~~~~~~~~~~|    "+ N6.display()+"   |          |~~~~~~~~|     "+ E4.display()+"         |      |     |  |___     |     |        |_____|~~~~~~~~~~\n",
      "~~~~~~~~~~~~|           |    "+ N7.display()+"  |~~~~~~~~|                 |  "+ E5.display()+" |    |  R9   |___ _|____|   "+ R7.display()+"        |~~~~~~~~~\n",
      "~~~~~~~~~~~~| _______ _|        ___|~~~~~~~|_____ _____      |        |    |           |  R8  |              _|~~~~~~~~~\n",
      "~~~~~~~~~~~~~|  N8   |         |~~~~~~~~~~~~~~~~~|  E6 |____|         |   |   "+ R9.display()+"    |        |____________|~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~|        |       |~~~~~~~~~~~~~~~~~|           |_ _______|   |           |                    |~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~| "+ N8.display()+"  _|_____|~~~~~~~~~~~~~~~~~__|            |   E7  |___|______     |____   "+ R8.display()+"      __|~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~|     |~~~~~~~~~~~~~~~~~~~~~~~~|     "+ E6.display()+"      |          |  R10  |__ | R11 |           |~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~|    |~~~~~~~~~~~~~~~~~~~~~~~~~~|              |   "+ E7.display()+"    |         |      |          |~~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~|__  |__~~~~~~~~~~~~~~~~~~~~~~~~|     __________|          |  "+ R10.display()+"   | "+ R11.display()+" |_________ |~~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~|_   |~~~~~~~~~~~~~~~~~~~~~~|___ _|    A1     |_________|         |      |   R12   |~~~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~|  |~~~~~~~~~~~~~~~~~~~~~~~~~~|             |    A2   |_____    |       |        |~~~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~|_|_________~~~~~~~~~~~~~~~~~|             |               |____|     _| "+ R12.display()+"   |~~~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~|    S1    |__~~~~~~~~~~~~~~|             |    "+ A2.display()+"       |~~~~|    |~~|      |~~~~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~|_      "+ S1.display()+" |_~~~~~~~~~~~|      "+ A1.display()+"     |              |~~~~|    |~~~|     |~~~~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~|  |____        |_____~~~~|                 |____________ |~~~~|   |~~~~~|     |~~~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~|  S2    |_______| S3  |~~/|                  |    A3     |~~~~~~|  |~~~~~~|   |~~~~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~|          |            |/~|                   |         |~~~~~~~~| |~~~~~~~|_ |_________~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~|_ "+ S2.display()+"    |    "+ S3.display()+"  |~~~|                   | "+ A3.display()+"   |~~~~~~~~~~|~~~~~~~~~~|    O1    |~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~|         |        |~~~~~|_                 |         |~~~~~~~~~~~~~~______|           |_~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~|__        |      |~~~~~~~~|_______________|        _|~~~~~~~~~~~~~~|_  O2  |_   "+ O1.display()+"    |~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~|       |      |~~~~~~~~~~~~~~~~~|   A4  |      |~~~~~~~~~~~~~~~~~~|       |_     ____|~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~|        |_ __|~~~~~~~~~~~~~~~~~|         |___ |~~~~~~~~~~~~~~~~~~~|_  "+ O2.display()+"  |___|~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~|_____     |~~~~~~~~~~~~~~~~~~~~~|            |~~~~~~~~~~~~~~~~~~~~~~|_          |_____~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~| S4  |___ |~~~~~~~~~~~~~~~~~~~~~~|  "+ A4.display()+"     |~~~~~~~~~~~~~~~~~~~~~~~~|____ ___|  O4  |~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~|         |~~~~~~~~~~~~~~~~~~~~~~~|           |~~~~~~~~~~~~~~~~~~~~~~~~~~~~_| O3|       |~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~| "+ S4.display()+"  _|~~~~~~~~~~~~~~~~~~~~~~~~|_____      |________~~~~~~~~~~~~~~~~~ _|      |       |~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~|      |~~~~~~~~~~~~~~~~~~~~~~~~~~|  A5 |_____|   A6   |~~~~~~~~~~~~~~~~|        |  "+ O4.display()+"  |~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~|     _|~~~~~~~~~~~~~~~~~~~~~~~~~~|            |_      |~~~~~~~~~~~~~~~~~|   "+ O3.display()+"  |        |~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~|   |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|  "+ A5.display()+"    |~| "+ A6.display()+" |~~~~~~~~~~~~~~~~~|          |       |~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~|    |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|        |~~|     |~~~~~~~~~~~~~~~~~~~|          |      |~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~|   |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|       |~~~|    _|~~~~~~~~~~~~~~~~~~~|   _______|    |~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~|  |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|     |~~~~|___|~~~~~~~~~~~~~~~~~~~~~|__|~~~~~~~|    |~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~|__ |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~| ____|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|____|~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|_|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n",
      "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"};
    return map2;
  }
  
  public static void showMap(String[] map){
    for(int x = 0; x < 48; x++){
      System.out.print(map[x]);
    }
    return;
  }
  public static Cards returnACard(String x){
    if (x.equals("airSupport")){
      return airSupport;
      
    }
    else if (x.equals("groundSupport")){
      return groundSupport;
      
    }
    else if (x.equals("navySupport")){
      return navySupport;
      
    }
    else{return navySupport;}
  }
  
  public static Territory returnATerr(String x){
    if (x.equals("N1")){
      return N1;
      
    }
    if (x.equals("N2")){
      return N2;
      
    }
    if (x.equals("N3")){
      return N3;
      
    }
    if (x.equals("N4")){
      return N4;
      
    }
    if (x.equals( "N5")){
      return N5;
      
    }
    if (x.equals("N6")){
      return N6;
      
    }
    if (x.equals("N7")){
      return N7;
      
    }
    if (x.equals("N8")){
      return N8;
      
    }
    if (x.equals("S1")){
      return S1;
      
    }
    if (x.equals("S2")){
      return S2;
      
    }
    if (x.equals("S3")){
      return S3;
      
    }
    if (x.equals("S4")){
      return S4;
      
    }
    if (x.equals("E1")){
      return E1;
      
    }
    if (x.equals("E2")){
      return E2;
      
    }if (x.equals("E3")){
      return E3;
      
    }
    if (x.equals("E4")){
      return E4;
      
    }
    if (x.equals( "E5")){
      return E5;
      
    }
    if (x.equals("E6")){
      return E6;
      
    }
    if (x.equals("E7")){
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