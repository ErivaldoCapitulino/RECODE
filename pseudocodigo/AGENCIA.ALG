Algoritmo "Agencia"

//Fun��o para Cadastro de Cliente

funcao cadastroCliente():caractere
var
   nomeCliente, email, cpf, ender: caractere   //ender � referente a endere�o
inicio

   para i de 1 ate VALOR faca

      escreva("Digite o Nome Completo: ")
      leia(nome[i])
      escreva("Digite o e-mail: ")
      leia(email[i])
      escreva("Digite o CPF: ")
      leia(cpf[i])

      nomeCliente <- nome[i]
      email <- email[i]
      cpf <- cpf[i]

      escreva("Informe o endere�o: ")
      escreval("")

      para j de 1 ate 5 faca

         escreva("Rua: ")
         leia(endereco[1,1])
         escreva("N�mero: ")
         leia(endereco[1,2])
         escreva("Bairro: ")
         leia(endereco[1,3])
         escreva("Cidade: ")
         leia(endereco[1,4])
         escreva("Estado: ")
         leia(endereco[1,5])

         ender <- endereco[i,j]
         interrompa
      fimpara

      escreval("==================================================================")

      escreva("Deseja cadastrar outro cliente? S/N: ")
      leia(resposta)

      limpatela

      se (resposta <> "s") e (resposta <> "S") entao
         interrompa
      fimse

   fimpara
   retorne nomeCliente
fimfuncao


//Fun��o para Cadastro de Destino


funcao cadastroDestino():Caractere
var
   cidade,estado,pais: caractere
inicio
   para i de 1 ate VALOR faca
      escreva("Digite a cidade: ")
      leia(cidade[i])
      escreva("Digite o estado: ")
      leia(estado[i])
      escreva("Digite o pa�s: ")
      leia(pais[i])

      cidade <- cidade[i]
      estado <- estado[i]
      pais <- pais[i]

      escreval("==================================================================")

      escreva("Deseja cadastrar outro Destino? S/N ")
      leia(resposta)

      limpatela

      se (resposta <> "s") e (resposta <> "S") entao
         interrompa
      fimse
   fimpara
   retorne cidade
fimfuncao


//Procedimento para Consulta de Cliente

procedimento consultarCliente()
var
   cliente: caractere
inicio

   limpatela
   escreva("Informe o Cliente que deseja consultar: ")
   leia(cliente)
   escreval("")

   para i de 1 ate VALOR faca
      se (nome[i]) = (cliente)entao
         escreval("---------------------------------------------------")
         escreval("Nome: ", nome[i])
         escreval("Email: ", email[i])
         escreval("CPF: ", cpf[i])


         para j de 1 ate 5 faca

            se(endereco[j] = "")entao
               interrompa
            fimse

            escreva("Endere�o: ")
            escreva((endereco[1,1])," ")
            escreva((endereco[1,2])," ")
            escreva((endereco[1,3])," ")
            escreva((endereco[1,4])," ")
            escreval((endereco[1,5])," ")

         fimpara

         escreval("---------------------------------------------------")
      fimse
   fimpara
   escreval("")
fimprocedimento


//Procedimento para consultar destino

procedimento consultarDestino()
var
   nomeCidade: caracter
   //verificar: logico
inicio

   limpatela
   escreva("Informe o Destino que deseja consultar: ")
   leia(nomeCidade)
   escreval("")

   para i de 1 ate VALOR faca


      se (nomeCidade = cidade[i]) entao
         escreval("---------------------------------------------------")
         escreval("Cidade: ", cidade[i])
         escreval("Estado: ", estado[i])
         escreval("Pa�s: ", pais[i])
         escreval("---------------------------------------------------")
         escreval("")
         interrompa
      senao
         escreva("Cliente n�o cadastrado!")
         interrompa
      fimse

   fimpara
   escreval("")
fimprocedimento


//Procedimento de consulta completa de cliente

procedimento consultaCompletaCliente()
var
   ender:caractere
inicio

   limpatela

   para i de 1 ate VALOR faca

      //Essa condi��o serve para parar a verifica��o da consulta at� onde
      //exista registro

      se((nome[i]) e (email[i]) e (cpf[i]) = "")entao
         interrompa
      fimse

      escreval("Nome: ",nome[i])
      escreval("E-mail: ",email[i])
      escreval("CPF: ",cpf[i])

      para j de 1 ate 5 faca
         se((nome[i]) e (email[i]) e (cpf[i]) = "")entao
            interrompa
         fimse
         escreva(endereco[i,j]," ")
      fimpara

      escreval("")

      escreval("=================================================================")
   fimpara
fimprocedimento


//Procedimento de consulta completa de destino

procedimento consultaCompletaDestino()
inicio

   para i de 1 ate VALOR faca

      se cidade[i] = "" entao
         interrompa
      fimse

      escreval("Cidade: ",cidade[i])
      escreval("Estado: ",estado[i])
      escreval("Pa�s: ",pais[i])
      escreval("================================================================")
   fimpara
fimprocedimento

const
   VALOR = 100
var
   i,j:inteiro
   codigo:caractere
   resposta: caractere
   nome, email, cpf: vetor[1..VALOR] de caractere
   endereco: vetor[1..VALOR, 1..5] de caractere    //Vetor de duas dimens�es
   cidade, estado, pais: vetor[1..5] de caractere
   cadastroCliente,cadastroDestino:caractere   // Variavel que recebe o valor do procedimento
inicio

   resposta <- "s"

   enquanto (resposta = "s") ou (resposta = "S") faca
      escreval("==================================================================")
      escreval("                     Ag�ncia Agcap-Viagem                         ")
      escreval("==================================================================")

      escreval("")

      escreval("                     0 - Sair                                     ")
      escreval("                     1 - Cadastrar novo cliente                   ")
      escreval("                     2 - Cadastrar novo destino                   ")
      escreval("                     3 - Consultar cliente                        ")
      escreval("                     4 - Consultar destino                        ")
      escreval("                     5 - Consulta completa cliente                ")
      escreval("                     6 - Consulta completa destino                ")

      escreval("")
      escreva("Informe a op��o desejada: ")
      leia(codigo)
      limpatela

      escolha (codigo)

      caso "0"
         interrompa
      caso "1"
         escreval("------CADASTRO DE CLIENTE------")
         escreval("")
         cadastroCliente <- cadastroCliente()
      caso "2"
         escreval("------CADASTRO DE DESTINO------")
         escreval("")
         cadastroDestino <- cadastroDestino()
      caso "3"
         escreval("------CONSULTA DE CLIENTE------")
         escreval("")
         consultarCliente()
      caso "4"
         escreval("------CONSULTA DE DESTINO------")
         escreval("")
         consultarDestino()
      caso "5"
         escreval("------CONSULTA COMPLETA DE CLIENTE------")
         escreval("")
         consultaCompletaCliente()
      caso "6"
         escreval("------CONSULTA COMPLETA DE DESTINO------")
         escreval("")
         consultaCompletaDestino()
      outrocaso
         escreval("C�digo inexistente!")
      fimescolha

      escreva("Deseja continuar no sistema? S/N ")
      leia(resposta)

      limpatela
   fimenquanto
fimalgoritmo