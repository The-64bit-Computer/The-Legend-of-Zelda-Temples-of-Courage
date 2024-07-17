// The Legend of Zelda: Temples of Courage - Version 1.0
// Character.java

public class Character
{
    // 1.1 - Name Encapsulation
    private String name;
    public String get_name() {return name;}
    public void set_name(String name) {this.name = name;}


    // 2.1 - Position Encapsulation
    private int xpos;
    private int ypos;

    public int get_xpos() {return xpos;}
    public void set_xpos(int xpos) {this.xpos = xpos;}
    public int get_ypos() {return ypos;}
    public void set_ypos(int ypos) {this.ypos = ypos;}
}
