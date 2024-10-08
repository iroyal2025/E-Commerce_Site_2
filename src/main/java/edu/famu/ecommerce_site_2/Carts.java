package edu.famu.ecommerce_site_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carts extends ACarts {
    private String userId;
    private String[] products;

    public Carts(String cartId, int totalAmount, String userId, String[] products) {
        super(cartId, totalAmount);
        this.userId = userId;
        this.products = products;
    }
}
