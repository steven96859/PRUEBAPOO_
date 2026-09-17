package org.example;

import java.util.LinkedList;

public class GestionFilaBanco {

    private LinkedList<String> filaclientes;
    public void gestionFilaBanco(){
        this.filaclientes= new LinkedList<>();

    }
    public void agregarClienteNormal(String nombre){
        if (nombre == null || nombre.trim().isEmpty()){
            System.out.println("error el nombre no puede estar vacio");
            return;
        }
        System.out.println("cliente normal '" + nombre.trim() + "' agregado a la lista");

    }
    public void agregarClienteVIP( String nombre){
        if (nombre == null || nombre.trim().isEmpty()){
            System.out.println("error el nombre no puede esatr vacio ");
            return;
        }
        System.out.println("cliente vip '"+ nombre.trim()+ "' agregado a la lista al frente");
    }

    public void atenderSiguienteCliente(){
        String clienteAtendido = filaclientes.poll();
        if (clienteAtendido != null){
            System.out.println("atendiendo al cliente"+ clienteAtendido);

        }
        else {
            System.out.println("la fila esta vacia");
        }
    }
}
