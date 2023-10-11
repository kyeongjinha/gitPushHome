package com.ohgiraffers.section01.conditional.level03;
import java.util.Scanner;
public class Application10 {

    public static void main(String[] args) {

        /*
                정수 두 개와 연산자를 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요.
                단, 해당 프로그램은 연산자 입력에 “exit”라는 값이 들어올 때까지 무한 반복하며
                exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다.
                또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
                “0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며,
                없는 연산자가 들어올 시 “없는 연산자입니다. 다시 입력해주세요.”라고 출력하고
                두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.

                예시)
                연산자(+, -, *, /, %) : +
                정수1 : 10
                정수2 : 4
                10 + 4 = 14

                연산자(+, -, *, /, %) : /		      연산자(+, -, *, /, %) : /
                정수1 : 10 				      정수1 : 10
                정수2 : 4 				      정수2 : 0
                10 / 4 = 2				      0으로 나눌 수 없습니다. 다시 입력해주세요.

                연산자(+, -, *, /, %) : ^ 		      연산자(+, -, *, /, %) : exit
                정수1 : 10 				      프로그램을 종료합니다.
                정수2 : 4
                없는 연산자입니다. 다시 입력해주세요.
	   */
        Scanner sc = new Scanner(System.in);
        int result = 0; // result 는 결과라는 의미

        while (true) { // 값이 true가 나올 때까지 반복으로 돌리겠다

            System.out.print("연산자(+, -, *, /, %) : ");
            String op = sc.next(); // 문자열을 입력하겠다

            if (op.equals("exit")) { // exit가 입력이 되면
                System.out.println("프로그램을 종료합니다."); // 좌측 문구를 출력하겠다
                break; // exit가 입력이 되면 위의 문구를 출력하고 종료하겠다.
            }

            System.out.print("정수1: ");
            int num1 = sc.nextInt();
            System.out.print("정수2: ");
            int num2 = sc.nextInt();

            if (op.equals("/") && num2 == 0) { // (연산자.==("/") 이고, 두 번째 정수 == 0이면)
                System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
                continue; // 특정 조건을 만족하는 경우 continue를 만나면 다음 코드로 넘어가지 않고 다시 반복 과정을 지속한다
            }

            switch (op) { // 위의 String op = sc.next(); 에서 입력한 문자열이 아래 case 조건과 같다면
                case "+" : // 조건값 즉 case 문자 +가 들어오면 result에 있는 값에다가 num1에 num2를  더해서 대입해 주겠다 라는 의미
                    result = num1 + num2; // 수행될 문장 case 조건값이라면 num1 + num2 를 띄우겠다?
                    break; // 위의 조건값이 맞다면 코드 실핼 후 종료 하겠다
                case "-" : // 조건값
                    result = num1 - num2;
                    break;
                case "*" : // 조건값
                    result = num1 * num2;
                    break;
                case "/" : // 조건값
                    result = num1 / num2;
                    break;
                case "%" : // 조건값
                    result = num1 % num2;
                    break;
                default: // 위의 case 조건값(+, - , *, /, %)에 해당하지 않는다면 아래 문구를 출력하겠다
                    System.out.println("없는 연산자 입니다. 다시 입력하세요");
                    continue; // 위에 문구가 나오면 다시 반복..
            }
            System.out.println(num1 + " " + op + " " + num2 + " = " + result); //result는 switch문에서 나오는 계산값
            break;
        }
    }
}