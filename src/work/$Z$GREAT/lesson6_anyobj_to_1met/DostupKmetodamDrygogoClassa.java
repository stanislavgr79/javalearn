package work.$Z$GREAT.lesson6_anyobj_to_1met;

public class DostupKmetodamDrygogoClassa {

    public static void main(String[] args) {
//
//        Button button = new Button();
//        ButtonPressKnopka buttonPressKnopka = new ButtonPressKnopka();
//        button.deistvia=buttonPressKnopka;
//        button.click();
//        button.click();

        Button button = new Button(new ButtonPressKnopka());
        button.click();
        button.click();
//
//        Button printButton = new Button(new ButtonPressKnopka(){
//            public void method1(){
//                System.out.println("Запущена печать на принтере...");
//            }
//        });
//
//        printButton.click();

    }
}

class ButtonPressKnopka implements IDeistvia{

    public void method1(){
        System.out.println("Кнопка нажата!");
    }
}

interface IDeistvia{

    void method1();
}

class Button{

    IDeistvia deistvia; //ссылка на интерфейс + конструктор и юзаем внутри методов - методы интерфейса
                        // и интерфейс пробросит в имплаймент класс, но этот класс нужно создать и привязать


    public Button(IDeistvia deistvia) {
        this.deistvia = deistvia;
    }

    public void click(){
        deistvia.method1();
    }
}
