package com.motor.teste;

/**
 * Created by 15dcc on 2018/6/11.
 */

public class Search {

    /**
     * 二分查找
     * @param list
     * @param key
     * @return
     */
    public int binarySearch(int[] list, int key){
        int low = 0,mid = 0, high= list.length-1;
        while(low <= high){
            mid = (low+high)/2;
            System.out.println("mid"+mid);
            if(key==list[mid]){  // 查找成功，直接返回位置
                return mid;
            }else if(key<list[mid]){  //key 在中间数的左边
                high = mid-1;
            }else {
                low = mid+1;   //key 在中间数的左边
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,8,10};

        Search search = new Search();
        System.out.println(search.binarySearch(list,5));


    }
}
