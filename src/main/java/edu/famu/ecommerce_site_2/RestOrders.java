package edu.famu.ecommerce_site_2;

import com.google.cloud.Timestamp;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RestOrders extends AOrders {
    private String userId;
    private String[] products;

    public RestOrders(String orderId, int totalAmount, String orderStatus, Timestamp createdAt, AOrders shippingInfo, String userId, String[] products) {
        super(orderId, totalAmount, orderStatus, createdAt, shippingInfo);
        this.userId = userId;
        this.products = products;
    }
}
