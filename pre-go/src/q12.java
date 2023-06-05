import java.util.Collections;

public class q12 {
    public static void main(String[] args) {
        int num = 1994;
        String result = "";
        if (num/1000 > 0 ){
            result += "M".repeat(num/1000);
            num = num % 1000;
        }
        if (num/900 > 0 ){
            result += "CM".repeat(num/900);
            num = num % 900;
        }
        if (num/500 > 0 ){
            result += "D".repeat(num/500);
            num = num % 500;
        }
        if (num/400 > 0 ){
            result += "CD".repeat(num/400);
            num = num % 400;
        }
        if (num/100 > 0 ){
            result += "C".repeat(num/100);
            num = num % 100;
        }
        if (num/90 > 0 ){
            result += "XC".repeat(num/90);
            num = num % 90;
        }
        if (num/50 > 0 ){
            result += "L".repeat(num/50);
            num = num % 50;
        }
        if (num/40 > 0 ){
            result += "XL".repeat(num/40);
            num = num % 40;
        }
        if (num/10 > 0 ){
            result += "X".repeat(num/10);
            num = num % 10;
        }
        if (num/9 > 0 ){
            result += "IX".repeat(num/9);
            num = num % 9;
        }
        if (num/5 > 0 ){
            result += "V".repeat(num/5);
            num = num % 5;
        }
        if (num/4 > 0 ){
            result += "IV".repeat(num/4);
            num = num % 4;
        }
        if (num/1 > 0 ){
            result += "I".repeat(num);
        }
        System.out.println(result);
    }
}
