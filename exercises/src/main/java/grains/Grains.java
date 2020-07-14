package grains;

import java.math.BigInteger;

class Grains {
    BigInteger[] board = new BigInteger[64];

    BigInteger grainsOnSquare(final int square) {

        if(square<1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

        board[0] = new BigInteger("1");
        for (int i = 1; i < board.length; i++) {
            board[i] = (board[i - 1]).multiply(new BigInteger("2"));
        }
        return board[square-1];
    }

    BigInteger grainsOnBoard() {
        BigInteger result = new BigInteger("0");

        for (int i = 0; i < board.length; i++) {
            result = result.add(grainsOnSquare(i+1));
        }
    return result;

}
}