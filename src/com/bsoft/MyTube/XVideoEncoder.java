package com.bsoft.MyTube;

public class XVideoEncoder implements VideoEncoder {
    @java.lang.Override
    public void encode(Video video) {
        System.out.println("Encoding video...");
        System.out.println("Done!\n");
    }
}
