package de.uka.ipd.sdq.probespec.framework.concurrency;

import java.util.ArrayList;

import org.apache.log4j.Logger;

/**
 * Maintains a list of threads that has been spawned by the ProbeSpecification. This allows for
 * stopping all running threads at once by using {@link #stopThreads()}.
 * <p>
 * The ThreadManager gets aware of new threads only when threads are spawned using
 * {@link #startThread(StoppableRunnable, String)}, which is the recommended approach.
 * 
 * @author Philipp Merkle
 * 
 */
public class ThreadManager {

    private static final Logger logger = Logger.getLogger(ThreadManager.class);

    private ArrayList<RunnableThreadPair> runnableThreadList;

    private boolean isStopping = false;

    public ThreadManager() {
        runnableThreadList = new ArrayList<RunnableThreadPair>();
    }

    /**
     * Creates a thread using the specified runnable and starts execution. All threads started that
     * way can be stopped at once by using {@link #stopThreads()}.
     * 
     * @param runnable
     * @param threadName
     */
    public void startThread(StoppableRunnable runnable, String threadName) {
        if (!isStopping) {
            Thread thread = new Thread(runnable);
            runnableThreadList.add(new RunnableThreadPair(runnable, thread));
            thread.setName(threadName);
            thread.start();
        } else {
            logger.warn("Tried to start a thread but the ThreadManager has before been told to stop all threads: "
                    + threadName);
        }
    }

    /**
     * Stops all threads that has been started using {@link #startThread(StoppableRunnable, String)}
     * and waits for their termination.
     */
    public synchronized void stopThreads() {
        // set this flag to avoid that additional threads are started using the startThread-method
        isStopping = true;

        for (RunnableThreadPair p : runnableThreadList) {
            p.getRunnable().stop();
        }

        for (RunnableThreadPair p : runnableThreadList) {
            // Wait for the thread to finish
            try {
                // TODO: maybe use join with parameter in order to avoid waiting
                // forever
                p.getThread().join();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        // all threads have stopped, we don't need the thread list anymore
        runnableThreadList.clear();

        isStopping = false;
    }

    /**
     * (StoppableRunnable, Thread)-Pair
     */
    private class RunnableThreadPair {

        private StoppableRunnable runnable;

        private Thread thread;

        public RunnableThreadPair(StoppableRunnable runnable, Thread thread) {
            this.runnable = runnable;
            this.thread = thread;
        }

        public StoppableRunnable getRunnable() {
            return runnable;
        }

        public Thread getThread() {
            return thread;
        }

    }

}
