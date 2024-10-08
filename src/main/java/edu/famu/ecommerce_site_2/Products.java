package edu.famu.ecommerce_site_2;

import com.google.cloud.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Products extends AProducts{
    public Products(String productId, String name, String description, int price, int stock, String imageUrl, String category, Timestamp createdAt) {
        super(productId, name, description, price, stock, imageUrl, category, createdAt);
    }
}
