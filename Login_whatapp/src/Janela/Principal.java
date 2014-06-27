package Janela;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Principal extends JFrame {
	
	
	JFrame jf_frame;
	JPanel pn_painelBotoes, pn_principal, pn_organizaLogin, pn_organizaSenha;
	JLabel lb_login,lb_senha;
	JTextField tx_login, tx_senha;
	JButton bt_login, bt_sair;
	String[] login,senha;
	
	public void iniciacomponentes(){
		lb_login = new JLabel("Login: ");
		lb_senha = new JLabel("Senha: ");
		tx_login = new JTextField(10);
		tx_senha = new JTextField(10);
		bt_login = new JButton("Login");
		bt_sair = new JButton("Sair");
		pn_painelBotoes = new JPanel();
		pn_organizaLogin = new JPanel(new FlowLayout());
		pn_organizaSenha = new JPanel(new FlowLayout());
		pn_principal = new JPanel(new GridLayout(4,2));
		jf_frame = new JFrame();
		bt_login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				criaUsuarios();
				boolean saida=false;
				for (int i = 0; i < login.length; i++) {
					if((tx_login.getText().equals(login[i]))&&(tx_senha.getText().equals(senha[i]))){
						saida=true;
						break;
					}else{
						saida=false;
					}
				}
				if(saida == true){
					JOptionPane.showMessageDialog(null,"Usuario Correto.");
				}else{
					JOptionPane.showMessageDialog(null,"Usuario Incorreto.");
				}
			}
		});
		bt_sair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		pn_organizaLogin.add(lb_login);
		pn_organizaLogin.add(tx_login);
		pn_principal.add(pn_organizaLogin);
		pn_organizaSenha.add(lb_senha);
		pn_organizaSenha.add(tx_senha);
		pn_principal.add(pn_organizaSenha);
		pn_painelBotoes.add(bt_login);
		pn_painelBotoes.add(bt_sair);
		
		jf_frame.add(pn_painelBotoes, BorderLayout.SOUTH);
		jf_frame.add(pn_principal);
		
		jf_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf_frame.setResizable(false);
		jf_frame.setLocationRelativeTo(null);
        jf_frame.setSize(200,200);
        jf_frame.setVisible(true);
        jf_frame.setTitle("Login");
	}
	
	private void criaUsuarios(){
		this.login = new String[5];
		this.senha = new String[5];
		
		this.login[0] = "pedro"; 
		this.login[1] = "joao"; 
		this.login[2] = "paulo"; 
		this.login[3] = "medonho"; 
		this.login[4] = "admin"; 
		
		
		this.senha[0] = "000000"; 
		this.senha[1] = "111111"; 
		this.senha[2] = "222222"; 
		this.senha[3] = "333333"; 
		this.senha[4] = "444444"; 	
	}
	
	
	public static void main(String[] args) {
		Principal teste = new Principal();
		teste.iniciacomponentes();
	}
}
