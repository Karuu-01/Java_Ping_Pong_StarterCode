import models.PingPong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class App {
  public static void main(String[] args) {
    System.out.println("I'm a ping-pong application!");
 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("I'm a ping-pong application!");
        System.out.println("Enter a number:");
        try {
            String stringUserNumber = bufferedReader.readLine();
            int intUserNumber = Integer.parseInt(stringUserNumber);
            PingPong pingPong = new PingPong();
            ArrayList<Object> pingPongResult = pingPong.runPingPong(intUserNumber);
            System.out.println(pingPongResult);
            System.out.println("Your ping result is awesome");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
 }