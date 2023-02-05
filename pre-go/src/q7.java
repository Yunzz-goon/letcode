import java.util.ArrayList;

public class q7 {
    public static void main(String[] args) {
        int x = 1463847412;
        boolean pos = true;
        if (x<0){
            pos = false;
            x = -x;
        }

        int x_reverse;
        String x_str = String.valueOf(x);
        String x_reverse_str = "";
        if (x_str.length() > 10){
            System.out.println("1. result = "+ 0);
        }

        if (x_str.length() == 10){
            for (int i = x_str.length()-1; i>0; i--){
                x_reverse_str += x_str.charAt(i);
            }
            int tmp = Integer.parseInt(x_reverse_str);
            if (tmp > 214748364){
                System.out.println("2. result = "+ 0);
            } else if (tmp == 214748364){
                if (Integer.parseInt(""+x_str.charAt(0)) > 7){
                    System.out.println(x_str.charAt(0));
                    System.out.println("3. result = "+ 0);
                }
            }
            x_reverse_str += x_str.charAt(0);
        }
        else{
            for (int i = x_str.length()-1; i>=0; i--){
                x_reverse_str += x_str.charAt(i);
            }
        }
        x_reverse = Integer.parseInt(x_reverse_str);
        if (pos == false){
            x_reverse = -x_reverse;
        }
        System.out.println("4. result = "+x_reverse);
    }
}
