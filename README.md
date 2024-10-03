<h1>INTEGRANTES:</h1>

+ Arthur Estevam – Responsável pela entidade Pizza;
+ Davi dos Anjos – Responsável pela entidade Cliente;
+ Jordan de Lima – Documentação;
+ Stanley Kennedy – Responsável pela entidade Pizza.

<h1>Descrição</h1>
<h4>A API de Pizzaria permite a gestão de clientes e pizzas. Ela fornece endpoints para criar, atualizar, deletar e consultar informações de clientes e pizzas. A API é simples e eficiente, facilitando o gerenciamento básico de um sistemas de pedidos de pizzas. A entidade Cliente representa os dados de um cliente da pizzaria e contém as seguintes informações: nome(String), endereço(String) e número(Integer). A entidade Pizza representa os dados de uma pizza do cardápio e contém as seguintes informações: nome(String) e preço(Double).</4>

<h2>INSTALAÇÃO</h2>
<h3>Pré-requisitos:</h3>

+ Java 11 ou superior;
+ Maven ou Gradle para gerenciamento de dependências;
+ Banco de dados H2(usado para testes) ou outro banco de dados da sua escolha;
+ Spring Boot para framework de aplicação.

<h2>Passos de Instalação</h2>

Clonar o repositório;

Após o clone, navegue até a pasta do projeto;

Configure o Banco de Dados;

Execute a aplicação;

Acesse o banco de dados H2

<h3>EndPoints da API</h3>

<h3>1.	Criar Pizza</h3>
   
      •	Verbo HTTP: POST

      •	EndPoint: /Pizzas

      •	Corpo da Requisição:
   
     {
     
       “String”: “Quatro queijo”,
       
       “Double”: “35.00”
       
     }

<h3>2.	Listar Pizza</h3>
   
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
   
<h3>3.	Buscar por Id:</h3>
   
      •	Verbo HTTP: GET
   
      •	EndPoint: /Clientes/{id}

<h3>4.	Deletar Pizza:</h3>
   
      •	Verbo HTTP: DELETE
   
      •	EndPoint: /Cliente/{id}

