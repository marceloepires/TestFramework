package files;

public class resources {
    public static String getJsonPostResourceCreate(){
        return "/maps/api/place/add/json";
    }

    public static String getXmlPostResourceCreate(){
        return "/maps/api/place/add/xml";
    }

    public static String getJsonPostResourceDelete(){
        return "/maps/api/place/delete/json";
    }
    
    public static String getXmlPostResourceDelete(){
    	return "/maps/api/place/delete/xml";
    }
}
