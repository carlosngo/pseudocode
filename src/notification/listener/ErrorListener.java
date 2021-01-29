package notification.listener;

import notification.event.SemanticErrorEvent;
import notification.event.ANTLRErrorEvent;

public interface ErrorListener extends PseudocodeListener {
	void onSemanticError(SemanticErrorEvent e);
	void onANTLRError(ANTLRErrorEvent e);
}