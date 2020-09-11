import java.lang.String;

public class Encrypter {

        public static void main(String[] args) {

            String encrypt = "1234";
            char[] a = encrypt.toCharArray();


            char temp = a[0];
            char temp1 = a[1];
            a[0] = a[2];
            a[2] = temp;
            a[1] = a[3];
            a[3] = temp1;

            int A, B, C, D;

            A = (Character.getNumericValue(a[0]) + 7)%10;
            B = (Character.getNumericValue(a[1]) + 7)%10;
            C = (Character.getNumericValue(a[2]) + 7)%10;
            D = (Character.getNumericValue(a[3]) + 7)%10;



            System.out.println("Encrypted Number" + " " + A + B + C + D);

        }
    }


