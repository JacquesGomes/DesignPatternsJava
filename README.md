# Padroes_Projetos_Java
Explorando padrões de projetos em Java

Repositório destinado praticar padrões de projetos em Java, utilizando tanto Java Puro como Spring.

### Elementos essenciais de um design pattern

-> Problema: serve para contextualizar as situações em que o padrão é aplicável, incluindo exemplos de situações em que o padrão é eficiente.

-> Solução: descrição abstrata de como um modo de organizar as classes e objetos resolverá o problema. A natureza abstrata da solução permite que o padrão seja adaptável e possa ser aplicado em diversas situações, servindo como um template.

-> Consequências: pros e contras em aplicar o padrão. Nesse ponto, é importante levantar explicitamente as implicações de adotar um padrão, tanto na parte de complexidade de espaço e tempo, com em aspectos da linguagem, implementação, o impacto na flexibilidade, escalabilidade, portabilidade, etc.

--- 

### Riscos no uso de padrões

-> Reinventar a roda: em alguns casos, já existem ferramentas modernas que podem ser utilizadas para substituir certos padrões.

-> Risco de ser utilizado como dogma: seguir padrões de forma rígida e sem considerar o contexto, pode levar a ineficiências.

-> Uso injustificado: tendências de buscar utilizar padrões em qualquer oportunidade, até em situações em que um código simples e objetivo seria suficiente.


---

### Padrão comportamental

Os padrões comportamentais estão relacionados ao modelo de interação e de divisão de responsabilidade entre objetos e classes.

<div width="500px">
<h3 align="center">Exemplos</h3>
<ul>
> Observer

- Problema: existe uma dependeẽncia entre objetos, onde a alteração de um objeto precisa ser refletida em outro objetos automaticamente.
- Solução: uso de sujeitos e observadores, onde o sujeito pode refletir suas mudanças nos objetos que estiverem registrados como observadores, ou seja, na pŕatica o sujeito poderá manter uma lista de observadores e um método para notificar ou alterar todos os observadores de acordo com uma mudança.
- Pros: É possível introduzir novos observadores sem haver mudança no código do sujeito observado, e vice-versa; é possível estabelecer relações entre objetos durante a execução.
- Cons: os observadores são notificados em uma ordem aleatória.
</ul>

<h3></h3>
<ul>
> Strategy

- Problema: uma mesma tarefa pode ter diferentes modos de ser resolvida.
- Solução: uma classe que possui diversas formas de resolver algo específico, deverá quebrar essas soluções em classes chamadas 'strategies'. A classe original fará referência às estratégias, e o cliente que informará qual a solução apropriada.
- Pros: é possível trocar algoritmos durante a execução; é possível introduzir novas soluções em modificar a classe original.
- Cons: linguagens modernas possuem mecanismos para implementar as soluções dentro de funções, sem haver a necessidade de criar classes, objetos, interfaces, etc.; o cliente deve ser capaz de fazer a escolha de forma correta.
</ul>
<div>
Outros exemplos: chain of responsability; iterator; template method.

---

### Padrão estrutural

Os padrões estruturais estão relacionados à composição de classes e objetos. Discute o uso de objetos e classes para montar estruturais maiores, sem perder a flexibilidade e eficiência.

<h3 align="center">Exemplos</h3>
<pre width="100%">
> Padrão: Adapter

- Problema: dois objetos são incompatíveis, mas precisam interagir. Além disso, a modificação dos objetos não é interessante/possível.
- Solução: um adaptador é construído ao redor de um objeto ou classe, para tornar a interação com o outro objeto ou classe possível.
- Solução: um adaptador é construído ao redor do objeto, para tornar a interação com o outro objeto possível.
- Pros: é possível adicionar novos adaptadores sem impactar o código existente.
- Cons: complexidade aumenta com a adição de novas interfaces e classes.
        </pre>


Outros exemplos: adapter; bridge; composite; decorator; facade; flyweight; proxy.

---

### Padrão criacional

Está relacionado ao modelo de criação de objetos, com o intuito de aumentar a flexibilidade e reutilização do código.

<h3 align="center">Exemplos</h3>
<pre>
> Padrão: Factory method

- Problema: null.
- Solução: null.
- Solução: unull.
- Pros: null.
- Cons: null.
</pre>

Outros exemplos: abstract factory; builder;  factory method; prototype; singleton.

