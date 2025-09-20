package Module3.Proxy;

import java.util.Optional;

public class EntityConnector implements Connector{
    private final EntityStorage entityStorage;
    public EntityConnector(EntityStorage entityStorage) {
        this.entityStorage = entityStorage;
    }

    @Override
    public void saveEntity(Entity entity) {
        entityStorage.save(entity);
    }

    @Override
    public Optional<Entity> getEntity(int id) {
        return entityStorage.getEntityById(id);
    }
}
