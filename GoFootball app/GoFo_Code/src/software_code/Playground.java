/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software_code;

import java.util.ArrayList;

/**
 * The playground class
 * @author Youssef hesham mohamed 
 * 
 * version 1.0
 */
public class Playground {
    /**
     * The playground name
    */
    private String name;
    /**
     *The playground location 
    */
    private String location;
    /**
     * The playground type 
    */
    private int type;
    /**
    * The playground price 
    */
    private double price;
    /**
    * The team number of the player who booked or requested the playground
    */
    private int playerTeamNumber;
    /**
    * The list of the available hours in the playground
    */
    private static ArrayList<String> available_hours;
    /**
    * The playground cancellation period 
    */
    private String cancellation_period;
    /**
    * A boolean attribute to check if the playground is requested or not  
    */
    private boolean requested;
    /**
    * A boolean attribute to check if the playground is booked or not  
    */
    private boolean booked;
    /**
    * A boolean attribute to check if the playground is active or not  
    */
    private boolean active;
    /**
    * An aggregation relation between the playground and the player
    * the list of the players who booked or requested this playground
    */
    static ArrayList<Player> player_list;
    

    /**
     * a parameterized constructor for the class.
     *
     * @param name the playground name
     * @param location the playground location
     * @param size the playground size(type)
     * @param price the playground price
     * @param cancellation_period the playground cancellation period
     */
    public Playground(String name, String location,int size,double price, String cancellation_period) {
        this.name = name;
        this.location = location;
        this.price=price;
        this.type=size;
        this.cancellation_period = cancellation_period;
        this.active = true;
        this.requested = false;
        this.booked=false;
        this.player_list= new ArrayList<>();
    }
   

/**
 * A getter function the get the players the booked or requested this playground
 * @return the list of the players who booked or requested this playground
 */
    public ArrayList<Player> getPlayer_list() {
        return player_list;
    }
/**
 * A setter function to set the list of the players who booked or requested this playground
 * @param player_list the list of the players who booked or requested this playground
 */
    public void setPlayer_list(ArrayList<Player> player_list) {
        this.player_list = player_list;
    }

  

    
    /**
     * A boolean function to check if the playground is booked or not
     * @return the state of the playground, if it's booked or not
     */
    public boolean cheakBooked() {
        return booked;
    }
    /**
     * A setter function to set the state of the playground
     * @param booked the state of the playground, if it's active or not
     */
    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    /**
     * getter function to get the type of the playground
     * @return the type of the playground
     */
    public int getType() {
        return type;
    }
/**
 * A setter function to set the playground type
 * @param Type the playground type(size)
 */
    public void setType(int Type) {
        this.type = Type;
    }
/**
 * A getter function to get the playground price
 * @return the playground price
 */
    public double getPrice() {
        return price;
    }
/**
 *A setter function to set the playground price
 * @param price the playground price
 */
    public void setPrice(double price) {
        this.price = price;
    }
    /**
     * A boolean function to check if the playground is requested or not
     * @return the state of the playground(requested or not)
     */
    public boolean cheakRequested() {
        return requested;
    }
/**
 * A setter function to set the state of the playground(requested or not)
 * @param requested the state of the playground (requested or not)
 */
    public void setRequested(boolean requested) {
        this.requested = requested;
    }

    /**
     * A getter function to get the playground name
     * @return the playground name
     */
    public String getName() {
        return name;
    }
/**
 * A setter function to set the playground name
 * @param name the playground name
 */
    public void setName(String name) {
        this.name = name;
    }
/**
 * A getter function to get the playground location
 * @return the playground location
 */
    public String getLocation() {
        return location;
    }
/**
 * A setter function to set the playground location
 * @param location the playground location
 */
    public void setLocation(String location) {
        this.location = location;
    }
/**
 * A getter function to get the available hours in the playground
 * @return the available hours in the playground
 */
    public ArrayList<String> getAvailable_hours() {
        return available_hours;
    }
/**
 * A setter function to set the available hours in the playground
 * @param available_hours the available hours in the playground
 */
    public void setAvailable_hours(ArrayList<String> available_hours) {
        this.available_hours = available_hours;
    }
/**
 * A getter function to get the playground cancellation period
 * @return the playground cancellation period
 */
    public String getCancellation_period() {
        return cancellation_period;
    }
/**
 * A setter function to set the playground cancellation period
 * @param cancellation_period the playground cancellation period
 */
    public void setCancellation_period(String cancellation_period) {
        this.cancellation_period = cancellation_period;
    }

    /**
     * A boolean function to check the state of the playground(active or not)
     * @return the state of the playground(active or not)
     */
    public boolean cheakActivation() {
        if(this.active==true)
        {
            System.out.println("This playground is active");
            return true;
        }
        else{
            System.out.println("This playground is not active");
            return false;
        }
        
    }
/**
 * A setter function to set the state of the playground(active or not)
 * @param active the state of the playground(active or not)
 */
    public void setActive(boolean active) {
        this.active = active;
    }
/**
 * A getter function to get the team number of the players who booked or requested this playground 
 * @return the players who booked or requested this playground
 */
    public int getPlayerTeamNumber() {
        return playerTeamNumber;
    }
/**
 * A setter function to set the team number of the players who booked or requested this playground
 * @param playerTeamNumber the team number of the players who booked or requested this playground
 */
    public void setPlayerTeamNumber(int playerTeamNumber) {
        this.playerTeamNumber = playerTeamNumber;
    }
 /**
 * String function to print the playground information.
 *
 * @return player information which is name, location, type, price, cancellation period, requested or not, booked or not, active or not, and the players list
 */
    @Override
    public String toString() {
        return "Playground{" + "name=" + name + ", location=" + location + ", type= " + type + ", price=" + price + ", cancellation_period=" + cancellation_period + ", requested=" + requested + ", booked=" + booked + ", active=" + active + ", Player list "+this.getPlayer_list()+'}';
    }

    

    
    

    
    

    
    
    
    
    
}
