package com.learning.java8.java8e2e.executorService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo3 {

	public static void main(String[] args) {
		/*
		 * We have already seen execute method of ExecutorService in ExecutorServiceDemo1
		 * 
		 * Now we'll look at submit method which takes argument same as execute method,
		 * but returns a Future
		 */
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		/*
		 * the above is same as Executors.newFixedThreadPool(1); // another method of Executors class
		 */
		Future future = executorService.submit(ExecutorServiceDemo1.newRunnable("Task 1"));
		
		/*
		 *  this future can give some info on the tasks
		 *  it has methods isDone() and isCancelled() to provide the status of the task
		 */
		System.out.println(future.isDone());
		
		// if we do not shutdown, the program keeps running
		executorService.shutdown();
		
		System.out.println(future.isDone()); // after submit, the future has not done yet.
		
		try {
			Object object = future.get();
			// until the run method doesn't finish its execution, the main thread will be blocked here
			// as we have this get method
			System.out.println(object);
			// this returns null as the return type of our run method of newRunnable method 
			// in Demo1 is void.   as Runnable's run's return type is void.
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println(future.isDone());
	}

}
