# Requisitos Funcionais e Regras de Negócio - Aplicação de Restaurante

## Requisitos Funcionais

1. **Cadastro de Clientes**
   - A aplicação deve permitir o cadastro de clientes, armazenando informações como nome, telefone, e-mail e endereço.

2. **Cadastro de Funcionários**
   - A aplicação deve permitir o cadastro de funcionários, incluindo nome, cargo (garçom, cozinheiro, gerente), horário de trabalho e salário.

3. **Gestão de Cardápio**
   - A aplicação deve permitir o gerenciamento do cardápio, possibilitando a adição, remoção e edição de itens (nome do prato, ingredientes, preço).

4. **Realização de Pedidos**
   - A aplicação deve permitir que os clientes façam pedidos, selecionando itens do cardápio, e associando esses pedidos a uma mesa ou ao cliente em caso de delivery.

5. **Gerenciamento de Mesas**
   - A aplicação deve permitir o controle e gerenciamento das mesas do restaurante, mostrando se estão ocupadas ou disponíveis.

6. **Processamento de Pagamento**
   - A aplicação deve permitir o cálculo do valor total do pedido, permitindo múltiplas formas de pagamento (dinheiro, cartão de crédito, débito, pix).

7. **Relatórios de Vendas**
   - A aplicação deve gerar relatórios de vendas diários, mensais ou anuais, listando os pedidos realizados e os totais arrecadados.

8. **Gestão de Estoque**
   - A aplicação deve permitir o gerenciamento do estoque, atualizando automaticamente a quantidade de ingredientes disponíveis conforme os pratos são pedidos.

9. **Autenticação de Usuários**
   - A aplicação deve permitir o login e autenticação de funcionários e administradores, controlando o nível de acesso de acordo com a função (ex: cozinheiro pode ver pedidos, gerente pode ver relatórios).

10. **Controle de Delivery**
    - A aplicação deve permitir o controle de pedidos para entrega, registrando dados como endereço do cliente e status do pedido (em preparo, em rota, entregue).

## Regras de Negócio

1. **Desconto de Funcionários**
   - Funcionários cadastrados devem ter direito a um desconto de 20% em refeições no restaurante.

2. **Reserva de Mesas**
   - Clientes podem reservar mesas com até 24 horas de antecedência. Se o cliente não comparecer em até 15 minutos após o horário da reserva, a mesa volta a ficar disponível.

3. **Pedidos Mínimos para Delivery**
   - O valor mínimo para pedidos de delivery deve ser de R$ 30,00.

4. **Taxa de Serviço**
   - Deve ser adicionado automaticamente 10% do valor total do pedido como taxa de serviço em pedidos feitos nas mesas, a não ser que o cliente solicite a remoção.

5. **Limite de Produtos no Estoque**
   - O estoque de ingredientes deve ser atualizado sempre que um prato for preparado. Quando o estoque de algum ingrediente estiver abaixo de uma quantidade mínima, o sistema deve alertar o gerente.

6. **Divisão de Conta**
   - Deve ser possível dividir o valor da conta entre os clientes de uma mesma mesa, com a opção de dividir igualmente ou por consumo.

7. **Cancelamento de Pedidos**
   - O cancelamento de um pedido só pode ser feito antes de ele entrar em preparo. Após o preparo iniciado, o pedido não poderá ser cancelado, mas deve permitir registrar o motivo para controle.

8. **Formas de Pagamento Aceitas**
   - A aplicação deve aceitar pagamentos em dinheiro, cartão (crédito e débito) e pix, e em caso de pagamento com cartão, deve verificar a disponibilidade do terminal de pagamento.

9. **Pontos de Fidelidade**
   - Clientes cadastrados no sistema acumulam pontos a cada compra. A cada R$ 100,00 gastos, o cliente ganha um cupom de R$ 10,00 de desconto para ser usado em compras futuras.

## Estrutura em POO

Em termos de POO, as seguintes classes podem ser utilizadas:

### Cliente
- **Atributos**: nome, telefone, e-mail, endereço, pontosFidelidade.
- **Métodos**: fazerPedido(), reservarMesa(), pagarConta().

### Funcionário
- **Atributos**: nome, cargo, salario, horasTrabalhadas.
- **Métodos**: logar(), atenderCliente(), gerarRelatorioVendas().

### Pedido
- **Atributos**: id, cliente, listaDeItens (List<Item>), valorTotal, status.
- **Métodos**: calcularValorTotal(), adicionarItem(Item item), removerItem(Item item), cancelar().

### Item
- **Atributos**: nome, preco.
- **Métodos**: getters para nome e preco.

### Mesa
- **Atributos**: numero, capacidade, ocupada.
- **Métodos**: reservar(), liberar(), associarPedido(Pedido pedido).

### Estoque
- **Atributos**: listaIngredientes, quantidadeMinima.
- **Métodos**: atualizarEstoque(String ingrediente, int quantidade), alertarBaixa().

