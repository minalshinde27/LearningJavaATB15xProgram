package Ex_12_OOPs.Lab092_Encapsulation;

public class RealExample {
    public static void main() {

        ICICIBank b1 = new ICICIBank();
        b1.ICICIBank("user1","pass1");
        System.out.println(b1.getUsername());
        b1.setUsername("user2");
        System.out.println(b1.getUsername());
        System.out.println(b1.getPassword());
        b1.setPassword("pass2",false);
        System.out.println(b1.getPassword());
        b1.setPassword("pass3",true);
        System.out.println(b1.getPassword());
    }

}

class ICICIBank{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin == true) {
            this.password = password;
        } else {
            System.out.println("Not allowed to change password");
        }
    }

    void ICICIBank (String username, String password){
        this.username = username;
        this.password = password;
    }

}