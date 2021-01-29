package notification;

import notification.event.*;

public interface PseudocodeListener {
    void onPrint(PrintEvent e);
    void onScanStart(StartScanEvent e);
    void onScanEnd(EndScanEvent e);
    void onSemanticError(SemanticErrorEvent e);
    void onANTLRError(ANTLRErrorEvent e);
}
