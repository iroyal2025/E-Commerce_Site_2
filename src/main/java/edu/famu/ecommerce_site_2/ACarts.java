package edu.famu.ecommerce_site_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class ACarts {
    private String cartId;
    private int totalAmount;

}
