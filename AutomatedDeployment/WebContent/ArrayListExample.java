package com.collections.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;





public class ArrayListExample {
			
			   public static void main(String args[]) {
				   
				   
				   
				   TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
				   
				   treeMap.put(1, "One");
				   treeMap.put(12, "Twelve");;
				   treeMap.put(3, "three");
				   treeMap.put(5, "five");
				   treeMap.put(7, "seven");
				   treeMap.put(9, "nine");
				   
				 
				   
				   System.out.println("Elements in treeMap:"+treeMap);
				   
				   Set set = treeMap.entrySet();
				   
				   Iterator itr = set.iterator();
				   
				   while(itr.hasNext())
				   {
					   Entry<Integer, String> entry = (Entry<Integer,String>)itr.next();
					   System.out.println("Key:"+entry.getKey());
					   System.out.println("Value:"+entry.getValue());
				   }
				   
				   
				   
				   
				   
				   
				/*   HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
				   
				   hashMap.put(1, "First");
				   hashMap.put(12, "Second");
				   hashMap.put(3, "Third");
				   
				   hashMap.remove(3);
				   System.out.println("Elements in hashMap are:"+hashMap);
				   
				   Set set= hashMap.entrySet();
				   
				   Iterator iterator = set.iterator();
				   
				   while(iterator.hasNext())
				   {
					   Map.Entry<Integer, String> entry = (Entry<Integer, String>) iterator.next();
					   
					   System.out.println("Key:"+entry.getKey());
					   System.out.println("Value:"+entry.getValue());
					  
				   }
				   */
				  /* HashSet<String> hashSet= new HashSet<String>();
				   
				   LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
				   
				   TreeSet<String> Treeset = new TreeSet<String>();
				   
				   
				   
				    hashSet.add("lmanish");
				    hashSet.add("qrohit");
				    hashSet.add("rsaks");
				    hashSet.add("xmanish");
				    hashSet.add(" ");
				    hashSet.add("    ");
				    hashSet.add("aManish");
				    hashSet.add("12AManish");
				    
				    linkedHashSet.addAll(hashSet);
				    
				   Treeset.addAll(linkedHashSet);
				    
				    System.out.println("elements in hashSet are:"+hashSet);
				    
				    System.out.println("elements in linkedSet are:"+linkedHashSet);
				    
				    System.out.println("elements in Tree Set are:"+Treeset);
				    
				    Iterator<String> iterator = hashSet.iterator();*/
				    
				    
				   
				   
				/* Vector<String>vector = new Vector<String>();
				   
				   	vector.add("One");
				   	vector.add("two");
				   	vector.add("three");
				   	vector.add("four");
				   	vector.add("");
				   	
				   	System.out.println("vector:"+vector);
				   	
				   	Enumeration en = vector.elements();
				   	
				   	while(en.hasMoreElements())
				   	{
				   		System.out.println("elements in vector:"+en.nextElement());
				   		
				   	}
				   	
				   
				   Iterator iterator = vector.iterator();
				   
				   while(iterator.hasNext())
				   {
					   System.out.println("element through iterator:"+iterator.next());
					   
				   }
				   */
				  
				   
				 /*LinkedList<String> linkedList = new LinkedList<String>();
				 
				 linkedList.add("Manish");
				 linkedList.add("Pradhan");
				 linkedList.add("Rohit");
				 linkedList.add("Saksham");
				
				 
				 ListIterator<String> iterator = linkedList.listIterator();
				 
				 
				
		
				 
				 //System.out.println(linkedList.get(0));
				 System.out.println("Linked list:"+linkedList);
				 System.out.println("Updated linked List:"+linkedList);
				 
				 System.out.println("Peek:"+linkedList.peek());
				 
				 System.out.println("pop"+linkedList.pop());
				
				 
				 System.out.println("poll:"+linkedList.poll());
				 
				  System.out.println("Updated linked List:"+linkedList);
				 */
			/*	 ArrayList<String> arrayList = new ArrayList<String>();
				 
				 arrayList.add("Mac");
				 arrayList.add("roy");
				
				 
				 Iterator<String> iterator = arrayList.iterator();
				 
				 while(iterator.hasNext())
				 {
					 System.out.println("element:"+iterator.next());
					 arrayList.add("error");
				 }
				 
				 
				 */
				  //linkedList.addAll(arrayList);
				  //linkedList.addAll(2, arrayList);
				  
			
				
				/* 
				 * Take all elements from one List and put it into another List
				 *   
				 *   ArrayList<Integer> list = new ArrayList<Integer>();
				   list.add(1);
				   list.add(5);
				   list.add(1);
				   list.add(2);
				   list.add(1);
				   System.out.println(list);
				   
				   ArrayList<Integer> noDuplicates = new ArrayList<Integer>();
				  HashSet<Integer> duplicates = new HashSet<Integer>();
				   
				   
				   Iterator<Integer> itr = list.iterator();
				   
				   while(itr.hasNext())
				   {
					   Integer next = itr.next();
					   
					   if(noDuplicates.contains(next) )
					   {
						   
							   duplicates.add(next);
						   
						  
					   }
					   else
					   {
						   noDuplicates.add(next);
					   }
					  
					   
				   }
				   
				   System.out.println("list:"+list);
				   
				   System.out.println(" list with no duplicates:"+noDuplicates);
				   
				   System.out.println("List with duplicates:"+duplicates);
				   */
				   
			/*	   
			ArrayList<StudentComparator> listComparator = new ArrayList<StudentComparator>();
			
			listComparator.add(new StudentComparator(10, "Manish", 22));
			listComparator.add(new StudentComparator(5, "Rohit", 23));
			listComparator.add(new StudentComparator(3, "Pradhan", 24));*/
			
			/*Collections.sort(listComparator,StudentComparator.studentNameComparator);
			
			for (StudentComparator studentComparator : listComparator) {
				System.out.println(studentComparator.getStudentName());
				
			}*/
			
		/*	Collections.sort(listComparator,StudentComparator.studentRollNoComparator);
			
			for (StudentComparator studentComparator : listComparator) {
				
				System.out.println(studentComparator.getRollNo());
			}
			
				  */ 
				   
				/*   ArrayList<Student> list = new ArrayList<Student>();
				   
				   list.add(new Student("xanish",1));
				   list.add(new Student("aohit",2));
				   list.add(new Student("bradhan",3));
				   list.add(new Student("caksham", 4));
				   
				   Iterator<Student> itr = list.iterator();
				  
				   Collections.sort(list);
				   
				   while(itr.hasNext())
				   {
					   Student st = itr.next();
					   System.out.println("The name of student is:"+st.getName());
					   System.out.println("The rollno of student is:"+st.getRollNo());
				   }
				   */
	
				   
				  /* ArrayList<String> list = new ArrayList<String>();
				   
				   list.add("Manish");
				   list.add("ArrayList");
				   list.add("Implements");
				   list.add("List");
				   list.add("Interface");
				   
				  // list.add(0, "element");
				  // list.remove(1);
				   //list.set(1, "set element");
				//System.out.println(list.indexOf("List"));
				  
				   System.out.println("The List is:"+list);
				   
				   Iterator<String> itr = list.iterator();
				   
				   while(itr.hasNext())
				   {
					   System.out.println("The element is:"+itr.next());
					   
					   
					   
				   }
				   
				   System.out.println("***********************************");
				   
				   ArrayList<Integer> integerList = new ArrayList<Integer>();
				   
				   Scanner scanner = new Scanner(System.in);
				   
				   String answer = "";
				   
				   do
				   {
					   System.out.println("Enter the integer element in the List:");
					   integerList.add(scanner.nextInt());
					   
					   System.out.println("Do you want to add more elements in the List(Y/N):");
					   answer = scanner.next();
				   }while(answer.equalsIgnoreCase("y"));
				   
				   if(answer.equalsIgnoreCase("y"));
				   else
				   {
					   Collections.sort(integerList);
					   Collections.reverse(integerList);
					   System.out.println("The List generated is:"+integerList);
				   }*/
			}
	
}

