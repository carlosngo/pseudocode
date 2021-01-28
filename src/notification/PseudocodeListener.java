package notification;

import notification.event.PseudocodeEvent;

public interface PseudocodeListener {
    void onNotify(PseudocodeEvent e);
}
