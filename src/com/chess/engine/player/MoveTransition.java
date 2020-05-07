package com.chess.engine.player;

import com.chess.engine.board.Board;
import com.chess.engine.board.Move;

/* The transition and all the necessary information from one board to another when you make a move. */
public class MoveTransition {
    private final Board transitionBoard;
    private final Move move;
    private final MoveStatus moveStatus;

    public MoveTransition(final Board transitionBoard, final Move move, final MoveStatus moveStatus) {
        this.transitionBoard = transitionBoard;
        this.move = move;
        this.moveStatus = moveStatus;
    }

    public MoveStatus getMoveStatus() {
        return this.moveStatus;
    }

    public Board getTransitionBoard() {
        return this.transitionBoard;
    }
}
