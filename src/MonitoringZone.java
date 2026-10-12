public class MonitoringZone {
    int id;
    String name;
    String coordinates;
    String status;
    String monitoringLevel;

    public MonitoringZone() {
        this.id = 1;
        this.name = "Північний сектор";
        this.coordinates = "50.45, 30.52";
        this.status = "Активно";
        this.monitoringLevel = "Високий";
    }

    public MonitoringZone(int id, String name, String coordinates, String status, String monitoringLevel) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.status = status;
        this.monitoringLevel = monitoringLevel;
    }

    public void updateZoneStatus() {
    }

    public String toString() {
        return "Зона моніторингу: " +
                "id=" + id +
                ", Назва='" + name + '\'' +
                ", Координати='" + coordinates + '\'' +
                ", Статус='" + status + '\'' +
                ", Рівень моніторингу='" + monitoringLevel + '\'';
    }
}