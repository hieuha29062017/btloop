package query;

public class QueryString {
	//Đưa ra tên và tuổi của Ngô_Minh_Anh_31
	public static final String NAME_BASIC_QUERY_1 = "Đưa ra tên và tuổi của Ngô_Minh_Anh_31";
	public static final String BASIC_QUERY_1 = "prefix per:<http://EntityPerson.oop/>\r\n" + 
											   "prefix rela:<http://RelationOfEntity.oop/>\r\n" + 
											   "select *\r\n" + 
											   "where{\r\n" + 
											   "    per:Ngô_Minh_Anh_31 rela:hasName ?name.\r\n" + 
											   "    per:Ngô_Minh_Anh_31 rela:hasAge ?age.\r\n" + 
											   "}";
	
	//Đưa ra tất cả thông tin của Trương_Thị_Lâm_Oanh_1060
	public static final String NAME_BASIC_QUERY_2 = "Đưa ra tất cả thông tin của Trương_Thị_Lâm_Oanh_1060";
	public static final String BASIC_QUERY_2 = "prefix per:<http://EntityPerson.oop/>\r\n" + 
											   "prefix rela:<http://RelationOfEntity.oop/>\r\n" + 
											   "select ?name ?description ?link ?time\r\n" + 
											   "where{\r\n" + 
											   "    per:Trương_Thị_Lâm_Oanh_1060 rela:hasName ?name;\r\n" + 
											   "                                 rela:hasDescription ?description;\r\n" + 
											   "                                 rela:hasSource ?o.\r\n" + 
											   "    ?o rela:hasLink ?link;\r\n" + 
											   "       rela:updateAtTime ?time.\r\n" + 
											   "    							\r\n" + 
											   "}";
	public static final String BASIC_QUERY_3 = "";
	public static final String BASIC_QUERY_4 = "";
	public static final String BASIC_QUERY_5= "";
	public static final String BASIC_QUERY_6 = "";
	public static final String BASIC_QUERY_7 = "";
	public static final String BASIC_QUERY_8 = "";
	public static final String BASIC_QUERY_9 = "";
	public static final String BASIC_QUERY_10 = "";
	
	public static final String ADVANCED_QUERY_1 = "";
	public static final String ADVANCED_QUERY_2 = "";
	public static final String ADVANCED_QUERY_3 = "";
	public static final String ADVANCED_QUERY_4 = "";
	public static final String ADVANCED_QUERY_5 = "";
	public static final String ADVANCED_QUERY_6 = "";
	public static final String ADVANCED_QUERY_7 = "";
	public static final String ADVANCED_QUERY_8 = "";
	public static final String ADVANCED_QUERY_9 = "";
	public static final String ADVANCED_QUERY_10 = "";
}
