package logic;

import java.util.Objects;

class People {
    String name;
    int age;


    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(obj instanceof People){
            People p = (People)obj;
            return p.age == this.age && Objects.equals(p.name, this.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }
}

class animal {
    People people;
    String animalName;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (obj instanceof animal) {
            animal o = (animal) obj;
            return Objects.equals(o.people, this.people) && Objects.equals(o.animalName, this.animalName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalName,people);
    }
}


public class test {

    public static void main(String[] args) {

        animal a = new animal();
        // a.people = new people();
        a.animalName = " xxx";
        animal b = new animal();
        //b.people = new people();
        b.animalName = " xxx";

        System.out.println(a.equals(b));





    }

}
