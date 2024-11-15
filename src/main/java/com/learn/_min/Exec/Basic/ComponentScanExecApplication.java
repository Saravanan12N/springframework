package com.learn._min.Exec.Basic;

import com.learn._min.Exec.ComponentScan.ComponentPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.learn._min.Exec.ComponentScan")
public class ComponentScanExecApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ComponentScanExecApplication.class);

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());

		//Application Context

		ApplicationContext applicationContext =SpringApplication.run(ComponentScanExecApplication.class, args);
//		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
//		System.out.println(binarySearch);


		ComponentPersonDAO personDAO = applicationContext.getBean(ComponentPersonDAO.class);
		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());

		ComponentPersonDAO personDAO1 = applicationContext.getBean(ComponentPersonDAO.class);
		LOGGER.info("{}",personDAO1);
		LOGGER.info("{}",personDAO1.getJdbcConnection());


//		int result = binarySearch.binarySearch(new int[]{1,2,3,4,5},3);
//		System.out.println(result);

		//OUTPUT com.learn._min.Exec.Basic.BubbleSortAlg@15deb1dc
	}

}
