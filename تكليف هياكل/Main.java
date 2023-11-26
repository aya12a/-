import java.util.ArrayList;
import java.util.Scanner;

public class Main {
static String el[];
static Student ss[];

    public static void main(String[] args) {
        Student student;
        Student ss[]=new Student[10];
        Student A1=new Student("SARA",19);
        ss[0]=A1;

        System.out.println("Hello DS");
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
//String el[]={"gg","hh"};
        String el[]=new String[10];
         el[0]="sara";
        el[1]="dd";
        Scanner my=new Scanner(System.in);
        System.out.println("enter...");
        String name=my.next();
        el[3]=name;


        for (String a:el
             ) {
            System.out.println(a);

        }

    }
    public void display() {
        for (String a : el
        ) {
            System.out.println(a);

        }
    }
    public void input(){
        Scanner my=new Scanner(System.in);
        System.out.println("enter...");
        String name=my.next();
        el[0]=name;

    }
}