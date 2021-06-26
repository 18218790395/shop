package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import service.OrderService;
import dao.OrderDao;
import entity.Order;
import entity.Orderandcart;

@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;

	@Override
	public void addOrder(Order order) {
		orderDao.addOrder(order);
	}

	@Override
	public List<Order> list() {
		return orderDao.list();
	}

	@Override
	public void addOrderandcart(Orderandcart orderandcart) {
		orderDao.addOrderandcart(orderandcart);
	}

	@Override
	public List<Orderandcart> order_detail(Orderandcart id) {
		return orderDao.order_detail(id);
	}

}
