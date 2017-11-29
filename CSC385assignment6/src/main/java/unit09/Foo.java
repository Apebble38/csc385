/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit09;

/**
 *
 * @author Bastian Tenbergen (bastian.tenbergen@oswego.edu)
 */
public class Foo {

    public int bar(int a, int b, int c) {
        int result = 0;
        for (int i = 0; i < a; i++) {
            if (((a > 5) | (b > 5)) & (c < 10)) {
                result = a + b + c;
            }
            result = result * 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Foo().bar(6, 6, 9));
    }
}
