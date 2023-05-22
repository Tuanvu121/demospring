package com.example.demo.controller;

import com.example.demo.entity.onetomany.Cart;
import com.example.demo.service.onetomany.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    CartServiceImpl cartService;

    @GetMapping("/add")
    public void addCart(){
        cartService.addCart();
    }

    @GetMapping("/getCart/{id}")
    public Cart getCartById(@PathVariable long id){
        return  cartService.findCartByID(id);
    }
}
