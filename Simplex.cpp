#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
/*En vez de preguntar por variables ecuaciones, se debe pedir por cu�ntas restricciones para as�
  enumerar las variables de holgura. El pedo va a ser como identificar las restricciones tal vez, tal vez 
  despu�s de pedir el coeficiente de la variable pedir tambien que elija si es menor o igual, mayor o igual,
  etc.*/
/*UPDATE: Tas bien pendejo, las variables de holgura son para igualar a huevo en vez de ver si es mayor/menor.
  Puto.*/
main(){
	//AGREGAR ASCII PARA ACENTOS
	int i,j,v,m,n,r,vr;
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
	}
	*/
	printf("Ingrese la cantidad de restricciones en el sistema: ");
	scanf("%d",&r);
	for(m=0;m<r;m++){
		for(n=0;n<r;n++){
		printf("Ingrese el coeficiente de la variable %d en la ecuaci�n %d ",&n,&m);
		scanf("%d",&j);
		}
	printf("Ingrese el resultado de la ecuaci�n: ");
	scanf("%d",&vr);	
	}
	getche();
}
