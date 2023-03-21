public class oop41exception {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            int result = x / y;
            System.out.println("Result is " + result);
        } catch (ArithmeticException anyvariable2) {
            System.out.println("This is  exception! " + anyvariable2);
        } catch (Exception anyvariable1) {
            System.out.println("This is  exception! " + anyvariable1);
        }

        // in exception hierarchy all exception is under "Exception"
        // if "Exception" is used in catch, it covers all
        // "Exception" is to be used at the very last catch

        // }catch(ArithmeticException anyvariable){
        // System.out.println("This is arithmatic exception! " + anyvariable);
        // }

        finally {
            System.out.println("Last line of code");
        }
        // finally blcok will run no matter what

        try {
            int[] a = new int[4];
            a[4] = 10;
        } catch (ArrayIndexOutOfBoundsException anyvariable3) {
            System.out.println("This is  exception! " + anyvariable3);
        } catch (Exception anyvariable4) {
            System.out.println("This is  exception! " + anyvariable4);
        }

    }
}
