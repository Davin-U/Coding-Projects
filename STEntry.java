package pickle;

public class STEntry {
    
    String symbol;
    Classif primClassif;
    
    /**
     * STEntry Constructor
     * <p>
     * Instantiates STEntries; is called by subclasses via super().
     * @param symbol        Symbol being put into SymbolTable.
     * @param primClassif   Primary Classification of symbol.
     */
    public STEntry(String symbol, Classif primClassif)
    {
        this.symbol = symbol;
        this.primClassif  = primClassif;
    }
    
}
