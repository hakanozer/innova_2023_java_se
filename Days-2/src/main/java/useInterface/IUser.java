package useInterface;

public interface IUser {

    boolean userNamePasswordLogin( String userName, String password );
    boolean userChangePassword( String oldPassword, String newPassword, int userID );
    String userProfileName( int userID );
    boolean userNameUpdate( String newName, int userID );
}
