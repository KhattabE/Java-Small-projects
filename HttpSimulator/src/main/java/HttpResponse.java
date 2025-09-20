import java.util.HashMap;

public class HttpResponse {

    int statusCode;
    String statusMessage;
    HashMap<String, String> headers = new HashMap<>();
    String body;

    public HttpResponse(int statusCode, String statusMessage, HashMap<String, String> headers, String body) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
        this.headers = headers;
        this.body = body;
    }

    @Override
    public String toString() {
        String result = "HTTP/1.1 " + statusCode + " " + statusMessage + "\n";

        for (String key : headers.keySet()) {
            result += key + ": " + headers.get(key) + "\n";
        }

        result += "\n";  // blank line before body
        result += body;

        return result;
    }


}
