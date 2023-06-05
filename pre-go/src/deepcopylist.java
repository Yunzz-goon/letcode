import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class deepcopylist {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        for (int i=0; i < 5; i++){
            ls.add(i);
        }

        List<Integer> copyls = new ArrayList<>();
        copyls.addAll(copyls);
        System.out.println(copyls == ls);

        List<Integer> copyls2 = new ArrayList<>(ls);
        System.out.println(copyls2 == ls);
    }
}
