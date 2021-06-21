package AlertService;
//  MapAlertDAO implements AlertDAO interface: Correct answer
//  AlertService accepts AlertDAO in its constructor: Correct answer
//  The raiseAlert and getAlertTime methods use AlertDAO passed through constructor: Wrong answer
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

class MapAlertDAO implements AlertDAO{
    private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();

    public UUID addAlert(Date time) {
        UUID id = UUID.randomUUID();
        this.alerts.put(id, time);
        return id;
    }

    public Date getAlert(UUID id) {
        return this.alerts.get(id);
    }

    public static void main (String args[]){
        AlertService alertService = new AlertService(new MapAlertDAO());
    }
}