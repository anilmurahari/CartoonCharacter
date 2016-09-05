package edu.niu.cs.z1759385.cartooncharacter;

public class Character {
    private String characterDescription;
    private int characterID;

    public Character( String newDescription, int newID ){

        characterDescription = newDescription;
        characterID = newID;

    }

    public int getCharacterID(){
        return characterID;
    }

    public void setCharacterID(int newID){
        characterID = newID;
    }

    public String getCharacterDescription(){
        return characterDescription;
    }

    public void setCharacterDescription(String newDescription){
        characterDescription = newDescription;
    }

}

