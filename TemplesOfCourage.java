// The Legend of Zelda: Temples of Courage - Version 1.0
// TemplesOfCourage.java

// Libraries
import java.util.Scanner;





public class TemplesOfCourage
{
    public static void main(String[] args)
    {
        // 1.1 - Create a MainGame object + Call the Title_Screen() method
        MainGame CurrentGame = new MainGame();
        CurrentGame.Title_Screen();
    }
}





class MainGame
{
    // 1.1 - Make Player a global object
    Hero Player;





    public void Title_Screen()
    {
        // 2.1 - Create a Hero object
        Hero Player = new Hero();


        // 2.2 - Clear the console + Display the title screen
        System.out.println("\033[H\033[2J");
        System.out.flush();

        System.out.println("=== THE LEGEND OF ZELDA: TEMPLES OF COURAGE ===");
        System.out.println("2024 The 64-bit Computer\n");


        // 2.3 - What is your name? + Create the StringScanner object
        System.out.println("\"Hi! I'm NAVI! What is your name?\"");

        Scanner StringScanner = new Scanner(System.in);
        String input = StringScanner.nextLine();
        Player.set_name(input);


        // 2.4 - Create a Menu object + Let Menu receive Player and StringScanner + Call the Menu_Screen() method
        Menu CurrentMenu = new Menu(Player, StringScanner);
        CurrentMenu.Menu_Screen();


        // 2.5 - Call Tournament_Quest() method
        Tournament_Quest();
    }





    public void Tournament_Quest()
    {
        // [UNDER CONSTRUCTION]
    }
}





class Menu
{
    // 1.1 - Receive Player and StringScanner + Make them global objects
    Hero Player;
    Scanner StringScanner;

    public Menu(Hero Player, Scanner StringScanner)
    {
        this.Player = Player;
        this.StringScanner = StringScanner;
    }
    




    public void Menu_Screen()
    {
        while(true)
        {
            // 2.1 - Clear console
            System.out.println("\033[H\033[2J");
            System.out.flush();


            // 2.2 - Display title screen + What would you like to do?
            System.out.println("=== MENU ===\n");
            System.out.println("\"What would you like to do?\"");


            // 2.3 - Display options and whether or not they should appear + Acquire the user input
            if(Player.get_began_Game() == true)
            {
                System.out.println("    1. CONTINUE");
            }
            else
            {
                System.out.println("    1. PLAY");
            }

            System.out.println("    2. PROGRESS");

            if(Player.get_began_Game() == true)
            {
                System.out.println("    3. INVENTORY");
            }
            if(Player.get_began_Game() == true)
            {
                System.out.println("    4. TRAVEL");
            }

            String input = StringScanner.nextLine();






            // 2.4 - Call the user-requested method
            if(input.equals("1") && Player.get_began_Game() == true)
            {
                // [UNDER CONSTRUCTION]
            }
            else if(input.equals("1") && Player.get_began_Game() == false)
            {
                break;
            }

            else if(input.equals("2"))
            {
                Progress_Screen();
            }

            else if(input.equals("3") && Player.get_began_Game() == true)
            {
                Inventory_Screen();
            }

            else if(input.equals("4") && Player.get_began_Game() == true)
            {
                Travel_Screen();
            }
        }
    }





    public void Progress_Screen()
    {
        while(true)
        {
            // 3.1 - Clear Console
            System.out.println("\033[H\033[2J");
            System.out.flush();


            // 3.2 - Display title screen + Display basic info
            System.out.println("=== PROGRESS ===\n");

            System.out.println("Name: " + Player.get_name());
            System.out.println("Health: " + Player.get_health());
            System.out.println("Rupees: " + Player.get_rupees());

            System.out.println("\nCompleted Side Quests: " + Player.get_completed_sidequests());






            // 3.3 - Display completed Dungeons
            if(Player.get_completed_underground_dungeon() == true)
            {
                System.out.println("\nUNDERGROUND DUNGEON");
            }

            if(Player.get_completed_castle_dungeon() == true)
            {
                System.out.println("CASTLE DUNGEON");
            }



            // 3.4 - Display completed Temples
            if(Player.get_completed_temple_of_time() == true)
            {
                System.out.println("TEMPLE OF TIME");
            }

            if(Player.get_completed_forest_temple() == true)
            {
                System.out.println("FOREST TEMPLE");
            }

            if(Player.get_completed_water_temple() == true)
            {
                System.out.println("WATER TEMPLE");
            }

            if(Player.get_completed_fire_temple() == true)
            {
                System.out.println("FIRE TEMPLE");
            }

            if(Player.get_completed_gerudo_temple() == true)
            {
                System.out.println("GERUDO TEMPLE");
            }



            // 3.5 - Display the defeated final and secret Bosses
            if(Player.get_defeated_ganon() == true)
            {
                System.out.println("\nGANON");
            }
            
            if(Player.get_defeated_majora() == true)
            {
                System.out.println("MAJORA'S MASK");
            }






            // 3.6 - Exit Progress Screen
            System.out.println("\n    1. BACK");
            String input = StringScanner.nextLine();

            if(input.equals("1"))
            {
                break;
            }
        }
    }





    public void Inventory_Screen()
    {
        while(true)
        {
            // 4.1 - Clear Console
            System.out.println("\033[H\033[2J");
            System.out.flush();


            // 4.2 - Display title screen
            System.out.println("=== INVENTORY ===");


            // [UNDER CONSTRUCTION]
        }
    }





    public void Travel_Screen()
    {
        while(true)
        {
            // 5.1 - Clear Console
            System.out.println("\033[H\033[2J");
            System.out.flush();


            // 5.2 - Display title screen + Where would you like to travel?
            System.out.println("=== TRAVEL ===");
            System.out.println("\"Where would you like to travel?\"");


            // [UNDER CONSTRUCTION]
        }
    }
}
