public class Encrypter {

    public  int encrypt(int number){

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
        int b = (switchnumber1+7)%10;
        int c = (switchnumber2+7)%10;
        int d = (switchnumber3+7)%10;
        int e = (switchnumber4+7)%10;

       System.out.println(b+" "+ c +" " + d +" " + e);

        return (0);
    }
}
