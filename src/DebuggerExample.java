public class DebuggerExample {

    public static void main(String[] args) {
        doSomething();

    }


    public static void doSomething(){
        int x = 5;
        String s = "Semmel";
        boolean r = doSomethingElse(s);
        System.out.println(s+" "+r);
    }


    public static boolean doSomethingElse(String s) {
        if (s.length() > 4) {
            return true;
        }

        return false;
    }
}
