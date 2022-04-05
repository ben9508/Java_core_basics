/* No Argument Constructor */

// class MyClass {
//     int num;
//     MyClass() {
//         num = 100;
//     }
// }

// public class ConsDemo {
//     public static void main(String args[]) {
//         MyClass t1 = new MyClass();
//         MyClass t2 = new MyClass();
//         System.out.println(t1.num + " " + t2.num);
//     }
// }

/* No Argument Constructor */


/* Parameterized Constructor */

class MyClass {
    int num;
    MyClass( int i) {
        num = i;
    }
}

public class ConsDemo {
    public static void main(String args[]) {
        MyClass t1 = new MyClass( 10 );
        MyClass t2 = new MyClass( 20 );
        System.out.println(t1.num + " " + t2.num);
    }
}

/* Parameterized Constructor */