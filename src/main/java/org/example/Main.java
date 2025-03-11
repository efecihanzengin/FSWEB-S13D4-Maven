package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0, 0);
        System.out.println("distance()= " + point.distance());

        Player player1 = new Player("Arthur", 120, Weapon.SWORD);  // 120 → 100'e çekilecek
        Player player2 = new Player("Lancelot", -10, Weapon.AXE);  // -10 → 0'a çekilecek

        System.out.println(player1.healthRemaining()); // 100
        System.out.println(player2.healthRemaining()); // 0

        player1.loseHealth(30);
        System.out.println(player1.healthRemaining()); // 70

        player1.loseHealth(80); // Can 0 olacak, mesaj basacak
        System.out.println(player1.healthRemaining()); // 0

        player2.restoreHealth(50);
        System.out.println(player2.healthRemaining()); // 50

        player2.restoreHealth(100); // 150 olacak ama 100'e çekilecek
        System.out.println(player2.healthRemaining()); // 100
    }
}