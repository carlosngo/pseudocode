package notification.listener;

import notification.event.PrintEvent;

public interface PrintListener extends PseudocodeListener {
	void onPrint(PrintEvent e);
}