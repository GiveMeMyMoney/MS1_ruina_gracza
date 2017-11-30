package com.company;

public class Main {

    public static void main(String[] args) {

        int A = 50; //pA = p
        int B = 50; //pB = q
        int Z = A + B;

        //do poki nie zbankrutuje A albo B
        //Pa
        for (double pA = 0.01; pA < 1.0; pA++) {
            //na kazde prawdopodobienstwo x100 //ile razy A zbankrutowało
            for (int i = 0; i < 100; i++) {
                //for do poki ktos nie zbankrutuje
                //generator liczb pseudolosowych (0, 1) patrzymy czy nalezy do przedzialu [0, pA]
                double random = Math.random();
                double pB = 1.0 - pA;



            }




        }

        //double pRuiny = (Math.pow(pB / pA, A) - Math.pow(pB / pA, Z)) / (1 - Math.pow(pB / pA, Z));





    }
}
