package map;

public class My_Map_Client {
    public static void main(String[] args) {
        My_Map_Implementation mp = new My_Map_Implementation(5);
        mp.put("A", 10);
        mp.put("X", 7);
        mp.put("B", 20);
        mp.put("X", 90);
        System.out.println(mp.get("X"));
        System.out.println(mp.remove("X"));
    }
}
