package com.speical.first;

import java.util.Scanner;

/**
 * 找最小的数
 * @author Special
 *
 */
public class Pro195 {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            int n = input.nextInt();
            int x, y, minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
            while(n-- > 0) {
                x = input.nextInt();
                y = input.nextInt();
                if(x < minX) {
                    minX = x;
                    minY = y;
                }else if(x == minX && y < minY){
                    minY = y;
                }
            }
            System.out.println(minX + " " + minY);
        }
    }

}
