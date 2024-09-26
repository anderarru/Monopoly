package edu.ncsu.monopoly;
//updated augost 24 with a comment
//COMMENT 2
public abstract class Card {

    public static final int TYPE_CHANCE = 1;
    public static final int TYPE_CC = 2;

    public abstract String getLabel();
    public abstract void applyAction();
    public abstract int getCardType();
}
