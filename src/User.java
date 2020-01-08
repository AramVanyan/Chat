import java.text.SimpleDateFormat;
import java.util.Date;
public class User {
    public static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private String nickName;
    Date joinedAt;
    public String getJoinedAt() {
        return formatter.format(joinedAt).toString();
    }
    public void setJoinedAt(Date joinedAt) {
        this.joinedAt = joinedAt;
    }

    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    @Override
    public String toString() {
        return "User{" +
                "nickName='" + nickName + '\'' +
                '}';
    }

}