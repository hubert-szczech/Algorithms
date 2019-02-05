package main.java.com.basic;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Task21 {
  static  void task21(int size){
        Scanner scanner = new Scanner(System.in);
        String[] data = new String[size];
        for(int i = 0; i < size ; i ++) {
            data[i] = scanner.nextLine();
        }
      System.out.printf("| %-8s | %-5s | %-5s |%-5.3s | %n","name", "1th" ,"2th", "1th/2th" );
        for(String line:data){
            String[] place = line.split(" ");
            int x= parseInt(place[1]);
            int y = parseInt(place[2]) ;

            System.out.printf("| %-8s | %-5d | %-5d | %-5.3f | %n",place[0], x , y, (float)x/y );
        }
    }
    public static void main(String... args){

      // wpisz np : Hubert 11 12
        task21(3);

    }

}
