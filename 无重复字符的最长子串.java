import java.util.Scanner;
import java.util.ArrayList;

public class 无重复字符的最长子串 {
    public static void main(String[] args) {
        无重复字符的最长子串 w = new 无重复字符的最长子串();
        Scanner s = new Scanner(System.in);
        System.out.println("输入字符串");
        String a = s.next();
        s.close();
        ArrayList<String> b = new ArrayList<>();
        for (int i = 0; i < a.length(); i ++) {
            b.add(String.valueOf(a.charAt(i)));
        }
        System.out.println(w.str(b));
    }

    public ArrayList<String> str(ArrayList<String> x) {
        ArrayList<String> c = new ArrayList<>();
        int a = x.size();
        int s = 1;
        for (int i = 0; i < a; i ++) {
            ArrayList<String> b = new ArrayList<>();
            for (int j = i; j < a; j ++) {
                if (b.contains(x.get(j))) {
                    break;
                }
                b.add(x.get(j));
            }
            int d = str1(b).length();
            if (s <= d) {
                s = d;
                c.add(str1(b));
            }
            if (a - i - 1 < c.get(c.size() - 1).length()) {
                break;
            }
        }
        return str3(c);
    }

    public String str1(ArrayList<String> x) {
        StringBuilder a = new StringBuilder();
        for (String s : x) {
            a.append(s);
        }
        return String.valueOf(a);
    }

    public ArrayList<String> str3(ArrayList<String> x) {
        int b = x.size();
        int c = x.get(b - 1).length();
        ArrayList<String> a = new ArrayList<>();
        for (String f : x) {
            if (f.length() >= c) {
                a.add(f);
            }
        }
        return a;
    }
}
