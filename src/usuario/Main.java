package usuario;

import Aparelho.Iphone;

public class Main {

		public static void main(String[] args) {
			Iphone iphone = new Iphone();
			
			iphone.tocar("Faroeste caboclo");
			iphone.ligar("49028922");
			iphone.exibirPagina("facebook.com");
			iphone.adicionarNovaAba();
			iphone.pausar();
			iphone.atualizarPagina();
			iphone.selecionarMusica("Roda gigante");
			iphone.atender();
			iphone.iniciarCorrerioVoz("me retorne depressa");
		}
}
