package org.gazzax.labs.jena.nosql.fwk.w3c;

import org.gazzax.labs.jena.nosql.fwk.SparqlSelectIntegrationTestCase;

/**
 * SPARQL Integration test with examples taken from http://www.w3.org/TR/sparql11-query.
 * 
 * @see http://www.w3.org/TR/sparql11-query/#matchingRDFLiterals
 * @author Andrea Gazzarini
 * @since 1.0
 */
public class Ch2_3_MatchingRDFLiterals_ITCase extends SparqlSelectIntegrationTestCase {

	@Override
	protected String chapter() {
		return "2.3";
	}
	
	@Override
	protected int howManyExamples() {
		return 3;
	}
}