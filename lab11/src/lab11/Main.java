package lab11;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Integer a = 2;
        Integer b = 10;
        Solution sl = new Solution();
        System.out.println(sl.newArrayList(10,12,13,15));
        System.out.println(sl.newHashSet(8,2,4,5));
        sl.Filelist("/Users/royalblue/Downloads/file");
HashMap<String, Integer> h = sl.newHashMap(new HashMap<String, Integer>(){{ put("ключ", 1); }});
System.out.println(sl.newHashMap(new HashMap<String, Integer>(){{ put("ключ", 1); }}));
    }
}
