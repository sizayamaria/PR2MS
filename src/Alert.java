public class Alert {
    int id;
    int eventId;
    String time;
    String type;
    String dangerLevel;
    String status;

    public Alert() {
        this.id = 101;
        this.eventId = 8945;
        this.time = "08:05";
        this.type = "Повітряна тривога";
        this.dangerLevel = "Високий";
        this.status = "Активно";
    }

    public Alert(int id, int eventId, String time, String type, String dangerLevel, String status) {
        this.id = id;
        this.eventId = eventId;
        this.time = time;
        this.type = type;
        this.dangerLevel = dangerLevel;
        this.status = status;
    }

    public void createAlert() {
    }

    public void displayAlert() {
    }

    public String toString() {
        return "Сповіщення: " +
                "id=" + id +
                ", ID події=" + eventId +
                ", Час='" + time + '\'' +
                ", Тип='" + type + '\'' +
                ", Рівень небезпеки='" + dangerLevel + '\'' +
                ", Статус='" + status + '\'';
    }
}