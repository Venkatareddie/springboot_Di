package in.venkat.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	
	public void productOrdered()
	{
		System.out.println("You product got ordered....");
	}

}
