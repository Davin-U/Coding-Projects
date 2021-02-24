package pickle;

public class STFunction extends STEntry {
    
    SubClassif returnType;
    SubClassif definedBy;
    int numArgs;
    // ArrayList<String> parmList;
    // SymbolTable symbolTable;
    
    /**
     * STFunction Constructor
     * <p>
     * Instantiates STFunctions; calls STEntry constructor via super().
     * @param symbol        Symbol being put into SymbolTable.
     * @param primClassif   Primary Classification of symbol.   
     * @param returnType    Symbol being put into SymbolTable.
     * @param definedBy     Built-in Function, or User-Defined Function.
     * @param numArgs       Optional number of args.
     */
    public STFunction(String symbol, Classif primClassif, SubClassif returnType, SubClassif definedBy, int ...numArgs)
    {
        super(symbol, primClassif);
        this.returnType = returnType;
        this.definedBy = definedBy;
        this.numArgs = numArgs.length;
        // this.parmList = parmList;
        // this.symbolTable = symbolTable;
    }
}
