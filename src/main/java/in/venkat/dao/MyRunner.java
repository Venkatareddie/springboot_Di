package in.venkat.dao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

	public MyRunner() {
		System.out.println("MyRunner :: Constructor");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Run()...method called....");

	}

}
