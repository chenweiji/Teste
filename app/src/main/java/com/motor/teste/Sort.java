package com.motor.teste;

/**
 * 数组冒泡排序
 */

public class Sort {


    /**
     * 数组冒泡排序
     * @param arr 目标数组
     * @return int[]
     */
    public int[] sort(int[] arr){

        int temp;
        boolean isChange = false; //元素发生交换标志位，用于优化排序
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                    isChange =true; //发生了交换，标志位变为true
                }
            }
            if(!isChange)break;
            isChange = false; //如果经过一轮的比较没有发生交换，说明已经排好序，直接结束循环
        }
        return arr;
    }

    public void reOrderArray(int [] array) {
        /**
         * 算法思路：
         * 采用冒泡法思想，只要遇到前偶后奇则交换
         */
        int temp;

        boolean isChange = false; //元素发生交换标志位，用于优化排序
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j]=array[j+1];
                    array[j+1] = temp;
                    isChange =true; //发生了交换，标志位变为true
                }
            }
            if(!isChange)break;
            isChange = false; //如果经过一轮的比较没有发生交换，说明已经排好序，直接结束循环
        }

        for(int i=0;i<array.length; i++){
            for(int j=0; j<array.length-i-1; j++){

                if(array[j]%2==0 && array[j+1]%2==1){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
//        int[] a = {1,3,2,2,3,2,3,4,5,6,7,8};
//        Sort sort = new Sort();
//        sort.sort(a);
//        for(int i= 0; i<a.length;i++){
//            System.out.print(a[i]+" ");
//        }
//
//        int[] A = {2,1,4,7,1,0,6,64,4,4,4,3,3,3,3,3,4,7,1,2,8,4,3,6,7,2,14,3,7,4,3,2,4,3,2,7};
//        sort.reOrderArray(A);
//        System.out.println(" ");
//        for(int i = 0;i < A.length;i++)
//            System.out.print(A[i]+" ");

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                System.out.println("a"+(1+122));
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("b"+(1+122));
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("c"+(1+122));
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("d"+(1+122));
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("e"+(1+122));
                }
            }
        }).start();new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("f"+(1+122));
                }
            }
        }).start();new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("g"+(1+122));
                }
            }
        }).start();new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("h"+(1+122));
                }
            }
        }).start();new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("i"+(1+122));
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("j"+(1+122));
                }
            }
        }).start();





    }

}
