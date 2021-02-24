package pickle;

public class STControl extends STEntry {
    
    SubClassif subClassif;
    
    /**
     * STControl Constructor
     * <p>
     * Instantiates STControls; calls STEntry constructor via super().
     * @param symbol        Symbol being put into SymbolTable.
     * @param primClassif   Primary Classification of symbol.   
     * @param subClassif    SubClassification of symbol.
     */
    public STControl(String symbol, Classif primClassif, SubClassif subClassif)
    {
        super(symbol, primClassif);
        this.subClassif = subClassif;    
    }
}
