public class q8 {
    public static void main(String[] args) {
        String s = "2147483646";
        String number_str = "";
        boolean space_judge = true;
        boolean negative_judge = false;
        boolean number_start = false;
        boolean real_start = false;
        int number;

        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ' & space_judge) {
                continue;
            }
            if (ch != ' ') {
                space_judge = false;
            }
            if (negative_judge == false & number_start == false) {
                number_start = true;
                if (ch == '-'){
                    negative_judge = true;
                    continue;
                } else if (ch == '+'){
                    negative_judge = false;
                    continue;
                }
            }
            int tmp = (int) ch;
            if (tmp == 48) {
                if (real_start == true) {
                    number_str += ch;
                    continue;
                }
                if (real_start == false){
                    continue;
                }
            }
            if (48 < tmp & tmp < 58) {
                number_start = true;
                number_str += ch;
                real_start = true;
                continue;
            } else {
                break;
            }
        }
        if (number_str == ""){
            System.out.println("1. "+0);
        }

        if (number_str.length() > 10){
            if (negative_judge){
                number = -2147483648;
            } else{
                number = 2147483647;
            }
            System.out.println(number);
        } else if (number_str.length() == 10){
            String number_str_9digits = number_str.substring(0, 9);
            int number_sub = Integer.parseInt(number_str_9digits);
            System.out.println(number_sub);
            if (number_sub > 214748364){
                if (negative_judge){
                    number = -2147483648;
                } else{
                    number = 2147483647;
                }
                System.out.println("2. "+number);
            } else if (number_sub == 214748364) {
                if (negative_judge){
                    if (Integer.parseInt(""+number_str.charAt(9)) > 8){
                        number = -2147483648;
                    } else{
                        number = Integer.parseInt(number_str);
                    }
                } else{
                    if (Integer.parseInt(""+number_str.charAt(9)) > 7){
                        number = 2147483647;
                    } else{
                        number = Integer.parseInt(number_str);
                    }
                }
                System.out.println("3. " + number);
            }
        }

        number = Integer.parseInt(number_str);
        if (negative_judge){
            number = -number;
        }
        System.out.println("4. "+ number);
    }


}
