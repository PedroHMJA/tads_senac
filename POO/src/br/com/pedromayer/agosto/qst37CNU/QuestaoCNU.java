/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.pedromayer.agosto.poo.qst37CNU;

import java.util.LinkedList;
// presente no arquivo
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author alves.7924
 */
public class QuestaoCNU {

    public static void main(String[] args) {
        int y = 1234;
        int x = inverte(y);
        System.out.println(x);
    }
    // presente no arquivo

    public static int inverte(int num) {
        Stack<Integer> pilha = new Stack<Integer>();

        do {
            int resto = num % 10;
            num /= 10;

            pilha.push(resto);
        } while (num > 0);

        for (int i = 1; !pilha.isEmpty(); i *= 10) {
            num += pilha.pop() * i;
        }
        return num;
    }
}
