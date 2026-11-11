package com.puralsight;

import java.math.BigDecimal;

public class moneymath {
    public static void
    main (String[] args){

        float floatAmount = 0.0f;
        double doubleAmount = 0.0;
        BigDecimal
                bigDecimalAmount = BigDecimal.ZERO;

        System.out.println("==== Loop  add $0.10 ten times====");

        for (int i = 1; i<= 10; i++){
            floatAmount += 0.10f;
                    doubleAmount += 0.10;
                            bigDecimalAmount.add(new BigDecimal("0.10"));


                    System.out.println("Iteratio" + i);

                    System.out.println("Float: " + floatAmount);

                    System.out.println("Double: " + doubleAmount);

                    System.out.println("BigDecimal: " + bigDecimalAmount);

                    System.out.println();
        }

        floatAmount = 0.0f;
        doubleAmount = 0.0;
        bigDecimalAmount = BigDecimal.ZERO;

        System.out.println("==== Loop Add 19.99 one thousand times ====");

        for (int i = 1; i <= 1000; i++) {
            floatAmount += 19.99f;
                    doubleAmount += 19.99;
            bigDecimalAmount = bigDecimalAmount.add(new BigDecimal("19.99"));
        }
        // Print results after the loop

        System.out.println("Float: " + floatAmount);

        System.out.println("Double: " + doubleAmount);

        System.out.println("BigDecimal: " + bigDecimalAmount);

        System.out.println("float == double: " + (floatAmount == (float) doubleAmount));


        System.out.println("double == BigDecimal: " (BigDecimal.valueOf(doubleAmount).compareTo(bigDecimalAmount) == 0));

    }
}
