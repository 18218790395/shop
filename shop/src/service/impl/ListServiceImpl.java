package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import service.ListService;
import dao.ListDao;
import entity.Product;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class ListServiceImpl implements ListService {

	@Autowired
	private ListDao listDao;

	@Override
	public List<Product> list() {
		return listDao.list();
	}

}
