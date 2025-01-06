package com.example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 필드
        boolean calculator = true;
        int num1 = 0, num2 = 0;
        double result = 0;
        char oper = 0;
        String repeatCalculator = "";
        Calculator2 cal = new Calculator2();;

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
            result = cal.calculate(num1, num2, oper);

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

        // 리스트의 모든 값을 출력
        System.out.println(cal.getDoubleList());
        cal.setDoubleList(1, 33);
        System.out.println(cal.getDoubleList());
        cal.removeResult();
        System.out.println(cal.getDoubleList());
    }
}