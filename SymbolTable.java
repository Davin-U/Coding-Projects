package pickle;

import java.util.HashMap;

public class SymbolTable 
{
    // Not sure where/how this is used... yet.
    public int VAR_ARGS;
    
    public HashMap <String, STEntry> ht;
    
    /**
     * SymbolTable Constructor
     * <p>
     * Instantiates SymbolTable as HashMap and fills Global table.
     */
    public SymbolTable()
    {
        ht = new HashMap<String, STEntry>();
        initGlobal();
    }
    
    /**
     * getSymbol
     * <p>
     * Returns STEntry for given symbol.
     * @param symbol    Symbol in SymbolTable.
     * 
     * @return          STEntry for given symbol in SymbolTable.
     */
    public STEntry getSymbol(String symbol)
    {
        //returns the symbol table entry for the given symbol
        //null check here or wherever getSymbol is called error throws whatever
        return ht.get(symbol);
        
    }
    
    /**
     * putSymbol
     * <p>
     * Sorts STEntry into SymbolTable at given symbol.
     * @param symbol    Symbol going into SymbolTable.
     * @param entry     STEntry going into SymbolTable.
     */
    public void putSymbol(String symbol, STEntry entry)
    {
        //may need exist check
        ht.put(symbol, entry);
    }
    
    /**
     * initGlobal fills Global SymbolTable with common pickle symbols 
     * and their classifications.
     * <p>
     * Makes use of STEntry classes and subclasses and is called as part 
     * of the SymbolTable constructor.
     */
    private void initGlobal()
{
    ht.put("def", new STControl("def", Classif.CONTROL, SubClassif.FLOW));
    ht.put("enddef", new STControl("enddef", Classif.CONTROL, SubClassif.END));

    ht.put("if", new STControl("if", Classif.CONTROL, SubClassif.FLOW));
    ht.put("endif", new STControl("endif", Classif.CONTROL, SubClassif.END));
    ht.put("else", new STControl("else", Classif.CONTROL, SubClassif.END));

    ht.put("for", new STControl("for",Classif.CONTROL, SubClassif.FLOW));
    ht.put("endfor", new STControl("endfor", Classif.CONTROL, SubClassif.END));

    ht.put("while", new STControl("while", Classif.CONTROL, SubClassif.FLOW));
    ht.put("endwhile", new STControl("endwhile", Classif.CONTROL, SubClassif.END));

    ht.put("Int", new STControl("Int",Classif.CONTROL, SubClassif.DECLARE));
    ht.put("Float", new STControl("Float",Classif.CONTROL, SubClassif.DECLARE));
    ht.put("String", new STControl("String",Classif.CONTROL, SubClassif.DECLARE));
    ht.put("Bool", new STControl("Bool",Classif.CONTROL, SubClassif.DECLARE));
    ht.put("Date", new STControl("Date",Classif.CONTROL, SubClassif.DECLARE));

    ht.put("print", new STFunction("print", Classif.FUNCTION, SubClassif.VOID, SubClassif.BUILTIN, VAR_ARGS));

    ht.put("LENGTH", new STFunction("LENGTH", Classif.FUNCTION, SubClassif.INTEGER, SubClassif.BUILTIN, VAR_ARGS));
    ht.put("MAXLENGTH", new STFunction("MAXLENGTH", Classif.FUNCTION, SubClassif.INTEGER, SubClassif.BUILTIN, VAR_ARGS));
    ht.put("SPACES", new STFunction("SPACES", Classif.FUNCTION, SubClassif.INTEGER, SubClassif.BUILTIN, VAR_ARGS));
    ht.put("ELEM", new STFunction("ELEM", Classif.FUNCTION, SubClassif.INTEGER, SubClassif.BUILTIN, VAR_ARGS));
    ht.put("MAXELEM", new STFunction("MAXELEM", Classif.FUNCTION, SubClassif.INTEGER, SubClassif.BUILTIN, VAR_ARGS));

    ht.put("and", new STEntry("and", Classif.OPERATOR));
    ht.put("or", new STEntry("or", Classif.OPERATOR));
    ht.put("not", new STEntry("not", Classif.OPERATOR));
    ht.put("in", new STEntry("in", Classif.OPERATOR));
    ht.put("notin", new STEntry("notin", Classif.OPERATOR));
}

}
