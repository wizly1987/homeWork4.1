package com.goit.gojavaonline;

import java.util.Scanner;

/**
 * Created by vasyambr on 14.03.2016.
 */
public class temperaturConverter {

        float konvertationToF;
        float konvertorToC;
        int C;
        int F;
        float a=1.8f;
        int b=32;
        public  void Scan (String... args) {
            konvertationToF =  C*a+b;
            konvertorToC = (F-b)/a;
            Scanner scn = new Scanner(System.in);
            System.out.println("vvedite gradus v Celsiyax,a programma skonvertiruet ego v Farengeyti");
            C = scn.nextInt();

            System.out.println( konvertationToF+ " - eto vawa temperatura v Farengeytax");
            System.out.println("vvedite gradus v Farengeytax i programma sdelaet obratnuyu operaciyu");
            F = scn.nextInt();

            System.out.println( konvertorToC+"  - a eto vawa tepmeratura v Celsiyax");


        }

        }