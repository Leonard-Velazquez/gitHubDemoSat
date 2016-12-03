/*Leonard Velazquez
 *Lab 3 List, Stacks, Queues, Sets, and Maps
 *October 14, 2015
 */
package lab.pkg3;

import java.util.*;
import java.io.*;

public class Lab3Lists {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        String value;
        ArrayList<String> list= new ArrayList<>();
        
        System.out.print("Enter your input(press enter exit):");
            
            value = input.nextLine();
            StringTokenizer st = new StringTokenizer(value);
            
            while(st.hasMoreTokens()){
                list.add(st.nextToken());
            }
        
        //adding arraylist into linkedlist
        LinkedList<String> linkedlist = new LinkedList<>(list);
        
        showWords(linkedlist);
        removeDup(list);
        
        
    }
    public static void removeDup(ArrayList<String> list ){
        List<String> temp= new ArrayList<>();
        Object start;
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            
            start = iterator.next();
            if(!temp.contains(start))
                temp.add(start.toString());
        }
        
        Collections.sort(temp);
        System.out.println("\n"+temp);
        
    }
    public static void showWords(LinkedList<String> list){
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}
