package com.learning.java8.java8e2e.executorService;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo2 {

	public static void main(String[] args) {

		int corePoolSize = 10;
		int maxPoolSize = 20;
		long keepAliveTime = 3000;
		
		/*
		 * Java has two implementation classes for ExecutorService Interface
		 * 1. ThreadPoolExecutor - It attempts to execute tasks submitted to it as soon as it can.
		 * 2. ScheduledThreadPoolExecutor - schedule to execute the tasks at a specific time in future.
		 */

		ExecutorService threadPoolExecutor = new ThreadPoolExecutor(
				corePoolSize, //starts with 10 threads in the pool
				maxPoolSize, // if there are more tasks for the 10 threads,
							// it can create upto 10 more threads (tot: 20)
				keepAliveTime, // after this time, execService can terminate the additional
								// threads created if they are "idle"
				TimeUnit.MILLISECONDS, // unit of keepAliveTime
										// i.e., after 3000 milliseconds, the additional threads 
										//if idle will be terminated.
				new ArrayBlockingQueue<>(128));
										// to store the tasks submitted to thread pool executor.
										// the pool threads will take the tasks from this queue.
		
		
		// another way of creating threadPoolExecutor through Executors' class factory method.
		// here the corePoolSize and maxPoolSize will be 3
		threadPoolExecutor = Executors.newFixedThreadPool(3);
		
		
		// ScheduledExecutorService extends ExecutorService
		ScheduledExecutorService scheduledExecutorService = 
				new ScheduledThreadPoolExecutor(corePoolSize);
		
		scheduledExecutorService = (ScheduledExecutorService) 
				Executors.newFixedThreadPool(10);
		
	}
}
