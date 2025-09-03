package dev.enricogollner.projValorTotalPedido.services;

import dev.enricogollner.projValorTotalPedido.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order) {
        double basic = order.getBasic();
        return (basic < 100) ? 20 : (basic < 200) ? 12 : 0;
    }
}
