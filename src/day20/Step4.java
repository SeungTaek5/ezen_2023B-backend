package day20;

public class Step4 {

    public static void main(String[] args) {
        String[] array = {"100", "1oo"};
        for(int i=0; i<= array.length; i++){

            try{
              int value = Integer.parseInt(array[i]);
            } catch (NumberFormatException e){
                System.out.println("                              ");
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("");
            }
        }
    }
}
