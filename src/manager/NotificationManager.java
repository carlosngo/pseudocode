package manager;

import notification.listener.*;
import notification.event.*;

import java.util.ArrayList;

public class NotificationManager implements Manager {
    private final ArrayList<PseudocodeListener> listeners;

    public NotificationManager() {
        listeners = new ArrayList<>();
    }

    public void addListener(PseudocodeListener listener) {
        listeners.add(listener);
    }

    public void removeListener(PseudocodeListener listener) {
        listeners.remove(listener);
    }

    public void notifyErrorListeners(SemanticErrorEvent e) {
        for (PseudocodeListener listener : listeners) {
            if (listener instanceof SemanticErrorListener) {
                ((SemanticErrorListener) listener).onSemanticError(e);
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

    public void notifyScanListeners(ScanStartEvent e) {
        for (PseudocodeListener listener : listeners) {
            if (listener instanceof ScanListener) {
                ((ScanListener) listener).onScanStart(e);
            }
        }
    }

    public void notifyScanListeners(ScanEndEvent e) {
        for (PseudocodeListener listener : listeners) {
            if (listener instanceof ScanListener) {
                ((ScanListener) listener).onScanEnd(e);
            }
        }
    }

    public void notifyCompileListeners(CompileStartEvent e) {
        for (PseudocodeListener listener : listeners) {
            if (listener instanceof CompileListener) {
                ((CompileListener) listener).onCompileStart(e);
            }
        }
    }

    public void notifyCompileListeners(CompileSuccessEvent e) {
        for (PseudocodeListener listener : listeners) {
            if (listener instanceof CompileListener) {
                ((CompileListener) listener).onCompileSuccess(e);
            }
        }
    }

    public void notifyCompileListeners(CompileErrorEvent e) {
        for (PseudocodeListener listener : listeners) {
            if (listener instanceof CompileListener) {
                ((CompileListener) listener).onCompileError(e);
            }
        }
    }

    public void notifyExecuteListeners(ExecuteStartEvent e) {
        for (PseudocodeListener listener : listeners) {
            if (listener instanceof ExecuteListener) {
                ((ExecuteListener) listener).onExecuteStart(e);
            }
        }
    }

    public void notifyExecuteListeners(ExecuteSuccessEvent e) {
        for (PseudocodeListener listener : listeners) {
            if (listener instanceof ExecuteListener) {
                ((ExecuteListener) listener).onExecuteSuccess(e);
            }
        }
    }

    public void notifyExecuteListeners(ExecuteErrorEvent e) {
        for (PseudocodeListener listener : listeners) {
            if (listener instanceof ExecuteListener) {
                ((ExecuteListener) listener).onExecuteError(e);
            }
        }
    }

    @Override
    public void reset() {
        listeners.clear();
    }
}
