package character;

public class Character {
    // Name
    // race
    // Type
    // Symbol
    // Health
    // Speed
    String name;
    String race;
    String type;
    String symbol;
    int health;
    int speed;

    public Character(String name, String race, String type, String symbol, int health, int speed) {
        this.name = name;
        this.race = race;
        this.type = type;
        this.symbol = symbol;
        this.health = health;
        this.speed = speed;
    }

    /********** GETTERS **********/
    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public String getType() {
        return type;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }
}
