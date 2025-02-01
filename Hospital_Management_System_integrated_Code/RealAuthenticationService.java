public class RealAuthenticationService implements AuthenticationService {

    @Override
    public boolean login(String username, String password) {
        FileDatabase db = FileDatabase.getInstance();
        String userData = db.getUser(username).toString();
        if (userData != null && userData.split(",")[3].equals(password)) {
            System.out.println("Login successful for: " + username);
            return true;
        }
        System.out.println("Login failed for: " + username);
        return false;
    }

    @Override
    public void viewRecord(String username) {
        FileDatabase db = FileDatabase.getInstance();
        String userData = db.getUser(username).toString();
        if (userData != null) {
            System.out.println("Record for " + username + ": " + userData);
        } 
        else {
            System.out.println("No record found for " + username);
        }
    }
}