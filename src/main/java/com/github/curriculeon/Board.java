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

        return null;
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
