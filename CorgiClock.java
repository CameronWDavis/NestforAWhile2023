import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		String[] Zero = {"1", "2", "0", "4", "5", "6", "3"};
		Zero[0] = "+---+";
		Zero[1] = "|   |";
		Zero[2] = "|   |";
		Zero[3] = "+   +";
		Zero[4] = "|   |";
		Zero[5] = "|   |";
		Zero[6] = "+---+";
		
		String[] One = {"1", "2", "0", "4", "5", "6", "3"};
		One[0] = "    +";
		One[1] = "    |";
		One[2] = "    |";
		One[3] = "    +";
		One[4] = "    |";
		One[5] = "    |";
		One[6] = "    +";
	
		String[] Two = {"1", "2", "0", "4", "5", "6", "3"};
		Two[0] = "+---+";
		Two[1] = "    |";
		Two[2] = "    |";
		Two[3] = "+---+";
		Two[4] = "|    ";
		Two[5] = "|    ";
		Two[6] = "+---+";
		
		String[] Three = {"1", "2", "0", "4", "5", "6", "3"};
		Three[0] = "+---+";
		Three[1] = "    |";
		Three[2] = "    |";
		Three[3] = "+---+";
		Three[4] = "    |";
		Three[5] = "    |";
		Three[6] = "+---+";
		
		String[] Four = {"1", "2", "0", "4", "5", "6", "3"};
		Four[0] = "+   +";
		Four[1] = "|   |";
		Four[2] = "|   |";
		Four[3] = "+---+";
		Four[4] = "    |";
		Four[5] = "    |";
		Four[6] = "    +";
		
		String[] Five = {"1", "2", "0", "4", "5", "6", "3"};
		Five[0] = "+---+";
		Five[1] = "|    ";
		Five[2] = "|    ";
		Five[3] = "+---+";
		Five[4] = "    |";
		Five[5] = "    |";
		Five[6] = "+---+";
		
		String[] Six = {"1", "2", "0", "4", "5", "6", "3"};
		Six[0] = "+---+";
		Six[1] = "|    ";
		Six[2] = "|    ";
		Six[3] = "+---+";
		Six[4] = "|   |";
		Six[5] = "|   |";
		Six[6] = "+---+";
		
		String[] Seven = {"1", "2", "0", "4", "5", "6", "3"};
		Seven[0] = "+---+";
		Seven[1] = "    |";
		Seven[2] = "    |";
		Seven[3] = "    +";
		Seven[4] = "    |";
		Seven[5] = "    |";
		Seven[6] = "    +";
		
		String[] Eight = {"1", "2", "0", "4", "5", "6", "3"};
		Eight[0] = "+---+";
		Eight[1] = "|   |";
		Eight[2] = "|   |";
		Eight[3] = "+---+";
		Eight[4] = "|   |";
		Eight[5] = "|   |";
		Eight[6] = "+---+";
		
		String[] Nine = {"1", "2", "0", "4", "5", "6", "3"};
		Nine[0] = "+---+";
		Nine[1] = "|   |";
		Nine[2] = "|   |";
		Nine[3] = "+---+";
		Nine[4] = "    |";
		Nine[5] = "    |";
		Nine[6] = "    +";
		
		
		Scanner input = new Scanner(System.in);
		
		String str = "notEnd";

        while (!str.equals("end")){
        	str = input.nextLine();
        	if(str.equals("end")){
        		System.exit(0);
        	}
        	String strNew = str.replace(":", "");

        	int First = strNew.charAt(0) - '0';
        	int Second = strNew.charAt(1) - '0';
        	int Third = strNew.charAt(2) - '0';
        	int Fourth = strNew.charAt(3) - '0';
        	
        	String[] FirstDigit = {"1", "2", "0", "4", "5", "6", "3"};
        	String[] SecondDigit = {"1", "2", "0", "4", "5", "6", "3"};
        	String[] ThirdDigit = {"1", "2", "0", "4", "5", "6", "3"};
        	String[] FourthDigit = {"1", "2", "0", "4", "5", "6", "3"};
        	
        	switch(First){
        	case 0:
        		FirstDigit = Zero;
        		break;
        	case 1:
        		FirstDigit = One;
        		break;
        	case 2:
        		FirstDigit = Two;
        		break;
        	case 3:
        		FirstDigit = Three;
        		break;
        	case 4:
        		FirstDigit = Four;
        		break;
        	case 5:
        		FirstDigit = Five;
        		break;
        	case 6:
        		FirstDigit = Six;
        		break;
        	case 7:
        		FirstDigit = Seven;
        		break;
        	case 8:
        		FirstDigit = Eight;
        		break;
        	case 9:
        		FirstDigit = Nine;
        	}
        	
        	switch(Second){
        	case 0:
        		SecondDigit = Zero;
        		break;
        	case 1:
        		SecondDigit = One;
        		break;
        	case 2:
        		SecondDigit = Two;
        		break;
        	case 3:
        		SecondDigit = Three;
        		break;
        	case 4:
        		SecondDigit = Four;
        		break;
        	case 5:
        		SecondDigit = Five;
        		break;
        	case 6:
        		SecondDigit = Six;
        		break;
        	case 7:
        		SecondDigit = Seven;
        		break;
        	case 8:
        		SecondDigit = Eight;
        		break;
        	case 9:
        		SecondDigit = Nine;
        	}
        	switch(Third){
        	case 0:
        		ThirdDigit = Zero;
        		break;
        	case 1:
        		ThirdDigit = One;
        		break;
        	case 2:
        		ThirdDigit = Two;
        		break;
        	case 3:
        		ThirdDigit = Three;
        		break;
        	case 4:
        		ThirdDigit = Four;
        		break;
        	case 5:
        		ThirdDigit = Five;
        		break;
        	case 6:
        		ThirdDigit = Six;
        		break;
        	case 7:
        		ThirdDigit = Seven;
        		break;
        	case 8:
        		ThirdDigit = Eight;
        		break;
        	case 9:
        		ThirdDigit = Nine;
        	}
        	
        	switch(Fourth){
        	case 0:
        		FourthDigit = Zero;
        		break;
        	case 1:
        		FourthDigit = One;
        		break;
        	case 2:
        		FourthDigit = Two;
        		break;
        	case 3:
        		FourthDigit = Three;
        		break;
        	case 4:
        		FourthDigit = Four;
        		break;
        	case 5:
        		FourthDigit = Five;
        		break;
        	case 6:
        		FourthDigit = Six;
        		break;
        	case 7:
        		FourthDigit = Seven;
        		break;
        	case 8:
        		FourthDigit = Eight;
        		break;
        	case 9:
        		FourthDigit = Nine;
        	}	
        	
    		for(int i = 0; i < 7; i++) {
    			System.out.print(FirstDigit[i]);
    			System.out.print(" ");
    			System.out.print(SecondDigit[i]);
    			if(i == 2 || i == 4) {
    				System.out.print(" o ");
    			}
    			else {
    				System.out.print("   ");
    			}
    			System.out.print(ThirdDigit[i]);
    			System.out.print(" ");
    			System.out.print(FourthDigit[i]);
    			System.out.println(" ");			
    		}
        	
        }
        


	}

}
