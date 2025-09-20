import java.util.HashMap;

public class HttpRequest {


    String method;
    String path;
    HashMap<String, String> headers = new HashMap<>();
    String body;

    public HttpRequest(String method, String path, HashMap<String, String> headers, String body) {
        // initialize all fields
        this.method = method;
        this.path = path;
        this.headers = headers;
        this.body = body;
    }

    @Override
    public String toString() {
        String result = method + " " + path + " HTTP/1.1\n";

        for (String key : headers.keySet()) {
            result += key + ": " + headers.get(key) + "\n";
        }

        result += "\n";  // Blank line between headers and body
        result += body;

        return result;
    }



}
