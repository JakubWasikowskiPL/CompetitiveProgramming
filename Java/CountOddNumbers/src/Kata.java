import java.util.LinkedList;

public class Kata {
    public static void main(String[] args) {
        System.out.println(oddCount(7));
    }
    public static int oddCount(int n) {
        LinkedList list=new LinkedList();
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                list.add(i);
            }
        }
        return list.size();
    }
}