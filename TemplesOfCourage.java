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


        // 2.3 - What is your name?
        System.out.println("\"Hi! I'm NAVI! What is your name?\"");

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Player.set_name(input);


        // 2.4 - Create a Menu object + Let Menu receive Player + Call the Menu_Screen() method
        Menu CurrentMenu = new Menu(Player);
        CurrentMenu.Menu_Screen();
    }
}





class Menu
{
    // 1.1 - Receive Player + Make it a global object
    Hero Player;
    public Menu(Hero Player)
    {
        this.Player = Player;
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

            System.out.println("    1. PLAY");
            System.out.println("    2. PROGRESS");
            System.out.println("    3. INVENTORY");
            System.out.println("    4. TRAVEL");


            // 2.3 - Acquire the user input
            @SuppressWarnings("resource")
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();






            // 2.4 - Call the user-requested method
            if(input.equals("1"))
            {
                // [UNDER CONSTRUCTION]
            }

            else if(input.equals("2"))
            {
                Progress_Screen();
            }

            else if(input.equals("3"))
            {
                // [UNDER CONSTRUCTION]
            }

            else if(input.equals("4"))
            {
                // [UNDER CONSTRUCTION]
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

            System.out.println("Completed Side Quests: " + Player.get_completed_sidequests());






            // 3.3 - Display completed Dungeons [UNDER CONSTRUCTION]
        }
    }
}
