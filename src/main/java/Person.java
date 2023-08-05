
    //generics class
    public class Person<T> {
        private T type;


        public T getType() {
            return type;
        }


        public void setType(T type) {
            this.type = type;
        }


        @Override
        public String toString() {
            return "Person{" +
                    "type=" + type +
                    '}';
        }
    }