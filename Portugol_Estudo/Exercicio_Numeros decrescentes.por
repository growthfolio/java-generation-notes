programa
{
	funcao inicio()
	{
		inteiro vetor[10] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6} 
		inteiro i, j, troca

		escreva("numeros não ordenados: ")
		para(i=0; i < 10; i++){
			escreva(vetor[i], " ")
			}
			
		para(i = 0; i < 9; i++){
			para(j = i + 1; j < 10; j++){
				se(vetor[i] < vetor[j]){
					troca = vetor[i]
					vetor[i] = vetor[j]
					vetor[j] = troca
				}
			}
		}
		
		escreva("\nnúmeros em ordem decrescente: ")
		para(i = 0; i < 10; i++){
			escreva(vetor[i], " ")
		}
	}
}