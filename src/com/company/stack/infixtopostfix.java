package com.company.stack;

import java.util.Scanner;
import java.util.Stack;

public class infixtopostfix {
    public static String infixtopost(String s)
    {
        char[] ch=s.toCharArray();
        String result="";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<ch.length;i++)
        {
            if(Character.isLetterOrDigit(ch[i]))
            {
                result=result+ch[i];
            }
            else if(ch[i]=='(')
            {
                st.push(ch[i]);
            }
            else if(ch[i]==')')
            {
                while(!st.isEmpty() && st.peek()!='(')
                {
                    result=result+st.pop();
                }
                if(!st.isEmpty() && st.peek()!='(')
                {
                    return "invalid";
                }
                else
                {
                    st.pop();
                }
            }
            else
            {
                while(!st.isEmpty() && precidence(ch[i])<=precidence(st.peek()))
                {
                    if(st.peek()=='(')
                    {
                        return "invalid";
                    }
                    result=result+st.pop();
                }
                st.push(ch[i]);
            }

        }
        while(!st.isEmpty())
        {
            result=result+st.pop();
        }
        return result;
    }
    static int precidence(char c)
    {
        switch(c)
        {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;

        }
        return -1;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String s=sc.next();
            System.out.println(infixtopost(s));
        }
    }
}