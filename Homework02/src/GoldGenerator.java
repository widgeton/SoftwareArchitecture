public class GoldGenerator extends ItemFabric {
    
    @Override
    public IGameItem createItem() {
        System.out.println("Created new chest");
        return new GoldReward();
    }
}
