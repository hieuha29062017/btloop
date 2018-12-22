package main;

import org.eclipse.rdf4j.repository.RepositoryConnection;
import org.eclipse.rdf4j.repository.RepositoryException;

import graphdbconnection.GetConnection;

public class Main {

	public static void main(String[] args){
		try {
			Process process = new Process();
			RepositoryConnection conn = GetConnection.getGraphDBConnection("btloop20181_100E200R");
			process.pushEntity(100, conn);
			process.createRelation(200, conn);
		}
		catch(RepositoryException repo) {
			System.err.println("ERROR ORCURED !!!");
			System.err.println("Turn on your local database !");
		}
		catch (Exception ex) {
			System.err.println("ERROR ORCURED !!!");
			ex.printStackTrace();
		}
	}
}
