package dev.enricogollner.projValorTotalPedido.services;

import dev.enricogollner.projValorTotalPedido.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double discountFactor = 1 - (order.getDiscount() / 100);
        return (order.getBasic() * discountFactor) + shippingService.shipment(order);
    }
}
