package notification.listener;

import notification.event.SemanticErrorEvent;

public interface SemanticErrorListener extends PseudocodeListener {
	void onSemanticError(SemanticErrorEvent e);
}