package com.study.ladder.pku;

public class Solution {

    // 数字翻转
    private int reverseInteger(int number) {
        // 百位
        int a = number / 100;
        System.out.println("a = " + a);
        // 十位
        int b = (number - a * 100) / 10;
        System.out.println("b = " + b);
        // 个位
        int c = (number % 100) % 10;
        System.out.println("c = " + c);
        // 输出结果
        return a + b * 10 + c * 100;
    }

    // 小写转大写
    private char lowercaseToUppercase(char character) {
        return (char) (character - 32);
    }

    // 冒泡排序
    private void sortIntegers(int[] A) {
        for (int i = 1; i <= A.length; i++) {
            for (int j = 0; j < A.length - i; j++) {
                int temp;
                int first = A[j];
                int other = A[j + 1];
                if (first > other) {
                    temp = first;
                    A[j] = other;
                    A[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(" " + A[i]);
        }
    }

    // 求链表长度
    public int countNodes(ListNode head) {

        // write your code here
        if (head == null) {
            return 0;
        }

        int i = 1;
        while (head.next != null) {
            i++;
            head = head.next;
        }

        return i;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // solution.reverseInteger(123);
        // System.out.println(solution.lowercaseToUppercase('a'));
        int[] A = {2, 5, 1, 5, 1, 68, 7};
        solution.sortIntegers(A);
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
