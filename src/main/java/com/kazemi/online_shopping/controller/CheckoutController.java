package com.kazemi.online_shopping.controller;

import com.kazemi.online_shopping.dto.Purchase;
import com.kazemi.online_shopping.dto.PurchaseResponse;
import com.kazemi.online_shopping.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

/**
 * @author fh.kazemi
 **/

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {
    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }
}
