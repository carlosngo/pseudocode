package notification.listener;

import notification.event.*;

public interface ScanListener extends PseudocodeListener {
	void onScanStart(ScanStartEvent e);
	void onScanEnd(ScanEndEvent e);
}