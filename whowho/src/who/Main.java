package who;

import javax.swing.JOptionPane;

public class Main { //the Main class
	//the main method that runs a text window, a randomizer method(chooser), and the final guess
	public static void main(String[] args){
		Window.msg("Welcome to guess who!\nIn this game, a random set of characters will be selected as the answer and you will have to guess it!\nYou will get 3 attempts on finding out the answers characteristics, once that is up you must guess!\nNow goodluck!");
		chooser();
		Windoww();
	
	public static String C9 = "pp"; 
	public static String C10 = "lol"; 
	static int Chosen = 0; 
	static String ChosenDisplay = ""; 
	
	static boolean hasO;
	static boolean hasP;
	static boolean hasE;
	static boolean hasC;
	static boolean hasD;
	static boolean hasL;
	static boolean hasTwoCapitals;
	static boolean hasTwoLowercase;
	static boolean hasOneCapital;
	static boolean has3Letters;
	//A chart of all the characters and how they are displayed
	public static String[][] Chart = {
		{C1 	, C2 	, C3 	, C4 	, C5 	},
		{C6 	, C7 	, C8 	, C9 	, C10 	},
};
	//A list of all the questions that a user can answer
	static String[] Questions = {
			"Is there an O?",
			"Is there a P?",
			"Is there an E?",
			"Is there a C?",
			"Is there a D?",
			"Is there an L?",
			"Does it have 2 Capitals?",
			
		Chart[0][4],
		Chart[1][0],
		Chart[1][1],
		Chart[1][2],
		Chart[1][3],
		Chart[1][4],
		"Exit"
};
	//The method that chooses which one is the correct guess and sets boolean equal to approximate values to the chosen guess
	public static int chooser(){
		int choser = (int)(Math.random()*10 + 1);//Randomizes through a value of 10 to select the correct guess
		if(choser == 1){ //if the guess is 1
			// OP
			Chosen = 1; //set chosen to option 1
			ChosenDisplay = C1; //display character 1
			hasO = true;//hasO is true
			hasP = true;//hasP is true
			hasE = false;//hasE is false
			hasC = false;//hasC is false
			hasD = false;//hasD is false
			hasL = false;//hasL is false
			hasTwoCapitals = true;//hasTwoCapitals is true
			hasTwoLowercase = false;//hasTwoLowercase is false
			hasOneCapital = false;//hasOneCapital is false
			has3Letters = false;//has3Letters is false
		}
		//The same as above for all corresponding character options
		if(choser == 2){ 
			// OC
			Chosen = 2; 
			ChosenDisplay = C2; 
			hasO = true;
			hasP = false;
			hasE = false;
			hasC = true;
			hasD = false;
			hasL = false;
			hasTwoCapitals = true;
			hasTwoLowercase = false;
			hasOneCapital = false;
			has3Letters = false;
		}
		if(choser == 3){
			// oE
			Chosen = 3;
			ChosenDisplay = C3;
			hasO = true;
			hasP = false;
			hasE = true;
			hasC = false;
			hasD = false;
			hasL = false;
			hasTwoCapitals = false;
			hasTwoLowercase = false;
			hasOneCapital = true;
			has3Letters = false;
		}
		if(choser == 4){
			// od
			Chosen = 4;
			ChosenDisplay = C4;
			hasO = true;
			hasP = false;
			hasE = false;
			hasC = false;
			hasD = true;
			hasL = false;
			hasTwoCapitals = false;
			hasTwoLowercase = true;
			hasOneCapital = false;
			has3Letters = false;
		}
		if(choser == 5){
			// PE
			Chosen = 5;
			ChosenDisplay = C5;
			hasO = false;
			hasP = true;
			hasE = true;
			hasC = false;
			hasD = false;
			hasL = false;
			hasTwoCapitals = true;
			hasTwoLowercase = false;
			hasOneCapital = false;
			has3Letters = false;
		}
		if(choser == 6){
			// cE
			Chosen = 6;
			ChosenDisplay = C6;
			hasO = false;
			hasP = false;
			hasE = true;
			hasC = true;
			hasD = false;
			hasL = false;
			hasTwoCapitals = false;
			hasTwoLowercase = false;
			hasOneCapital = true;
			has3Letters = false;
		}
		if(choser == 7){ 
			// pL
			Chosen = 7;
			ChosenDisplay = C7;
			hasO = false;
			hasP = true;
			hasE = false;
			hasC = false;
			hasD = false;
			hasL = true;
			hasTwoCapitals = false;
			hasTwoLowercase = false;
			hasOneCapital = true;
			has3Letters = false;
		}
		if(choser == 8){ 
			// cd
			Chosen = 8;
			ChosenDisplay = C8;
			hasO = false;
			hasP = false;
			hasE = false;
			hasC = true;
			hasD = true;
			hasL = false;
			hasTwoCapitals = false;
			hasTwoLowercase = true;
			hasOneCapital = false;
			has3Letters = false;
		}
		if(choser == 9){ 
			// pp
			Chosen = 9;
			ChosenDisplay = C9;
			hasO = false;
			hasP = true;
			hasE = false;
			hasC = false;
			hasD = false;
			hasL = false;
			hasTwoCapitals = false;
			hasTwoLowercase = true;
			hasOneCapital = false;
			has3Letters = false;
		}
		if(choser == 10){
			// lol
			Chosen = 10;
			ChosenDisplay = C10;
			hasO = false;
			hasP = false;
			hasE = false;
			hasC = false;
			hasD = false;
			hasL = true;
			hasTwoCapitals = false;
			hasTwoLowercase = true;
			hasOneCapital = false;
			has3Letters = true;
		}
		System.out.println(Chosen);
		return Chosen;
	}
	
	//creates and organizes the display using the Chart initialized by 
	//using a double for loop and adding spaces and whats at the approximate index
	public static String display(String[][] Chart){
		String blank = "                                                                                                                                                                                                                                                                    ";
		for(int r = 0; r < 2; r++){
			for(int c = 0; c < 5; c++){
				blank += Chart[r][c];
				blank += " ";
			}
			blank += "\n                                                                                                                                                                                                                                                                    ";
		}
		blank += "Possible Questions: " +turns;
		return blank;
	}
	
		//Displays the chart as a joption pane window accesing through the window class
		//And updates the GUI based on the correct guess and what the user guesses(chooses) by crossing out certain values
		//And subtracting the value to the players turns
		public static void Windoww(){
			while(turns > 0){
		int x = Window.option(Questions, display(Chart)) + 1;
		
		if(x == 1){
			if(hasO == false){
				Window.msg("Incorrect!");
				Chart[0][0] = "-- ";
				Chart[0][1] = "-- ";
				Chart[0][2] = "-- ";
				Chart[0][3] = "-- ";
				ChosenDisplay = ChosenDisplay;
			}
			else{
				Window.msg("There is an O!");
				Chart[0][4] = "-- ";
				Chart[1][0] = "-- ";
				Chart[1][1] = "-- ";
				Chart[1][2] = "-- ";
				Chart[1][3] = "-- ";
				Chart[1][4] = "-- ";
				}
			turns--;
		}
		if(x == 2){
			if(hasP == false){
				Window.msg("Incorrect!");
				Chart[0][0] = "-- ";
				Chart[0][4] = "-- ";
				Chart[1][1] = "-- ";
				Chart[1][3] = "-- ";
				ChosenDisplay = ChosenDisplay;
			}
			else{
				Window.msg("There is a P!");
				Chart[0][1] = "-- ";
				Chart[0][2] = "-- ";
				Chart[0][3] = "-- ";
				Chart[1][0] = "-- ";
				Chart[1][2] = "-- ";
				Chart[1][4] = "-- ";
			}
			turns--;
		}
		if(x == 3){
			if(hasE == false){
				Window.msg("Incorrect!");
				Chart[0][2] = "-- ";
				Chart[0][4] = "-- ";
				Chart[1][0] = "-- ";
			}
			else{
				Window.msg("There is an E!");
				Chart[0][0] = "-- ";
				Chart[0][1] = "-- ";
				Chart[1][1] = "-- ";
				Chart[0][3] = "-- ";
				Chart[1][2] = "-- ";
				Chart[1][3] = "-- ";
				Chart[1][4] = "-- ";
			}
			turns-=1;
		}
		if(x == 4){
			if(hasC == false){
				Window.msg("Incorrect!");
				Chart[0][1] = "-- ";
				Chart[1][0] = "-- ";
				Chart[1][2] = "-- ";
				ChosenDisplay = ChosenDisplay;
			}
			else{
				Window.msg("There is a C!");
				Chart[0][0] = "-- ";
				Chart[0][2] = "-- ";
				Chart[0][3] = "-- ";
				Chart[0][4] = "-- ";
				Chart[1][1] = "-- ";
				Chart[1][3] = "-- ";
				Chart[1][4] = "-- ";
			}
			turns-=1;
		}
		if(x == 5){
			if(hasD == false){
				Window.msg("Incorrect!");
				Chart[0][3] = "-- ";
				Chart[1][2] = "-- ";
				ChosenDisplay = ChosenDisplay;
			}
			else{
				Window.msg("There is a D!");
				Chart[0][0] = "-- ";
				Chart[0][1] = "-- ";
				Chart[0][2] = "-- ";
				Chart[0][4] = "-- ";
				Chart[1][0] = "-- ";
				Chart[1][1] = "-- ";
				Chart[1][3] = "-- ";
				Chart[1][4] = "-- ";
				
			}
			turns-=1;
		}
		if(x == 6){
			if(hasL == false){
				Window.msg("Incorrect!");
				Chart[1][1] = "-- ";
				Chart[1][4] = "-- ";
				ChosenDisplay = ChosenDisplay;
			}
			else{
				Window.msg("There is an L!");
				Chart[0][0] = "-- ";
				Chart[0][1] = "-- ";
				Chart[0][2] = "-- ";
				Chart[0][3] = "-- ";
				Chart[0][4] = "-- ";
				Chart[1][0] = "-- ";
				Chart[1][2] = "-- ";
				Chart[1][3] = "-- ";
			}
			turns-=1;
		}
		if(x == 7){
			if(hasTwoCapitals == false){
				Window.msg("Incorrect!");
				Chart[0][0] = "-- ";
				Chart[0][1] = "-- ";
				Chart[0][4] = "-- ";
				ChosenDisplay = ChosenDisplay;
			}
			else{
				Window.msg("There are 2 capitals!");
				Chart[0][2] = "-- ";
				Chart[0][3] = "-- ";
				Chart[1][0] = "-- ";
				Chart[1][1] = "-- ";
				Chart[1][2] = "-- ";
				Chart[1][3] = "-- ";
				Chart[1][4] = "-- ";
			}
			turns-=1;
			
		}
		if(x == 8){
			if(hasTwoLowercase == false){
				Window.msg("Incorrect!");
				Chart[0][3] = "-- ";
				Chart[1][2] = "-- ";
				Chart[1][3] = "-- ";
				Chart[1][4] = "-- ";
				ChosenDisplay = ChosenDisplay;
			}
			else{
				Window.msg("They are all lowercases!");
				Chart[0][0] = "-- ";
				Chart[1][1] = "-- ";
				Chart[0][1] = "-- ";
				Chart[0][2] = "-- ";
				Chart[0][4] = "-- ";
				Chart[1][0] = "-- ";
			}
			turns-=1;
		}
		if(x == 9){
			if(hasOneCapital == false){
				Window.msg("Incorrect!");
				Chart[0][2] = "-- ";
				Chart[1][0] = "-- ";
				Chart[1][1] = "-- ";
				ChosenDisplay = ChosenDisplay;
			}
			else{
				Window.msg("There is one capital!");
				Chart[0][0] = "-- ";
				Chart[0][1] = "-- ";
				Chart[0][3] = "-- ";
				Chart[0][4] = "-- ";
				Chart[1][2] = "-- ";
				Chart[1][3] = "-- ";
				Chart[1][4] = "-- ";
			}
			turns-=1;
		}
		if(x == 10){
			if(has3Letters == false){
				Window.msg("Incorrect!");
				Chart[1][4] = "-- ";
				ChosenDisplay = ChosenDisplay;
			}
			else{
				Window.msg("There is 3 letters!");
				Chart[0][0] = "-- ";
				Chart[0][1] = "-- ";
				Chart[0][2] = "-- ";
				Chart[0][3] = "-- ";
				Chart[0][4] = "-- ";
				Chart[1][0] = "-- ";
				Chart[1][1] = "-- ";
				Chart[1][2] = "-- ";
				Chart[1][3] = "-- ";
			}
			turns-=1;
		}
		if(x == 11){
			System.exit(0);
		}
		}
			
	}
	//Method that organizes the display GUI by adding spaces and lines to the chart and updating the amount of turns
	public static String displayButGay(String[][] Chart){
		String blank = "";
		for(int r = 0; r < 2; r++){
			for(int c = 0; c < 5; c++){
				blank += Chart[r][c];
				blank += " ";
			}
			blank += "\n";
		}
		blank += "Possible Questions: " +turns;
		return blank;
	}
	
	//Opens a final window that allows the player to guess which character they think is the correct guess
	//If what they choose is right they are congratulated and told via another window
	//If not they are humiliated and told what the correct guess was via another window
	public static void finalGuess(){
		int x = Window.option(Select, displayButGay(Chart)) + 1;
		
		if(x == 1){
			if(ChosenDisplay == C1){
				Window.msg("Correct!\n"+C1+" was the correct guess!");
			}
			else{
				Window.msg("You failed lol!\n"+ChosenDisplay+" was the correct guess!");
			}
		}
		if(x == 2){
			if(ChosenDisplay == C2){
				Window.msg("Correct!\n"+C2+" was the correct guess!");
			}
			else{
				Window.msg("You failed lol!\n"+ChosenDisplay+" was the correct guess!");
			}
		}
		if(x == 3){
			if(ChosenDisplay == C3){
				Window.msg("Correct!\n"+C3+" was the correct guess!");
			}
			else{
				Window.msg("You failed lol!\n"+ChosenDisplay+" was the correct guess!");
			}
		}
		if(x == 4){
			if(ChosenDisplay == C4){
				Window.msg("Correct!\n"+C4+" was the correct guess!");
			}
			else{
				Window.msg("You failed lol!\n"+ChosenDisplay+" was the correct guess!");
			}
		}
		if(x == 5){
			if(ChosenDisplay == C5){
				Window.msg("Correct!\n"+C5+" was the correct guess!");
			}
			else{
				Window.msg("You failed lol!\n"+ChosenDisplay+" was the correct guess!");
			}
		}
		if(x == 6){
			if(ChosenDisplay == C6){
				Window.msg("Correct!\n"+C6+" was the correct guess!");
			}
			else{
				Window.msg("You failed lol!\n"+ChosenDisplay+" was the correct guess!");
			}
		}
		if(x == 7){
			if(ChosenDisplay == C7){
				Window.msg("Correct!\n"+C7+" was the correct guess!");
			}
			else{
				Window.msg("You failed lol!\n"+ChosenDisplay+" was the correct guess!");
			}
		}
		if(x == 8){
			if(ChosenDisplay == C8){
				Window.msg("Correct!\n"+C8+" was the correct guess!");
			}
			else{
				Window.msg("You failed lol!\n"+ChosenDisplay+" was the correct guess!");
			}
		}
		if(x == 9){
			if(ChosenDisplay == C9){
				Window.msg("Correct!\n"+C9+" was the correct guess!");
			}
			else{
				Window.msg("You failed lol!\n"+ChosenDisplay+" was the correct guess!");
			}
		}
		if(x == 10){
			if(ChosenDisplay == C10){
				Window.msg("Correct!\n"+C10+" was the correct guess!");
			}
			else{
				Window.msg("You failed lol!\n"+ChosenDisplay+" was the correct guess!");
			}
		}
		if(x == 11){
			System.exit(0);
		}
		
	}
}
