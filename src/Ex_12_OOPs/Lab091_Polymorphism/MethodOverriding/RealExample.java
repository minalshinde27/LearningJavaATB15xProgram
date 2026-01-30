package Ex_12_OOPs.Lab091_Polymorphism.MethodOverriding;

public class RealExample {
    public static void main() {

        CommonToAll b1 = new CommonToAll();
        b1.openBrowser();

        ChromeTCs b2 = new ChromeTCs();
        b2.openBrowser();

        FirefoxTCs b3 = new FirefoxTCs();
        b3.openBrowser();

        CommonToAll b4 = new ChromeTCs();       //Dynamic Dispatch
        b4.openBrowser();

        CommonToAll b5 = new FirefoxTCs();
        b5.openBrowser();

    }
}

class CommonToAll {
    void openBrowser(){
        System.out.println("Starting IE browser");
    }
}

class ChromeTCs extends CommonToAll {
    void openBrowser(){
        System.out.println("Starting Chrome browser");
    }
}

class FirefoxTCs extends CommonToAll {
    void openBrowser(){
        System.out.println("Starting Firefox browser");
    }
}
