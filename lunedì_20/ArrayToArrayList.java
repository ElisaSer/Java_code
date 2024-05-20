import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");

        cars.add("BMW");

        cars.add("Ford");

        cars.add("Mazda");

        System.out.println(cars);

        cars.set(0, "Opel");
        System.out.println(cars);
        System.out.println(cars.get(0));

        System.out.println(cars.size());

        cars.remove(0);

        cars.clear();

        Integer arr[] = { 1 , 2 , 3 , 4 , 5 , 6 };

        System.out.println( "Array:" + Arrays.toString(arr));

        // ora convertiamo Array in ArrayList in modo da poter aggiungere un altro elemento
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr)); 

        arrayList.add( 7 );

        // ora convertiamo da ArrayList a Array
        arr = arrayList.toArray(arr);

        System.out.println( "Array dopo aver aggiunto l'elemento: " +Arrays.toString(arr));

    }

}
