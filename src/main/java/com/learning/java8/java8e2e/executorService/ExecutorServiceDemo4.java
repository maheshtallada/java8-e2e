package com.learning.java8.java8e2e.executorService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo4 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// over-loaded method of submit method which takes Callable instance as
		// argument

		ExecutorService executorService = Executors.newSingleThreadExecutor();

		@SuppressWarnings({ "unchecked", "rawtypes" })
		Future future = executorService.submit(ExecutorServiceDemo1.newCallable("Task 1.1"));
		System.out.println(future.isDone());
		
		String object = (String) future.get();
		System.out.println(object);
		
		System.out.println(future.isDone());
		executorService.shutdown();
		//	learn about Future class and it's usage 
	}

}
