package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner ss=new Scanner(in);
int n = ss.nextInt();

        int[] arr = {6, 25, 91,1010, 83,23, 72, 9, 18, 17,6};
        boolean found = false;

        for (int i = 0; i < 8; i++) {
            if (arr[i] == n) {
                found = true;
                break;
            }
        }

        System.out.println(found);

        }

            }



