package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application8 {

    public static void main(String[] args) {

        /*
            1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.

            ex.
            정수를 하나 입력하세요 : 8
            1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
	    */
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");

        int user = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= user; i++){ //  for문은 int i = 1 확인 후 i <= user 확인

            sum += i;
            if ( i != user){
                System.out.print(i + " + ");
            } else {
                System.out.print(i + " = " + sum);
            }
        }

    }
}
