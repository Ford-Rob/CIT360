/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twentyone.enums;

/**
 *

 */
public enum ErrorType {
    ERROR101 ("You can not change the dimensions "
              + "of the board once the game has been started. "
              + "\nStart a new game and then change the dimensions "
              + "of the board. "),
        
    ERROR104 ("That character has already been selected by the other player. "
              + "Try again."),
    
    ERROR105 ("Invalid command. Please enter a valid command."),
    
    ERROR106 ("You must start a new game first."),
    
    ERROR107 ("You must enter a name or enter a \"Q\" to quit. Try again."),
    
    ERROR108 ("The game parameter is null."),
    
    ERROR201 ("No empty locations found on the board"),
    
    ERROR203 ("This location is already occupied. Try a different "
              + "location."),
    
    ERROR204 ("Enter a non-blank character for the player's marker."),
    
    ERROR205 ("Both players can not use the same character for a marker."),
    
    ERROR206 ("There is no active game. You must start a new game before "
              + "you can take a turn"), 
    
    ERROR207 ("Enter a valid number of rows from 3 to 10"),
    
    ERROR208 ("Enter a valid number of columns from 3 to 10)"), 
    
    ERROR209 ("GameCommands - takeTurn: invalidPlayerTYpe");
    
    String message;
    
    ErrorType(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return this.message;
    }

    
    public static void displayErorrMsg(String errorMessage) {
        String fullMessage = "\t+ ERROR: " + errorMessage + " +";
        int dividerLineLength = fullMessage.length();
        StringBuilder dividerLine = new StringBuilder(dividerLineLength);
        for (int i = 0; i < dividerLineLength; i++) {
            dividerLine.insert(i, '+');
        }
        System.out.println("\t" + dividerLine.toString());
        System.out.println(fullMessage);
        System.out.println("\t" + dividerLine.toString());
    }
    
    
  
}
