package work.java_learn.$pattern.$25Busines;

public class Main {
    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
//        businessDelegate.lookupService.getService("jms").doJob();
        businessDelegate.doTask( "jms" );
    }
}
// два класса которые чтото делают - у них есть интерфейс
interface IBusinessService{
    void doJob();
}

class EJB_service implements IBusinessService{
    @Override
    public void doJob() {
        System.out.println("do EJB");
    }
}

class JMS_service implements IBusinessService{
    @Override
    public void doJob() {
        System.out.println("do JMS");
    }
}

// класс который гетает сервис(экземпляр класса new по ретурну) по условию String
class LookupService{
    IBusinessService getService(String serviceType){
        if(serviceType.equals("ejb")){
            return new EJB_service();
        }else {
            return new JMS_service();
        }
    }
}

//  класс : i i, new класс который гетает \ делаем метод сет
class BusinessDelegate {
    IBusinessService iBusinessService;
    LookupService lookupService = new LookupService();
    void doTask(String serviceType){
        iBusinessService = lookupService.getService( serviceType );
        iBusinessService.doJob();
    }
}
