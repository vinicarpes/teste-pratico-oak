# Teste prático para processo seletivo de estágio na Oak Tecnologia

Esse sistema CRUD simples foi desenvolvido para a minha participação no processo seletivo da empresa supracitada.

A aplicação foi feita com Java 17, utilizando Spring MVC. Ela consiste em um sistema de registro de produtos, nos quais os principais requisitos são:

- Listar produtos
- Cadastrar produtos
- Ao cadastrar um produto, a página de listagem deve ser carregada

Para rodar a aplicação você deve:

- Possuir JDK 
- Possuir MySQL instalado e configurado
- Modificar, em application.properties, o usuário e senha para acesso ao MySQL
- Criar uma tabela Produtos no banco de dados

# Requisitos solicitados pela empresa

𝐂𝐚𝐝𝐚𝐬𝐭𝐫𝐨:

- Formulário com os campos abaixo:

  - Nome do produto - campo de texto
  - Descrição do produto - campo de texto
  - Valor do produto - campo de valor
  - Disponível para venda - campo com 2 opções: sim / não

𝐋𝐢𝐬𝐭𝐚𝐠𝐞𝐦:

- Colunas da listagem: nome, valor
- Ordenação por valor do menor para o maior
- Quando cadastrar um novo produto é para abrir a listagem automaticamente
- Deve existir um botão para cadastrar um novo produto a partir da listagem
