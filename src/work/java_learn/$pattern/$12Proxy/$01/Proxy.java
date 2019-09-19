package work.java_learn.$pattern.$12Proxy.$01;

////////////////////////////////
class Proxy implements ICarr{
ICarr iCarr = new Reno();

    @Override
    public void drive() {
        iCarr.drive();
        System.out.println(" my + method");
    }
}
