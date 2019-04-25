package com.cheer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("设定最大值:");
        int max = sc.nextInt();
        int i = 0;
        int j = 1;
        List<Integer> fibonacci = new ArrayList<Integer>();
        fibonacci.add(0);
        fibonacci.add(1);
        while (true){
            int temp = i;
            i = j;
            j += temp;
            if (j<max){
                fibonacci.add(j);
            }else{
                break;
            }
        };
        int count = 0;
        for (int c = 0;c < fibonacci.size();c++){
            System.out.print(fibonacci.get(c));
            count++;
            if (count % 8 == 0){
                System.out.print("\n");
            }else {
                System.out.print("\t");
            }
        }
        sc.close();
    }
}
