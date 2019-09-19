//package work.$pattern.COMPLITE.$2builder;
//
//import java.util.EnumSet;
//import java.util.Objects;
//import java.util.Set;
//
//import static work.$pattern.COMPLITE.$2builder.NyPizza.Size.SMALL;
//
//public class Main4 {
//
//    public static void main(String[] args) {
//
//        Calzone calzone = (Calzone) new Calzone.Builder().addSoys(Pizza.Soys.HAM)
//                .sauceInside().build();
//
//        NyPizza pizza = (NyPizza) new NyPizza.Builder(SMALL)
//                .addSoys(Pizza.Soys.SAUSAGE)
//                .addSoys(Pizza.Soys.PEPPER)
//                .build();
//
//    }
//}
//
//abstract class Pizza{
//
//    public enum Soys {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}
//    final Set<Soys> soysSet;
//
//    abstract static class Builder<T extends Builder<T>>{
//        EnumSet<Soys> soysEnumSet = EnumSet.noneOf(Soys.class);
//
//        public T addSoys(Soys soysName){
//            soysEnumSet.add(Objects.requireNonNull(soysName));
//            return self();
//        }
//        abstract Pizza build();
//        protected abstract T self();
//    }
//
//    Pizza(Builder<?> builder){
//        soysSet = builder.soysEnumSet.clone();
//    }
//}
//
//class NyPizza extends Pizza{
//public enum Size {SMALL, MEDIUM, LARGE}
//private final Size size;
//
//public static class Builder extends Pizza.Builder<Builder> {
//    private final Size size;
//
//    public Builder(Size size){
//        this.size = Objects.requireNonNull(size);
//    }
//
//    @Override
//    Pizza build() {
//        return new NyPizza(this);
//    }
//
//    @Override
//    protected Builder self() {
//        return this;
//    }
//}
//
//    NyPizza(Builder builder) {
//        super(builder);
//        this.size = builder.size;
//    }
//}
//
//class Calzone extends Pizza{
//    private final boolean sauceInside;
//
//    public static class Builder extends Pizza.Builder<Builder>{
//        private boolean sauceInside = false;
//
//        public Builder sauceInside(){
//            sauceInside = true;
//            return this;
//        }
//
//        @Override
//        Pizza build() {
//            return new Calzone(this);
//        }
//
//        @Override
//        protected Builder self() {
//            return this;
//        }
//    }
//
//    Calzone(Builder builder) {
//        super(builder);
//        this.sauceInside = builder.sauceInside;
//    }
//}