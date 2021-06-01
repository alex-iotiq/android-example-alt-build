package com.example.android_example;

public class TestMe {
    // will always return 1
    public int test(){
        int tmp = 2;
        try {
            Thread.sleep(1 * 500);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        for (int i = 0; i < 10; i++) {
            tmp += i^i;
        }
        return tmp;
    }
}