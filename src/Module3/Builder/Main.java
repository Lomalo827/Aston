package Module3.Builder;

public class Main {
    public static void main(String[] args){
        Entity entity = new Entity.Builder()
                .component1("Компонент 1")
                .component2("Компонент 2")
                .component3("Компонент 3")
                .component4("Компонент 4")
                .component5("Компонент 5")
                .component6("Компонент 6")
                .build();
        System.out.println(entity);
    }
}
