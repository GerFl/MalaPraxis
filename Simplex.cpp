#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
main(){
	//AGREGAR ASCII PARA ACENTOS
	// r = # de restricciones
	// varholg = variables de holgura. El n�mero de variables de holgura es igual a la cantidad de res
	// maxmin = maximizaci�n o minimizaci�n
	// vr = valor de la restricci�n
	// v = # de varibles en el sistema
	int c,m,n,v,r,vr;
	int M[m][n];
	int maxmin;
	int varholg;
	/* MAXIMIZAR O MINIMIZAR
	while(maxmin<0 || maxmin>2){
	printf("�Desea maximizar o minimizar?\n1.Maximizar\t2.Minimizar\t");
	scanf("%d",&maxmin);
	if(maxmin<0||maxmin>2){
		printf("\nFavor de indicar el n�mero de la opci�n mostrada.\n");
	}
	}*/
	printf("Ingrese la cantidad de restricciones en el sistema: ");
	scanf("%d",&r);
	printf("Ingrese la cantidad de variables: ");
	scanf("%d",&v);
	for(m=0;m<r;m++){
		for(n=0;n<v;n++){
		printf("Ingrese el coeficiente de la variable %d en la ecuaci%cn %d ",&n,162,&m);
		scanf("%d",&c);
		}
	printf("Ingrese el resultado de la ecuaci%cn: ",162);
	scanf("%d",&vr);	
	}
	getche();
}
