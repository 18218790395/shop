package service;

import java.util.List;

import entity.Cart;

public interface CartService {

	List<Cart> list();

	void updateCart(Cart id);

	void deleteCart(Cart id);

	void clearCart();

	void addCart(Cart cart);

}
