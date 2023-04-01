package DZ6.lsp2.factory;

import DZ6.lsp2.model.Order;
import DZ6.lsp2.model.OrderBonus;
import DZ6.lsp2.model.Orderable;

public class OrderFactory {
    public Orderable create(int quantity, int price, boolean isBonus) {
        if (isBonus) {
            return new OrderBonus(quantity, price);
        }
        return new Order(quantity, price);
    }
}
