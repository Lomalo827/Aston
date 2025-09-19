package Module3.Builder;

public class Entity {

    private String component1;
    private String component2;
    private String component3;
    private String component4;
    private String component5;
    private String component6;


    public static class Builder {
        private Entity entity;

        Builder(){
            entity = new Entity();
        }

        public Builder component1 (String component1){
            entity.component1=component1;
            return this;
        }
        public Builder component2 (String component2){
            entity.component2=component2;
            return this;
        }
        public Builder component3 (String component3){
            entity.component3=component3;
            return this;
        }
        public Builder component4 (String component4){
            entity.component4=component4;
            return this;
        }
        public Builder component5 (String component5){
            entity.component5=component5;
            return this;
        }
        public Builder component6 (String component6){
            entity.component6=component6;
            return this;
        }

        public Entity build(){
            return entity;
        }

    }
    @Override
    public String toString() {
        return "Entity{" +
                "component1='" + component1 + '\'' +
                ", component2='" + component2 + '\'' +
                ", component3='" + component3 + '\'' +
                ", component4='" + component4 + '\'' +
                ", component5='" + component5 + '\'' +
                ", component6='" + component6 + '\'' +
                '}';
    }
}
