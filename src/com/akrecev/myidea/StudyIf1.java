package com.akrecev.myidea;

import java.util.Scanner;

public class StudyIf1 {

    public static void main(String[] args) {

        double a, b, c, d, result, result2, result3;
        String action;

        Scanner console = new Scanner(System.in);

        System.out.println("Перед Вами простой калькулятор. Следуйе инструкциям системы. Для выхода нажмите клавишу Q");
        System.out.println("Введите первое число:");
        if (console.hasNextInt()) {
            a = console.nextInt();
            System.out.println("Введите второе число:");
            if (console.hasNextInt()) {
                b = console.nextInt();
                System.out.println("Введите действие, которое неоходимо совершить с числами (+, -, *, /)");
                action = console.next();
                if (action.equals("+")) {
                    result = a + b;
                    System.out.println("Результат вычисления a + b = " + result);
                } else if (action.equals("-")) {
                    result = a - b;
                    System.out.println("Результат вычисления a - b = " + result);
                } else if (action.equals("*")) {
                    result = a * b;
                    System.out.println("Результат вычисления a * b = " + result);
                } else if (action.equals("/")) {
                    result = a / b;
                    System.out.println("Результат вычисления a / b = " + result);
                } else {
                    System.out.println("Внимательно следуйте инструкциям! Нужно ввести действие,"
                            + " которое неоходимо совершить с числами (+, -, *, /). Программа закрыта.");
                    console.close();
                    return;
                }

                System.out.println("Введите третье число для оперции с результатом первого вычисления");

                if (console.hasNextInt()) {
                    c = console.nextInt();
                    System.out.println("Введите действие, которое неоходимо совершить (+, -, *, /)");
                    action = console.next();
                    if (action.equals("+")) {
                        result2 = result + c;
                        System.out.println("Результат вычисления: " + result2);
                    } else if (action.equals("-")) {
                        result2 = result - c;
                        System.out.println("Результат вычисления: " + result2);
                    } else if (action.equals("*")) {
                        result2 = result * c;
                        System.out.println("Результат вычисления: " + result2);
                    } else if (action.equals("/")) {
                        result2 = result / c;
                        System.out.println("Результат вычисления: " + result2);
                    } else {
                        System.out.println("Внимательно следуйте инструкциям! Нужно ввести действие,"
                                + " которое неоходимо совершить с числами (+, -, *, /). Программа закрыта.");
                        console.close();
                        return;
                    }

                    System.out.println("Введите четвертое число для оперции с результатом второго вычисления");

                    if (console.hasNextInt()) {
                        d = console.nextInt();
                        System.out.println("Введите действие, которое неоходимо совершить (+, -, *, /)");
                        action = console.next();
                        if (action.equals("+")) {
                            result3 = result2 + d;
                            System.out.println("Результат вычисления: " + result3);
                        } else if (action.equals("-")) {
                            result3 = result2 - d;
                            System.out.println("Результат вычисления: " + result3);
                        } else if (action.equals("*")) {
                            result3 = result2 * d;
                            System.out.println("Результат вычисления: " + result3);
                        } else if (action.equals("/")) {
                            result3 = result2 / d;
                            System.out.println("Результат вычисления: " + result3);
                        } else {
                            System.out.println("Внимательно следуйте инструкциям! Нужно ввести действие,"
                                    + " которое неоходимо совершить с числами (+, -, *, /). Программа закрыта.");
                            console.close();
                            return;
                        }
                    }
                }
            }
        }

        action = console.next();
        if (action.equalsIgnoreCase("q")) {
            System.out.println("Программа закрыта");
        } else {
            System.out.println("Внимательно следуйте инструкциям! Необходимо ввести число. Программа закрыта.");
        }
        console.close();
    }
}

