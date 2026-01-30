package Ex_12_OOPs;

public class Lab098_StaticBlocks {
    public static void main() {
        StaticBlocks sb1 = new StaticBlocks();
        StaticBlocks sb2 = new StaticBlocks();
    }
}

class StaticBlocks {
    //SIB (Static Initializtion Block)
    static {
        System.out.println("Runs only once at class load");
    }
    //IIB (Instance Initialization Block)
    {
        System.out.println("Runs everytime new object of class is created");
    }
}
