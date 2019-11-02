#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<ctype.h>
main(){
	// checar especificaciones de la función objetivo
	// r = # de restricciones
	// varholg = variables de holgura. El número de variables de holgura es igual a la cantidad de res
	// maxmin = maximización o minimización
	// vr = valor de la restricción
	// v = # de variables en el sistema
	// validación de string
	// función de tablatura
	// resolver función objetivo
	int m,n;
	int M[m][n];
	int varholg;
	void captura_restricciones();
	void max_min();
	void tabulacion();
	max_min();
	captura_restricciones();
	//tabulacion();
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
	int m,n,v,r,vr,e;
	int f,fo,i,piv;
	int R[50];
	int V[50][50];
	int F[50];
	/*printf("Ingrese la función objetivo: ");
	for(f=0;fo<?;f++){
		scanf("%d",&fo);
		F[f]=fo;
	}*/
	printf("Ingrese la cantidad de restricciones en el sistema: ");
	scanf("%d",&r);
	printf("Ingrese la cantidad de variables: ");
	scanf("%d",&v);
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
	for(m=1;m<=r;m++){
		printf("\nArreglo %d: ",m);
		for(n=1;n<=v;n++){
			printf("%d, ",V[m][n]);			
		}
		printf("Resultado de la ecuaci%cn: %d",162, R[m]);
		//printf("%d",R[m]);
	}
}

/*void tabulacion(){
	int i,j,r,v;
	int V[r][v];
	for(i=0;i<=r;i++){
		for(j=0;j<=v;j++){
			printf("%d",&V[r][v]);
		}
	}
}*/
