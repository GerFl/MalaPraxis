 #include<stdio.h>
#include<conio.h>
#include<stdlib.h>
main(){
	//AGREGAR ASCII PARA ACENTOS
	// r = # de restricciones
	// varholg = variables de holgura. El número de variables de holgura es igual a la cantidad de res
	// maxmin = maximización o minimización
	// vr = valor de la restricción
	// v = # de varibles en el sistema
	int m,n;
	int M[m][n];
	int varholg;
	void restricciones();
	void max_min();
	max_min();
	restricciones();
	getche();
}

void max_min(){
	int maxmin;
	do{
		printf("%cDesea maximizar o minimizar?\n1.Maximizar\t2.Minimizar\t",168);
		scanf("%d",&maxmin);
	} while(maxmin<1 || maxmin>2);
}

void restricciones(){
	int m,n,c,v,r,vr;
	int R[m][n];
	int V[m][n];
	printf("Ingrese la cantidad de restricciones en el sistema: ");
	scanf("%d",&r);
	printf("Ingrese la cantidad de variables: ");
	scanf("%d",&v);
	for(m=0;m<r;m++){
		for(n=0;n<v;n++){
			printf("Ingrese el coeficiente de la variable %d en la ecuaci%cn %d ",&n,162,&m);
			V[m][n]=scanf("%d",n);
		}
		printf("Ingrese el resultado de la ecuaci%cn: ",162);
		scanf("%d",&vr);	
	}
}
