package test;

import java.io.*;

class CloneTest implements Cloneable, Serializable {

    private int id;
    private String name;

    public CloneTest() {
    }

    public CloneTest(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "CloneTest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloneTest)) {
            return false;
        } else {
            if (this.id == ((CloneTest) obj).id && this.name.equals(((CloneTest) obj).name)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, CloneNotSupportedException, IOException {
        CloneTest cloneTest = (CloneTest) Class.forName("test.CloneTest").newInstance();
        System.out.println(cloneTest);

        CloneTest cloneTest1 = new CloneTest(1001, "li");
        System.out.println(cloneTest1);

        CloneTest cloneTest2 = (CloneTest) cloneTest1.clone();
        System.out.println(cloneTest2);


        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("D:\\swordOffer\\src\\test\\cloneTest1.txt")));
        oo.writeObject(cloneTest1);
        System.out.println("cloneTest1对象序列化成功！");
        oo.close();

        ObjectInputStream in = new ObjectInputStream (new FileInputStream("D:\\swordOffer\\src\\test\\cloneTest1.txt"));
        CloneTest cloneTest3= (CloneTest)in.readObject();
        System.out.println(cloneTest3);

        System.out.println(cloneTest1 == cloneTest2);
        System.out.println(cloneTest1.equals(cloneTest2));
        System.out.println(cloneTest1.equals(cloneTest3));
    }


}