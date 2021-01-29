package notification.listener;

import notification.event.PrintEvent;

public interface PrintListener {
	void onPrint(PrintEvent e);
}