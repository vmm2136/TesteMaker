<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Cadastro de Produtos</title>
</head>
<body>

<h2>Formulário de Cadastro de Produtos</h2>
<form:form method="POST" action="/produto/addProduto">
   <table>
    <tr>
        <td><form:label path="nome">Nome></form:label></td>
        <td><form:input path="nome" /></td>
    </tr>
    <tr>
        <td><form:label path="marca">Marca:</form:label></td>
        <td><form:textarea path="marca" /></td>
    </tr>
    <tr>
        <td><form:label path="departamento">Departamento:</form:label></td>
        <td><form:textarea path="departamento" /></td>
    </tr>
    <tr>
        <td><form:label path="cor">Cor</form:label></td>
        <td><form:textarea path="cor" /></td>
    </tr>
</table>
</form:form>
<a href="/produto/listaProdutos">Lista</a>

</body>
</html>