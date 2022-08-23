package com.github.curriculeon;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private final Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;

    }

    public Boolean isInFavorOf(Character player) {
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
        boolean winsWithLeftColumn = topLeft == middleLeft && middleLeft == bottomLeft && bottomLeft == player;
        boolean winsWithMiddleColumn = topMiddle == middleMiddle && middleMiddle == bottomMiddle && bottomMiddle == player;
        boolean winsWithRightColumn = topRight == middleRight && middleRight == bottomRight && bottomRight == player;
        boolean winsWithLeftDiagonal = topLeft == middleMiddle && middleMiddle == bottomRight && bottomRight == player;
        boolean winsWithRightDiagonal = topRight == middleMiddle && middleMiddle == bottomLeft && bottomLeft == player;
        boolean winsWithTopRow = topLeft == topMiddle && topMiddle == topRight && topRight == player;
        boolean winsWithMiddleRow = middleLeft == middleMiddle && middleMiddle == middleRight && middleRight == player;
        boolean winsWithBottomRow = bottomLeft == bottomMiddle && bottomMiddle == bottomRight && bottomRight == player;


        return winsWithLeftColumn || winsWithMiddleColumn || winsWithRightColumn || winsWithLeftDiagonal || winsWithRightDiagonal || winsWithTopRow || winsWithMiddleRow || winsWithBottomRow;
    }
    public Boolean isInFavorOfX() {
         return isInFavorOf('X');
    }

    public Boolean isInFavorOfO() {
        return isInFavorOf('O');
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


        return "";
    }

}
