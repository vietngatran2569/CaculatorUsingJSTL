<%--
  Created by IntelliJ IDEA.
  User: vietngatran
  Date: 06/11/2019
  Time: 09:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Caculator</title>
  </head>
  <body>
  <form action="/caculate" method="post">
    <h2>Caculator</h2>
    <label>First operand: </label>
    <input type="number" name="firstOperand"/>
    <br/>
    <h2>Operator: </h2>
    <select name="operator">
      <option value="+">Addition</option>
      <option value="-">Subtraction</option>
      <option value="*">Multiplication</option>
      <option value="/">Division</option>
    </select>
    <br/>
    <br/>
    <label>Second operand: </label>
    <input type="number" name="secondOperand"/>
    <br/>
    <br/>
    <input type="submit" value="Caculator">
  </form>
  </body>
</html>
