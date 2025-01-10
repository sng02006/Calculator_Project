package com.example.calculator;

public enum OperatorType {
    PLUS('+') {
        @Override
        char operation() {
            return PLUS.oper;
        }
    },
    MINUS('-') {
        @Override
        char operation() {
            return MINUS.oper;
        }
    },
    MULTIPLICATION('*') {
        @Override
        char operation() {
            return MULTIPLICATION.oper;
        }
    },
    DIVISION('/') {
        @Override
        char operation() {
            return DIVISION.oper;
        }
    };

    private final char oper;

    char operation() {
        return '+';
    };

    OperatorType(char oper) {
        this.oper = oper;
    }
}