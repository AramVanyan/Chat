import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numberOfMembers = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of members: ");
        numberOfMembers = CheckForWrongInput.checkForWrongInput();
        System.out.println();
        ChatRoomService.initializeMembers(numberOfMembers);
        String memberName;
        while(true){
            System.out.println("Start chatting -> 1");
            System.out.println("See chat history -> 2");
            System.out.println();
            int input = CheckForWrongInput.checkForWrongInput();
            if (input == 1) {
                System.out.print("Please enter the name of member to start chatting: ");
                memberName = scanner.next();
                if(ChatRoomService.isUser(memberName)) ChatRoomService.startChat(memberName);
                else {
                    System.out.println("There is no member with name " + memberName);
                    System.out.println("Please try again");
                    System.out.println();
                }
            }else if(input == 2){
                ChatHistory.printChatHistory();
                break;
            }else System.out.println("You didn't specify what to do ");
        }
    }
}
