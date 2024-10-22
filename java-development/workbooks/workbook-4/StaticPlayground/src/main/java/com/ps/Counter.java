package com.ps;

public class Counter {
    int instanceCount = 0;
    static int staticCount = 0;

    public void instanceIncrement(){
        this.instanceCount++;
    }

    public static void staticIncrement(){
        staticCount++;
    }
}
