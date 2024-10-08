package edu.famu.ecommerce_site_2;

import com.google.cloud.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders extends AOrders {
    private String userId;
    private String[] products;

    public Orders(String orderId, int totalAmount, String orderStatus, Timestamp createdAt, AOrders shippingInfo, String userId, String[] products) {
        super(orderId, totalAmount, orderStatus, createdAt, shippingInfo);
        this.userId = userId;
        this.products = products;
    }
}
