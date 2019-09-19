package work.java_learn.$pattern.$30ServiceLocator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Service service = ServiceLocator.getService( "SERVICE1" );
        service.execute();
//        System.out.println(service.getName());
        Service service1 = ServiceLocator.getService( "SERVICE2" );
        service1.execute();
//        System.out.println(service1.getName());
    }
}

interface Service{
    String getName();
    void execute();
}

class Service1 implements Service{

    @Override
    public String getName() {
        return Service1.class.getName();
    }

    @Override
    public void execute() {
        System.out.println("Executing service 1");
    }
}

class Service2 implements Service{

    @Override
    public String getName() {
        return Service2.class.getName();
    }

    @Override
    public void execute() {
        System.out.println("Executing service 2");
    }
}

class InitialContext{
    public Object lookup(String jndiName){
        if(jndiName.equalsIgnoreCase( "SERVICE1" )){
            return new Service1();
        }else if(jndiName.equalsIgnoreCase( "SERVICE2" )){
            return new Service2();
        }return null;
    }
}

class Cache {
    private List<Service> services = new ArrayList<>(  );

    public Service getService (String serviceName){
        for(Service service: services){
            if(service.getName().equalsIgnoreCase( serviceName )){
                return service;
            }
        } return null;
    }

    public void addService (Service newService){
        boolean exists = false;
        for(Service service: services){
            if(service.getName().equalsIgnoreCase(newService.getName())){
                exists=true;
            }
        }if(!exists){
            services.add( newService );
        }
    }
}

class ServiceLocator{
    private static Cache cache = new Cache();

    public static Service getService(String jndiname){
        Service service = cache.getService( jndiname );
        if(service!=null){
            return service;
        }
        InitialContext initialContext = new InitialContext();
        Service service1 = (Service) initialContext.lookup( jndiname );
        cache.addService( service1 );
        return service1;
    }
}