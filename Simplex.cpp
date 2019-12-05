#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<ctype.h>
main(){ //Puto el que lo lea
	int r,v,m,n;
	int M[m][n];
	int varholg;
	void captura_restricciones(int r,int v);
	void prueba_cociente();
	//max_min();
	printf("Ingrese la cantidad de restricciones en el sistema: ");
	scanf("%d",&r);
	printf("Ingrese la cantidad de variables: ");
	scanf("%d",&v);
	printf("x1= N%cmero de soldados a fabricar\nx2= N%cmero de trenes a fabricar\n\nEl valor de las restricciones es igual a la cantidad de horas disponibles.\nLos coeficientes indican la cantidad de horas para cada soldado o tren.\nLos coeficientes de la funci%cn objetivo aluden a la utilidad del producto.\n",163,163,162);
	captura_restricciones(r,v);
	getche();
}

void max_min(){
	int maxmin;
	do{
		printf("%cDesea maximizar o minimizar?\n1.Maximizar\t2.Minimizar\t",168);
		scanf("%d",&maxmin);
		char str[0];
		if(isdigit(maxmin[""])){
			printf("Khe");
		}
	} while(maxmin<1 || maxmin>2);
}

void captura_restricciones(int r,int v){
	int m,n,vr,e;
	int f,fo,i,piv;
	int R[50];
	int V[50][50];
	int F[50];
	//CAPTURA DE DATOS Y FUNCIÓN OBJETIVO
	for(m=0;m<1;m++){
		for(n=1;n<=v;n++){
			printf("Ingresa el valor de la variable %i en la funci%cn objetivo:",n,162);
			scanf("%d",&e);
			V[m][n]=e;
		}
	}
	for(m=1;m<=r;m++){
		for(n=1;n<=v;n++){
			printf("Ingrese el coeficiente de la variable %i en la restricci%cn %i: ",n,162,m);
			scanf("%d",&e);
			V[m][n]=e;			
		}
		printf("Ingrese el resultado de la ecuaci%cn: ",162);
		scanf("%d",&vr);
		R[m]=vr;	
	}
	//IMPRESIÓN DE LOS DATOS CAPTURADOS
	printf("\nFunci%cn objetivo: ",162);
	for(m=0;m<1;m++){
		for(n=1;n<=v;n++){
			printf("%d x%d + ",V[m][n],n);
		}
	}
	printf("S.A.:");
	for(m=1;m<=r;m++){
		printf("\nRestricci%cn %d: ",162,m);
		for(n=1;n<=v;n++){
			printf("%d, ",V[m][n]);			
		}
		printf("Resultado de la ecuaci%cn: %d\n",162, R[m]);
	}
}

/* HACE  BIEN LA BUSQUEDA DEL MENOR
void prueba_cociente(){
	int v,t,j,n,i,pivote,X;
	int P[50]={};
	printf("Sobres puto, dame el tamaño: ");
	scanf("%d",&t);
	for(j=0;j<t;j++){
		printf("Dame el número, puta: ");
		scanf("%d",&n);
		P[j]=n;
	}
	pivote=P[0];
	for(i=0;i<=t;i++){
		if(pivote>P[i]){
			pivote=P[i];
			printf("\t%d",pivote);
		}
	}
	printf("\n%d",pivote);
}*/
