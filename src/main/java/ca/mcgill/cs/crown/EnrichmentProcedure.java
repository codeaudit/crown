package ca.mcgill.cs.crown;

import edu.mit.jwi.IDictionary;

public interface EnrichmentProcedure {

    /**
     * Identifies the appropriate position in the WordNet semantic network for
     * the provided {@code LexicalEntry} and returns a {@code
     * AnnotatedLexicalEntry} describing the specifics of how the entry should
     * be integrated into the network or {@code null} if this procedure was
     * unable to integrate the entry.
     */
    AnnotatedLexicalEntry integrate(LexicalEntry e);

    /**
     * Sets the dictionary used by this procedure for determining where to
     * attach new entries.
     */
    void setDictionary(IDictionary dictionary);
}
