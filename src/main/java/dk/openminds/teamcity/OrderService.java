package dk.openminds.teamcity;

import dk.openminds.teamcity.domain.Order;

/**
 * Created by mma on 15-12-2016.
 */
public interface OrderService {

    void createOrder(Order order);
}
