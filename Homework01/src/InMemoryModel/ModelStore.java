package InMemoryModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ModelElements.Angle3D;
import ModelElements.Camera;
import ModelElements.Color;
import ModelElements.Flash;
import ModelElements.Point3D;
import ModelElements.PoligonalModel;
import ModelElements.Scene;
import ModelElements.Texture;

public class ModelStore implements IModelChanger {
    List<PoligonalModel> Models;
    List<Flash> Flashes;
    List<Camera> Cameras;
    List<Scene> Scenes;
    private List<IModelChangedObserver> changedObservers;
    private int n;

    public ModelStore(List<IModelChangedObserver> changedObservers) {
        if(changedObservers.size() > n) {
            throw new IllegalArgumentException("Quantity of changedObservers should be less " + n);
        }
        this.changedObservers = changedObservers;

        this.Models = Arrays.asList(new PoligonalModel(new ArrayList<Texture>()));
        this.Flashes = Arrays.asList(new Flash(new Point3D(), new Angle3D(), new Color(), 0));
        this.Cameras = Arrays.asList(new Camera(new Point3D(), new Angle3D()));

        this.Scenes = new ArrayList<>();
        List<PoligonalModel> models = Arrays.asList(new PoligonalModel(new ArrayList<Texture>()));
        List<Camera> cameras = Arrays.asList(new Camera(new Point3D(), new Angle3D()));

        this.Scenes.add(new Scene(0, models, new ArrayList<Flash>(), cameras));
    }

    public Scene GetScene(int sceneId) {
        return this.Scenes.get(sceneId);
    }

    public void NotifyChanger(IModelChanger sender) {

    }
}
