package demo01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
public class ClientDemo01 {
    public static void main(String[] args) throws Exception{
        //创建客户端的Socket对象(Socket)
        Socket socket = new Socket("192.168.1.4",8888);
        //获取输出流，写数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello:tcp我来了".getBytes());
        //接收服务器反馈
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        String s = new String(bytes, 0, len);
        System.out.println("客户端：" + s);
        inputStream.close();
        outputStream.close();
        socket.close();

    }
}
