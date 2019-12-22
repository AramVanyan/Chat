import java.util.Scanner;
public class MemberService {
    private static int actionID;
    private static Member[] members;
    private static String messageOfMember;
    private static String currentTime;
    public static Member[] getMembers() {
        return members;
    }
    private static Scanner scanner = new Scanner(System.in);
    public static void initializeMembers(int n){
        members = new Member[n];
        for (int i = 0; i < n ; i++) {
            members[i] = new Member();
            System.out.print("Please enter the name of member " + (i+1) + ": ");
            members[i].setName(scanner.nextLine());
        }
        System.out.println();
    }
    public static void startChat(String memberName){
        System.out.println("Welcome " + memberName);
        System.out.println("Send message -> press 1");
        System.out.println("Exit -> press 2 in message line ");
        actionID = scanner.nextInt();
        if(actionID == 1) typeMessage(memberName);
        if(actionID == 2) {
            System.out.println("You have exited chat mode");
            System.out.println();
        }
    }
    public static void typeMessage(String memberName){
        while(true){
            System.out.print(memberName + ": ");
            Scanner scanner = new Scanner(System.in);
            messageOfMember = scanner.nextLine();
            if(messageOfMember.equals("2")) {
                System.out.println("You have exited chat mode");
                System.out.println();
                break;
            };
            currentTime = CurrentDate.returnCurrentDate();
            if(messageOfMember.equals("")) continue;
            ChatHistory.addToChatStory(currentTime,memberName,messageOfMember);
        }
    }
    public static boolean isMember(String nameOfMember){
        boolean isMember = false;
        for (int i = 0; i <members.length ; i++) {
            if(nameOfMember.equals(members[i].getName())){
                isMember = true;
            }
        }
        return  isMember;
    }
}
