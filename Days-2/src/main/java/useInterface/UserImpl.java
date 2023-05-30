package useInterface;

public class UserImpl implements IUser, IProfile {

    @Override
    public boolean userNamePasswordLogin(String userName, String password) {
        if( userName.equals("user01") && password.equals("12345") ) {
            return true;
        }
        return false;
    }

    @Override
    public boolean userChangePassword(String oldPassword, String newPassword, int userID) {
        if ( oldPassword.equals("12345") && userID == 101 ) {
            System.out.println( "newPassword Success :" + newPassword );
            return true;
        }
        return false;
    }

    @Override
    public String userProfileName(int userID) {
        if ( userID == 101 ) {
            return  "Selin Bilki";
        }
        return null;
    }

    @Override
    public boolean userNameUpdate(String newName, int userID) {
        if ( userID == 101 ) {
            System.out.println("newName :" + newName);
            return true;
        }
        return false;
    }

    @Override
    public String userProfileImagePath(int userID) {
        if  ( userID == 101 ) {
            return "http://localhost/images/users/23423fgdf.jpg";
        }
        return null;
    }
}
