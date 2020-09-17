import java.util.Scanner;

public class EncryptionTest{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Encryption ed = new Encryption();

        int value = getInput("Enter a 4 digit number tp encrypt: ", sc);

        while(ed.verify(value) != true){
            value = getInput("Enter a 4 digit number to encrypt: ", sc);
        }
        int encrypted = ed.encrypt(value);
        int decrypted = ed.decrypt(encrypted);

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
    public static int getInput(String s, Scanner sc){
        System.out.print(s);
        return sc.nextInt();
    }
}