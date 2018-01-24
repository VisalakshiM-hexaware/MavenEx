package com.visa;

import com.visa.Division;
import org.junit.Test;
//import java.util.Scanner;

public class DivisionTest {
    @Test
    public void testDiv() {
        int a =6;
        int b =2;
        //Scanner sc = new Scanner(System.in);
        Division d = new Division();
        /*System.out.println("Enter value for a");
        int a = sc.nextInt();*/
        d.setA(a);
        /*System.out.println("Enter value for b");
        int b = sc.nextInt();*/
        d.setB(b);
        System.out.println("Value after division");
        int res = d.div(d.getA(), d.getB());
        System.out.println(res);
    }
}