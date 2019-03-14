package Practice;

import java.io.IOException;


 class MyResource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closing MyResource");
        throw new Exception("Exception in Closing");
    }

}
class cutomException extends Exception {

}
public class ExeceptionHandling {

    private static void normalTryException() throws Exception {
        MyResource mr = null;
        try {
            mr = new MyResource();
            System.out.println("MyResource created in try block");
            if (true)
                throw new Exception("Exception in try");
        } finally {
            if (mr != null)
                mr.close();
        }

    }
    private static void tryWithResourceException() throws Exception {
        try (MyResource mr = new MyResource()) {
            System.out.println("MyResource created in try-with-resources");
            if (true)
                throw new Exception("Exception in try");
        }
     finally {
            //throw new Exception("finall exception with resources");
        }
    }

    public static void main(String[] args) throws Exception {
        //Thread
        try {
            tryWithResourceException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            normalTryException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
