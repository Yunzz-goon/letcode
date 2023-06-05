public class q9 {
    public static void main(String[] args) {
        int x = 12421;
        if(x < 0){
            System.out.println(false);
        }

        String x_str = String.valueOf(x);
        for (int i = 0; i < (int) x_str.length()/2; i++){
            char left = x_str.charAt(i);
            char right = x_str.charAt(x_str.length()-1-i);
            if(left != right){
                System.out.println(false);
            }

        }
        System.out.println(true);
    }
}
