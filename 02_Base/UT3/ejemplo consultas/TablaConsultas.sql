--13. Números de pedido y números de vendedor, para los pedidos solicitados el 15 de octubre de 1992.
SELECT numpedido, numvend FROM pedido WHERE fecha = TO_DATE('15/10/1992', 'DD/MM/YYYY');