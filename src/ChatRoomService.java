import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class ChatRoomService {
    private static User[] users;
    private static Scanner scanner = new Scanner(System.in);
    public static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public static String returnCurrentDate(){
        Date date = new Date();
        return formatter.format(date).toString();
    }
    public static Date returnJoinedDate(){
        Date date = new Date();
        return date;
    }
    public static void initializeMembers(int n){
        users = new User[n];
        for (int i = 0; i < n ; i++) {
            users[i] = new User();
            System.out.print("Please enter the nickname of a member " + (i+1) + ": ");
            users[i].setNickName(scanner.nextLine());
            users[i].setJoinedAt(returnJoinedDate());
        }
        System.out.println();
    }
    public static void startChat(String memberName){
        while(true) {
            System.out.println("Welcome " + memberName);
            System.out.println("Send message -> press 1");
            System.out.println("Exit -> press 2 in message line ");
            int actionID = CheckForWrongInput.checkForWrongInput();
            if (actionID == 1) typeMessage(memberName);
            else if (actionID == 2) {
                System.out.println("You have exited chat mode");
                System.out.println();
            } else {
                System.out.println("You didn't specify what to do ");
            }
            if(actionID == 1 || actionID == 2) break;
        }
    }
    public static void typeMessage(String memberName){
        while(true){
            System.out.print(memberName + ": ");
            Scanner scanner = new Scanner(System.in);
            String messageOfUser = scanner.nextLine();
            if(messageOfUser.equals("2")) {
                System.out.println("You have exited chat mode");
                System.out.println();
                break;
            };
            String currentTime = returnCurrentDate();
            if(messageOfUser.equals("")) continue;
            ChatHistory.addToChatStory(currentTime,memberName, messageOfUser);
        }
    }
    public static boolean isUser(String nameOfMember){
        boolean isUser = false;
        for (int i = 0; i < users.length ; i++) {
            if(nameOfMember.equals(users[i].getNickName())){
                isUser = true;
            }
        }
        return  isUser;
    }
}
