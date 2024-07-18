// The Legend of Zelda: Temples of Courage - Version 1.0
// Hero.java

public class Hero extends Character
{
    // 1.1 - Health Encapsulation
    private int health = 12;
    public int get_health() {return health;}
    public void set_health(int health) {this.health = health;}


    // 2.1 - Rupees Encapsulation
    private int rupees = 0;
    public int get_rupees() {return rupees;}
    public void set_rupees(int rupees) {this.rupees = rupees;}


    // 3.1 - Inventory Encapsulation [LATER]


    // 4.1 - Completed Side Quests Encapsulation
    private int completed_sidequests = 0;
    public int get_completed_sidequests() {return completed_sidequests;}
    public void set_completed_sidequests(int completed_sidequests) {this.completed_sidequests = completed_sidequests;}
}
