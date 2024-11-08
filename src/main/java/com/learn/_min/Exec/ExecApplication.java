package com.learn._min.Exec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExecApplication {

	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());

		//Application Context

		ApplicationContext applicationContext =SpringApplication.run(ExecApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch1);
		int result = binarySearch.binarySearch(new int[]{1,2,3,4,5},3);
		System.out.println(result);

		//OUTPUT com.learn._min.Exec.BubbleSortAlg@15deb1dc
	}

}
