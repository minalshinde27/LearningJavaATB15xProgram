package Ex_08_DoWhile;

public class Lab049_DoWhileBasics {
        public static void main(String[] args) {
            int a = 1;
            do {
                System.out.println(a);
                a++;
            }
            while (a < 10);


/// ////////

            char ch[] = {'A', 'B', 'C'};
            int i=0;
            do { System.out.print(ch[i] + ",");
                i++; }
            while(i < ch.length);

        }
    }

