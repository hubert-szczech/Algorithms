package main.java.com.searching;

public class BinarySearch {
    static int x = 0;

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    public static int rank(int key, int[] a, int lo, int hi) {
        x++;
        System.out.println("=====" + x + "=====");
        System.out.println("lowest= " + lo + " highest= " + hi);
        if (lo > hi) return -1;
        int mid = (lo + hi) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi);
        else {
            x = 0;
            return mid;
        }
    }

        public static void main (String args[]){
            int[] a = {0, 1, 2, 3, 4, 5, 5, 7, 8, 9, 9, 11,12,13, 1234, 1234,143124214,};
            System.out.print("nuber is on index : " + rank(8, a));
        }

    }

