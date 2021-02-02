package antlr.visitor.expression;

import antlr.PseudocodeParserBaseVisitor;
import manager.FunctionManager;
import manager.NotificationManager;
import manager.ProgramManager;
import manager.VariableManager;

public class BooleanExpressionVisitor extends PseudocodeParserBaseVisitor<Boolean> {
    private final ProgramManager programManager;
    private final VariableManager variableManager;
    private final FunctionManager functionManager;
    private final NotificationManager notificationManager;
    private final boolean isCompiling;

    public BooleanExpressionVisitor(ProgramManager programManager
            , boolean isCompiling) {
        this.programManager = programManager;
        functionManager = programManager.getFunctionManager();
        variableManager = functionManager
                .getCurrentFunction()
                .getVariableManager();
        notificationManager = programManager.getNotificationManager();
        this.isCompiling = isCompiling;
    }



}
