#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

main(){
	//AGREGAR ASCII PARA ACENTOS
	int i,j,v,m,n,r;
	int M[m][n];
	int maxmin;
	/* MAXIMIZAR O MINIMIZAR
	while(maxmin<0 || maxmin>2){
	printf("�Desea maximizar o minimizar?\n1.Maximizar\t2.Minimizar\t");
	scanf("%d",&maxmin);
	if(maxmin<0||maxmin>2){
		printf("\nFavor de indicar el n�mero de la opci�n mostrada.\n");
	}
	}
	*/
	printf("Ingrese la cantidad de variables/ecuaciones en el sistema: ");
	scanf("%d",&v);
	for(m=0;m<v;m++){
		for(n=0;n<v;n++){
		printf("Ingrese el coeficiente de la variable %d en la ecuaci�n %d ",&n,&m);
		scanf("%d",&j);
		}
	printf("Ingrese el resultado de la ecuaci�n: ");
	scanf("%d",&r);	
	}
	getche();
}
