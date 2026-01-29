package Ex_12_OOPs;

import org.w3c.dom.ls.LSOutput;

public class Lab089_ConstructorChaining {
    static void main() {
        LoginPage l1 = new LoginPage();
        LoginPage l2 = new LoginPage("minal","pass");
        LoginPage l3 = new LoginPage("shlok","pass1", "test");

        System.out.println(l1.email+l1.password+l1.note);
        System.out.println(l2.email+l2.password+l2.note);
        System.out.println(l3.email+l3.password+l3.note);

    }}

class LoginPage {
    String email;
    String password;
    String note;

    LoginPage(){
        System.out.println("Default LoginPage Constructor");
    }

    LoginPage(String emailid){
        this.email = emailid;
    }

    LoginPage(String emailid, String password){
        this.email = emailid;
        this.password = password;
    }

    LoginPage(String email, String password, String note){
        this(email, password);  //This is calling above constructor having same params
        this.note = note;
    }
        }
