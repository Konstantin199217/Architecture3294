package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private iModelChangeObserver[] changeObservers;

    public ModelStore(iModelChangeObserver[] changeObservers) {
        this.changeObservers = changeObservers;
        this.models = new ArrayList<PoligonalModel>();
        this.scenes = new ArrayList<Scene>();
        this.cameras = new ArrayList<Camera>();
        this.flashes = new ArrayList<Flash>();
    }

    @Override
    public void NotifyChange(IModelChanger sender) {
        //
    }

    public Scene getScene(int id){
        return scenes.get(id);
    }
}
