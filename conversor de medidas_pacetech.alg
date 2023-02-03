algoritmo "conversor"
// Função : Converter
// Autor : Marlon Rodrigues
// Data : 02/02/2023

// Seção de Declarações
var

opcao: literal
km, m, litro, m3: real

inicio

//inicio do painel de seleção
repita

   escreval ("------------------------------------------------")
   escreval ("Digite 1 para converter quilômetro(s) em metro(s)")
   escreval ("Digite 2 para converter litro(s) em metro(s) cúbico(s)")
   escreval ("Digite 3 para sair do programa")
   escreval ("------------------------------------------------")
   leia(opcao)
   escreval("")
   //final do painel de seleção

   //inicio da função 1
   se opcao = "1" entao
      escreval("Digite o valor do quilômetro a ser convertido em metro:  ")
      leia(km)
      escreval("")

      m <-   km * 1000

      escreval(km, " quilômetro(s) convertido(s) equivale(m) a ", m, " metro(s)")
      escreval("")
      //fim da função 1

      //inicio da função 2
   senao
      se opcao = "2" entao
         escreval("Digite o valor do litro a ser convertido em metro cúbico:  ")
         leia(litro)
         escreval("")

         m3 <-   litro / 1000

         escreval(litro, " litro(s) convertido(s) equivale(m) a ", m3, " metro(s) cúbico(s)")
         escreval("")
         //fim da função 2

      fimse
   fimse

ate opcao = "3"

//inicio da funçao 3
escreval("Você escolheu sair do programa!")
escreval("")
//fim da funçao 3

fimalgoritmo
