class Person {
    public void talk() {
        System.out.println( "Hello" );
    }
}

class Baby extends Person {
    public void talk() {
        System.out.println( "Goo goo" );
    }
}

class Boy extends Person {
    public void hi() {
        System.out.println( "hi" );
    }
}

public class Test{
    public static void main( String args[] ) {
        Person p1 = new Person();
        p1.talk();

        Baby b1 = new Baby();
        b1.talk();

        Boy b2 = new Boy();
        b2.talk();
        b2.hi();
    }
}