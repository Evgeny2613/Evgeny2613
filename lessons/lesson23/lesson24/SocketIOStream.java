package lessons.lesson23.lesson24;

import java.io.*;
import java.net.Socket;

public class SocketIOStream {
    public static void main(String[] args) {
        String serverName = "colormind.io";
        int port = 80; // tcp http

        String webService = "/list/";

        try (
                Socket socket = new Socket(serverName, port); //tcp

                InputStream inputStream = socket.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                OutputStream outputStream = socket.getOutputStream();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
                )
        {
            //отправляем
            outputStreamWriter.write("GET http://" + serverName + webService + " HTTP/1.0\n\n");
            outputStreamWriter.flush(); // отправить буфер

            // получаем
            bufferedReader.lines().forEach(System.out::println
            );
        }
        catch (Exception e) {
            System.err.println(e);
        }
    }
}
