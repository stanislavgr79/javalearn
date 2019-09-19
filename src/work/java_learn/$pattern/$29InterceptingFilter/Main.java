package work.java_learn.$pattern.$29InterceptingFilter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager();
        filterManager.setFilter( new AuthFilter() );
        filterManager.setFilter( new IPFilter() );

        filterManager.filterRequest( "hello" );
    }
}

interface Filter{
    String execute (String data);
}

class AuthFilter implements Filter{

    @Override
    public String execute(String data) {
        return data.toUpperCase();
    }
}
class IPFilter implements Filter{

    @Override
    public String execute(String data) {
        return "ip filter data " + data;
    }
}

class FilterChain{
    static List<Filter> filtersList = new ArrayList<>(  );
    Target target = new Target();

    void addFilter (Filter filter){
        filtersList.add( filter );
    }

    void filter(String data){
        String temp = new String(data);
        for(Filter filter: filtersList){
           temp = filter.execute( temp );
        }
        target.doJob( temp );
    }
}

class FilterManager{
    FilterChain filterChain = new FilterChain();

    void setFilter (Filter filter){
        filterChain.addFilter( filter );
    }
    void filterRequest(String request){
        filterChain.filter( request );
    }
}

class Target {
    void doJob (String data){
        System.out.println("data came in :" + data);
    }
}