package Singleton;

public class Usuario {
	private static String nome;
	private static String cpf;
	private static String grupo; //admin ou user
	private static String email;
    private static Usuario uniqueInstance;
    
    
    private Usuario(String nome, String cpf, String grupo, String email) {
	Usuario.nome = nome;
	Usuario.cpf = cpf;
	Usuario.grupo = grupo;
	Usuario.email = email;
    }
 
    public synchronized static Usuario obterUsuario() {
        if (uniqueInstance == null) {
        uniqueInstance = new Usuario(nome, cpf, grupo, email);	
        }
        return uniqueInstance;
    }

    void enviarEmail(final String email){
	System.out.println("Olá, "+nome+"! Este é um e-mail.");
    }

}