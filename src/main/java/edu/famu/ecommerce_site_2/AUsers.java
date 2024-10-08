package edu.famu.ecommerce_site_2;

import com.google.cloud.firestore.annotation.DocumentId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class AUsers {
    @DocumentId
    private String userId;
    private String email;
    private String name;
    private AUsers address;
    private String phoneNumber;
    private String role;


}
