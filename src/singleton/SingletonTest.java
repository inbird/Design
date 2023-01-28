package singleton;

public class SingletonTest {
    public static void main(String[] args) {
        //일반
        NormalClass normalClass1 = new NormalClass();
        NormalClass normalClass2 = new NormalClass();

        System.out.println("Non Singleton");
        System.out.println("normalClass1:"+normalClass1);
        System.out.println("normalClass2:"+normalClass2);
        System.out.println();

        //EagerInitialization
        EagerInitialization eagerInitialization1  = EagerInitialization.getInstance();
        EagerInitialization eagerInitialization2 = EagerInitialization.getInstance();
        System.out.println("EagerInitialization");
        System.out.println("eagerInitialization1:"+eagerInitialization1);
        System.out.println("eagerInitialization2:"+eagerInitialization2);
        System.out.println();

        //ThreadSafeLazyInitialization
        ThreadSafeLazyInitialization threadSafeLazyInitialization1  = ThreadSafeLazyInitialization.getInstance();
        ThreadSafeLazyInitialization threadSafeLazyInitialization2 = ThreadSafeLazyInitialization.getInstance();
        System.out.println("ThreadSafeLazyInitialization");
        System.out.println("threadSafeLazyInitialization1:"+threadSafeLazyInitialization1);
        System.out.println("threadSafeLazyInitialization2:"+threadSafeLazyInitialization2);
        System.out.println();

        //DoubleCheckedLocking
        DoubleCheckedLocking doubleCheckedLocking1  = DoubleCheckedLocking.getInstance();
        DoubleCheckedLocking doubleCheckedLocking2 = DoubleCheckedLocking.getInstance();
        System.out.println("DoubleCheckedLocking");
        System.out.println("doubleCheckedLocking1:"+doubleCheckedLocking1);
        System.out.println("doubleCheckedLocking2:"+doubleCheckedLocking2);
        System.out.println();
    }
}
