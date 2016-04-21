package Materials;

public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(Material.wood);
        Coin coin = new Coin(Material.silver);
        Ring ring = new Ring(Material.gold);

        System.out.println(ball.material);
        System.out.println(coin.material);
        System.out.println(ring.material);
    }
}
