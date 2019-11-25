package com.company.stack;

import java.util.Scanner;
import java.util.Stack;

public class balanced_bracket {
    public static boolean checkbrackets(String s)
    {
        Stack<Character> s1=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            switch (c){
                case '{':
                case '[':
                case '(':
                {
                    s1.push(c);
                    break;
                }
                case '}':
                case ']':
                case ')':
                {
                    if(!s1.isEmpty())
                    {
                        char ch=s1.pop();
                        if((ch!='{' && c=='}') || (ch!='[' && c==']')|| (ch!='(' && c==')'))
                        {
                        //    System.out.println("invalid");
                            return false;
                        }
                    }
                    break;
                }
            }
        }
        if(!s1.isEmpty())
        {
           // System.out.println("invalid");
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        boolean ans=checkbrackets(str);
        if(ans)
        {
            System.out.println("balanced brackets");
        }
        else
        {
            System.out.println("unbalanced brackets");
        }



    }
}
