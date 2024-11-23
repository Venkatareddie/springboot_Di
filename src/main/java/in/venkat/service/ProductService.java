package in.venkat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.venkat.dao.ProductDao;

@Service
public class ProductService {

//	@Autowired
//	private ProductDao productDao;

	private ProductDao productDao;

	@Autowired
	public void setProductDao(ProductDao productDao) {
		System.out.println("Setter Injection.....");
		this.productDao = productDao;
	}

	public ProductService(ProductDao productDao) {
		System.out.println("Constructor injection....");
		this.productDao = productDao;
	}

	public void orderInfo() {
		productDao.productOrdered();
	}

}
