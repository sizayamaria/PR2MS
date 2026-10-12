public class Message {
    int id;
    String timestamp;
    String content;
    String sender;

    public Message() {
        this.id = 1;
        this.timestamp = "08:10";
        this.content = "Зафіксовано новий повітряний об'єкт";
        this.sender = "Система моніторингу";
    }

    public Message(int id, String timestamp, String content, String sender) {
        this.id = id;
        this.timestamp = timestamp;
        this.content = content;
        this.sender = sender;
    }

    public void sendMessage() {
    }

    public void archiveMessage() {
    }

    public String toString() {
        return "Повідомлення: " +
                "id=" + id +
                ", Час='" + timestamp + '\'' +
                ", Зміст='" + content + '\'' +
                ", Відправник='" + sender + '\'';
    }
}