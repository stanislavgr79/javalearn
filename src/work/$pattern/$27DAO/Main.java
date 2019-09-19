package work.$pattern.$27DAO;

public class Main {

    public static void main(String[] args) {
        Data data = new FileSystem();
        System.out.println(data.getData());
    }
}

interface Data{
    String getData();
}

class Db implements Data{

    @Override
    public String getData() {
        return "data from table";
    }
}

class FileSystem implements Data{

    @Override
    public String getData() {
        return "data from table";
    }
}
