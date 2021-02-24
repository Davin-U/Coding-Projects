package pickle;

public class STIdentifier extends STEntry {
    
    SubClassif dclType;
    String structure;
    String parm;
    int nonLocal;
    
    /**
     * STIdentifier Constructor
     * <p>
     * Instantiates STIdentifiers; calls STEntry constructor via super().
     * @param symbol        Symbol being put into SymbolTable.
     * @param primClassif   Primary Classification of symbol.   
     * @param dclType       Declaration type.
     * @param structure     
     * @param parm          
     * @param nonLocal      
     */
    public STIdentifier(String symbol, Classif primClassif, SubClassif dclType, String structure, String parm, int nonLocal)
    {
        super(symbol, primClassif);
        this.dclType = dclType;
        this.structure = structure;
        this.parm = parm;
        this.nonLocal = nonLocal;
    }
}
