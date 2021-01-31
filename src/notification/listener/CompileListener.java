package notification.listener;

import notification.event.CompileErrorEvent;
import notification.event.CompileStartEvent;
import notification.event.CompileSuccessEvent;

public interface CompileListener extends PseudocodeListener {
    void onCompileStart(CompileStartEvent e);
    void onCompileSuccess(CompileSuccessEvent e);
    void onCompileError(CompileErrorEvent e);
}
