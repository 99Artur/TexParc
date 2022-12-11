import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<MyProcessor> myCpu = new ArrayList<>();
        myCpu.add(new MyProcessor("Amd", 4, 3.2));


        MyProcessor[] myProcessors = new MyProcessor[1];
        myProcessors[0] = new MyProcessor("intel", 2, 4.3);

        MyProcessor[] myArray = myCpu.toArray(new MyProcessor[1]);
        Arrays.sort(myArray);

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(myProcessors));
        boolean res = Arrays.equals(myArray, myProcessors);
        System.out.println(res);

        myArray[0].setNaming("intel");
        myArray[0].setNumberCores(2);
        myArray[0].setFrequencies(4.3);

        System.out.println(Arrays.equals(myArray, myProcessors));
        System.out.println(Arrays.toString(myArray));

        ArrayList<MyProcessor> myCpuArray = new ArrayList<>(Arrays.asList(myArray));
        System.out.println(myCpuArray);
    }


}