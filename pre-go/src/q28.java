public class q28 {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issipi";
        for (int i=0; i<haystack.length(); i++){
            int left = i;
            for (int j=0; j<needle.length(); j++){
                System.out.println(i+","+j);
                if (needle.charAt(j) == haystack.charAt(left)){
                    if (j == needle.length()-1){
                        System.out.println(i);
                        break;
                    } else{
                        left +=1;
                        continue;
                    }
                } else{
                    break;
                }
            }
        }
        System.out.println(-1);
    }
}
