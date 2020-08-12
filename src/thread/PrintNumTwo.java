package thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 两个线程交替打印奇数和偶数
 * 具体实现：交替打印小于等于20范围内的数字
 */
public class PrintNumTwo {


    /**
     *  使用原子类进行线程间安全的访问
     */
    static AtomicInteger a = new AtomicInteger(1);
    public static void thread1(){
        //打印偶数
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(a.get() <= 20){
                    if(a.get() % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + a.get());
                        a.incrementAndGet();
                    }

                }
            }
        }, "偶数线程");

        //打印奇数
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(a.get() < 20){
                    if(a.get() % 2 != 0){
                        System.out.println(Thread.currentThread().getName() + a.get());
                        a.incrementAndGet();
                    }

                }
            }
        }, "奇数线程");
        t1.start();
        t2.start();
    }

    /**
     * 不加任何锁，直接靠逻辑进行实现
     */
    static int b = 1;
    public static void thread2(){
        //打印偶数
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(b <= 20){
                    if(b % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + b);
                        b++;
                    }

                }
            }
        }, "偶数线程");

        //打印奇数
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(b < 20){
                    if(b % 2 != 0){
                        System.out.println(Thread.currentThread().getName() + b);
                       b++;
                    }

                }
            }
        }, "奇数线程");
        t1.start();
        t2.start();
    }

    /**
     * 使用对象锁实现
     */
    static int c = 1;
    public static void thread3(){
        Object obj = new Object();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj){
                    while(c <= 20) {
                        if (c % 2 == 0) {
                            System.out.println(Thread.currentThread().getName() + c);
                            c++;
                        }
                        obj.notifyAll();
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    obj.notify();
                }
            }
        }, "偶数线程");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj){
                    while(c < 20) {
                        if (c % 2 != 0) {
                            System.out.println(Thread.currentThread().getName() + c);
                            c++;
                        }
                        obj.notifyAll();
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    obj.notify();
                }
            }
        }, "奇数线程");

        t1.start();
        t2.start();

    }

    public static void main(String[] args) {
        thread3();
    }

}
