public abstract class GameChar {
    private int id;
    private String charName;
    private int damage;
    private int health;
    private int money;

    public GameChar(int id, String name, int damage, int health, int money) {
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.charName = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getcharName() {
        return charName;
    }

    public void setcharName(String name) {
        this.charName = charName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
