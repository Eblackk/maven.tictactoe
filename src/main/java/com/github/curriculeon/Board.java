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
        boolean winsWithLeftColumn = topLeft == middleLeft && middleLeft == bottomLeft && bottomLeft == 'x';
        boolean winsWithMiddleColumn = topMiddle == middleMiddle && middleMiddle == bottomMiddle && bottomMiddle == 'x';
        boolean winsWithRightColumn = topRight == middleRight && middleRight == bottomRight && bottomRight == 'x';
        boolean winsWithLeftDiagonal = topLeft == middleMiddle && middleMiddle == bottomRight && bottomRight == 'x';
        boolean winsWithRightDiagonal = topRight == middleMiddle && middleMiddle == bottomLeft && bottomLeft == 'x';
        boolean winsWithTopRow = topLeft == topMiddle && topMiddle == topRight && topRight == 'x';
        boolean winsWithMiddleRow = middleLeft == middleMiddle && middleMiddle == middleRight && middleRight == 'x';
        boolean winsWithBottomRow = bottomLeft == bottomMiddle && bottomMiddle == bottomRight && bottomRight == 'x';


        return winsWithLeftColumn || winsWithMiddleColumn || winsWithRightColumn || winsWithLeftDiagonal || winsWithRightDiagonal || winsWithTopRow || winsWithMiddleRow || winsWithBottomRow;
    }

    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        return null;
    }

}
