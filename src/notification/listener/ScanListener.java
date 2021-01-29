package notification.listener;

import notification.event.*;

public interface ScanListener {
	void onScanStart(StartScanEvent e);
	void onScanEnd(EndScanEvent e);
}	