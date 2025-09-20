package Module3.Proxy;

import java.util.Optional;

public interface Connector {

    void saveEntity(Entity entity);
    Optional<Entity> getEntity(int id);

}
