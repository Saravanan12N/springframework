package com.learn._min.Exec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExecApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());
		int result = binarySearch.binarySearch(new int[]{1,2,3,4,5},3);
		System.out.println(result);

		SpringApplication.run(ExecApplication.class, args);
	}

}
