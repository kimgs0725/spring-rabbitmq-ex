package hello.kgs.rabbitmqex.dto;

public class CustomMessage {
    private String message;
    private int priority;
    private boolean secret;

    protected CustomMessage() {}

    public CustomMessage(String message, int priority, boolean secret) {
        this.message = message;
        this.priority = priority;
        this.secret = secret;
    }

    public String getMessage() {
        return message;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isSecret() {
        return secret;
    }

    @Override
    public String toString() {
        return "CustomMessage{" +
                "text='" + message + '\'' +
                ", priority=" + priority +
                ", secret=" + secret +
                '}';
    }
}
