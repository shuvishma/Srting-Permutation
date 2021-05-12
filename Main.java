import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static String swap(String str, int i, int j) {
        char[] temp = str.toCharArray();
        char t = temp[i];
        temp[i] = temp[j];
        temp[j] = t;
        return new String(temp);  
    }

    public static void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        }
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = str.length();
        permute(str, 0, length - 1);
    }
}