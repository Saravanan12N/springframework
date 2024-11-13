package com.learn._min.Exec;

import com.learn._min.Exec.Basic.BinarySearchImpl;
import com.learn._min.Exec.Scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExecApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ExecApplication.class);

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());

		//Application Context

		ApplicationContext applicationContext =SpringApplication.run(ExecApplication.class, args);
//		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
//		System.out.println(binarySearch);
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		//System.out.println(personDAO);
		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());
		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
		LOGGER.info("{}",personDAO1);
		LOGGER.info("{}",personDAO1.getJdbcConnection());
		//System.out.println(personDAO1);
//		int result = binarySearch.binarySearch(new int[]{1,2,3,4,5},3);
//		System.out.println(result);

		//OUTPUT com.learn._min.Exec.Basic.BubbleSortAlg@15deb1dc
	}

}
