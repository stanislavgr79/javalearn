package work.$pattern.$26CompositeEntity;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        CompositeEntity compositeEntity = new CompositeEntity();
        Arrays.asList(compositeEntity.getData()).forEach( System.out::println );

    }
}

class CompositeEntity {
    CoreGainObject coreGainObject = new CoreGainObject();
    public String[] getData (){
       return coreGainObject.getData();
    }
}

class CoreGainObject{
    DependentObject1 dependentObject1 = new DependentObject1();
    DependentObject2 dependentObject2 = new DependentObject2();

    public String[] getData (){
        return new String[] {dependentObject1.getData(), dependentObject2.getData()};
    }
}

class DependentObject1{
    String getData(){
        return "one";
    }
}

class DependentObject2{
    String getData(){
        return "two";
    }
}
