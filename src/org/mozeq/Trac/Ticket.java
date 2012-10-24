package org.mozeq.Trac;

import java.util.Date;
import java.util.HashMap;


public class Ticket {
	private final String SUMMARY = "summary";
	private final String COMPONENT = "component";

	int id = 0;
	Date time_created = null;
	Date time_changed = null;
	HashMap<String, String> attributes = null;

	@SuppressWarnings("unchecked")
	public Ticket(Object[] o){
	   //[id, time_created, time_changed, attributes].
	   int i;
	   for(i=0; i < o.length; i++) {
		   if (i == 0) id = (Integer)o[i];
		   if (i == 1) time_created = (Date) o[i];
		   if (i == 2) time_changed = (Date) o[i];
		   if (i == 3) attributes = (HashMap<String, String>)o[i];
	   }
   }

   public String toString() {
	   return "id: " +id +"\ntime_created: " + time_created + "\nsummary: " + attributes;
   }

   public String getSummary() {
	   return attributes.get(SUMMARY);
   }

   public String getComponent() {
	   return attributes.get(COMPONENT);
   }

   public int getID() {
	   return id;
   }
}
