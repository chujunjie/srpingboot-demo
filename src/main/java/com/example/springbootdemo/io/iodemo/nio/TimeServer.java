package com.example.springbootdemo.io.iodemo.nio;

import java.io.IOException;

/**
 * @Description: NIO
 * @Author: chujunjie
 * @Date: Create in 1:18 2018/12/2
 * @Modified By
 */
public class TimeServer {
    public static void main(String[] args) throws IOException {
        int port = 8080;
        if (args != null && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                // 采用默认值
            }
        }
        MultiplexerTimeServer timeServer = new MultiplexerTimeServer(port);
        new Thread(timeServer, "NIO-MultiplexerTimeServer-001").start();
    }
}
