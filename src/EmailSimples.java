import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailSimples {

	public static void main(String[] args) {
		Email email = new SimpleEmail();
		String destinatario = null;
		String remetente = null;
		String login = null;
		String senha = null;
		
		try {
			//Endereco do servidor
			email.setHostName("smtp.googlemail.com");
			//Porta de conexao com o servidor
			email.setSmtpPort(465);
			//Autenticacao no servidor
			email.setAuthentication(login, senha);
			//Habilitando conexao segura com o servidor
			email.setSSLOnConnect(true);
			//Assunto do email
			email.setSubject("Teste de envio de um email simples.");
			//Remetente
			email.setFrom(remetente);
			//Corpo da mensagem do email
			email.setMsg("Aqui vai o corpo do email de teste");
			//Destinatio
			email.addTo(destinatario);
			//Enviar
			email.send();

			System.out.println("Email enviado com sucesso!");
		} catch (EmailException e) {
			e.printStackTrace();
		}

	}

}
