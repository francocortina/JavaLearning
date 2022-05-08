package EJ48Mapas2;

import java.util.Comparator;

public class OrdenarAsc implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
       return o1.compareTo(o2);
    }
}
