package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import service.CartService;
import dao.CartDao;
import entity.Cart;

@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDao cartDao;

	@Override
	public List<Cart> list() {
		return cartDao.list();
	}

	@Override
	public void updateCart(Cart id) {
		cartDao.updateCart(id);
	}

	@Override
	public void deleteCart(Cart id) {
		cartDao.deleteCart(id);
	}

	@Override
	public void clearCart() {
		cartDao.clearCart();
	}

	@Override
	public void addCart(Cart cart) {
		cartDao.addCart(cart);
	}

}
