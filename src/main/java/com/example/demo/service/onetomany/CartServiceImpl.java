package com.example.demo.service.onetomany;

import com.example.demo.entity.onetomany.Cart;
import com.example.demo.entity.onetomany.Item;
import com.example.demo.dao.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CartServiceImpl implements CartService{
    @Autowired
    CartRepository cartRepository;
    @Override
    public void addCart() {
        Item item1 = new Item(1, "Item 1");
        Item item2 = new Item(2, "Item 2");
        Item item3 = new Item(3, "Item 3");
        Item item4 = new Item(4, "Item 4");
        ArrayList<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        Cart cart = new Cart();
        item1.setCart(cart);
        item2.setCart(cart);
        item3.setCart(cart);
        item4.setCart(cart);
        cart.setItems(items);
        cartRepository.save(cart);
    }

    @Override
    public Cart findCartByID(Long id) {
        Optional<Cart> opt = cartRepository.findById(id);
        if (opt.isPresent())
            return opt.get();
        else
            return null;

    }
}
