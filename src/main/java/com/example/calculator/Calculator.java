package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        boolean calculator = true;
        int num1 = 0, num2 = 0;
        double result = 0;
        char oper = 0;
        String repeatCalculator = "";

        Scanner sc = new Scanner(System.in);

        while (calculator) {
            // 첫 번째 피연산자 입력
            System.out.println("첫 번째 숫자를 입력하세요: ");
            num1 = sc.nextInt();
            if (num1 < 0) {
                System.out.println("0 또는 양의 정수를 입력하세요");
                continue;
            }

            // 두 번째 피연산자 입력
            System.out.println("두 번째 숫자를 입력하세요: ");
            num2 = sc.nextInt();
            if (num2 < 0) {
                System.out.println("0 또는 양의 정수를 입력하세요");
                continue;
            }

            // 연산자 입력
            System.out.println("사칙연산 기호를 입력하세요: ");
            oper = sc.next().charAt(0);
            if (!(oper == '+' || oper == '-' || oper == '*' || oper == '/')) {
                System.out.println("올바른 연산자를 입력해주세요");
                continue;
            }

            // 연산
            switch (oper) {
                case '+' : result = num1 + num2; break;
                case '-' : result = num1 - num2; break;
                case '*' : result = num1 * num2; break;
                case '/' :
                    result = (double) num1 / num2;
                    if(num2 == 0) System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    break;
                default :
                    System.out.println("연산 기호를 잘못 입력하셨습니다.");
            }

            // 출력 (0으로 나눈 경우 제외)
            if (!(oper == '/' && num2 == 0)) {
                System.out.println("수식: " + num1 + " " + oper + " " + num2);
                System.out.println("결과: " + result);
            }

            // 다시 연산 할 지 끝낼 지 입력 (exit 이외의 값 입력 시 다시 진행)
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            repeatCalculator = sc.next();
            if (repeatCalculator.equals("exit")) calculator = false;
        }
    }
}