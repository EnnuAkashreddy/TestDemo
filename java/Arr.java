import java.util.HashSet;
import java.util.Iterator;

public class Arr {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<String>();
        st.add("luffy");
        st.add("zoro");

        Iterator it = st.iterator();

        while (it.hasNext()) {
            System.out.println(" " + it.next());
        }
    }
}
