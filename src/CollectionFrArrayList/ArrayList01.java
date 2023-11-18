package CollectionFrArrayList;
import java.util.ArrayList;
public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add("Belal");
        al.add("ayan");
        al.add(null);
        System.out.println(al);
        al.remove(3);
        System.out.println(al);
    }
}
