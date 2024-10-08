package edu.famu.ecommerce_site_2;

import com.google.cloud.Timestamp;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RestProducts extends AProducts {
    public RestProducts(String productId, String name, String description, int price, int stock, String imageUrl, String category, Timestamp createdAt) {
        super(productId, name, description, price, stock, imageUrl, category, createdAt);
    }
}
