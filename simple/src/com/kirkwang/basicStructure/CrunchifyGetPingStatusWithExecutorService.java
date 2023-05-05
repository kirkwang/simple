package com.leetcode.LengthOfLongestSubstring;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lombok.SneakyThrows;

public class CrunchifyGetPingStatusWithExecutorService {

    private static final int crunchifyThreads = 10;

    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
// wait for activity here
        // Executors: Factory and utility methods for Executor, ExecutorService, ScheduledExecutorService, ThreadFactory, and Callable classes defined in this package.

        // ExecutorService: An Executor that provides methods to manage termination and methods that can produce a Future for tracking progress of one or more asynchronous tasks.
        // An ExecutorService can be shut down, which will cause it to reject new tasks.
        // Two different methods are provided for shutting down an ExecutorService.
        // The shutdown method will allow previously submitted tasks to execute before terminating, while the shutdownNow method prevents waiting tasks from starting and attempts to stop currently executing tasks.
        // Upon termination, an executor has no tasks actively executing, no tasks awaiting execution, and no new tasks can be submitted.
        // An unused ExecutorService should be shut down to allow reclamation of its resources.
        ExecutorService executor = Executors.newFixedThreadPool(crunchifyThreads);

        // newFixedThreadPool(): Creates a thread pool that reuses a fixed number of threads operating off a shared unbounded queue.
        // At any point, at most nThreads threads will be active processing tasks. If additional tasks are submitted when all threads are active, they will wait in the queue until a thread is available.
        // If any thread terminates due to a failure during execution prior to shutdown, a new one will take its place if needed to execute subsequent tasks

        String[] crunchifyList = {
                "https://crunchify.com",
                "https://yahoo.com",
                "https://www.ebay.com",
                "https://google.com",
                "https://www.example.co",
                "https://paypal.com",
                "http://bing.com/",
                "https://techcrunch.com/",
                "http://mashable.com/",
                "https://wpsharing.co",
                "https://wordpress.com/",
                "https://wordpress.org/",
                "https://example.com/",
                "https://sjsu.edu/",
                "https://crunchify.com/",
                "https://test.com.au/",
                "https://www.wikipedia.org/",
                "https://en.wikipedia.org"
        };

        for (int i = 0; i < crunchifyList.length; i++) {

            String url = crunchifyList[i];
            Runnable worker = new MyRunnable(url);

            executor.execute(worker);
        }

        // shutdown(): Initiates an orderly shutdown in which previously submitted tasks are executed, but no new tasks will be accepted.
        // Invocation has no additional effect if already shut down.
        // This method does not wait for previously submitted tasks to complete execution. Use awaitTermination to do that.
        executor.shutdown();

        // Wait until all threads are finish
        // Returns true if all tasks have completed following shut down.
        // Note that isTerminated is never true unless either shutdown or shutdownNow was called first.
        while (!executor.isTerminated()) {
            // empty body
        }
        long endTime = System.currentTimeMillis();
        long seconds = (endTime - startTime) / 1000;

        System.out.println("\nFinished all threads in second " + seconds);
    }

    public static class MyRunnable implements Runnable {

        private final String url;

        MyRunnable(String url) {
            this.url = url;
        }

        @SneakyThrows
        @Override
        public void run() {
            String result = "";
            int code = 200;
            URL siteURL = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) siteURL.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(3000);
            connection.connect();
            code = connection.getResponseCode();
            if (code == 200) {
                result = "-> Green <-\t\t" + "Code: " + code;
                ;
            } else {
                result = "-> Yellow <-\t\t" + "Code: " + code;
            }

            Thread.sleep(1000);
            System.out.println(url + "\t\t\t\tStatus:" + result);
        }
    }
}
