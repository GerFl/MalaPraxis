#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<ctype.h>
main(){
	// r = # de restricciones
	// varholg = variables de holgura. El número de variables de holgura es igual a la cantidad de res
	// maxmin = maximización o minimización
	// vr = valor de la restricción
	// v = # de varibles en el sistema
	// validación de string
	int m,n;
	int M[m][n];
	int varholg;
	void captura_restricciones();
	void max_min();
	max_min();
	captura_restricciones();
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

void captura_restricciones(){
	int m,n,c,v,r,vr,e;
	int R[50][50];
	int V[50][50];
	printf("Ingrese la cantidad de restricciones en el sistema: ");
	scanf("%d",&r);
	printf("Ingrese la cantidad de variables: ");
	scanf("%d",&v);
	for(m=1;m<=r;m++){
		for(n=1;n<=v;n++){
			printf("Ingrese el coeficiente de la variable %i en la restricci%cn %i: ",n,162,m);
			scanf("%d",&e);
			//V[r][v]=n;
			//printf("%d\n",V[r][v]);
		}
		printf("Ingrese el resultado de la ecuaci%cn: ",162);
		scanf("%d",&vr);	
	}
}
