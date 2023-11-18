import java.util.Scanner;

public class ProgramB {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String numAdditions = scanner.nextLine();
        String [] names = new String [Integer.parseInt(numAdditions)];
        boolean ascending = false;
        boolean decending = false;


        for(int i = 0; i < Integer.parseInt(numAdditions); i++){
            String birdName = scanner.nextLine();
            if(birdName.length() < 2 || birdName.length() > 20){
                System.out.println("Invalid");
                return;
            }
            names[i] = birdName;
        }

        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    decending = true;
                }else if(names[i].compareTo(names[j]) < 0){
                    ascending = true;
                }
            }
        }// end for
        if(isUnordered(names)){
            System.out.println("Unordered");
            return;
        }
        if(ascending == true){
            System.out.println("Ascending");
        }
        if(decending == true){
            System.out.println("Descending");
        }
    }
    public static boolean isUnordered(String[] arr){
        boolean ascending = true;
        boolean descending = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                ascending = false;
            } else if (arr[i].compareTo(arr[i + 1]) < 0) {
                descending = false;
            }
        }
        return !(ascending || descending);
    }
}
