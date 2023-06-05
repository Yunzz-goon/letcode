Idea
Vertical add. Firstly add for the align digits and then add for the extra digits

Code

class Solution {
    public String addStrings(String num1, String num2) {
        StringBuffer result = new StringBuffer();
        int l1 = num1.length();
        int l2 = num2.length();
        int short_length;
        if (l1 > l2){
            short_length = l2;
        } else{
            short_length = l1;
        }
        int add = 0;
        int i1 = l1-1;
        int i2 = l2-1;
        // same digit add
        for (int i = short_length-1; i >= 0; i--){
            int x = num1.charAt(i1) - '0';
            int y = num2.charAt(i2) - '0';
            int add_result = x + y + add;
            result.append(add_result % 10);
            add = add_result / 10;
            i1 --;
            i2 --;
        }

        //complete extra digits
        if (l1 > l2){
            while (i1 >= 0){
                int add_result = num1.charAt(i1)-'0' + add;
                result.append(add_result % 10);
                add = add_result / 10;
                i1--;
            }
        } else if (l1 < l2){
            while (i2 >= 0) {
                int add_result = num2.charAt(i2)-'0' + add;
                result.append(add_result % 10);
                add = add_result / 10;
                i2--;
            }
        }
    
        if (add > 0){
            result.append(1);
        }
        return result.reverse().toString();
    }
}

作者：goofy-i2hodesqsi
链接：https://leetcode.cn/problems/add-strings/solution/415-string-add-java-by-goofy-i2hodesqsi-4l4d/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。



作者：goofy-i2hodesqsi
链接：https://leetcode.cn/problems/add-strings/solution/415-string-add-java-by-goofy-i2hodesqsi-4l4d/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。