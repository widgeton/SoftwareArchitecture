package ModelElements;

import java.util.List;

public class Scene {
    int Id;
    List<PoligonalModel> Models;
    List<Flash> Flashes;
    List<Camera> Cameras;

    public Scene(int Id, List<PoligonalModel> Models, List<Flash> Flashes, List<Camera> Cameras) {
        this.Id = Id;
        this.Flashes = Flashes;
        if (Models.isEmpty()) {
            throw new IllegalArgumentException("The Arrey of PoligonalModels should have at least one element");
        }
        this.Models = Models;
        if (Cameras.isEmpty()) {
            throw new IllegalArgumentException("The Arrey of Cameras should have at least one element");
        }
        this.Cameras = Cameras;
    }

    public Type method1(Type type) {
        return new Type();
    }

    public Type method2(Type type1, Type type2) {
        return new Type();
    }
}
