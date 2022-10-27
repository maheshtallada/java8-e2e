package com.learning.java8.java8e2e.executorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo5 {

	// invokeAny & invokeAll
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		List<Callable<String>> callables = new ArrayList<>();
		callables.add(ExecutorServiceDemo1.newCallable("Task 1.1"));
		callables.add(ExecutorServiceDemo1.newCallable("Task 1.2"));
		callables.add(ExecutorServiceDemo1.newCallable("Task 1.3"));
		
		try {
			/*
			 * invokeAny invokes one of the callable from list,
			 * this is used in case of we have multiple options(ex: servers) to call, 
			 * but all returns the same response
			 * 
			 * whichever server gives response faster, its result will be considered.
			 */
			String invokeAny = executorService.invokeAny(callables);
			System.out.println("from invokeAny ::" + invokeAny);
			
			
			
			List<Future<String>> invokeAll = executorService.invokeAll(callables);
			invokeAll.forEach((future)-> {
				try {
					System.out.println(future.get());
				} catch (InterruptedException | ExecutionException e) {
					e.printStackTrace();
				}
			});
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		executorService.shutdown();

	}

}
