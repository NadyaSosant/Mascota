/*Para el pago de paquetes es por medio de tarjeta, se le busca el número de cliente y a este
se le asigna un atributo tarjeta.
Para determinar el monto del pago de cada servicio contratado se le hace la sumatoria década
paquete y se aplica al cargo (double) de la tarjeta

Equipo:
-Sosa Santiago Nadya Cristina

*/

import java.util.HashMap;
import java.util.Map;

public class Pagos{

    private Map<String, Double> preciosPaquetes;

    public Pagos() {

        preciosPaquetes = new HashMap<>();
        
        preciosPaquetes.put("Baño", 100.0);
        preciosPaquetes.put("Corte", 150.0);
        preciosPaquetes.put("Desparasitación", 200.0);
        preciosPaquetes.put("Esterilización", 500.0);
    }

    // La tarea que realiza este metodo es calcular el monto total del pago

    public double calcularMontoTotal(String[] paquetes) {

        double montoTotal = 0.0;

        for (String paquete : paquetes) {

            montoTotal += preciosPaquetes.getOrDefault(paquete, 0.0);
        }

        return montoTotal;
    }

    // La tarea que realiza este metodo es aplicar el pago a la tarjeta del cliente
    //Se lanza un throw si el cliente no tiene tarjeta

    public void realizarPago(Cliente cliente, String[] paquetes) throws Exception {

        if (cliente.getTarjeta() == null) {

            throw new Exception("El cliente no tiene una tarjeta asignada");
        }
        
        double montoTotal = calcularMontoTotal(paquetes);
        // Aquí se realizaría la lógica para aplicar el cargo a la tarjeta del cliente
        // Por ejemplo, podrías llamar a una API de procesamiento de pagos
        System.out.println("Se ha realizado un cargo de " + montoTotal + " a la tarjeta del cliente " + cliente.getNumCliente());
    }
}
