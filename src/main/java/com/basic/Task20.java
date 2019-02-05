package main.java.com.basic;

public class Task20 {

           public static double naturalLogFromfactorial(int N){
               if(N > 0) return Math.log(N) + naturalLogFromfactorial(N-1);
               else return 0;
           }
}
