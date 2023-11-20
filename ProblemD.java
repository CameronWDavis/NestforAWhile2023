public class ProblemD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] arrOfStr = str.split(" ", 4);

        int row = Integer.valueOf(arrOfStr[0]);
        int column = Integer.valueOf(arrOfStr[1]);
        int x = Integer.valueOf(arrOfStr[2]);
        int y = Integer.valueOf(arrOfStr[3]);

        for(int i = 0; i < row; i++) {
            str = input.nextLine();
            String strNew = str.replace(" ", "");
            String[] arrOfMatrix = strNew.split("(?!^)");
            for(int n = 0; n < x; n++) {
            for(int j = 0; j < column; j++) {
                for(int k = 0; k < y; k++) {
                        System.out.print(arrOfMatrix[j]);
                }
            }
            System.out.println();
        }
        }
    }

}
