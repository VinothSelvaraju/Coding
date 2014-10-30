import java.lang.Math;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListAdd{
    
    /*
    Code for adding 2 linked lists presented in reverse order
    I/P - 2 lists in reversed order
    O/P - sum list in reversed order
    Time - O(n), n and m size of l1 and l2 and if n>=m
    Space - O(n), creating a new linked list as output
    Essential condition to be considered while coding - 2 lists can be of diffrent sizes
    */
    public static LinkedList<Integer> addLinkedLists(LinkedList<Integer> l1, LinkedList<Integer> l2){
       
       //both lists not null
        if(l1 != null && l2 != null){
            LinkedList<Integer> sumList = new LinkedList<Integer>();
            ListIterator<Integer> li1 = l1.listIterator(0);
            ListIterator<Integer> li2 = l2.listIterator(0);
            Integer i1;
            Integer i2;
            int carry = 0;
            while(li1.hasNext() || li2.hasNext()){
           
                //node available in both lists
                if(li1.hasNext() && li2.hasNext()){
                    i1 = li1.next();
                    i2 = li2.next();
                    int sum = i1 + i2 + carry;
                    if(sum<10){
                         sumList.add(sum);
                         carry = 0;
                    }
                    else{
                        sumList.add(Math.abs(10-sum));
                        carry = 1;
                    }      
                }
                //l2 size is larger than l1
                else if(li2.hasNext()){
                    i2 = li2.next();
                    if(i2+carry<10){
                         sumList.add(i2+carry);
                         carry = 0;
                    }
                    else{
                        sumList.add(Math.abs(10-i2+carry));
                        carry = 1;
                    }      
                }
                //l1 size is larger than l2
                else{
                    i1 = li1.next();
                    if(i1+carry<10){
                         sumList.add(i1+carry);
                         carry = 0;
                    }
                    else{
                        sumList.add(Math.abs(10-i1+carry));
                        carry = 1;
                    }  
                }
            }
            //carry left over when the last digits sum is over 10; must be added to the sumList
            if(carry == 1){
                sumList.add(1);
            }
            return sumList;
        }

        return null;
    }

    public static void printList(LinkedList<Integer> l1){
        System.out.println("Print list");
        if(l1 != null){
            ListIterator<Integer> li1 = l1.listIterator(0);
            while(li1.hasNext()){
                System.out.println(li1.next());
            }
        }
        else{
             System.out.println("List NULL");
        }
        
    }

     public static void main(String []args){
        //Testing
        //1. Boundary
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        l1.add(9);
        l1.add(9);
        l1.add(9);
        printList(l1);
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l2.add(9);
        l2.add(9);
        l2.add(9);
        printList(l2);
        LinkedList<Integer> sumList1 = addLinkedLists(l1,l2);
        printList(sumList1);

        //2. Positive within boundary
        LinkedList<Integer> l3 = new LinkedList<Integer>();
        l3.add(7);
        l3.add(1);
        l3.add(6);
        LinkedList<Integer> l4 = new LinkedList<Integer>();
        l4.add(5);
        l4.add(9);
        l4.add(2);
        LinkedList<Integer> sumList2 = addLinkedLists(l3,l4);
        printList(sumList2);

        //3. Null
        LinkedList<Integer> sumList3 = addLinkedLists(null,null);
        printList(sumList3);
        
        //4. Empty
        LinkedList<Integer> sumList4 = addLinkedLists(new LinkedList<Integer>(),new LinkedList<Integer>());
        printList(sumList4);
     }
}