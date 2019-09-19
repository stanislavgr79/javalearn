package work.$pattern.COMPLITE.$14Command;

import java.util.ArrayList;
import java.util.List;

public class Junior {

    public static void main(String[] args) {
        Commander commander = new Commander();
        commander.addToListToExec(new Run1());
        commander.addToListToExec(new Run2());
        commander.execAllJobFromList();
    }
}

class Commander{
    List<Ijob> list = new ArrayList<>();
    void addToListToExec(Ijob ijob){
        list.add(ijob);
    }

    void execAllJobFromList(){
        list.forEach(Ijob::doJob);
    }
}

interface Ijob {
    void doJob();
}

class Run1 implements Ijob {
    @Override
    public void doJob() {
        System.out.println("job1");
    }
}

class Run2 implements Ijob {
    @Override
    public void doJob() {
        System.out.println("job2");
    }
}