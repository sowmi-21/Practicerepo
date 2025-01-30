package threadDemo;

class Car {
    private boolean isAvailable = true;
 
    public synchronized void acquire() {
        while (!isAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isAvailable = false;
        System.out.println(Thread.currentThread().getName() + " acquired the car.");
    }
 
    public synchronized void release() {
        isAvailable = true;
        System.out.println(Thread.currentThread().getName() + " released the car.");
        notifyAll(); // Notify all waiting threads
    }
}
 
class WaitAndNotifyActivity implements Runnable {
    private Car car;
 
    public WaitAndNotifyActivity(Car car) {
        this.car = car;
    }
 
    @Override
    public void run() {
        car.acquire();
        try {
            // Simulate the time taken for the cab service
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            car.release();
        }
    }
 
    public static void main(String[] args) {
        Car car = new Car();
        Thread t1 = new Thread(new WaitAndNotifyActivity(car), "Driver 1");
        Thread t2 = new Thread(new WaitAndNotifyActivity(car), "Driver 2");
        Thread t3 = new Thread(new WaitAndNotifyActivity(car), "Driver 3");
 
        t1.start();
        t2.start();
        t3.start();
    }
}

