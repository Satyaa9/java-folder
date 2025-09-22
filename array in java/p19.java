import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] marks = {40,80,25,55,12,60,78,5,19};

		for(int i=0; i<marks.length; i++){
			if(marks[i]<35){
				System.out.print(i+" ");
			}
		}
	}
}

/*
OUTPUT:
2 4 7 8

Given an array of marks of students, if the marks of students, if the marks of any student is less than 35 print its roll number.[roll number here referes to the index of the array.]

*/