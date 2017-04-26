package nl.utwente.di.bookQuote;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by claudia.reuvers on 25/04/2017.
 */
public class Quoter {

    private Map<String, Double> map;

    Quoter() {
        map = new HashMap<>();
        map.put("1", 10.0);
        map.put("2", 45.0);
        map.put("3", 20.0);
        map.put("4", 35.0);
        map.put("5", 50.0);
    }

    double getBookPrice(String book) {
        if (map.get(book) == null) {
            return 0.0;
        } else {
            return map.get(book);
        }
    }
}
