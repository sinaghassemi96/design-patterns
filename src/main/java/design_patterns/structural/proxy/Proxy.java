package design_patterns.structural.proxy;

/**
 * This design pattern attempts to hide the service asset core from all clients
 * <pre>
 *     Proxy classes serve multiple functionalities:<ul>
 *         <li>Protection proxy: provides authorization</li>
 *         <li>Remote proxy: provides required API calls far from the user access</li>
 *         <li>Logger proxy: wraps the core methods between logger methods.</li>
 *         <li>Caching proxy: caches heavy and voluminous results to offer reliability.</li>
 *         <li>Smart reference proxy: manages the core dependency lifecycle and eradicates the injection if not used.</li>
 *     </ul>
 * </pre>
 */
public class Proxy {

    private static final ProxyRequest proxyRequest = new ProxyRequest();

    public static void main(String[] args) {
        proxyRequest.request();
    }

    static class Request {
        public void request() {
            System.out.println("Proxying Request");
        }
    }

    static class ProxyRequest {

        private final Request request;

        public ProxyRequest() {
            this.request = new Request();
        }

        private boolean isAuthenticated() {
            return true;
        }

        private void log(String log) {
            System.out.println(log);
        }

        public void request() {
            this.log("Proxy Request");
            if (this.isAuthenticated()) {
                this.request.request();
                this.log("Proxied Request");
            }
        }
    }

}
