package CORE_JAVA.Varags;

public class VarArgsExample {

    public static void main(String[] args) {

        VarArgsExample v = new VarArgsExample();

        System.out.println(v.add(1,2,3,4,5));

    }

    public int add(int ...n){  // will receive an array of {1,2,3,4,5}

        int sum = 0;

        for(int i : n){
            sum = sum + i;
        }

        return sum;

    }

}
