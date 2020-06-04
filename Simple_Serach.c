#include <stdio.h>
#define Max_Size 10000

int main(){
	int n, a[Max_Size], k, item;
	scanf("%d", &n);              	

	for(int i=0; i<n; i++){
		scanf("%d",&a[i]);
	}
		scanf("%d",&k);

	for(int i=0; i<n; i++){
		if(a[i]==k){
			item = i+1;
			item--;
		}
			else{
				item = 0;
			}

			if(item!=0){
				printf("%d",item);
			}
				else{
					printf("");
				}



	}
	       
}

