package org.OOP_HW_1;


import java.util.LinkedHashSet;
import java.util.Set;


public class Person extends Human {
    Human wife_husband;
    LinkedHashSet<Human> brothers_sisters;
    LinkedHashSet<Human> children;
    LinkedHashSet<Human> parents;

    public Person(Integer id, String name, String sex, Human wife_husband,
                  LinkedHashSet<Human> brothers_sisters,
                  LinkedHashSet<Human> children, LinkedHashSet<Human> parents) {
        super(id, name, sex);
        this.wife_husband = wife_husband;
        this.brothers_sisters = brothers_sisters;
        this.children = children;
        this.parents = parents;
    }

    public Integer getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Human getWife_husband() {
        return wife_husband;
    }

    public LinkedHashSet<Human> getBrothers_sisters() {
        return brothers_sisters;
    }

    public LinkedHashSet<Human> getChildren() {
        return children;
    }

    public LinkedHashSet<Human> getParents() {
        return parents;
    }

    @Override
    public String toString() {
        String human = "\n" +
                "\nID:            \t" + id +
                "\nИмя:           \t" + name +
                "\nПол:           \t" + sex +
                "\nЖена/Муж:        \t" + wife_husband +
                "\nБратья/Сестры: \t" + brothers_sisters +
                "\nДети:          \t" + children +
                "\nРодители:      \t" + parents + "\n";
        return human;
    }
}
