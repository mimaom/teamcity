package dk.openminds.teamcity.impl;

import dk.openminds.teamcity.OrderService;
import dk.openminds.teamcity.domain.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mma on 15-12-2016.
 */
public class DefaultOrderService implements OrderService {

    private List<Order> orders;

    public DefaultOrderService() {
        orders = new ArrayList<>();
    }

    @Override
    public void createOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }
}
