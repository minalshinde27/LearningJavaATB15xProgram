package Ex_12_OOPs.Lab092_Encapsulation;

public class BasicEncapsulation {
 public static void main() {

     //Object of unprotected class
     loginScript l1 = new loginScript();
     l1.loginScript("username1","password1");
     System.out.println(l1.password);
     l1.password = "newPass";
     System.out.println(l1.password);

     //Object of encapsulated class
     goodLoginScript l2 = new goodLoginScript();
     l2.goodLoginScript("username2","password2");
     //System.out.println(l2.username);     Not able to access private attributes directly
     //System.out.println(l2.password);
     System.out.println(l2.getUsername());
     System.out.println(l2.getPassword());
     l2.setUsername("user2");
     System.out.println(l2.getUsername());
     l2.setPassword("pass2");
     System.out.println(l2.getPassword());

 }
}

//As attributes are not protected; they are accessible outside the class
class loginScript {
    String username;
    String password;
    void loginScript(String username, String password){
        this.username = username;
        this.password = password;
    }
}

/*
To achieve encapsulation, need to protect attributes
To access the attributes need to use getter/setter methods
To restrict getter/setter can set rules accordingly
 */
class goodLoginScript {
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

    public void setPassword(String password) {
        this.password = password;
    }

    void goodLoginScript (String username, String password){
        this.username = username;
        this.password = password;
    }
}