import java.util.HashMap;

public class Main {

    public static void main(String[] args){



        HashMap<String, String> requestHeaders = new HashMap<>();
        requestHeaders.put("Content-Type", "text/plain");

        HttpRequest request = new HttpRequest("GET", "/hello", requestHeaders, "");
        System.out.println("Client sends:\n" + request);

        HttpResponse response;

        if (request.path.equals("/hello")) {
            HashMap<String, String> responseHeaders = new HashMap<>();
            responseHeaders.put("Content-Type", "text/plain");

            response = new HttpResponse(200, "OK", responseHeaders, "Hello from server!");
        } else {
            HashMap<String, String> responseHeaders = new HashMap<>();
            responseHeaders.put("Content-Type", "text/plain");

            response = new HttpResponse(404, "Not Found", responseHeaders, "Oops, page not found.");
        }

        System.out.println("\nServer responds:\n" + response);



    }



    }



