package by.itacademy.multienvapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${app.environment}")
    private String environment;

    @Value("${app.message}")
    private String message;

    @Value("${server.port}")
    private String port;

    @GetMapping("/")
    public String hello() {
        return String.format(
                "🚀 Hello from %s environment!<br>" +
                        "📝 Message: %s<br>" +
                        "🔌 Port: %s<br>" +
                        "💡 Debug mode: %s",
                environment.toUpperCase(),
                message,
                port,
                System.getProperty("debug", "false")
        );
    }

    @GetMapping("/health")
    public String health() {
        return "✅ Healthy - Environment: " + environment;
    }

}
