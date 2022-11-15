public class main {
    int x;

    public main() {
        x = 5; //set the initial value for a class attribute x
    }

    public static void main(String[] arg) {
        main myobj = new main();//create an object of class main (this will call the constructor)
        System.out.println(myobj);

    }
}
