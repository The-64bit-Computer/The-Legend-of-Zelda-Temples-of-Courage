// The Legend of Zelda: Temples of Courage - Version 1.0
// TemplesOfCourage.java

// Libraries






public class TemplesOfCourage
{
    public static void main(String[] args)
    {
        // 1.1 - Creating a MainGame object and bringing it to life
        MainGame CurrentGame = new MainGame();
        CurrentGame.Title_Screen();
    }
}





class MainGame
{
    // 1.1 - Making Player a global object
    Hero Player;

    public void Title_Screen()
    {
        // 2.1 - Creating a Hero object
        Hero Player = new Hero();


        // 2.2 - Clearing the console and displaying the title screen
        System.out.println("\033[H\033[2J");
        System.out.flush();

        System.out.println("=== THE LEGEND OF ZELDA: TEMPLES OF COURAGE ===");
        System.out.println("2024 The 64-bit Computer");


        // 2.3 - Navi asking the user for their username [UNDER CONSTRUCTION]
        System.out.println("\"Hi! I'm NAVI! What is your name?\"");
    }
}
