public class Nearby{
    private final static String[][] nearby ={{"N2", "N5"}, //These are the territories around N1
                                            {"N1", "N3", "N4", "N5"}, //N2
                                            {"N2", "N4", "E1"}, //N3
                                            {"N2", "N3", "N5", "N7"}, //N4
                                            {"N1", "N2", "N4", "N6", "N7"}, //N5
                                            {"N5", "N7", "N8"}, //N6
                                            {"N4", "N5", "N6", "N8"}, //N7
                                            {"N6", "N7", "S1"}, //N8
                                            {"N8", "S2", "S3"}, //S1
                                            {"S1", "S3", "S4"}, //S2
                                            {"S1", "S2", "A1"}, //S3
                                            {"S2"}, //S4
                                            {"N3","E2","E4"}, //E1
                                            {"E1","E3","E4","E5"}, //E2
                                            {"E2", "E5", "E7", "R1", "R9", "R10"}, //E3
                                            {"E1", "E2", "E5", "E6"}, //E4
                                            {"E2", "E3", "E4", "E6", "E7"}, //E5
                                            {"E4", "E5", "E7", "A1"}, //E6
                                            {"E3", "E5", "E6", "A1", "A2", "R10"}, //E7
                                            {"E6", "E7", "A2", "A3", "A4"}, //A1
                                            {"A1", "A3", "E7", "R10"}, //A2
                                            {"A1", "A2", "A4"}, //A3
                                            {"A1", "A3", "A5", "A6"}, //A4
                                            {"A4", "A6"}, //A5
                                            {"A4", "A5"}, //A6
                                            {"E3", "R2", "R8", "R9"}, //R1
                                            {"R1", "R3", "R5", "R7", "R8"}, //R2
                                            {"R2", "R5", "R4"}, //R3
                                            {"R3", "R5", "R6", "R7"}, //R4
                                            {"R2", "R3", "R4", "R7"}, //R5
                                            {"R4", "R7"}, //R6
                                            {"R2", "R4", "R5", "R6", "R8"}, //R7
                                            {"R1", "R2", "R7", "R9", "R11", "R12"}, //R8
                                            {"E3", "R1", "R8", "R10", "R11"}, //R9
                                            {"E3", "E7", "A2", "R9", "R11"}, //R10
                                            {"R8", "R9", "R10", "R12"}, //R11
                                            {"R8", "R11", "O1"}, //R12
                                            {"R12", "O2"}, //O1
                                            {"O1", "O3", "O4"}, //O2
                                            {"O2", "O4"}, //O3
                                            {"O2", "O3"}}; //O4

    
    public static int convert( String terr ){
        String firstChar = terr.substring(0,1);
        String second = terr.substring(1);
        
        if (firstChar.equals("N")){ 
            if (second.equals("1")) return 0;
            else if (second.equals("2")) return 1;
            else if (second.equals("3")) return 2;
            else if (second.equals("4")) return 3;
            else if (second.equals("5")) return 4;
            else if (second.equals("6")) return 5;
            else if (second.equals("7")) return 6;
            else return 7;
        }
        
        else if (firstChar.equals("S")){
            if (second.equals("1")) return 8;
            else if (second.equals("2")) return 9;
            else if (second.equals("3")) return 10;
            else return 11;
        }
        
        else if (firstChar.equals("E")){
            if (second.equals("1")) return 12;
            else if (second.equals("2")) return 13;
            else if (second.equals("3")) return 14;
            else if (second.equals("4")) return 15;
            else if (second.equals("5")) return 16;
            else if (second.equals("6")) return 17;
            else return 18;
        }
        
        else if (firstChar.equals("A")){
            if (second.equals("1")) return 19;
            else if (second.equals("2")) return 20;
            else if (second.equals("3")) return 21;
            else if (second.equals("4")) return 22;
            else if (second.equals("5")) return 23;
            else return 24;
        }
        
        else if (firstChar.equals("R")){
            if (second.equals("1")) return 25;
            else if (second.equals("2")) return 26;
            else if (second.equals("3")) return 27;
            else if (second.equals("4")) return 28;
            else if (second.equals("5")) return 29;
            else if (second.equals("6")) return 30;
            else if (second.equals("7")) return 31;
            else if (second.equals("8")) return 32;
            else if (second.equals("9")) return 33;
            else if (second.equals("10")) return 34;
            else if (second.equals("11")) return 35;
            else return 36;
        }
        
        else{
            if (second.equals("1")) return 37;
            else if (second.equals("2")) return 38;
            else if (second.equals("3")) return 39;
            else return 40;
        }
    }
    
    public static String[] getNearby(int x){
        return nearby[x];
    }
    
    public static String displayNearby(String x){
        int a = convert(x);
        String y = "";
        for(int z = 0; z < nearby[a].length; z++){
            y = y + nearby[a][z] + "   ";
        }
        return y;
    }

    //Checks to see if the territory chosen is nearby.
    public static boolean near(String actionTerr, String reactTerr){ //actionTerr = Territory either attacking or lending troops. reactTerr = Territory defending or receiving troops.
        boolean isNearby = false;
        int row = convert(actionTerr);
        for(int x = 0; x < nearby[row].length; x++){
            if (reactTerr.equals(nearby[row][x]))
                isNearby = true;
        }
        return isNearby;
    }
    
    public static void main(String[] args){
        //System.out.println(getNearby(0));
        System.out.println(convert("N1")); //Should be 0
        System.out.println(convert("O3")); //Should be 39
        System.out.println(near("N1", "N2")); //Should be true
        System.out.println(near("N1", "O1")); //Should be false
        System.out.println(displayNearby("N1")); 
        System.out.println(displayNearby("E3"));
    }
}