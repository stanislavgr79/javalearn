package work;

import java.util.LinkedList;
import java.util.List;

public class Repeat {
    Account account;

    public static void main(String[] args) {

//        List list = new LinkedList(  );
//
//        Account acc1 = new Account("Petrov");
//        Account acc2 = new Account("Ivanov");
//        Account acc3 = new Account("Sidorov");
//
//        acc1.list.forEach( list -> System.out.println(list) );
//        System.out.println(acc1.list.size());

//        list.add( acc1 );
        Account.list.add( new Account( "Petrov" ) );
        Account.list.add( new Account( "Ivanov" ) );
        Account.list.add( new Account( "Sidorov" ) );
//        System.out.println(Account.list.size());
//        Account.list.forEach( Account-> System.out.println(Account) );
        Account.list.stream().forEach( Account-> System.out.println(Account) );
        closeName( Account.list, "Ivanov" );
        Account.list.stream().forEach( Account-> System.out.println(Account) );
//        Account acc1 = Account.list.get( 1 );
        // Account.list.contains( );
//        System.out.println( acc1 );
//        Account.list.iterator( );
//        boolean a = containsName( Account.list, "Petrov" );
//        System.out.println();
//        Account acc3 = (Account) returnIndexSearchName( Account.list, "Ivanov" );
//        System.out.println(acc3);
    }

    public static void closeName(List<Account> list, String searchName) {
        if (!(list.stream().anyMatch( o -> o.getName().equals( searchName ) ))) {
            System.out.println( "false" );
        } else {
//            list.stream().filter( o-> o.getName().equals( searchName ) );
            list.remove( list.stream().filter( o-> o.getName().equals( searchName ) ) );
//            list.remove( o )
            for (int i = 0; i < list.size(); i++) {
                Account temp = list.get( i );
                if (temp.getName().equals( searchName )) {
                    list.remove( i );
                }
            }
        }
//        return real;
    }
}

interface Ioperations {

    void transaction();

    void closeAccount();

    void createAccount();
}

class Transaction<T extends Account>{

    private T from;     // с какого счета перевод
    private T to;       // на какой счет перевод
    private double sum;    // сумма перевода

    public Transaction(T from, T to, int sum){
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    public void perevodMoney(){

        if (from.getSchet() > sum)
        {
            from.setSchet(from.getSchet() - sum);
            to.setSchet(from.getSchet() + sum);
            System.out.printf("Account %s: %d \nAccount %s: %d \n",
                    from.getId(), from.getSchet(),to.getId(), to.getSchet());
        }
        else{
            System.out.printf("Operation is invalid");
        }
    }

}

class Account {
    private static int idCounter = 1;
    int id;
    private String name;
    private double schet;
    static List<Account> list = new LinkedList<>();

    {

    }

    public Account(String name) {
        this.id = idCounter++;
        this.name = name;
        this.schet = 0;
//         list.add( this );
    }

    public String toString() {
        return "id " + id + " name " + name + " schet " + schet;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSchet() {
        return schet;
    }

    public void setSchet(double schet) {
        this.schet = schet;
    }
}