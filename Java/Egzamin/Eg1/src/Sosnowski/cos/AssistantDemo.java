package Sosnowski.cos;

import java.util.ArrayList;

public class AssistantDemo {
    public static void main(String[] args){
        ArrayList<Assistant> assistants = new ArrayList<>();
        assistants.add(new Assistant("Piotr", 975));
        assistants.add(new Assistant("Alicja", 976));
        assistants.add(new Assistant("Zdzisław", 977));
        assistants.add(new Assistant("Maciej", 978));
        assistants.add(new Assistant("Benia", 979));
        assistants.add(new Assistant("Rysiu", 980));

        Assistant a1 = assistants.get(0).clone();
        System.out.println(assistants.get(0).compareTo(a1));
        System.out.println(assistants.get(0).compareTo(assistants.get(1)));
        System.out.println(assistants.get(2).compareTo(assistants.get(1)));


        for (Assistant a : assistants){
            System.out.println("Imię : " + a.getName() + ", ID: " + a.getId());
        }

        System.out.println();

        assistants.sort(new NamesComparator());
        for (Assistant a : assistants){
            System.out.println("Imię : " + a.getName() + ", ID: " + a.getId());
        }

    }
}
