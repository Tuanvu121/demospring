package com.example.demo.service.onetomany;
import com.example.demo.entity.onetomany.Cart;

public interface CartService {
    void addCart();
    Cart findCartByID(Long id);
}
