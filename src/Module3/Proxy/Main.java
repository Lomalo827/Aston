package Module3.Proxy;

import java.util.HashMap;
import java.util.Optional;

public class Main {
    public static void main(String[] args){

        Optional<Entity> entity;

        Connector connector = new EntityConnector(new EntityStorage());
        connector.saveEntity(new Entity(1,"a","b"));

        entity = connector.getEntity(1);
        System.out.println(entity);

        // сохраняем и получаем объекты через Прокси
        Connector connector1 = new ProxyEntityConnector();
        connector1.saveEntity(new Entity(2,"a,","b"));

        connector1.saveEntity(new Entity(3,"a,","b"));
        System.out.println(connector1.getEntity(3));

    }
}
