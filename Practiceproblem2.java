import java.util.Scanner;

public class ProgramB {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String numAdditions = scanner.nextLine();


        for(int i = 0; i <= Integer.parseInt(numAdditions); i++){
            String numA = scanner.nextLine();
            String[] arrOfStr = numA.split("\\+", 2);

            if(Integer.parseInt(arrOfStr[0]) >= 1000 || Integer.parseInt(arrOfStr[1]) <= 0 ){
                System.out.println("Invalid");
            }
            if(Integer.parseInt(arrOfStr[0]) >= 1000 || Integer.parseInt(arrOfStr[1]) <= 0 ){
                System.out.println("Invalid");
            }
            int newNumber = Integer.parseInt(arrOfStr[0]) + Integer.parseInt(arrOfStr[1]);

            System.out.println(newNumber);


        }
    }
}
