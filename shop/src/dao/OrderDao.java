package dao;

import java.util.List;

import entity.Order;
import entity.Orderandcart;

public interface OrderDao {

	void addOrder(Order order);

	List<Order> list();
	
	void addOrderandcart(Orderandcart orderandcart);

	List<Orderandcart> order_detail(Orderandcart id);

}
