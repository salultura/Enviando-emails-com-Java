import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class EmailComAnexo {

	public static void main(String[] args) {
		EmailAttachment anexo = new EmailAttachment();
		MultiPartEmail email = new MultiPartEmail();
		String destinatario = "";
		String remetente = "";
		String login = "";
		String senha = "";

		try {

			/* Anexando o arquivo */
			// Path Absoluto
			// anexo.setPath("D:\\Dev\\Projetos\\EclipseProjects\\EnviandoEmailsComJava\\lib\\img\\javamail.jpg");

			// Path relativo
			anexo.setPath("./lib/img/javamail.jpg");
			anexo.setDisposition(EmailAttachment.ATTACHMENT);
			anexo.setDescription("Uma simples imagem de teste");
			anexo.setName("Java Mail API");

			/* Envio do Email */

			// Endereco do servidor
			email.setHostName("smtp.googlemail.com");
			// Porta de conexao com o servidor
			email.setSmtpPort(465);
			// Autenticacao no servidor
			email.setAuthentication(login, senha);
			// Habilitando conexao segura com o servidor
			email.setSSLOnConnect(true);
			// Assunto do email
			email.setSubject("Teste de envio de um email com anexo.");
			// Remetente
			email.setFrom(remetente);
			// Corpo da mensagem do email
			email.setMsg("Aqui vai o corpo do email de teste");
			// Destinatio
			email.addTo(destinatario);

			// Anexando o arquivo ao email
			email.attach(anexo);

			// Enviar
			email.send();

			System.out.println("Email enviado com sucesso!");
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}

}
