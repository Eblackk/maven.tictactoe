package com.github.curriculeon;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private final Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;

    }


    public Boolean isInFavorOfX() {
        Character topLeft = this.matrix[0][0];
        Character topMiddle = this.matrix[0][1];
        Character topRight = this.matrix[0][2];
        Character middleLeft = this.matrix[1][0];
        Character middleMiddle = this.matrix[1][1];
        Character middleRight = this.matrix[1][2];
        Character bottomLeft = this.matrix[2][0];
        Character bottomMiddle = this.matrix[2][1];
        Character bottomRight = this.matrix[2][2];

        // topLeft == middleLeft && middleLeft ==  bottomLeft && bottomLeft == x
        // line 25 checks to see if leftcolumn has the same value of x
        boolean winsWithLeftColumn = topLeft == middleLeft && middleLeft == bottomLeft && bottomLeft == 'X';
        boolean winsWithMiddleColumn = topMiddle == middleMiddle && middleMiddle == bottomMiddle && bottomMiddle == 'X';
        boolean winsWithRightColumn = topRight == middleRight && middleRight == bottomRight && bottomRight == 'X';
        boolean winsWithLeftDiagonal = topLeft == middleMiddle && middleMiddle == bottomRight && bottomRight == 'X';
        boolean winsWithRightDiagonal = topRight == middleMiddle && middleMiddle == bottomLeft && bottomLeft == 'X';
        boolean winsWithTopRow = topLeft == topMiddle && topMiddle == topRight && topRight == 'X';
        boolean winsWithMiddleRow = middleLeft == middleMiddle && middleMiddle == middleRight && middleRight == 'X';
        boolean winsWithBottomRow = bottomLeft == bottomMiddle && bottomMiddle == bottomRight && bottomRight == 'X';


        return winsWithLeftColumn || winsWithMiddleColumn || winsWithRightColumn || winsWithLeftDiagonal || winsWithRightDiagonal || winsWithTopRow || winsWithMiddleRow || winsWithBottomRow;
    }

    public Boolean isInFavorOfO() {
        Character topLeft = this.matrix[0][0];
        Character topMiddle = this.matrix[0][1];
        Character topRight = this.matrix[0][2];
        Character middleLeft = this.matrix[1][0];
        Character middleMiddle = this.matrix[1][1];
        Character middleRight = this.matrix[1][2];
        Character bottomLeft = this.matrix[2][0];
        Character bottomMiddle = this.matrix[2][1];
        Character bottomRight = this.matrix[2][2];

        boolean winsWithLeftColumn = topLeft == middleLeft && middleLeft == bottomLeft && bottomLeft == 'O';
        boolean winsWithMiddleColumn = topMiddle == middleMiddle && middleMiddle == bottomMiddle && bottomMiddle == 'O';
        boolean winsWithRightColumn = topRight == middleRight && middleRight == bottomRight && bottomRight == 'O';
        boolean winsWithLeftDiagonal = topLeft == middleMiddle && middleMiddle == bottomRight && bottomRight == 'O';
        boolean winsWithRightDiagonal = topRight == middleMiddle && middleMiddle == bottomLeft && bottomLeft == 'O';
        boolean winsWithTopRow = topLeft == topMiddle && topMiddle == topRight && topRight == 'O';
        boolean winsWithMiddleRow = middleLeft == middleMiddle && middleMiddle == middleRight && middleRight == 'O';
        boolean winsWithBottomRow = bottomLeft == bottomMiddle && bottomMiddle == bottomRight && bottomRight == 'O';

        return winsWithLeftColumn || winsWithMiddleColumn || winsWithRightColumn || winsWithLeftDiagonal || winsWithRightDiagonal || winsWithTopRow || winsWithMiddleRow || winsWithBottomRow;
    }

    public Boolean isTie() {
        return !isInFavorOfX() && !isInFavorOfO();


    }

    public String getWinner() {
        if (isInFavorOfX()) {
            return "X";
        }

        if (isInFavorOfO()) {
            return "O";
        }


        return null;
    }

}
