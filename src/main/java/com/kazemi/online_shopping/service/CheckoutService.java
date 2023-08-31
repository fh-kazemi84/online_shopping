package com.kazemi.online_shopping.service;

import com.kazemi.online_shopping.dto.Purchase;
import com.kazemi.online_shopping.dto.PurchaseResponse;

/**
 * @author fh.kazemi
 **/

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
