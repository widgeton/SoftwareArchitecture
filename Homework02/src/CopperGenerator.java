public class CopperGenerator extends ItemFabric {

    @Override
    public IGameItem createItem() {
        System.out.println("Created new chest");
        return new CopperReward();
    }
    
}
