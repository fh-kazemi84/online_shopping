package com.kazemi.online_shopping.dto;

import com.kazemi.online_shopping.entity.Address;
import com.kazemi.online_shopping.entity.Customer;
import com.kazemi.online_shopping.entity.Order;
import com.kazemi.online_shopping.entity.OrderItem;
import lombok.Data;

import java.util.Set;

/**
 * @author fh.kazemi
 **/

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
