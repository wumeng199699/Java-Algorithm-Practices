package AlertService;

import java.util.Date;
import java.util.UUID;

class AlertService {
    private final MapAlertDAO storage = new MapAlertDAO();
    public AlertDAO alertDAO;

    public AlertService (AlertDAO alertDAO){
        this.alertDAO = alertDAO;
    }

    public UUID raiseAlert() {
        return this.storage.addAlert(new Date());
    }

    public Date getAlertTime(UUID id) {
        return this.storage.getAlert(id);
    }
}
