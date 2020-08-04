package logic;

public class test {
    String name;
    String sex;
    int m;


    @Override
    public int hashCode() {
        return name.hashCode() + sex.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(obj instanceof test){
            test a = (test)obj;
            if(a.sex == this.sex && a.name == this.name)
                return true;

        }

            return false;


    }
}
