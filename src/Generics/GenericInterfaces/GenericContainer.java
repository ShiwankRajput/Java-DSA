package Generics.GenericInterfaces;


public class GenericContainer<T> implements Container<T>{

    private T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }

}




/*

    public class GenericContainer implements Container<String>{

        private String item;

        @Override
        public void add(String item) {
            this.item = item;
        }

        @Override
        public String get() {
            return "Shiwank";
        }

    }

*/

