package exercicio;

import javax.swing.JOptionPane;

public class CadastroApp {

	public static void main(String[] args) {
		BancoDeClientes clientes = new BancoDeClientes(); 
		int op;
		String nome;
		String fone;
		int id,excluir,imprimir,t,ni;
		String nn,nf;
		
		do 
		{
			op = Integer.parseInt(JOptionPane.showInputDialog("o que deseja fazer:"
					+ "\n 1 - inserir"
					+ "\n 2 - listar um"
					+ "\n 3 - listar todos"
					+ "\n 4 - remover "
					+ "\n 5 - alterar "
					+ "\n 6 - sair "));
		
		if(op==1)
		{
			Cliente cliente = new Cliente(null, null, op);
			
			nome=(JOptionPane.showInputDialog("digite o nome:"));
			fone=(JOptionPane.showInputDialog("digite o telefone:"));
			id=Integer.parseInt(JOptionPane.showInputDialog("digite o id:"));
			
			cliente.setNome(nome);
			cliente.setFone(fone);
			cliente.setId(id);
			
			
			clientes.inserir(cliente);
		}
		
		if(op==2)
		{
			imprimir=Integer.parseInt(JOptionPane.showInputDialog("digite a posição do cliente que deseja imprimir:"));
			clientes.imprimirCliente(imprimir);
		}
		
		if(op==3)
		{
		
			clientes.imprimirClientes();
		}
		
		if(op==4)
		{
		excluir=Integer.parseInt(JOptionPane.showInputDialog("digite a posição  cliente que deseja excluir:"));
		  clientes.excluir(excluir);
		}
		
		if(op==5)
		{
			t=Integer.parseInt(JOptionPane.showInputDialog("digite a posição do  cliente que deseja trocar:"));
			nn=(JOptionPane.showInputDialog("digite o nome:"));
			nf=(JOptionPane.showInputDialog("digite o telefone:"));
			ni=Integer.parseInt(JOptionPane.showInputDialog("digite o id:"));
		
			clientes.alterar(nn,nf,ni,t);
		}
		}
		while(op!=6);

	}

	}


