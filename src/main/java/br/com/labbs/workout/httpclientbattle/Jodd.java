package br.com.labbs.workout.httpclientbattle;

import br.com.labbs.workout.httpclientbattle.shared.HttpClient;
import jodd.http.HttpRequest;
import jodd.http.HttpResponse;

@SuppressWarnings("unused")
public class Jodd implements HttpClient<HttpRequest, HttpResponse> {

    private final static String JODD = "Jodd";

    @Override
    public String getClientName() {
        return JODD;
    }

    @Override
    public HttpRequest newRequest(String url) {
        return HttpRequest.get(url);
    }

    @Override
    public void addHeaderToRequest(HttpRequest httpRequest, String key, String value) {
        httpRequest.header(key, value);
    }

    @Override
    public HttpResponse execRequest(HttpRequest httpRequest, int request_number) throws Exception {
        return httpRequest.send();
    }

    @Override
    public int getResponseStatusCode(HttpResponse httpResponse) {
        return httpResponse.statusCode();
    }
}
