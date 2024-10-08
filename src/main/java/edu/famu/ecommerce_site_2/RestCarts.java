package edu.famu.ecommerce_site_2;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RestCarts extends ACarts{
    private String userId;
    private String[] products;

    public RestCarts(String cartId, int totalAmount, String userId, String[] products) {
        super(cartId, totalAmount);
        this.userId = userId;
        this.products = products;
    }
}
