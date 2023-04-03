package api.endpoints;
/*
 * Swagger URl: https://petstore.swagger.io
 * 					  USER
 * Create user(POST):	https://petstore.swagger.io/v2/user
 * Read user(GET):		https://petstore.swagger.io/v2/user/{username}
 * Update user(PUT):	https://petstore.swagger.io/v2/user/{username}
 * Delete user(DELETE):	https://petstore.swagger.io/v2/user/{username}
 * 
 * 					 STORE
 * Create store(POST):	https://petstore.swagger.io/v2/store/order
 * Read store (GET):	
 */
public class Routes 
{
	//BaseURl
	public static String base_url="https://petstore.swagger.io/v2";
	//User Module
	public static String post_url=base_url+"/user";
	public static String get_url=base_url+"/user/{username}";
	public static String update_url=base_url+"/user/{username}";
	public static String delete_url=base_url+"/user/{username}";
	
	//Store Module
			//Here we will create the Store Module "URL's"
	
	//Pet Module
			//Here we will create the Pet Module "URL's"
}
