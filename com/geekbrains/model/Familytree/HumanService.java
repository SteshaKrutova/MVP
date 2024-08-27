package com.geekbrains.model.Familytree;

import com.geekbrains.model.human.Human;
import com.geekbrains.model.human.HumanBuilder;

public class HumanService {
    private FamilyTree<Human> family;
    private HumanBuilder builder;

    public HumanService() {
        family = new FamilyTree<>();
        builder = new HumanBuilder();
    }

    public void addHuman(String Humaname, int HumanAge){
        Human human = builder
                .setName(Humaname)
                .setAge(HumanAge)
                .build();
        family.addHuman(human);
    }

    public void sortByName(){family.sortByName();}

    public void sortByAge(){family.sortByAge();}

    public String getFamilyListInfo(){
        StringBuilder family = new StringBuilder();
        family.append("Список семьи\n");
        for(Human human:family){
            family.append(human);
            family.append("\n");
        }
        return family.toString();
    }
}
