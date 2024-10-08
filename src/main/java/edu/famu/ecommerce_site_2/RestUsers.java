package edu.famu.ecommerce_site_2;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RestUsers extends AUsers{
    public RestUsers(String userId, String email, String name, AUsers address, String phoneNumber, String role) {
        super(userId, email, name, address, phoneNumber, role);


    }
}
