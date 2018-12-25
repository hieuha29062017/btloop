package graphdb;

import org.eclipse.rdf4j.repository.RepositoryConnection;
import org.eclipse.rdf4j.repository.RepositoryException;
import org.eclipse.rdf4j.repository.http.HTTPRepository;

public class GetConnection {
	private static final String SERVER_GRAPHDB_URL = "http://localhost:7200/";
	
	public static RepositoryConnection getGraphDBConnection(String serverID) throws RepositoryException {
	
		HTTPRepository repo = new HTTPRepository(SERVER_GRAPHDB_URL, serverID);
		repo.initialize();
		RepositoryConnection connection = repo.getConnection();
		return connection;
	}
}
