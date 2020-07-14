package grains;

import java.math.BigInteger;

public class GrainsApp {
    public static void main(String[] args) {

        BigInteger Multiply = new BigInteger("2");
        BigInteger[] board = new BigInteger[64];

        board[0] = new BigInteger("1");
        BigInteger result = new BigInteger("1");

        for (int i = 1; i < board.length; i++) {
            result = result.add((board[i - 1].multiply(Multiply)));
            System.out.println(result);
//            }
//        System.out.println(result);
        }
    }
    }
