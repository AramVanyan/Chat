import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of members: ");
        int numberOfMembers = scanner.nextInt();
        System.out.println();
        MemberService.initializeMembers(numberOfMembers);
        String memberName;
        while(true){
            System.out.println("Start chatting -> 1");
            System.out.println("See chat history -> 2");
            System.out.println();
            if (scanner.nextInt() == 1) {
                System.out.print("Please enter the name of member to start chatting: ");
                memberName = scanner.next();
                if(MemberService.isMember(memberName)) MemberService.startChat(memberName);
                else {
                    System.out.println("There is no member with name " + memberName);
                    System.out.println("Please try again");
                    System.out.println();
                }
            }else {
                ChatHistory.printChatHistory();
                break;
            }
        }
    }
}
