import java.util.Scanner;

public class ProblemI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        int counter = 0;
        
        for(int i = 0; i < Integer.parseInt(str); i++) {
        	String entry = input.nextLine();
            String[] arrOfStr = entry.split(" ", 2);
            String strNew = arrOfStr[1].replace(" ", "");

            counter += Integer.parseInt(strNew);

        }
        if(counter % 2 == 0) {
        	System.out.print("YES");
        }
        else {
        	System.out.print("NO");
        }

	}

}
