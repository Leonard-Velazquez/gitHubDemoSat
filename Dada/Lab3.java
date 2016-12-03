/*Leonard Velazquez
 *Lab 3 Generics
 *October 5, 2015
 */
package lab.pkg3;
import java.util.*;

public class Lab3{

    public static <E> void print(E[] list){
        for(int i = 0; i < list.length; i++){
        System.out.print(list[i] + " ");
        }
        System.out.println();
    }
    public static <E extends Comparable<E>> void sort(E[] list){
        E currentMin;
        int currentMinIndex;
        for(int i=0; i < list.length -1; i++){
            currentMin = list[i];
            currentMinIndex = i;
            for(int j=i +1; j < list.length; j++){
                if (currentMin .compareTo(list[j])>0){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
                if(currentMinIndex != i){
                    list[currentMinIndex] = list[i];
                    list[i] =currentMin;
                }
            }
        }
    }
    public static <E> ArrayList<E> removeDup(ArrayList<E> list){
    // implement the method
        E start;
        for(int g = 0; g < list.size() -1; g++){
            start = list.get(g);
            if(list.contains(start) && list.indexOf(start)== g){
                   list.remove(start);
               }
        }
        return list;
    }
    public static <E extends Comparable<E>> E max(E[] list){
    //implement the body
        E m = list[0];
        for(int i = 0;i < list.length-1;i++){
            int result = m.compareTo(list[i]);
            
            if(result == 0){
                //System.out.println("no change number is the same");
            }
            else if(result > 0){
                //System.out.println("Value is lower");
            }
            else{
                m = list[i];               
            }
        }        
        return m;
    }
    public static <E extends Comparable<E>> int binarySearch(E[] list, E key){
        int low = 0, high = list.length -1;
        int mid = (high + low)/2;
        while (low < high){
            // use compareTo Method
            int result = key.compareTo(list[mid]);
            if (result<0) {
                high = mid -1;
            }
            else if (result == 0){
                return mid;
            }else{
                low = mid + 1;
            }
            mid = (low + high)/2;
        }
        return -1;
    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E key){
    //implement the body
    return 0;
    }
    public static void main(String[] args) {
    // TODO Auto-generated method stub
        Integer[] intList = {7,3,7,2,1,9,6,9};
        String[] stringList = {"Java", "is","fun !"};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(7);
        list.add(9);
        list.add(8);
        list.add(3);
        list.add(7);
        
        System.out.println("The max number of the list is "+max(intList));
        System.out.println(removeDup(list));
        sort(stringList);
        print(intList);
        print(stringList);
    }
}