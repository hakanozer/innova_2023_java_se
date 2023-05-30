package useInterface;

public class MainInterface {
    public static void main(String[] args) {

        UserImpl user = new UserImpl();
        user.userChangePassword("12345", "54321", 101);
        user.userProfileImagePath(101);

        IUser user1 = new UserImpl();
        user1.userProfileName(101);

        IProfile user2 = new UserImpl();
        user2.userProfileImagePath(101);

    }
}
