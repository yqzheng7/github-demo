package com.atguigu.github.test;

public class GithubTest {
    public static void main(String[] args) {
        int i = 1;
        i = 2;
        i = 3; //update via hot-fix
        i = 4; //update via master
        i = 5; //update via hot-fix
        i = 6; //push to GitHub
        i = 7; //update via GitHub
        System.out.println("i = " + i);
    }
}
