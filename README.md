# Api-Pizzaria

INTEGRANTES:
Arthur Estevam – Responsável pela entidade Pizza;
Davi dos Anjos – Responsável pela entidade Cliente;
Jordan de Lima – Documentação e correção de erros;
Stanley Kennedy – Responsável pela entidade Pizza.


A API de Pizzaria permite a gestão de clientes e pizzas. Ela fornece endpoints para criar, atualizar, deletar e consultar informações de clientes e pizzas. A API é simples e eficiente, facilitando o gerenciamento básico de um sistemas de pedidos de pizzas.
A entidade Cliente representa os dados de um cliente da pizzaria e contém as seguintes informações: nome(String), endereço(String) e número(Integer). A entidade Pizza representa os dados de uma pizza do cardápio e contém as seguintes informações: nome(String) e preço(Double). 

INSTALAÇÃO

Pré-requisitos:
•	Java 11 ou superior;

•	Maven ou Gradle para gerenciamento de dependências;

•	Banco de dados H2(usado para testes) ou outro banco de dados da sua escolha;

•	Spring Boot para framework de aplicação.



EndPoints da API

1.	Criar Pizza
   
   •	Verbo HTTP: POST

   •	EndPoint: /Pizzas

   •	Corpo da Requisição:
   
     {
     
       “String”: “Quatro queijo”,
       
       “Double”: “35.00”
       
     }

2.	Listar Pizza
   
      •	Verbo HTTP: GET
  	
      •	EndPoint: /Clientes
  	
      •	Resposta de Sucesso:


   
   [
   
     {

  	   “id” : 1,
  	
  	   “nome”: “Quatro queijo”,
  	
  	   “Double”: “35.00”,
  	
     }
     
   ]
   
3.	Buscar por Id:
   
   •	Verbo HTTP: GET
   
   •	EndPoint: /Clientes/{id}

5.	Deletar Cliente:
   
   •	Verbo HTTP: DELETE
   
   •	EndPoint: /Cliente/{id}

