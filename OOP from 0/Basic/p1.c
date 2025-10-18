#include<stdio.h>

int a=10;

void CodexFun(){
	printf(" in codex fun %d",a);
}

void opd(){
	printf("in hospital function %d",a);
}

void main(){
	printf("in main ");
	opd();
	CodexFun();
}

/*
OUTPUT:
in main in hospital function 10 in codex fun 10
*/