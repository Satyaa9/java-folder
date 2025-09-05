import myPack.*;
class Demo{
	public static void main(String[]args){
		System.out.println("in Demo");

		Codex obj = new Codex();
		obj.fun();
	}
}
/*
OUTPUT:
p2.java:6: error: cannot find symbol
                Codex obj = new Codex();
                ^
  symbol:   class Codex
  location: class Demo
p2.java:6: error: cannot find symbol
                Codex obj = new Codex();

Karan aapan jevha aapan dusrya class chya package cha use karun goshti access karayacha try karto tevha to class aani tyacha aatil saglya method public karavya lagatat.

Aani public kelya nantr class Ani file ch name pn same dyav lagat karan aapan class cha access specifier public kela aahe mg compiler la to class lagech sapdato
*/