package work.$pattern.COMPLITE.$18Observable;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {

        JavaDeveloperJob javaDeveloperJob = new JavaDeveloperJob();
        Subscriber subscriber1 = new Subscriber("Ann");
        javaDeveloperJob.addObserverVacancy(subscriber1);
        Vacancy vacancy = new Vacancy("front-end");
        javaDeveloperJob.addVacancy(vacancy);
        javaDeveloperJob.addVacancy(new Vacancy("back-end"));
        javaDeveloperJob.removeVacancy(vacancy);

    }
}

interface ObserverVacancy{
    void handleEvent(List<String> vacancies);
}
class Subscriber implements ObserverVacancy{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println(name + " vacancy changed");
        vacancies.forEach(o-> System.out.println(o));
    }
}


interface SyshnistiDlyaNabludeniaObserved{
    void addObserverVacancy(ObserverVacancy observerVacancy);
    void removeObserverVacancy(ObserverVacancy observerVacancy);
    void notifyAllObservers();
}
class Vacancy{
    String nameVacancy;

    public Vacancy(String nameVacancy) {
        this.nameVacancy = nameVacancy;
    }
}

class JavaDeveloperJob implements SyshnistiDlyaNabludeniaObserved{

    List<ObserverVacancy> list = new ArrayList<>();
    List<String> vacancyList = new ArrayList<>();
    void addVacancy(Vacancy vacancy){
        vacancyList.add(vacancy.nameVacancy);
        notifyAllObservers();
    }
    void removeVacancy(Vacancy vacancy){
        vacancyList.remove(vacancy.nameVacancy);
        notifyAllObservers();
    }

    @Override
    public void addObserverVacancy(ObserverVacancy observerVacancy) {
        list.add(observerVacancy);
    }

    @Override
    public void removeObserverVacancy(ObserverVacancy observerVacancy) {
        list.remove(observerVacancy);
    }

    @Override
    public void notifyAllObservers() {
        list.forEach(o-> o.handleEvent(vacancyList));
    }
}