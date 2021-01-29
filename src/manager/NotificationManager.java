package manager;

import notification.PseudocodeListener;
import notification.event.PseudocodeEvent;

import java.util.ArrayList;

public class NotificationManager {
    private ArrayList<PseudocodeListener> listeners;

    public void addListener(PseudocodeListener listener) {
        listeners.add(listener);
    }

    public void removeListener(PseudocodeListener listener) {
        listeners.remove(listener);
    }

    public void notifyListeners(PseudocodeEvent e) {
        for (PseudocodeListener listener : listeners) {
            listener.onNotify(e);
        }
    }
}
