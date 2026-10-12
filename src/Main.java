public class Main {
    public static void main(String[] args) {
        MonitoringZone zone1 = new MonitoringZone(1, "Південний сектор", "46.48, 30.73", "Активно", "Середній");
        Alert alert1 = new Alert(501, 8945, "08:02", "Загроза БПЛА", "Високий", "Новий");
        Message message1 = new Message(10, "08:03", "Увага! Зафіксовано невідомий об'єкт.", "Оператор");

        System.out.println(zone1);
        System.out.println(alert1);
        System.out.println(message1);
    }
}