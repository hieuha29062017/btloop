package query;

import org.eclipse.rdf4j.model.Value;
import org.eclipse.rdf4j.query.Binding;
import org.eclipse.rdf4j.query.BindingSet;
import org.eclipse.rdf4j.query.QueryLanguage;
import org.eclipse.rdf4j.query.TupleQuery;
import org.eclipse.rdf4j.query.TupleQueryResult;
import org.eclipse.rdf4j.repository.RepositoryConnection;


public class PrintResult {
	private String query;
	
	public PrintResult(String re) {
		query = re;
	}
	
	public void PrintQueryResult(RepositoryConnection conn) {
		try {
			TupleQuery tuple = conn.prepareTupleQuery(QueryLanguage.SPARQL, query);
			
			long start = System.currentTimeMillis();
			TupleQueryResult result = tuple.evaluate();
			long end = System.currentTimeMillis();
		
			System.out.println("Result:");
			if(!result.hasNext()) System.out.println("\t No Result!");
			while(result.hasNext()) {
				BindingSet solutions = result.next();
			
				for(Binding binds : solutions) {
					String name = binds.getName();
					Value value = binds.getValue();
				
					System.out.println("\t" + name + ":  " + value.stringValue());
				}
			}
			System.out.println("Time : " + (end - start) + "ms");
		}
		catch(Exception ex) {
			System.out.println("An error orcur when querying!");
		}
		finally {
			conn.close();
		}
	}
}
