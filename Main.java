package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int[] ar={0,0,1,0,3,0,5,0,6};
 int l=ar.length;
 int p=l-1;
 int tmp=0;
 int max=1;
    for(int i=0;i<l;i++){

     while(ar[i]==0){

           tmp = ar[i];
           ar[i] = ar[l - 1];
           ar[l - 1] = tmp;

          l--;



     }


    }
        int len=0;
        for (int j=0;j<ar.length;j++){
            if (ar[j]!=0){
                len++;
            }
        }
        int t=0;
        for (int j=0;j<len;j++){

            for(int k=j+1;k<len;k++){
                if(ar[j]>ar[k]){
                    t=ar[j];
                    ar[j]=ar[k];
                    ar[k]=t;
                }
            }
        }
        System.out.println(len);

        System.out.println(ar.length);


        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }


    }
}

