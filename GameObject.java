/*
Предположим, у нас есть иерархия классов для создания игры. У нас есть базовый класс GameObject, представляющий общие характеристики для всех объектов в игре:
*/
public class GameObject {
    private int x;
    private int y;

    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
        System.out.println("Объект перемещен в координаты (" + x + ", " + y + ")");
    }
}
/*
Теперь мы можем создать подклассы, представляющие конкретные объекты в игре, такие как игрок (Player) и враг (Enemy):
*/
public class Player extends GameObject {
    private int health;

    public Player(int x, int y, int health) {
        super(x, y);
        this.health = health;
    }

    public void attack() {
        System.out.println("Игрок атакует!");
    }
}

public class Enemy extends GameObject {
    private int damage;

    public Enemy(int x, int y, int damage) {
        super(x, y);
        this.damage = damage;
    }

    public void takeDamage(int damageTaken) {
        System.out.println("Враг получил урон: " + damageTaken);
    }
}
/*
Польза:
Мы используем наследование для расширения функциональности базового класса GameObject и создания специфичных объектов игры.
Код для перемещения объектов и их координат общий для всех объектов в игре и находится в базовом классе.
*/
