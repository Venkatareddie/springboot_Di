package in.venkat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.venkat.service.ProductService;

@SpringBootApplication
public class SpringBootDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctn = SpringApplication.run(SpringBootDiApplication.class, args);
		ProductService productService=ctn.getBean(ProductService.class);
		productService.orderInfo();
	}

}
