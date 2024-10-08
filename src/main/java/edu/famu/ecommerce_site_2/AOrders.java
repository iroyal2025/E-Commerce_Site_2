package edu.famu.ecommerce_site_2;

import com.google.cloud.Timestamp;
import com.google.protobuf.util.Timestamps;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.ParseException;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class AOrders {
    private String orderId;
    private int totalAmount;
    private String orderStatus;
    private Timestamp createdAt;
    private AOrders shippingInfo;

    public Timestamp getCreatedAt() {
        return createdAt;

    }

    public void setCreatedAt(String createdAt) throws ParseException {
        this.createdAt = Timestamp.fromProto(Timestamps.parse(createdAt));
    }

}
