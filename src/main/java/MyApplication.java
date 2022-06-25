public class MyApplication {

    /**
     *
     * @param count число
     * @return возврат
     */
    public static int numberCount (int count) {
        return count;
    }

    /**
     *
     * @param args значение
     */
    public static void main(String[] args) {
        System.out.println("Hello git");
        for(int i = 0; i<numberCount(10); i++) {
            System.out.println(i);
        }
        System.out.println("End program");
    }
}
