package work.java_learn.$pattern.$4ObjectPool;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ObjectPool objectPool = new ObjectPool();

        PooledObject pl1 = new PooledObject();
        pl1.i=5;
        objectPool.setPoolObject( pl1 );
        System.out.println(ObjectPool.used.size());
        PooledObject pl2 = new PooledObject();
//        pl2.i=6;
        objectPool.setPoolObject( pl2 );
        System.out.println(ObjectPool.used.size());
        System.out.println(ObjectPool.unused.size());
        objectPool.releasePooledObjectToUnuse( pl1 );
        System.out.println(ObjectPool.used.size());
        System.out.println(ObjectPool.unused.size());

        PooledObject pooledObject3 = objectPool.getPooledObject(pl2);
//        System.out.println(pooledObject3.getI());
    }
}

class PooledObject {
    int i;

    PooledObject(){
    }
}

class ObjectPool{
    static List<PooledObject> unused = new LinkedList<>(  );
    static List<PooledObject> used = new LinkedList<>(  );

    public void setPoolObject(PooledObject pooledObject){
        if(used.isEmpty()){
            used.add( pooledObject );
        }else{
            unused.add( pooledObject );
        }
    }

    public void releasePooledObjectToUnuse(PooledObject pooledObject){
        used.remove( pooledObject );
        unused.add( pooledObject );
    }

    public void releasePooledObjectToUse(PooledObject pooledObject){
        unused.remove( pooledObject );
        used.add( pooledObject );
    }

    public PooledObject getPooledObject (PooledObject pl){
        if(unused.isEmpty()){
            System.out.println("pool is empty");
            return null;
        }else{
            unused.get(unused.indexOf( pl ));
            unused.remove( pl );
            return pl;
        }
    }

}