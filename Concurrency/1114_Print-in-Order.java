import java.util.concurrent.Semaphore;

class Foo {

    private Semaphore firstDone = new Semaphore(0);
    private Semaphore secondDone = new Semaphore(0);

    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        firstDone.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        firstDone.acquire();
        printSecond.run();
        secondDone.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
        secondDone.acquire();
        printThird.run();
    }
}