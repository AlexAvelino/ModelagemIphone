package Aparelho;

import aplicativos.AparelhoTelefonico;
import aplicativos.NavegadorInternet;
import aplicativos.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
	
	private int abasAbertas = 0;
	private String musicaReproduzindo;

	@Override
	public void tocar(String musica) {
		musicaReproduzindo = musica;
		System.out.println("Reproduzindo: " + musica);
	}

	@Override
	public void pausar() {
		System.out.println("Musica " + musicaReproduzindo + "Pausada");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Musica " + musica + " selecionada");
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Acessando: " + url + " ...");
		abasAbertas++;
		
	}

	@Override
	public void adicionarNovaAba() {
		++abasAbertas;
		System.out.println("Adicionando nova aba.");
		System.out.println("Abas abertas atualmente: " + abasAbertas);
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina web...");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada");
		
	}

	@Override
	public void iniciarCorrerioVoz(String msg) {
		System.out.println("Gravando correio de voz" + msg);
		
	}

}
