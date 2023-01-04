import java.util.Scanner;
public class RunCipher {
    public static void main(String[] args) {
        String text ;
        int key ;
        Scanner sc = new Scanner(System.in);
        System.out.print("[TXT] ");
        while(!(text=sc.nextLine()).equals("q")){
            System.out.print("[KEY] ");
            key = sc.nextInt();
            CaesarCipher shifted = new CaesarCipher(text,key);
            System.out.printf("[ENC] %s%n",shifted);
            sc.nextLine();
            System.out.print("[TXT] ");
        }
        sc.close();
    }
}