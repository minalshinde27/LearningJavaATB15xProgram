package Ex_09_Functions;

public class Lab053_UserDefined {
    public static void main (String[] args){

    }

    //Syntax of function: AccessModifier ReturnType FunctionName (ParametersIfAny){}

    static void non_return_function() {
        System.out.println("Print something no return or return type");
    }

    static int return_int() {
        System.out.println("Print something no return or return type");
        return 10;
    }

    static boolean return_boolean() {
        System.out.println("Print something no return or return type");
        return true;
    }

    static float return_float_pi_value(){
        return 3.14f;
    }
}
