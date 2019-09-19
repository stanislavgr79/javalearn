package work.$SE_Rabbit.lesson33;

import java.io.Serializable;

public class Cat implements Serializable{

  //  private static final long serialVersionUID = 1L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
