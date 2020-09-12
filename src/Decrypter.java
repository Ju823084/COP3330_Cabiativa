public class Decrypter {

    public  int decrypt(int number){

        String encryptnumber = String.valueOf(number);
        char[] a = encryptnumber.toCharArray();
        char temp = a[0];
        char temp1 = a[1];
        a[0] = a[2];
        a[2] = temp;
        a[1] = a[3];
        a[3] = temp1;
        int switchnumber1 = Integer.parseInt(String.valueOf(a[0]));
        int switchnumber2 = Integer.parseInt(String.valueOf(a[1]));
        int switchnumber3 = Integer.parseInt(String.valueOf(a[2]));
        int switchnumber4 = Integer.parseInt(String.valueOf(a[3]));
        int b = (switchnumber1*10)-7;
        int c = (switchnumber2*10)-7;
        int d = (switchnumber3*10)-7;
        int e = (switchnumber4*10)-7;

        System.out.println(b+" "+ c +" " + d +" " + e);

        return (0);
    }
}


