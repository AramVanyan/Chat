import java.util.ArrayList;
public class ChatHistory {
    private static ArrayList<String> chatHistory =new ArrayList<>();
    public static void printChatHistory(){
        for (int i = 0; i <chatHistory.size()-2; i+=3) {
            System.out.println(chatHistory.get(i) + " (local date)");
            System.out.println("name: " + chatHistory.get(i + 1));
            System.out.println("text: " + chatHistory.get(i + 2));
            System.out.println();
        }
        if(chatHistory.size()==0) System.out.println("There is no message yet");
        System.out.println();
    }
    public static void addToChatStory(String...chatUnit){
        chatHistory.add(chatUnit[0]);
        chatHistory.add(chatUnit[1]);
        chatHistory.add(chatUnit[2]);
    }
}
