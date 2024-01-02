package br.com.alura.loja.http.adapter;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

import br.com.alura.loja.adapter.HttpAdapter;

public class HttpAdapterClient implements HttpAdapter {

	@Override
	public void post(String url, Map<String, Object> dados) {

		try {
			URL urlApi = new URL(url);
			URLConnection urlConnection = urlApi.openConnection();
			urlConnection.connect();
		} 
		catch (Exception ex) {
			throw new RuntimeException("Erro ao enviar requisição HTTP!", ex);
		}

	}

}
