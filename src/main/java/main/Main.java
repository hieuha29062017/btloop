package main;

import java.util.Scanner;

import org.eclipse.rdf4j.repository.RepositoryConnection;
import graphdb.GetConnection;
import model.AddToRepository;
import query.PrintResult;
import query.QueryString;

public class Main {

	public static void main(String[] args){
		
		System.out.println("===================PROGRAM====================");
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			System.out.println("\n\n");
			System.out.println("\tMENU:\n");
			System.out.println("1.Up Load Data.");
			System.out.println("2.Query.");
			System.out.println("3.Exit.");
		
			int choise = sc.nextInt();
			switch (choise) {
			case 1:
				System.out.println("1. 100 Entities 200 Relations.");
				System.out.println("2. 5k Entities 7k Relations.");
				System.out.println("3. 60k Entities 80k Relations.");
				System.out.println("4. 600k Entities 1M Relations.");
				System.out.println("5. 1M Entities 2M Relations.");
				
				int choise1 = sc.nextInt();
				switch (choise1) {
				case 1:
					addRepository("btloop20181_100E200R", 100, 200);
					break;
				case 2:
					addRepository("btloop20181_5kE7kR", 5000, 7000);
					break;
				case 3:
					addRepository("btloop20181_60kE80kR", 60000, 80000);
					break;
				case 4:
					addRepository("btloop20181_600kE1MR", 600000, 1000000);
					break;
				case 5:
					addRepository("btloop20181_1ME2MR", 1000000, 2000000);
					break;
				default:
					break;
				}			
				break;
			case 2: 
				System.out.println("Choose server:");
				System.out.println("1. 100 Entities 200 Relations.");
				System.out.println("2. 5k Entities 7k Relations.");
				System.out.println("3. 60k Entities 80k Relations.");
				System.out.println("4. 600k Entities 1M Relations.");
				System.out.println("5. 1M Entities 2M Relations.");
				String repoID = "";
				int choise2 = sc.nextInt();
				switch (choise2) {
				case 1:
					repoID += "btloop20181_100E200R";
					break;
				case 2:
					repoID += "btloop20181_5kE7kR";
					break;
				case 3:
					repoID += "btloop20181_60kE80kR";
					break;
				case 4:
					repoID += "btloop20181_600kE1MR";
					break;
				case 5:
					repoID += "btloop20181_1ME2MR";
					break;
				default:
					break;
				}
				RepositoryConnection conn = GetConnection.getGraphDBConnection(repoID);
				System.out.println("chose query: ");
				System.out.println("\t1.Basic Query : " + QueryString.NAME_BASIC_QUERY_1);
				int choise3 = sc.nextInt();
				switch (choise3) {
				case 1:
					PrintResult result0 = new PrintResult(QueryString.BASIC_QUERY_1);
					result0.PrintQueryResult(conn);
					break;
				case 2:
					PrintResult result1 = new PrintResult(QueryString.BASIC_QUERY_2);
					result1.PrintQueryResult(conn);
					break;
				default:
					break;
				}
				break;
			default :
				loop = false;
				break;
			}
		}		
	}	
	
	
	private static void addRepository(String RepoID, int numberEntities, int numberRelation) {
		try {
			AddToRepository process = new AddToRepository();
			RepositoryConnection conn = GetConnection.getGraphDBConnection(RepoID);
			process.pushEntity(numberEntities, 100000, conn);
			process.pushRelation(numberRelation, 100000, conn);
			System.out.println("done!");
		}
		catch (Exception ex) {
			System.err.println("An unknown error orcured !!!");
			ex.printStackTrace();
		}
	}
}
