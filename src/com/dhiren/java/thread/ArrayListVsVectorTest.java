package com.dhiren.java.thread;

import java.util.ArrayList;
import java.util.List;

public class ArrayListVsVectorTest {

	int delay=10;//thread delay
    int dataCount=10;//item count
    //List items = new Vector();//Sync;thread-safe
    List items = new ArrayList();//Async;not-thread-safe

    {
        items.add("data1");
        items.add("data2");
    }    
    
    class AddDataThread extends Thread {
        @Override
        public void run() {
            Thread ct = Thread.currentThread();
            for (int i = 3; i <= dataCount; i++) {
                System.out.println(ct.getName() + ": Adding...data" + i);
                items.add("data" + i);
                System.out.println(ct.getName()+": "+items);
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    class DeleteDataThread extends Thread {
        @Override
        public void run() {
            Thread ct = Thread.currentThread();
            for (int i = 1; i <= dataCount; i++) {
                System.out.println(ct.getName() + ": Removing...data" + i);
                items.remove("data" + i);
                System.out.println(ct.getName()+": "+items);
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void doProcess() {
    	
        AddDataThread addThread = new AddDataThread();
        DeleteDataThread deleteThread = new DeleteDataThread();
        addThread.setName("A");
        deleteThread.setName("D");
        addThread.start();
        deleteThread.start();
    }
}
	//public class TestSync {
		
//}
