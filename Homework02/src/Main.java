import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<ItemFabric> generators = Arrays.asList(new GoldGenerator(), new SilverGenerator(), new CopperGenerator());
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            IGameItem item = generators.get(rnd.nextInt(generators.size())).createItem();
            item.open();
        }
    }
    
}