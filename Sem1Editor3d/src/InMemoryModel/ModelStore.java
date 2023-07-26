package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.Scene;

import java.util.List;

public class ModelStore implements IModelChanger{
    public List<PoligonModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<iModelChangeObserver> changeObservers;

    @Override
    public void NotifyChange(IModelChanger sender) {

    }
}
