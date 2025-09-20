package Module3.Proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EntityStorage {

    private List<Entity> entityList;

    public EntityStorage() {
        entityList= new ArrayList<>();
    }
    public void save(Entity entity){
        entityList.add(entity);
    }

    public Optional<Entity> getEntityById(int id){
        return entityList.stream()
                .filter(entity -> entity.getId()==id)
                .findFirst();
    }
}
