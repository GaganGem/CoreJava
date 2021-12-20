package basicjava;

import java.util.Scanner;

public class Websitetest {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 {
			String website = sc.next();
			if(website.endsWith(".org")){
				System.out.println("this is an organisation website");
			}
				
				else if (website.endsWith(".com")) {
					System.out.println("this is a commercial website");
				}
					
					else if  (website.endsWith(".in")) {
						System.out.println("this is an indian website");
					}
		}
	    			
	    		}
	
	}


