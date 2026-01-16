package Ex_11_Arrays;

public class Lab073_ReverseArray {
    public static void main(String[] args) {

        String[] names = {"Name1", "Name2", "Name3", "Name4"};

        for(int i=names.length-1; i>=0; i--){
            System.out.println(names[i]);
        }
    }
}
