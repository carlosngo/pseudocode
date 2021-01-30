package manager;

import error.exception.CompilationException;
import notification.listener.*;
import notification.event.*;

import java.util.ArrayList;

public class NotificationManager {
    private ArrayList<PseudocodeListener> listeners;

    public void addListener(PseudocodeListener listener) {
        listeners.add(listener);
    }

    public void removeListener(PseudocodeListener listener) {
        listeners.remove(listener);
    }

    public void notifyErrorListeners(SemanticErrorEvent e) {
        for (PseudocodeListener listener : listeners) {
            if (listener instanceof ErrorListener) {
                ((ErrorListener) listener).onSemanticError(e);
            }
        }
    }

    public void notifyErrorListeners(ANTLRErrorEvent e) {
        for (PseudocodeListener listener : listeners) {
            if (listener instanceof ErrorListener) {
                ((ErrorListener) listener).onANTLRError(e);
            }
        }
    }

    public void notifyPrintListeners(PrintEvent e) {
        for (PseudocodeListener listener : listeners) {
            if (listener instanceof PrintListener) {
                ((PrintListener) listener).onPrint(e);
            }
        }
    }

    public void notifyScanListeners(StartScanEvent e) {
        for (PseudocodeListener listener : listeners) {
            if (listener instanceof ScanListener) {
                ((ScanListener) listener).onScanStart(e);
            }
        }
    }

    public void notifyScanListeners(EndScanEvent e) {
        for (PseudocodeListener listener : listeners) {
            if (listener instanceof ScanListener) {
                ((ScanListener) listener).onScanEnd(e);
            }
        }
    }
}
