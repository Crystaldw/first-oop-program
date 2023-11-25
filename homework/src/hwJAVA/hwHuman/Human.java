package hwJAVA.hwHuman;

import java.util.List;
import java.util.Objects;

/*
В отдельном проекте создайте класс Human

У этого класса должны быть поля:
String name; - имя
Human mother; - мать
Human father; - отец
int age; - возраст
Создайте список людей.
Теперь создайте два стрима
1) Находит ВСЕХ родителей ВСЕХ людей в списке
2) Находит имена матерей тех людей, которые старше, чем 25 лет
Напишите ответы на экран
 */
public class Human {

   private String name;
   private Human mother;
   private Human father;
   private int age;

    public Human(String name, Human mother, Human father, int age) {
        this.name = name;
        this.mother = mother;
        this.father = father;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Human> getParents(){
        return List.of(father, mother);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(mother, human.mother) && Objects.equals(father, human.father);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mother, father, age);
    }
}
