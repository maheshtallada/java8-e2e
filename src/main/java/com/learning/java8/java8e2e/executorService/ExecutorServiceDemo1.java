package com.learning.java8.java8e2e.executorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo1 {

	public static void main(String[] args) {
		
		// creating executorService through one of the factory methods available
		// in Executors class with 10 threads.
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		
		// submitting three tasks to the thread pool
		
		//there are more methods to submit the tasks to 
		// thread pool other than the below execute method.
		executorService.execute(newRunnable("Task 1"));
		executorService.execute(newRunnable("Task 2"));
		executorService.execute(newRunnable("Task 3"));
		
		
		// shuts down the executor service.
		executorService.shutdown();

	}

	public static Runnable newRunnable(String msg) {
		
		Runnable runnable = () -> {
			String fullMsg = Thread.currentThread().getName() 
					+ ": " + msg;
			System.out.println(fullMsg);
		};
		return runnable;
	}

	public static Callable newCallable(String msg) {
		Callable callable = () -> {
			String fullMsg = Thread.currentThread().getName() 
					+ ": " + msg;
			return fullMsg;
		};
		return callable;
	}

}
