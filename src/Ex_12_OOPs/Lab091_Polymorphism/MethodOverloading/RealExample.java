package Ex_12_OOPs.Lab091_Polymorphism.MethodOverloading;

public class RealExample {
    public static void main() {
        webAutomation w = new webAutomation();
        w.openBrowser();
        w.openBrowser("Chrome");
    }
}

class webAutomation{
    void openBrowser(){
        System.out.println("Default Browser");
    }
    void openBrowser (String browser){
        System.out.println("Open mentioned browser : "+browser);
    }
}
