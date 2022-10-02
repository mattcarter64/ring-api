package org.mcsoft.ringapi.util;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public final class ThreadManager {

    private static final ThreadGroup threadGroup = new ThreadGroup("DLA");

    private static final ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(4,
            defaultThreadFactory("Scheduled"));
    private static final ExecutorService general = Executors.newCachedThreadPool(defaultThreadFactory("General"));
    private static final ExecutorService videoClip = Executors.newCachedThreadPool(defaultThreadFactory("Clip"));

    // /////////////////////////////////////////

    public static void stop() {
        scheduled.shutdownNow();
        general.shutdownNow();
        videoClip.shutdownNow();
    }

    public static ScheduledFuture<?> scheduleTask(Runnable task, long initialDelay, TimeUnit unit) {
        return scheduled.schedule(task, initialDelay, unit);
    }

    public static ScheduledFuture<?> scheduleFixedRateTask(Runnable task, long initialDelay, long period,
                                                           TimeUnit unit) {
        return scheduled.scheduleAtFixedRate(task, initialDelay, period, unit);
    }

    public static ScheduledFuture<?> scheduleFixedDelayTask(Runnable task, long initialDelay, long delay,
                                                            TimeUnit unit) {
        return scheduled.scheduleWithFixedDelay(task, initialDelay, delay, unit);
    }

    // /////////////////////////////////////////

    public static void execute(Runnable command) {
        general.execute(command);
    }

    public static Future<?> submit(Runnable command) {
        return general.submit(command);
    }

    // /////////////////////////////////////////
    // video clip foo
    public static Future<?> submit(Callable<?> command) {
        return videoClip.submit(command);
    }

    // /////////////////////////////////////////

    public static Thread newThread(Runnable target) {
        return new Thread(threadGroup, target);
    }

    public static Thread newThread(Runnable target, String name) {
        return new Thread(threadGroup, target, name);
    }

    public static ThreadGroup getThreadGroup() {
        return threadGroup;
    }

    // /////////////////////////////////////////

    private static ThreadFactory defaultThreadFactory(String threadPoolName) {
        return new DefaultThreadFactory(threadPoolName);
    }

    private static class DefaultThreadFactory implements ThreadFactory {

        private final AtomicInteger threadNumber = new AtomicInteger(1);

        private final String threadNamePrefix;

        public DefaultThreadFactory(String threadPoolName) {
            threadNamePrefix = threadPoolName + "-";
        }

        @Override
        public Thread newThread(Runnable runnable) {

            Thread thread = new Thread(threadGroup, runnable, threadNamePrefix + threadNumber.getAndIncrement());

            thread.setDaemon(true);
            thread.setPriority(Thread.NORM_PRIORITY);

            return thread;
        }
    }
}
