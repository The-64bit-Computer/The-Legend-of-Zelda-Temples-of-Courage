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















    // 4.1 - Did the player begin the Game? Encapsulation
    private boolean began_Game = false;
    public boolean get_began_Game() {return began_Game;}
    public void set_began_Game(boolean began_Game) {this.began_Game = began_Game;}


    // 5.1 - Completed Side Quests Encapsulation
    private int completed_sidequests = 0;
    public int get_completed_sidequests() {return completed_sidequests;}
    public void set_completed_sidequests(int completed_sidequests) {this.completed_sidequests = completed_sidequests;}


    // 6.1 - Completed Underground Dungeon? Encapsulation
    private boolean completed_underground_dungeon = false;
    public boolean get_completed_underground_dungeon() {return completed_underground_dungeon;}
    public void set_completed_underground_dungeon(boolean completed_underground_dungeon) {this.completed_underground_dungeon = completed_underground_dungeon;}


    // 7.1 - Completed Castle Dungeon? Encapsulation
    private boolean completed_castle_dungeon = false;
    public boolean get_completed_castle_dungeon() {return completed_castle_dungeon;}
    public void set_completed_castle_dungeon(boolean completed_castle_dungeon) {this.completed_castle_dungeon = completed_castle_dungeon;}


    // 8.1 - Completed Temple of Time? Encapsulation
    private boolean completed_temple_of_time = false;
    public boolean get_completed_temple_of_time() {return completed_temple_of_time;}
    public void set_completed_temple_of_time(boolean completed_temple_of_time) {this.completed_temple_of_time = completed_temple_of_time;}


    // 9.1 - Completed Forest Temple? Encapsulation
    private boolean completed_forest_temple = false;
    public boolean get_completed_forest_temple() {return completed_forest_temple;}
    public void set_completed_forest_temple(boolean completed_forest_temple) {this.completed_forest_temple = completed_forest_temple;}


    // 10.1 - Completed Water Temple? Encapsulation
    private boolean completed_water_temple = false;
    public boolean get_completed_water_temple() {return completed_water_temple;}
    public void set_completed_water_temple(boolean completed_water_temple) {this.completed_water_temple = completed_water_temple;}


    // 11.1 - Completed Fire Temple? Encapsulation
    private boolean completed_fire_temple = false;
    public boolean get_completed_fire_temple() {return completed_fire_temple;}
    public void set_completed_fire_temple(boolean completed_fire_temple) {this.completed_fire_temple = completed_fire_temple;}


    // 12.1 - Completed Gerudo Temple? Encapsulation
    private boolean completed_gerudo_temple = false;
    public boolean get_completed_gerudo_temple() {return completed_gerudo_temple;}
    public void set_completed_gerudo_temple(boolean completed_gerudo_temple) {this.completed_gerudo_temple = completed_gerudo_temple;}


    // 13.1 - Defeated Ganon? Encapsulation
    private boolean defeated_ganon = false;
    public boolean get_defeated_ganon() {return defeated_ganon;}
    public void set_defeated_ganon(boolean defeated_ganon) {this.defeated_ganon = defeated_ganon;}


    // 14.1 - Defeated Majora? Encapsulation
    private boolean defeated_majora = false;
    public boolean get_defeated_majora() {return defeated_majora;}
    public void set_defeated_majora(boolean defeated_majora) {this.defeated_majora = defeated_majora;}
}
