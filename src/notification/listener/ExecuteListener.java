package notification.listener;

import notification.event.ExecuteErrorEvent;
import notification.event.ExecuteStartEvent;
import notification.event.ExecuteSuccessEvent;

public interface ExecuteListener extends PseudocodeListener {
    void onExecuteStart(ExecuteStartEvent e);
    void onExecuteSuccess(ExecuteSuccessEvent e);
    void onExecuteError(ExecuteErrorEvent e);
}
