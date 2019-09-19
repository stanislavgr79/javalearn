package work.$pattern.COMPLITE.$17Momento;

public class Main2 {

    public static void main(String[] args) {

        Game game = new Game();
        game.setLevel(5);

        Slot slot1 = new Slot();
        slot1.setSave(game.saveToSave());

        game.setLevel(6);

//        game.getGamefromSaveEtcLoad(slot1.getSave());
        System.out.println(game);
    }
}

class Game{
    private int level;

    public void setLevel(int level) {
        this.level = level;
    }

    void getGamefromSaveEtcLoad(Save save){
        this.level = save.getLevel();
    }

    public Save saveToSave(){
        return new Save(this.level);
    }

    @Override
    public String toString() {
        return "Game{" +
                "level=" + level +
                '}';
    }
}

class Save{
    private final int level;

    public Save(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }


}

class Slot{
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}