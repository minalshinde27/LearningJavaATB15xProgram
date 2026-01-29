package Ex_12_OOPs;

public class Lab086_Constructor {
    public static void main() {
        Lab084_ClassConcept_Person person1;
        //It won't create constructor as object is not getting created

        Lab084_ClassConcept_Person person2 = new Lab084_ClassConcept_Person();
        //It will create constructor as object is getting created

        MySQL m1 = new MySQL();

        ReadExcelFile r1 = new ReadExcelFile();
    }

    static class MySQL {
        MySQL (){
            System.out.println("SQL Connected");
        }
    }

    static class ReadExcelFile {
        ReadExcelFile(){
            System.out.println("Excel file loaded");
        }
    }
}
