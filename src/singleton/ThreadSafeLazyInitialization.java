package singleton;

public class ThreadSafeLazyInitialization {
    private static ThreadSafeLazyInitialization threadSafeLazyInitialization;

    private ThreadSafeLazyInitialization(){}

    public static ThreadSafeLazyInitialization getInstance(){
        if( threadSafeLazyInitialization == null ){
            threadSafeLazyInitialization = new ThreadSafeLazyInitialization();
        }
        return threadSafeLazyInitialization;
    }
}
