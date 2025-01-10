package com.example.calculator;

import jdk.dynalink.Operation;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {
    // 필드
    private int num1, num2;
    private char oper;
    private double result;
    private List<Double> doubleList = new ArrayList<Double>();

    // 생성자
    public ArithmeticCalculator() {}
    public ArithmeticCalculator(int num1, int num2, char oper) {
        this.num1 = num1;
        this.num2 = num2;
        this.oper = oper;
    }


    //메서드
    // 연산
    public double calculate(int num1, int num2, char oper) {
//        switch (oper) {
//            case '+' : result = num1 + num2; break;
//            case '-' : result = num1 - num2; break;
//            case '*' : result = num1 * num2; break;
//            case '/' :
//                result = (double) num1 / num2;
//                if(num2 == 0) System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
//                break;
//            default :
//                System.out.println("연산 기호를 잘못 입력하셨습니다.");
//        }
        OperatorType ot = OperatorType.PLUS.operation();
        ot.operation();
        doubleList.add(result);

        return result;
    }

    // 리스트의 모든 값을 출력
    public String getDoubleList() {
        return doubleList.toString();
    }

    // 리스트의 i번째 값을 val로 수정
    public String setDoubleList(int i, double val) {
        doubleList.set(i, val);
        return doubleList.toString();
    }

    // 가장 먼저 저장된 데이터를 삭제
    public void removeResult() {
        doubleList.remove(0);
    }
}