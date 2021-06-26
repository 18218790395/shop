package dao;

import java.util.List;

import entity.Cart;

public interface CartDao {

	List<Cart> list();

	void updateCart(Cart id);

	void deleteCart(Cart id);

	void clearCart();

	void addCart(Cart cart);

}
