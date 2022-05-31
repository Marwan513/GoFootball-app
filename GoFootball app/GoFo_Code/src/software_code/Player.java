
package software_code;

import java.util.ArrayList;
/**
 * The player class
 *@author Marwan Mohamed Abd Almonem
 * 
 * @version 1.2
 */
public class Player {
     /**
     * The player's name
     */
    private String name;
    /**
     * The player's E-mail
     */
    private String email;
    /**
     * The player's password
     */
    private String password;
    /**
     * The player's ID
     */
    private int playerID ;
    /**
     * The player's phone number
     */
    private String phone;
    /**
     * The player's team number
     */
    private int teamNumber;
    /**
     * The player's location
     */
    private String location;
    /**
     * list of the player's requests
     */
     ArrayList<Playground> requests;
     /**
     * The player's team
     */
     ArrayList<Player> my_team;
    
    /**
     * A parameterized constructor for the class.
     * 
     * @param name the name of the player
     * @param email the E-mail of the player
     * @param password the password of the player
     * @param phone the phone number of the player
     * @param location the location of the player
     */
    public Player(String name, String email, String password, String phone, String location) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.location = location;
        this.requests= new ArrayList<>();
        this.my_team= new ArrayList<>();
    }
    

    
    
/**
* A getter function to get the name of the player
* 
* @return the name of the player
*/
    public String getName() {
        return name;
    }
/**
* A setter function to set the name of the player
* 
* @param name the name of the player
*/
    public void setName(String name) {
        this.name = name;
    }
/**
* A getter function to get the E-mail of the player
* 
* @return the name of the player
*/
    public String getEmail() {
        return email;
    }
/**
* A setter function to set the E-mail of the player
* 
* @param email the E-mail of the player
*/
    public void setEmail(String email) {
        this.email = email;
    }
    
/**
* A getter function to get the password of the player
* 
* @return the password of the player
*/
    public String getPassword() {
        return password;
    }
/**
* A setter function to set the password of the player
* 
* @param password the password of the player
*/
    public void setPassword(String password) {
        this.password = password;
    }
    
/**
* A getter function to get the ID of the player
* 
* @return the ID of the player
*/
    public int getPlayerID() {
        return playerID;
    }

/**
* A setter function to set the ID of the player
* 
* @param playerID the ID of the player
*/
    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }
/**
* A getter function to get the phone number of the player
* 
* @return the phone number of the player
*/
    public String getPhone() {
        return phone;
    }
/**
* A setter function to set the phone number of the player
* 
* @param phone the phone number of the player
*/
    public void setPhone(String phone) {
        this.phone = phone;
    }
/**
* A getter function to get the location of the player
* 
* @return the location of the player
*/
    public String getLocation() {
        return location;
    }
/**
* A setter function to set the location of the player
* 
* @param location the location of the player
*/
    public void setLocation(String location) {
        this.location = location;
    }
/**
* A getter function to get the list of the player's requests
* 
* @return the list of the player's requests
*/
    public ArrayList<Playground> getRequests() {
        return requests;
    }
/**
* A setter function to set the list of the player's requests
* 
* @param requests the list of the player's requests
*/
    public void setRequests(ArrayList<Playground> requests) {
        this.requests = requests;
    }

/**
* A getter function to get the team of the player
* 
* @return the team of the player
*/
    public  ArrayList<Player> getMy_team() {
        return my_team;
    }

    /**
* A setter function to set the team of the player
* 
* @param my_team the team of the player
*/
    public void setMy_team(ArrayList<Player> my_team) {
        this.my_team = my_team;
    }
/**
* A getter function to get the team number of the player
* 
* @return the team number of the player
*/
    public int getTeamNumber() {
        return teamNumber;
    }
/**
* A setter function to set the team number of the player
* 
* @param teamNumber the team number of the player
*/
    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    /**
     * String function to print the player's information.
     *
     * @return player information which is name, E-mail, password, ID, phone number, location, team number, and the player's team
     */

    @Override
    public String toString() {
        return "Player{" + "name= " + name + ", email= " + email + ", password= " + password + ", playerID= " + playerID + ", phone= " + phone + ", location= " + location +"My team number= "+teamNumber+", My team "+my_team+'}';
    }

   

    

    
    
    
    
    

      
   
    
}
