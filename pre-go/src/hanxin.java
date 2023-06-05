import java.util.ArrayList;
import java.util.Scanner;

public class hanxin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an 询问次数: ");
        int T = scanner.nextInt();
        scanner.close();
        int n, X;
        // 每个i是每次询问
        for (int t=0; t<T; t++){
            int i=0;
            n = scanner.nextInt();
            X = scanner.nextInt();
            ArrayList<Integer> a_i = new ArrayList<Integer>();
            ArrayList<Integer> b_i = new ArrayList<Integer>();
            while (i < n){
                a_i.add(scanner.nextInt());
            }
            while (i < n){
                b_i.add(scanner.nextInt());
            }
            int sum = 0;
            int sum_a = 0;
            for (int k=0; k<n; k++){
                sum+=a_i.get(k)*b_i.get(k);
                sum_a+= a_i.get(k);
            }
            double avg = sum/sum_a;
            if (avg >= X){
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }

        }
    }
}
