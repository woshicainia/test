package demo01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class Test02 {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(8888);
        Socket accept = ss.accept();
        InputStream inputStream = accept.getInputStream();
        File file = new File("d:\\upload");
        if (!file.exists()){
            file.mkdir();
        }
        FileOutputStream fos = new FileOutputStream(file + "\\1.jpg");
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = inputStream.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        accept.getOutputStream().write("上传成功".getBytes());
        fos.close();
        accept.close();
        ss.close();
    }
}
