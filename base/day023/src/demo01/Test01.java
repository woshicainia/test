package demo01;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
public class Test01 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("D:\\图片\\线程安全类.png");
        Socket socket = new Socket("192.168.1.4",8888);
        OutputStream outputStream = socket.getOutputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1){
            outputStream.write(bytes,0,len);
        }
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        while ((len = inputStream.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
        socket.close();
    }
}
