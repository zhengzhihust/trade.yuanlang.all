package com.yuanlang.netty.nio;

import java.io.IOException;

/**
 * Created by yuanlang on 15/12/20.
 */
public class TimeServer {

    public static void main(String[] args) throws IOException{
        int port = 8080;
        MultiplexerTimeServer timeServer = new MultiplexerTimeServer(port);
        new Thread(timeServer, "NIO-MultiplexerTimeServer-001").start();
    }

}
