import java.util.Scanner;
public class CheckForWrongInput {
    public static int checkForWrongInput(){
        int input;
        Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                input = Integer.parseInt(scanner.nextLine());
                return input;
            }catch (NumberFormatException e){
                System.out.print("Please enter a number: ");
            }
        }
    }
}
