package exercicio;

import java.util.ArrayList;

public class BancoDeClientes {
ArrayList<Cliente> clientes;
	
	public BancoDeClientes()
	{
		clientes = new ArrayList<Cliente>();
	}
	
	public void inserir(Cliente cliente)
	{
		clientes.add(cliente);
	}
	
	
	public void imprimirCliente(int s) 
	{
		int i = 0;
	
		
		for(i =s; i<=s; i++)
		 {
			 System.out.println("Lista ["+i+"] = nome: "+ clientes.get(i).getNome()+" fone: " + clientes.get(i).getFone()+ " id: " + clientes.get(i).getId());
			
		 }
		 System.out.println("");
	}

	
	public void imprimirClientes() 
	{
		int i = 0;
		
		for(Cliente cliente : clientes)
		 {
			 System.out.println("Lista ["+i+"] = nome: "+ cliente.getNome()+" fone: " + cliente.getFone()+ " id: " + cliente.getId());
			 i++;
		 }
		 System.out.println("");
	}

	public void excluir(int i) {
		clientes.remove(i);
		
	}
	
	public void alterar(String novoNome,  String novoFone, int novaId, int s) {
		int i=0;
		
	    for ( i = s; i <=s ; i++) {
	    
	            clientes.get(i).setNome(novoNome);
	            clientes.get(i).setFone(novoFone);
	            clientes.get(i).setId(novaId);
	             
	    }
	}
}
