package Pattern;

//饿汉模式
class Singleton {
    private Singleton() { }

    private static Singleton instance = new Singleton();

    public static synchronized Singleton getInstance() {
        return instance;
    }

    public void showMessage(){
        System.out.println("hello, hungry");
    }
}

//懒汉模式
class SingletonLazy {
    private SingletonLazy() { }

    private static SingletonLazy instance;

    public static synchronized SingletonLazy getInstance() {
        if(instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("hello, Lazy");
    }
}

//懒汉双检锁模式
class SingletonLazyDCL {
    private SingletonLazyDCL() { }

    private volatile static SingletonLazyDCL instance;

    public static SingletonLazyDCL getInstance() {
        if(instance == null){
            synchronized (SingletonLazyDCL.class) {
                if (instance == null) {
                    instance = new SingletonLazyDCL();
                }
            }
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("hello, Lazy");
    }
}

class SingletonPatternDemo {
    public static void main(String[] args) {
        SingletonLazyDCL s = SingletonLazyDCL.getInstance();
        s.showMessage();
    }
}