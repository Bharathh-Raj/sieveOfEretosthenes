package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int inp,i,j;
        System.out.print("Enter the number:");
        inp=sc.nextInt();
        double stime=System.currentTimeMillis();
        Boolean ary[]=new Boolean[inp+1];
        Arrays.fill(ary,true);
        for (i=2;i<=Math.sqrt(inp);i++){
            if(ary[i]==true){
                for(j=i*2;j<=inp;j+=i)
                    ary[j]=false;
            }
        }
        double etime=System.currentTimeMillis()-stime;
        System.out.println("Time to execute="+ etime+"ms");
        int count=0;
        for(i=2;i<=inp;i++){
            if(ary[i]) {
                count += 1;
                System.out.print("\t" + i);
            }
            if(i%20==0) System.out.println();
        }
        System.out.println("count: "+count);
        double ttime=System.currentTimeMillis()-stime;
        System.out.println("\nTotal time="+ttime+"ms");
    }
}