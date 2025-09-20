package Module3.Proxy;

import java.util.Optional;

public class ProxyEntityConnector implements Connector{

    private EntityConnector entityConnector;

    @Override
    public void saveEntity(Entity entity) {
        init();
        entityConnector.saveEntity(entity);
    }

    @Override
    public Optional<Entity> getEntity(int id) {
        return entityConnector.getEntity(id);
    }

    private void init(){
        if (entityConnector==null){
            System.out.println("Создание объекта EntityStorage");
            entityConnector=new EntityConnector(new EntityStorage());
        } else {
            System.out.println("Объект EntityStorage уже создан, не создаем");
        }
    }

}
