public class Person_050292 {
    public static void main(String[] args) {
        demo_1_initialize_object();
        demo_2_interaction_equality();
        demo_3_more_interaction();
        }
        static void demo_3_more_interaction() {
        System.out.println("- person's saving change----");
        Person yd1 = new Person("yindee", 2000 );
        Person pd = new Person("Preeda", 1000);
        yd1.reward(pd, 400);
        System.out.println(yd1);
        System.out.println(pd);
        }
        static void demo_2_interaction_equality() {
        System.out.println("-object interaction----");
        Person yd1 = new Person("yindee", 2000 );
        Person pd = new Person("Preeda", 1000);
        System.out.println(yd1.isWealthier(pd));
        Person yd2 = new Person("yindee",2000);
        System.out.println("== tests on references' address " + (yd1 == yd2));
        System.out.println(".equals() " + yd1.equals(yd2));
        System.out.println(".equals() " + yd2.equals(yd1));
        System.out.println(".equals() " + yd1.equals(pd));
        }
        static void demo_1_initialize_object() {
        System.out.println("-new and toString()----");
        Person yd = new Person("yindee", 2000 );
        Person pd = new Person("Preeda", 1000);
        yd.introduce_self();
        pd.introduce_self();
        System.out.println( yd ); // invoke toString()
        System.out.println( pd );
        }
}
    class Person {
        String name;
        int saving;
        Person(String n, int amount) {
            name = n;
            saving = amount;
        }
        void introduce_self() {
            System.out.println("Hi, My name is " + name);
        }
        public String toString() {
            return "I am " + name + ". My savings amount is " + saving;
        }

        boolean isWealthier(Person p) {
            return (this.saving > p.saving);
        }
        public boolean equals(Object theOther) {
            if (this == theOther)
                return true;
            if (theOther == null)
                return false;
            if (getClass() != theOther.getClass())
                return false;
            Person other = (Person) theOther;
            if (saving != other.saving)
                return false;
            return true;
        }
        int reward(Person p, int amount) {
            p.saving += amount;
            this.saving -= amount;
            return this.saving;
        }
    }
    

