package software_code;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The main class, Shows the all initial options
 *
 * @author Marwan Mohamed Abd Almonem
 * @author Mohamed Ashraf Hassan
 * @author Youssef hesham mohamed
 * @version 1.3
 */
public class Software_Code {

    private static Scanner scanner = new Scanner(System.in);
    /**
     * Playground owner ID
     */
    private static int playground_ownerID = 0;
    /**
     * Player ID
     */
    private static int playerID = 0;
    /**
     * Playgrounds list
     */
    public static ArrayList<Playground> playground_list = new ArrayList<>();
    /**
     * Playground owner ID
     */
    public static int ownerID = 1;
    /**
     * The player team number
     */
    public static int teamNumber = 1;
    /**
     * The playground owner
     */
    public static PlaygroundOwner playground_owner;
    /**
     * Players list
     */
    public static ArrayList<Player> player_list = new ArrayList<>();
    /**
     * The player requests list
     */
    public static ArrayList<Player> player_requests = new ArrayList<>();
    /**
     * The playground requests
     */
    public static ArrayList<Playground> requests = new ArrayList<>();
    /**
     * The player
     */
    public static Player player;

    public static void main(String[] args) {

        ShowIntialOption();
    }

    /**
     * a menu function to display main window and select options whether to
     * enter as a playground owner or enter as a player or to quit.
     */
    public static void ShowIntialOption() {
        System.out.println("Please select one option: \n\t 1-Enter Playground owner menu \n\t 2-Enter player menu \n\t 3-Quit");
        /**
         * variable for choice for client number.
         */
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                playground_ownerID++;
                System.out.println("Enter your information with respect to: name , email, password, phone, location");
                System.out.print("Name: ");
                String name = scanner.next();
                System.out.print("Email: ");
                String email = scanner.next();
                System.out.print("Password: ");
                String password = scanner.next();
                System.out.print("Phone: ");
                String phone = scanner.next();
                System.out.print("Location: ");
                String location = scanner.next();
                playground_owner = new PlaygroundOwner(name, email, password, phone, location);
                playground_owner.setOwnerID(ownerID);
                playground_owner.setPlayground_list(playground_list);
                playground_owner.setPlayer_requests(player_requests);
                playground_owner.setOwnerID(playground_ownerID);

                AsPlaygroundOwner();
                break;
            case 2:
                playerID++;

                System.out.println("Enter your information with respect to: name , email, password, phone, location");
                System.out.print("Name: ");
                name = scanner.next();
                System.out.print("Email: ");
                email = scanner.next();
                System.out.print("Password: ");
                password = scanner.next();
                System.out.print("Phone: ");
                phone = scanner.next();
                System.out.print("Location: ");
                location = scanner.next();

                player = new Player(name, email, password, phone, location);
                player.setPlayerID(playerID);
                player.setRequests(requests);
                AsPlayer();
                break;

            default:
                break;
        }
    }

    /**
     * A function to display the playground owner options whether to add
     * playground, remove playground, modify playground, display playground,
     * display the requests, display books, or exit
     */
    private static void AsPlaygroundOwner() {

        System.out.println("Please select one option\n\t1. Add playground\n\t2. Remove playground\n\t3. Modify playground\n\t4. Display your playgrounds\n\t5. Display your Requests\n\t6. Display books\n\t7.exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter your information with respect to: name, location, size, price, cancellation_period and it would be set active by default");
                System.out.print("Name: ");
                String name;
                name = scanner.next();
                ArrayList<Playground> cheak_list = playground_owner.getPlayground_list();
                for (Playground p : cheak_list) {
                    if (p.getName() == null ? name == null : p.getName().equals(name)) {
                        System.out.println("This name is already taken, enter another name");
                        name = scanner.next();
                    }
                }
                System.out.print("Location: ");
                String location = scanner.next();
                System.out.print("Size: ");
                int size = scanner.nextInt();
                System.out.print("Price: ");
                double price = scanner.nextDouble();
                System.out.print("Cancellation period: ");
                String cancellation_period = scanner.next();
                Playground playground = new Playground(name, location, size, price, cancellation_period);
                playground_owner.getPlayground_list().add(playground);
                playground.setPlayerTeamNumber(teamNumber);
                teamNumber++;
                AsPlaygroundOwner();
                break;
            case 2:
                playground_owner.display_playground();
                System.out.println("Enter the sorting number of the playgound you want to remove");
                int target = scanner.nextInt();
                playground_owner.getPlayground_list().remove(target - 1);
                AsPlaygroundOwner();
                break;
            case 3:
                modifyPlayground();
                AsPlaygroundOwner();
                break;
            case 4:
                playground_owner.display_playground();
                System.out.println();
                AsPlaygroundOwner();
                break;
            case 5:
                playground_owner.myRequests();
                System.out.println();
                AsPlaygroundOwner();
                break;
            case 6:
                playground_owner.booked_playgrounds();
                System.out.println();
                AsPlaygroundOwner();
                break;
            default:
                ShowIntialOption();
                break;
        }

    }

    /**
     * A function to modify the playground price, cancellation period,or
     * available hours, it has to extra option whether to return to the
     * playground owner menu or exit
     */
    private static void modifyPlayground() {
        System.out.println("Please select one option: \n\t1. Modify price\n\t2. Modify cancellation period\n\t3. available hours\n\t4. back to Playground owner menu\n\t5. exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:

                if (playground_owner.getPlayground_list().isEmpty()) {
                    System.out.println("There in no playgrounds in your list");
                } else {
                    playground_owner.display_playground();
                    System.out.println("Enter the sorting number of the playground you want to Modify");
                    int target = scanner.nextInt();
                    System.out.println("Enter the amount you want");
                    double amount = scanner.nextDouble();
                    playground_owner.getPlayground_list().get(target - 1).setPrice(amount);
                    System.out.println("After Modifying the price: " + playground_owner.getPlayground_list().get(target - 1));
                }
//                
                AsPlaygroundOwner();
                break;
            case 2:
                if (playground_owner.getPlayground_list().isEmpty()) {
                    System.out.println("There in no playgrounds in your list");
                } else {
                    playground_owner.display_playground();
                    System.out.println("Enter the sorting number of the playground you want to modify");
                    int target = scanner.nextInt();
                    System.out.println("Enter the period you want");
                    String period = scanner.next();
                    playground_owner.getPlayground_list().get(target - 1).setCancellation_period(period);
                    System.out.println("After Modifying the Cancellation period: " + playground_owner.getPlayground_list().get(target - 1));
                }
                AsPlaygroundOwner();
                break;
            case 3:
                modifyAvaliableHours();
                break;
            case 4:
                AsPlaygroundOwner();
                break;
            case 5:
                ShowIntialOption();
                break;
            default:
                System.out.println("Option not available");
                break;
        }
    }

    /**
     * A function to modify the available hours by adding available hours,or
     * removing available hours, it has to extra option return to the playground
     * owner menu
     */
    private static void modifyAvaliableHours() {
        System.out.println("Please select one option: \n\t1. Add available hour\n\t2. remove available hour\n\t3. back to playground owner menu");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                if (playground_owner.getPlayground_list().isEmpty()) {
                    System.out.println("There in no playgrounds in your list");
                } else {
                    playground_owner.display_playground();
                    System.out.println("Enter the sorting number of the playgound you want to remove");
                    int playgorund = scanner.nextInt();
                    System.out.println("Enter the amount you want");
                    String avaliable_hours = scanner.next();
                    playground_owner.getPlayground_list().get(playgorund - 1).getAvailable_hours().add(avaliable_hours);
                    System.out.println("After Adding an available hour: " + playground_owner.getPlayground_list().get(playgorund - 1));
                }

                AsPlaygroundOwner();
                break;
            case 2:
                if (playground_owner.getPlayground_list().isEmpty()) {
                    System.out.println("There in no playgrounds in your list");
                } else {
                    playground_owner.display_playground();
                    System.out.println("Enter the sorting number of the playgound you want to remove");
                    int playgorund = scanner.nextInt();
                    System.out.println("Enter the amount you want");
                    int target = scanner.nextInt();
                    playground_owner.getPlayground_list().get(playgorund - 1).getAvailable_hours().remove(target - 1);
                    System.out.println("After Adding an available hour: " + playground_owner.getPlayground_list().get(playgorund - 1));
                }

                AsPlaygroundOwner();
                break;
            case 3:
                AsPlaygroundOwner();
                break;
            default:
                System.out.println("Option not available");
                break;

        }

    }

    /**
     * A function to display the player options whether to Book playground,
     * Display my requests, Join team, Leave team, Display my books, Back to
     * player menu, or exit
     */
    private static void AsPlayer() {

        System.out.println("Please select one option: \n\t1. Book playground\n\t2. Display my requests\n\t3. Join team\n\t4. Leave team\n\t5. Display my books\n\t6.Back to player menu\n\t7. exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                bookPlayground();
                AsPlayer();
                break;
            case 2:
                if (player.getRequests().isEmpty()) {
                    System.out.println("You have no requests");
                } else {
                    int count = 0;
                    for (Playground p : (player.getRequests())) {
                        count++;
                        System.out.println(count + ". " + p);
                    }
                }

                AsPlayer();
                break;
            case 3:
                if (playground_owner.getPlayground_list().isEmpty()) {
                    System.out.println("there is no teams to join");
                } else {
                    int playerID;
                    ArrayList<Playground> cheak_list = playground_owner.getPlayground_list();
                    System.out.println("Enter your ID");
                    playerID = scanner.nextInt();
                    for (Playground p : cheak_list) {
                        if (p.getPlayer_list().get(playerID - 1).getPlayerID() == playerID) {
                            int count = 0;
                            for (Player p2 : p.getPlayer_list()) {
                                count++;
                                System.out.println(count + ". " + p2.getTeamNumber() + " " + p2.getMy_team());
                                System.out.println("Enter the team number of the team you want to join");
                                int target = scanner.nextInt();
                                if (p2.getTeamNumber() == target) {
                                    p2.getMy_team().add(player);
                                    System.out.println("You joined the team");
                                }
                            }

                        }
                    }
                }
                AsPlayer();
                break;

            case 4:
                if (playground_owner.getPlayground_list().isEmpty()) {
                    System.out.println("there is no teams to join");
                } else {
                    int playerID;
                    ArrayList<Playground> cheak_list = playground_owner.getPlayground_list();
                    System.out.println("Enter your ID");
                    playerID = scanner.nextInt();
                    for (Playground p : cheak_list) {
                        if (p.getPlayer_list().get(playerID - 1).getPlayerID() == playerID) {
                            int count = 0;
                            for (Player p2 : p.getPlayer_list()) {
                                count++;
                                System.out.println(count + ". " + p2.getTeamNumber() + " " + p2.getMy_team());
                                System.out.println("Enter the team number of the team you want to join");
                                int target = scanner.nextInt();
                                if (p2.getTeamNumber() == target) {
                                    p2.getMy_team().remove(player);
                                    System.out.println("You left the team");

                                }
                            }

                        }
                    }
                }
                break;
            case 5:
                if (playground_owner.getPlayground_list().isEmpty()) {
                    System.out.println("there is no teams to join");
                } else {

                    int playerID;
                    ArrayList<Playground> cheak_list = playground_owner.getPlayground_list();
                    System.out.println("Enter your ID");
                    playerID = scanner.nextInt();
                    for (Playground p : cheak_list) {
                        if (p.getPlayer_list().get(playerID).getPlayerID() == playerID) {
                            int count = 0;
                            for (Player p2 : p.getPlayer_list()) {
                                count++;
                                System.out.println(count + ". " + p2.getRequests());

                            }

                        }
                    }
                }
                AsPlayer();
                break;
            case 6:
                AsPlayer();
                break;
            case 7:
                ShowIntialOption();
                break;
            default:
                System.out.println("This option is not available");
                break;
        }

    }

    /**
     * A function to book playground its options: display playground with same
     * location, Search by location, search by available hours, Search by name,
     * Search by price, Search by type, or Back to player menu
     */
    private static void bookPlayground() {

        System.out.println("Please select one option: \n\t1. Display playground with same location\n\t2. Search by location \n\t3. search by available hours\n\t4. Search by name\n\t5. Search by price\n\t6. Search by type\n\t7. Back to player menu");
        int choice = scanner.nextInt();
        switch (choice) {

            case 1:
                if (playground_owner.getPlayground_list().isEmpty()) {
                    System.out.println("There in no playgrounds in the list");

                } else {
                    int count = 1;
                    ArrayList<Playground> cheak_list = playground_owner.getPlayground_list();

                    System.out.println("Playgrounds with your location: ");
                    for (Playground p : cheak_list) {

                        if (p.getLocation().equals(player.getLocation())) {
                            System.out.println(count + ". " + p);
                            System.out.println();
                            count++;
                        }

                    }

                    System.out.println("Select the sorting number of the playground you want to book");
                    int target = scanner.nextInt();
                    Player dump = new Player("", "", "", "", "");
                    playground_owner.getPlayground_list().get(target - 1).getPlayer_list().add(dump);

                    for (Playground ground : cheak_list) {

                        for (Player g : ground.getPlayer_list()) {
                            if (g.getPlayerID() != player.getPlayerID()) {

                                playground_owner.getPlayground_list().get(target - 1).getPlayer_list().remove(dump);

                                if ((playground_owner.getPlayground_list().get(target - 1).getPlayer_list().size()) != (playground_owner.getPlayground_list().get(target - 1).getType())) {
                                    player.getRequests().add(playground_owner.getPlayground_list().get(target - 1));
                                    playground_owner.getPlayground_list().get(target - 1).getPlayer_list().add(player);

                                    playground_owner.getPlayground_list().get(target - 1).setRequested(true);
                                    player.setTeamNumber((playground_owner.getPlayground_list().get(target - 1).getPlayerTeamNumber()));
                                    playground_owner.getPlayer_requests().add(player);

                                    System.out.println("The playground after booking it: " + playground_owner.getPlayground_list().get(target - 1));
                                    break;
                                } else {
                                    playground_owner.getPlayground_list().get(target - 1).setBooked(true);
                                    System.out.println("This playground is full with players");
                                    break;
                                }

                            } else {
                                System.out.println("You have already booked this playground");
                                break;
                            }

                        }
                    }
                }

                AsPlayer();
                break;

            case 2:
                if (playground_owner.getPlayground_list().isEmpty()) {
                    System.out.println("There in no playgrounds in the list");

                } else {
                    int count = 1;
                    ArrayList<Playground> cheak_list = playground_owner.getPlayground_list();
                    String target_location = scanner.next();
                    for (Playground p : cheak_list) {

                        if (p.getLocation().equals(target_location)) {
                            System.out.println("Playgrounds with your location: ");
                            System.out.println(count + ". " + p);
                            System.out.println();
                            count++;
                        }

                    }

                    System.out.println("Select the sorting number of the playground you want to book");
                    int target = scanner.nextInt();
                    Player dump = new Player("", "", "", "", "");
                    playground_owner.getPlayground_list().get(target - 1).getPlayer_list().add(dump);

                    for (Playground ground : cheak_list) {

                        for (Player g : ground.getPlayer_list()) {
                            if (g.getPlayerID() != player.getPlayerID()) {

                                playground_owner.getPlayground_list().get(target - 1).getPlayer_list().remove(dump);

                                if ((playground_owner.getPlayground_list().get(target - 1).getPlayer_list().size()) != (playground_owner.getPlayground_list().get(target - 1).getType())) {
                                    player.getRequests().add(playground_owner.getPlayground_list().get(target - 1));
                                    playground_owner.getPlayground_list().get(target - 1).getPlayer_list().add(player);
                                    player.setTeamNumber((playground_owner.getPlayground_list().get(target - 1).getPlayerTeamNumber()));
                                    playground_owner.getPlayground_list().get(target - 1).setRequested(true);
                                    playground_owner.getPlayer_requests().add(player);

                                    System.out.println("The playground after booking it: " + playground_owner.getPlayground_list().get(target - 1));
                                    break;
                                } else {
                                    playground_owner.getPlayground_list().get(target - 1).setBooked(true);
                                    System.out.println("This playground is full with players");
                                    break;
                                }

                            } else {
                                System.out.println("You have already booked this playground");
                                break;
                            }

                        }
                    }
                }

                AsPlayer();

                break;

            case 3:
                if (playground_owner.getPlayground_list().isEmpty()) {
                    System.out.println("There in no playgrounds in the list");

                } else {
                    int count = 1;
                    ArrayList<Playground> cheak_list = playground_owner.getPlayground_list();
                    String target_availableHours = scanner.next();
                    for (Playground p : cheak_list) {
                        for (String a : p.getAvailable_hours()) {
                            if (a.equalsIgnoreCase(target_availableHours)) {
                                System.out.println("Playgrounds with your location: ");
                                System.out.println(count + ". " + p);
                                System.out.println();
                                count++;
                            }

                        }
                    }

                    System.out.println("Select the sorting number of the playground you want to book");
                    int target = scanner.nextInt();
                    Player dump = new Player("", "", "", "", "");
                    playground_owner.getPlayground_list().get(target - 1).getPlayer_list().add(dump);

                    for (Playground ground : cheak_list) {

                        for (Player g : ground.getPlayer_list()) {
                            if (g.getPlayerID() != player.getPlayerID()) {

                                playground_owner.getPlayground_list().get(target - 1).getPlayer_list().remove(dump);

                                if ((playground_owner.getPlayground_list().get(target - 1).getPlayer_list().size()) != (playground_owner.getPlayground_list().get(target - 1).getType())) {
                                    player.getRequests().add(playground_owner.getPlayground_list().get(target - 1));
                                    playground_owner.getPlayground_list().get(target - 1).getPlayer_list().add(player);
                                    player.setTeamNumber((playground_owner.getPlayground_list().get(target - 1).getPlayerTeamNumber()));
                                    playground_owner.getPlayground_list().get(target - 1).setRequested(true);
                                    playground_owner.getPlayer_requests().add(player);

                                    System.out.println("The playground after booking it: " + playground_owner.getPlayground_list().get(target - 1));
                                    break;
                                } else {
                                    playground_owner.getPlayground_list().get(target - 1).setBooked(true);
                                    System.out.println("This playground is full with players");
                                    break;
                                }

                            } else {
                                System.out.println("You have already booked this playground");
                                break;
                            }

                        }
                    }
                }

                AsPlayer();
                break;
            case 4:

                if (playground_owner.getPlayground_list().isEmpty()) {
                    System.out.println("There in no playgrounds in the list");

                } else {
                    int count = 1;
                    ArrayList<Playground> cheak_list = playground_owner.getPlayground_list();
                    String target_name = scanner.next();
                    for (Playground p : cheak_list) {
                        String name = p.getName();
                        if (target_name.equals(name)) {
                            System.out.println("Playgrounds with the name " + target_name + ": ");
                            System.out.println(count + ". " + p);
                            System.out.println();
                            count++;
                        }
                    }

                    System.out.println("Select the sorting number of the playground you want to book");
                    int target = scanner.nextInt();
                    Player dump = new Player("", "", "", "", "");
                    playground_owner.getPlayground_list().get(target - 1).getPlayer_list().add(dump);

                    for (Playground ground : cheak_list) {

                        for (Player g : ground.getPlayer_list()) {
                            if (g.getPlayerID() != player.getPlayerID()) {

                                playground_owner.getPlayground_list().get(target - 1).getPlayer_list().remove(dump);

                                if ((playground_owner.getPlayground_list().get(target - 1).getPlayer_list().size()) != (playground_owner.getPlayground_list().get(target - 1).getType())) {
                                    player.getRequests().add(playground_owner.getPlayground_list().get(target - 1));
                                    playground_owner.getPlayground_list().get(target - 1).getPlayer_list().add(player);
                                    player.setTeamNumber((playground_owner.getPlayground_list().get(target - 1).getPlayerTeamNumber()));
                                    playground_owner.getPlayground_list().get(target - 1).setRequested(true);
                                    playground_owner.getPlayer_requests().add(player);

                                    System.out.println("The playground after booking it: " + playground_owner.getPlayground_list().get(target - 1));
                                    break;
                                } else {
                                    playground_owner.getPlayground_list().get(target - 1).setBooked(true);
                                    System.out.println("This playground is full with players");
                                    break;
                                }

                            } else {
                                System.out.println("You have already booked this playground");
                                break;
                            }

                        }
                    }
                }

                AsPlayer();
                break;
            case 5:
                if (playground_owner.getPlayground_list().isEmpty()) {
                    System.out.println("There in no playgrounds in the list");

                } else {
                    int count = 1;
                    ArrayList<Playground> cheak_list = playground_owner.getPlayground_list();
                    double target_price = scanner.nextDouble();
                    for (Playground p : cheak_list) {
                        double price = p.getPrice();
                        if (target_price == price) {
                            System.out.println("Playgrounds with the price " + target_price + ": ");
                            System.out.println(count + ". " + p);
                            System.out.println();
                            count++;
                        }
                    }

                    System.out.println("Select the sorting number of the playground you want to book");
                    int target = scanner.nextInt();
                    Player dump = new Player("", "", "", "", "");
                    playground_owner.getPlayground_list().get(target - 1).getPlayer_list().add(dump);

                    for (Playground ground : cheak_list) {

                        for (Player g : ground.getPlayer_list()) {
                            if (g.getPlayerID() != player.getPlayerID()) {

                                playground_owner.getPlayground_list().get(target - 1).getPlayer_list().remove(dump);

                                if ((playground_owner.getPlayground_list().get(target - 1).getPlayer_list().size()) != (playground_owner.getPlayground_list().get(target - 1).getType())) {
                                    player.getRequests().add(playground_owner.getPlayground_list().get(target - 1));
                                    playground_owner.getPlayground_list().get(target - 1).getPlayer_list().add(player);
                                    player.setTeamNumber((playground_owner.getPlayground_list().get(target - 1).getPlayerTeamNumber()));
                                    playground_owner.getPlayground_list().get(target - 1).setRequested(true);
                                    playground_owner.getPlayer_requests().add(player);

                                    System.out.println("The playground after booking it: " + playground_owner.getPlayground_list().get(target - 1));
                                    break;
                                } else {
                                    playground_owner.getPlayground_list().get(target - 1).setBooked(true);
                                    System.out.println("This playground is full with players");
                                    break;
                                }

                            } else {
                                System.out.println("You have already booked this playground");
                                break;
                            }

                        }
                    }
                }
                AsPlayer();
                break;
            case 6:
                if (playground_owner.getPlayground_list().isEmpty()) {
                    System.out.println("There in no playgrounds in the list");

                } else {
                    int count = 1;
                    ArrayList<Playground> cheak_list = playground_owner.getPlayground_list();
                    int target_type = scanner.nextInt();
                    for (Playground p : cheak_list) {
                        double price = p.getPrice();
                        if (target_type == price) {
                            System.out.println("Playgrounds with the price " + target_type + ": ");
                            System.out.println(count + ". " + p);
                            System.out.println();
                            count++;
                        }
                    }

                    System.out.println("Select the sorting number of the playground you want to book");
                    int target = scanner.nextInt();
                    Player dump = new Player("", "", "", "", "");
                    playground_owner.getPlayground_list().get(target - 1).getPlayer_list().add(dump);

                    for (Playground ground : cheak_list) {

                        for (Player g : ground.getPlayer_list()) {
                            if (g.getPlayerID() != player.getPlayerID()) {

                                playground_owner.getPlayground_list().get(target - 1).getPlayer_list().remove(dump);

                                if ((playground_owner.getPlayground_list().get(target - 1).getPlayer_list().size()) != (playground_owner.getPlayground_list().get(target - 1).getType())) {
                                    player.getRequests().add(playground_owner.getPlayground_list().get(target - 1));
                                    player.setTeamNumber((playground_owner.getPlayground_list().get(target - 1).getPlayerTeamNumber()));
                                    playground_owner.getPlayground_list().get(target - 1).getPlayer_list().add(player);

                                    playground_owner.getPlayground_list().get(target - 1).setRequested(true);
                                    playground_owner.getPlayer_requests().add(player);

                                    System.out.println("The playground after booking it: " + playground_owner.getPlayground_list().get(target - 1));
                                    break;
                                } else {
                                    playground_owner.getPlayground_list().get(target - 1).setBooked(true);
                                    System.out.println("This playground is full with players");
                                    break;
                                }

                            } else {
                                System.out.println("You have already booked this playground");
                                break;
                            }

                        }
                    }
                }
                AsPlayer();
                break;
            case 7:
                ShowIntialOption();
                break;
            default:
                System.out.println("This option is not available");
                break;

        }

    }

}
