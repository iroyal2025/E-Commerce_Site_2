package edu.famu.ecommerce_site_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users extends AUsers {
    public Users(String userId, String email, String name, AUsers address, String phoneNumber, String role) {
        super(userId, email, name, address, phoneNumber, role);


    }
}
