package work.$pattern.COMPLITE.$14Command;


import java.util.ArrayList;
import java.util.List;

public class Proffessional {


    public static void main(String[] args) {

        CommandRealizations commandRealizations = new CommandRealizations();

        ListQueueOfClass listQueueOfClass = new ListQueueOfClass();
        listQueueOfClass.addClassToQueueList(new Open(commandRealizations));
        listQueueOfClass.addClassToQueueList(new Open(new CommandRealizations()));
        listQueueOfClass.addClassToQueueList(()->commandRealizations.save());
        listQueueOfClass.addClassToQueueList(commandRealizations::close);
        listQueueOfClass.runAllQueueJobs();

    }
}
class ListQueueOfClass {

    private final List<Iaction> listOfRunnerClass = new ArrayList<>();

    public void addClassToQueueList(Iaction iaction) {
        listOfRunnerClass.add(iaction);
    }

    public void runAllQueueJobs() {
        listOfRunnerClass.forEach(Iaction::run);
    }
}
class CommandRealizations implements Icommands {

    private final List<String> actions = new ArrayList<>();

    @Override
    public void save() {
        actions.add("save");
        System.out.println("save");
    }

    @Override
    public void open() {
        actions.add("open");
        System.out.println("open");
    }

    @Override
    public void close() {
        actions.add("close");
        System.out.println("close");
    }

}

interface Iaction {
    public void run();

}
interface Icommands {

    public void save();

    public void open();

    public void close();

}

class Open implements Iaction {

    private final Icommands icommands;

    public Open(Icommands icommands) {
        this.icommands = icommands;
    }

    @Override
    public void run() {
        icommands.open();
    }
}
class Save implements Iaction {

    private final Icommands icommands;

    public Save(Icommands icommands) {
        this.icommands = icommands;
    }

    @Override
    public void run() {
        icommands.save();
    }
}
class Close implements Iaction {

    private final Icommands icommands;

    public Close(Icommands icommands) {
        this.icommands = icommands;
    }

    @Override
    public void run() {
        icommands.close();
    }

}


