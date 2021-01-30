package notification.listener;

import notification.event.*;

public interface ScanListener extends PseudocodeListener {
	void onScanStart(StartScanEvent e);
	void onScanEnd(EndScanEvent e);
}