package Pedidos;

import Pedidos.Pedido;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class PedidoTest {
    @Test
    public  void tst(){
        Pedido pedido = new Pedido();
        StatusPedido statusPedido = pedido.getStatusPedido();
    }

    public void tst2(){
        Map<StatusPedido, List<Pedido>> relatorio = new HashMap<>();

        List<Pedido> pedidosAguardandoPagamento = new LinkedList<>();

        relatorio.put(StatusPedido.PENDENTE_PAGAMENTO, pedidosAguardandoPagamento);

        relatorio.get(StatusPedido.PENDENTE_PAGAMENTO);

        if(relatorio.containsKey(StatusPedido.ABERTO));

        for (StatusPedido statusPedido : relatorio.keySet()){
            List lista = relatorio.get(statusPedido);
        }
    }

}