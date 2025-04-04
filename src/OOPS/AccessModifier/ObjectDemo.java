package OOPS.AccessModifier;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {

        ObjectDemo obj = new ObjectDemo(34,89.9f);
        System.out.println(obj.hashCode());

        ObjectDemo obj1 = new ObjectDemo(34,86.7f);
        System.out.println(obj1.hashCode());

        if(obj == obj1){
            System.out.println("obj is equals to obj1 by first");
        }

        if(obj.equals(obj1)){
            System.out.println("obj is equals to obj1 by second");
        }

        System.out.println(obj instanceof ObjectDemo);

        System.out.println(obj.getClass());


    }
}
