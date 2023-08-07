public class Task02 {
    public static void main(String[] args) {
    Task2();
    }
    public static void Task2() {
        int [] intArray = new int[10];
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
        catch (ArithmeticException e){
            System.out.println("Catching exception: " + e);
        }
    }

}
