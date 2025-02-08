/*
 */
package com.fu.mathutil;

public class MathUtil {

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid Argument. n must be betten 1 and 20");
        }
        //hàm dừng liền k cần return

        // 
        if (n == 0 || n == 1) {
            return 1;
        }
        
        
        
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
    //welcome 
    //test 2
    // test 5 test hiếu sinh 
    
}
