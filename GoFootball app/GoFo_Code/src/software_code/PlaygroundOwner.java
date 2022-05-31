package software_code;

import java.util.ArrayList;

/**
 * The playground owner class
 *@author Mohamed Ashraf Hassan
 * 
 * @version 1.2
 */
public class PlaygroundOwner {

    /**
     * The playground owner name
     */
    private String name;
    /**
     * The playground owner E-mail
     */
    private String email;
    /**
     * The playground owner password
     */
    private String password;
    /**
     * The playground owner ID
     */
    private int ownerID;
    /**
     * The playground owner phone number
     */
    private String phone;
    /**
     * The playground owner location
     */
    private String location;
    /**
     * The playground owner playgrounds list
     */
    private static ArrayList<Playground> playground_list;
    /**
     * The playground owner player's requests
     */
    static ArrayList<Player> player_requests;

    /**
     *  A parameterized constructor for the class
     * 
     * @param name the playground owner name
     * @param email the playground owner E-mail
     * @param password the playground owner password
     * @param phone the playground owner phone number
     * @param location the playground owner location
     */
    public PlaygroundOwner(String name, String email, String password, String phone, String location) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.location = location;
        this.playground_list = new ArrayList<>();
        PlaygroundOwner.player_requests = new ArrayList<>();
    }

   
/**
 * A getter function to get the playground owner requests
 * 
 * @return the playground owner requests 
 */
    public ArrayList<Player> getPlayer_requests() {
        return player_requests;
    }
/**
 * A setter function to set the playground owner requests
 * @param player_requests the playground owner requests
 */
    public void setPlayer_requests(ArrayList<Player> player_requests) {
        PlaygroundOwner.player_requests = player_requests;
    }
/**
 * A getter function to get the playground owner playgrounds list
 * @return the playgrounds list
 */
    public ArrayList<Playground> getPlayground_list() {
        return playground_list;
    }
/**
 * A setter function to set the playground owner playgrounds list
 * @param playground_list the playgrounds list
 */
    public void setPlayground_list(ArrayList<Playground> playground_list) {
        this.playground_list = playground_list;
    }
/**
 * A getter function to get the name of the playground owner
 * @return the playground owner
 */
    public String getName() {
        return name;
    }
/**
 * A setter function to set the playground owner name
 * @param name the playground owner name
 */
    public void setName(String name) {
        this.name = name;
    }
/**
 * A getter function to get the playground owner E-mail
 * @return the playground owner E-mail
 */
    public String getEmail() {
        return email;
    }
/**
 * A setter function to set the playground owner E-mail
 * @param email  the playground owner E-mail
 */
    public void setEmail(String email) {
        this.email = email;
    }
/**
 * A getter function to get the playground owner password
 * @return the playground owner password
 */
    public String getPassword() {
        return password;
    }
/**
 * A setter function to set the playground owner password 
 * @param password the playground owner password
 */
    public void setPassword(String password) {
        this.password = password;
    }
/**
 * A getter function to get the playground owner ID 
 * @return the playground owner ID
 */
    public int getOwnerID() {
        return this.ownerID;
    }
/**
 * A setter function to set the playground owner ID
 * @param ownerID the playground owner ID
 */
    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }
/**
 * A getter function to get the playground owner phone number
 * @return the playground owner phone number
 */
    public String getPhone() {
        return phone;
    }
/**
 * A setter function to set the playground phone number
 * @param phone the playground owner phone number
 */
    public void setPhone(String phone) {
        this.phone = phone;
    }
/**
 * A getter function to get the playground owner location
 * @return 
 */
    public String getLocation() {
        return location;
    }
/**
 * A setter function to set the playground owner location
 * @param location the playground owner location
 */
    public void setLocation(String location) {
        this.location = location;
    }
/**
 * Function to display the playground owner playgrounds
 */
    public void display_playground() {
        if (playground_list.isEmpty()) {
            System.out.println("There is no playgrounds in your list");
        } else {
            System.out.println("Your List:");
            int count = 0;
            for (Playground p : playground_list) {

                count++;
                System.out.println(count + ". " + p);
            }
        }
    }

    /**
     * Function to display the playground owner requests
     */
    public void myRequests() {
        if (playground_list.isEmpty()) {
            System.out.println("There is no playgrounds in your list");
        } else {
            for (Playground p : playground_list) {
                if (p.cheakRequested() == true) {
                    int count = 0;
                    count++;
                    System.out.println(count + ". " + p);
                } else {
                    System.out.println("you have no requests");
                }
            }
        }
    }
/**
 * Function to display the playground owner booked playgrounds
 */
    public void booked_playgrounds() {
        if (playground_list.isEmpty()) {
            System.out.println("There is no playgrounds in your list");
        } else {
            for (Playground p : playground_list) {
                if (p.cheakBooked() == true) {
                    int count = 0;
                    count++;
                    System.out.println(count + ". " + p);
                    break;
                } else {
                    System.out.println("you have no books");
                }
            }
        }
    }
    
/**
 * String function to display all the playground owner information.
 * @return the information of the playground owner which is name, ID, E-mail, password, phone number, location, and playgrounds list
 */
    @Override
    public String toString() {
        return "PlaygroundOwner{" + "name= " + name + ", ID= " + this.getOwnerID() + ", email= " + email + ", password= " + password + ", phone= " + phone + ", location= " + location + ", playground_list= " + this.getPlayground_list() + '}';
    }

}
