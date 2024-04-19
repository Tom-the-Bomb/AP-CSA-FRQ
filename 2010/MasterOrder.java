import java.util.ArrayList;

import x.CookieOrder;

class MasterOrder {
    private ArrayList<CookieOrder> orders;

    // a)
    public int getTotalBoxes() {
        int total = 0;
        for (CookieOrder order : orders) {
            total += order.getNumBoxes();
        }
        return total;
    }

    // b)
    public int removeVariety(String cookieVar) {
        int total = 0;
        for (CookieOrder order : orders) {
            if (order.getVariety().equals(cookieVar)) {
                total += order.getNumBoxes();
                orders.remove(order);
            }
        }
        return total;
    }
}