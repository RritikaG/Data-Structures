package com.company.stack;

import java.util.Scanner;
import java.util.Stack;

public class postfix_eval {
    public static int evaluate(String s)
    {
        Stack<Integer> st=new Stack<>();
        int result=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isDigit(c))
            {
                st.push(c-'0');
            }
            else
            {
                int val1=st.pop();
                int val2=st.pop();
                switch (c) {
                    case '+':
                        st.push(val1 + val2);
                        break;
                    case '-':
                        st.push(val1 - val2);
                        break;
                    case '*':
                        st.push(val1 * val2);
                        break;
                    case '/':
                        st.push(val1 / val2);
                        break;
                    case '^':
                        st.push(val1 ^ val2);
                        break;
                }
            }
        }
        result=st.pop();
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int result=evaluate(s);
        System.out.println(result);
    }
}
