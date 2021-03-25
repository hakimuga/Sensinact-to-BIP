package ressources.utility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.sensinact.studio.language.sensinact.DSL_ElseIfDo;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_And;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Diff;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Division;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Equal;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Larger_Equal;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Minus;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Modulo;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Multiplication;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Or;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Plus;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Expression_Smaller_Equal;
import org.eclipse.sensinact.studio.language.sensinact.DSL_ListActions;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Boolean;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Number;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Object_Ref;
import org.eclipse.sensinact.studio.language.sensinact.DSL_REF_CONDITION;
import org.eclipse.sensinact.studio.language.sensinact.DSL_Resource;
import org.eclipse.sensinact.studio.language.sensinact.DSL_ResourceAction;
import org.eclipse.sensinact.studio.language.sensinact.Sensinact;
import org.eclipse.core.runtime.Path;

import com.google.inject.matcher.Matcher;
public class Utility {

	public Utility() {
		// TODO Auto-generated constructor stub
	}
	
	public static String filename;
	
	
	public static String getFilename(URI uri){
	
		String filePath = uri.toPlatformString(true);
		IFile ifile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(filePath));
		filename = ifile.getName().substring(0, ifile.getName().lastIndexOf("."));
		
	return filename;
	}
	
	public static String getnotifyports(Sensinact sensinact){
		String port ="";		

		 for(int i=0; i<sensinact.getEca().getOn().getTriggers().size();i++){
		
		 DSL_REF_CONDITION dsl_cond = sensinact.getEca().getOn().getTriggers().get(i);
		 
		 for( int j=0; j<sensinact.getEca().getResources().size();j++){
		   DSL_Resource dsl_resource=sensinact.getEca().getResources().get(j) ;
		   
		   	if (dsl_cond.getRef().getName().equals(dsl_resource.getName())) 
				{  port = port + "export port PORT_NOTIFY_"+dsl_resource.getGatewayID() +"_" +dsl_resource.getDeviceID()+"_" + dsl_resource.getServiceID()+"_" +dsl_resource.getResourceID()+ " NOTIFY_"+dsl_resource.getGatewayID() +"_" +dsl_resource.getDeviceID()+"_" + dsl_resource.getServiceID()+"_" +dsl_resource.getResourceID()+"() \n";
				
					//port+="NOTIFY_"+dsl_resource.getGatewayID() +"_" +dsl_resource.getDeviceID()+"_" + dsl_resource.getServiceID()+"_" +dsl_resource.getResourceID()+") \n" ;
				}
	   }
		 }
	return port;
	
	
}

	public static String getsettersports(Sensinact sensinact){
		String actions ="";	

		actions = actions +notIn(getsettersactions(sensinact.getEca().getEca().getIfdo().getActions(), sensinact),actions) ;

		 

		 if(sensinact.getEca().getEca().getElseIfdo().size()==0) {
			 if(sensinact.getEca().getEca().getElsedo()!=null){
				
					 actions = actions + notIn(getsettersactions(sensinact.getEca().getEca().getElsedo().getActions(), sensinact),actions) ;
					
					 
				
			 }
		 			 
		 }
		 else{
				for (int i=0;i< sensinact.getEca().getEca().getElseIfdo().size();i++){
					
					 if(sensinact.getEca().getEca().getElsedo()!=null){
					actions = actions + notIn(getsettersactions(sensinact.getEca().getEca().getElsedo().getActions(), sensinact),actions);
					 }
					
				}
				if(sensinact.getEca().getEca().getElsedo()!=null){
					 if(sensinact.getEca().getEca().getElsedo().getActions().getActionList().size()!=0){
						 actions = actions + notIn(getsettersactions(sensinact.getEca().getEca().getElsedo().getActions(), sensinact),actions) ;
					 }	}
		 }
		 //actions ="export port PORT_TASK_"+filename+"_SET set("+actions.substring(0, actions.lastIndexOf(",")) +")\n";
		 
		 
		 if (actions.contains(",")){actions= actions.replace(",", "");}
		 
		 	return actions;	
	
	
}

	public static String getgettersports(Sensinact sensinact){
		String actions ="";	

		actions = actions +notIn(getgettersactions(sensinact.getEca().getEca().getIfdo().getActions(), sensinact),actions) ;

		 

		 if(sensinact.getEca().getEca().getElseIfdo().size()==0) {
			 if(sensinact.getEca().getEca().getElsedo()!=null){
				 actions = actions + notIn(getgettersactions(sensinact.getEca().getEca().getElsedo().getActions(), sensinact),actions) ;
			 }
		 			 
		 }
		 else{
				for (int i=0;i< sensinact.getEca().getEca().getElseIfdo().size();i++){
					 if(sensinact.getEca().getEca().getElsedo()!=null){
					actions = actions + notIn(getgettersactions(sensinact.getEca().getEca().getElsedo().getActions(), sensinact),actions);
					 }
				}
				 if(sensinact.getEca().getEca().getElsedo()!=null){
					 if(sensinact.getEca().getEca().getElsedo().getActions().getActionList().size()!=0){
						
						 actions = actions + notIn(getgettersactions(sensinact.getEca().getEca().getElsedo().getActions(), sensinact),actions) ;
						 }
				    }	
		 }


			
			actions = actions + notIn(expressionGetToBip(sensinact.getEca().getEca().getIfdo().getCondition(),  sensinact),actions);

			 
				for (int i=0;i< sensinact.getEca().getEca().getElseIfdo().size();i++){
					
					DSL_ElseIfDo elseifdo= sensinact.getEca().getEca().getElseIfdo().get(i);
					
					actions += notIn(expressionGetToBip(elseifdo.getCondition(),  sensinact),actions);				
				}
				
			//if(actions.lastIndexOf(",")!= -1){
			//	actions = actions.substring(0, actions.lastIndexOf(","))+")\n";
			//}else{
			//	actions = "export port PORT_TASK_"+filename+"_GET get("+actions +")\n";
			//}
		 	return actions;	
	
	
}
	
	public static String getPlaces(Sensinact sensinact){//composed places
		String place ="";	

		// for(int i=0; i<sensinact.getEca().getOn().getTriggers().size();i++){
			 place = place + "START"+" ,";
		 //}
		 //place = place.substring(0, place.lastIndexOf(","));
			 


					int k=1;
					int next = 0;
					int j=0;
					
					String initial ="_SET";
					 sensinact.getEca().getEca().getIfdo().getCondition();
					 place = place+ getsetInterraction(sensinact, j, initial, next, sensinact.getEca().getEca().getIfdo().getActions());
					 j=j+1;
					 
					 if(sensinact.getEca().getEca().getElseIfdo().size()==0) {
						 if(sensinact.getEca().getEca().getElsedo()!=null){
							 place = place+ getsetInterraction(sensinact,j, initial, next ,sensinact.getEca().getEca().getElsedo().getActions());
						 }
					 			 
					 }
					 else{
							for (int i=0;i< sensinact.getEca().getEca().getElseIfdo().size();i++){
								
								DSL_ElseIfDo elseifdo= sensinact.getEca().getEca().getElseIfdo().get(i);
								 
								place = place+ getsetInterraction(sensinact,j, initial, next,elseifdo.getActions());
								 
								 j=j+1;
							}
							 if(sensinact.getEca().getEca().getElsedo()!=null){
								 if(sensinact.getEca().getEca().getElsedo().getActions().getActionList().size()!=0){
									 place = place+ getsetInterraction(sensinact,j, initial, next,sensinact.getEca().getEca().getElsedo().getActions());
								 }	
							 }
					 }

					 
		 return place;
	}

	public static String getInitialPlaces(Sensinact sensinact){// set initial places
		String place ="START";	

		 //place = place.substring(0, place.lastIndexOf(","));
		 return place;
	}

	public static String getOnInterraction(Sensinact sensinact){// set on triggered interaction
		String port ="";	

		 for(int i=0; i<sensinact.getEca().getOn().getTriggers().size();i++){
				
		 DSL_REF_CONDITION dsl_cond = sensinact.getEca().getOn().getTriggers().get(i);
		 
		 for( int j=0; j<sensinact.getEca().getResources().size();j++){
		   DSL_Resource dsl_resource=sensinact.getEca().getResources().get(j) ;
		   
		  // DSL_Resource dsl_resource=sensinact.getEca().getResources().get(j) ;
		   
		   if (dsl_cond.getRef().getName().equals(dsl_resource.getName())) 
			{ 
		  // port = port + "on PORT_"+dsl_resource.getGatewayID() +"_" +dsl_resource.getDeviceID()+"_" + dsl_resource.getServiceID()+"_" +dsl_resource.getResourceID() + " from"+ " START"+ " to E"+ "  \n";
			   port = port + "on NOTIFY_"+dsl_resource.getGatewayID() +"_" +dsl_resource.getDeviceID()+"_" + dsl_resource.getServiceID()+"_" +dsl_resource.getResourceID() + " from"+ " START"+ " to G"+ "  \n";
				
			}	
	   }
		 }
		 return port;
	}
	
	public static String getnotification(Sensinact sensinact){
		String port ="on TASK_"+filename+"_subscribe from ";	

		// for(int i=0; i<sensinact.getEca().getOn().getTriggers().size();i++){
			 port = port + "E";//+i +", ";
		// }
		 //port = port+ " to G do {";
		 port = "do {";
		 //return port;
		 for(int i=0; i<sensinact.getEca().getOn().getTriggers().size();i++){
				
		 DSL_REF_CONDITION dsl_cond = sensinact.getEca().getOn().getTriggers().get(i);
		 
		 for( int j=0; j<sensinact.getEca().getResources().size();j++){
		   DSL_Resource dsl_resource=sensinact.getEca().getResources().get(j) ;

				//if (dsl_cond.getRef().getName().equals(dsl_resource.getName())) 
				//{ 
					port+=dsl_resource.getGatewayID() +"_" +dsl_resource.getDeviceID()+"_" + dsl_resource.getServiceID()+"_" +dsl_resource.getResourceID()+"=-1000;" ;
				//}

	   }
		 
		 }port += "}\n";return port;//+port.substring(0, port.lastIndexOf("||")); 
	//	 	return port+")";
	}

	public static String getNotnotification(Sensinact sensinact){
		String port ="on TASK_"+filename+"_unsubscribe from ";	
//         on TASK_«Utility.filename»_unsubscribe from S0 to START provided ( !(« Utility.getnotification(sensinact)»))    
		
			 port = port +" E ";
		 
		// port = port.substring(0, port.lastIndexOf(","));
		 port = port + " to " ;
		
			 port = port + "START";
		
		 
		 //port = port.substring(0, port.lastIndexOf(","));
		 
		 port = port+ " provided  ( !(";
		 for(int i=0; i<sensinact.getEca().getOn().getTriggers().size();i++){
				
		 DSL_REF_CONDITION dsl_cond = sensinact.getEca().getOn().getTriggers().get(i);
		 
		 for( int j=0; j<sensinact.getEca().getResources().size();j++){
		   DSL_Resource dsl_resource=sensinact.getEca().getResources().get(j) ;

				if (dsl_cond.getRef().getName().equals(dsl_resource.getName())) 
				{ 
					port+="NOTIFY_"+dsl_resource.getGatewayID() +"_" +dsl_resource.getDeviceID()+"_" + dsl_resource.getServiceID()+"_" +dsl_resource.getResourceID()+"==1 || " ;
				}

	   }
		
		 } port = port.substring(0, port.lastIndexOf("||")); 
		 	return port+"))\n";
	}
	
public static String getIfElseStates(Sensinact sensinact){
		String states ="";	
		int k=2;
		
		 sensinact.getEca().getEca().getIfdo().getCondition();
		// EList<DSL_ElseIfDo>
				
		for (int i=0;i< sensinact.getEca().getEca().getElseIfdo().size();i++){
			
			DSL_ElseIfDo elseifdo= sensinact.getEca().getEca().getElseIfdo().get(i);
			states = states + ", S"+k+ " ";
		}
		 	return states;			
	}

public static String getInterraction(Sensinact sensinact){
	int k=0;
	int j=k+1;
	String action = "";
	String getters =Utility.getgettersports(sensinact);
	Pattern pattern = Pattern.compile("PORT_(.*)_GET");
    java.util.regex.Matcher m = pattern.matcher(getters);
    while(m.find()) {
    	action += "on get"+m.group(1)+ " from G to G \n";
    }
	
	return action;
	
}
public static String setIfElseStates(Sensinact sensinact){
	String states ="// INTERNAL BEHAVIOR \n";	
	int k=1;
	int next = 0;
	int j=0;
	ArrayList <String> past_cond = new ArrayList <String>();
	String initial ="_SET";
	 sensinact.getEca().getEca().getIfdo().getCondition();
	 states += "on TASK_"+ filename+"_t"+j+ " from G"+ " to "  +"t"+j+initial + next+" provided ("+ expressionToBip(sensinact.getEca().getEca().getIfdo().getCondition(),  sensinact) +") do {" + getifelseactions(sensinact.getEca().getEca().getIfdo().getActions(), sensinact) +"}\n";
	 states = states+ setInterraction(sensinact, j, initial, next, sensinact.getEca().getEca().getIfdo().getActions());
	 j=j+1;
	 
	 past_cond.add(expressionToBip(sensinact.getEca().getEca().getIfdo().getCondition(),  sensinact));
	 if(sensinact.getEca().getEca().getElseIfdo().size()==0) {
		 if(sensinact.getEca().getEca().getElsedo()!=null){
			 states += "on TASK_"+ filename+"_t"+j+ " from G"+ " to " + "t"+j+initial  + next+ " provided ( !("+ list_past_cond(past_cond) +") ) do {" + getifelseactions(sensinact.getEca().getEca().getElsedo().getActions(), sensinact) +"}\n";
			 states = states+ setInterraction(sensinact,j, initial, next ,sensinact.getEca().getEca().getElsedo().getActions());
		 }
	 			 
	 }
	 else{
			for (int i=0;i< sensinact.getEca().getEca().getElseIfdo().size();i++){
				
				DSL_ElseIfDo elseifdo= sensinact.getEca().getEca().getElseIfdo().get(i);
				//states = states + ", S"+k+ " ";
				 states += "on TASK_"+ filename+"_t"+j+ " from G"+ " to " + "t"+j+initial  + next+ " provided ( !("+ list_past_cond(past_cond) +") && (" +expressionToBip(elseifdo.getCondition(),  sensinact)+") ) do {" + getifelseactions(elseifdo.getActions(), sensinact) +"} \n";
				 
				 past_cond.add(expressionToBip( elseifdo.getCondition() ,  sensinact) );
				 
				 states = states+ setInterraction(sensinact,j, initial, next,elseifdo.getActions());
				 
				 j=j+1;
			}
			 if(sensinact.getEca().getEca().getElsedo()!=null){
				 if(sensinact.getEca().getEca().getElsedo().getActions().getActionList().size()!=0){
					 states += "on TASK_"+ filename+"_t"+j+ " from G"+ " to " + "t"+j+initial  + next+ " provided ( !("+ list_past_cond(past_cond) +") ) do {" + getifelseactions(sensinact.getEca().getEca().getElsedo().getActions(), sensinact) +"} \n";
				
					 states = states+ setInterraction(sensinact,j, initial, next,sensinact.getEca().getEca().getElsedo().getActions());
				 }	
			 }
	 }

	 	return states;			
}

public static String setInterraction(Sensinact sensinact, int j, String initial, int next, DSL_ListActions dsl_ListActions){
	int k=1;
	String action="// SEND THE OUTPUTS  \n";

	for (int i=0;i< dsl_ListActions.getActionList().size();i++){
		DSL_ResourceAction ressource = dsl_ListActions.getActionList().get(i);
		int nnext=next+1;
		if(i==dsl_ListActions.getActionList().size()-1){
			action = action + "on set"+getRessourcesFromRef(ressource.getRef().getName(), sensinact)+ " from t"+j+initial+next + " to " + "START \n \n";
			
			
		}else{
			action = action + "on set"+getRessourcesFromRef(ressource.getRef().getName(), sensinact)+ " from t"+j+initial+next + " to " + "t"+j+initial+nnext+" \n";
			
		}
		
		next=next+1;
		k++;
		
	}
	
	 
	//action+=Utility.setInterraction(sensinact);
	 
	String port="START";
	
	return action;
}

public static String getsetInterraction(Sensinact sensinact, int j, String initial, int next, DSL_ListActions dsl_ListActions){
	int k=1;
	String action="";

	for (int i=0;i< dsl_ListActions.getActionList().size();i++){
		DSL_ResourceAction ressource = dsl_ListActions.getActionList().get(i);
		int nnext=next+1;
		if(i==dsl_ListActions.getActionList().size()-1){
			action = action + " t"+j+initial+i + ", ";
			
			
		}else{
			action = action + " t"+j+initial+i+", ";
			
		}
		
		next=next+1;
		k++;
		
	}
	//f(action.length()>0){action=action.substring(0, action.length());}
	
	return action;
}

public static String getSilentPorts(Sensinact sensinact){
	String states ="";	
	int k=1;
	int j=0;

	 states = "port State TASK_"+ filename+"_t"+j+ "() \n";
	 j=j+1;
	 if(sensinact.getEca().getEca().getElseIfdo().size()==0) {
		 if(sensinact.getEca().getEca().getElsedo()!=null){
			 states += "port State TASK_"+ filename+"_t"+j+ "()\n";
		 }
	 			 
	 }
	 else{
			for (int i=0;i< sensinact.getEca().getEca().getElseIfdo().size();i++){
				
				DSL_ElseIfDo elseifdo= sensinact.getEca().getEca().getElseIfdo().get(i);
				//states = states + ", S"+k+ " ";
				 states += "port State TASK_"+ filename+"_t"+j+ "()\n"; j =j+1;
				
			}
			
			 if(sensinact.getEca().getEca().getElsedo()!=null){
				 if(sensinact.getEca().getEca().getElsedo().getActions().getActionList().size()!=0){
					 states += "port State TASK_"+ filename+"_t"+j+ "()\n";
				 }	
			 }
				 
	 }

	 	return states;		
}

public static String getifelseactions(DSL_ListActions dsl_ListActions, Sensinact sensinact){
	
	String doactions="";
	
	for (int i=0;i< dsl_ListActions.getActionList().size();i++){
		DSL_ResourceAction ressource = dsl_ListActions.getActionList().get(i);
		doactions = doactions + getRessourcesFromRef(ressource.getRef().getName(), sensinact);
		
		if (ressource.getActiontype().equals("act")){
			doactions = doactions+ "=";
			if (ressource.getListParam()==null){
				doactions = doactions + "1 ;";
			}else{
				doactions = doactions + "(";
				for(int j=0; j<ressource.getListParam().getParam().size();j++){
					
					DSL_Expression dsl_expression = ressource.getListParam().getParam().get(j);
					
			
					
					doactions = doactions + expressionToBip(dsl_expression,  sensinact)+",";
				}
				doactions = doactions.substring(0, doactions.lastIndexOf(","))+") ;";												
						
			}
			}

	}
	
	return doactions;
	
}

public static String getRessourcesFromRef(String ref, Sensinact sensinact){
	
	String ressource_name="";
	 for( int j=0; j<sensinact.getEca().getResources().size();j++){
		   DSL_Resource dsl_resource=sensinact.getEca().getResources().get(j) ;

				if (ref.equals(dsl_resource.getName())) 
				{ 
					ressource_name=dsl_resource.getGatewayID() +"_" +dsl_resource.getDeviceID()+"_" + dsl_resource.getServiceID()+"_" +dsl_resource.getResourceID() ;
				}

	   }
	 return ressource_name;
}

public static String list_past_cond(ArrayList <String> past_cond){

	String set_cond = "";
	
	for (int i=0;i<past_cond.size();i++){
		set_cond+=past_cond.get(i) + " && ";
	}
	return set_cond.substring(0, set_cond.lastIndexOf("&&"));
}

// set the connector inputs outputs
public static String getInOutNotifyPorts(Sensinact sensinact){
	String port=""; 
	for(int i=0; i<sensinact.getEca().getOn().getTriggers().size();i++){
			
	 DSL_REF_CONDITION dsl_cond = sensinact.getEca().getOn().getTriggers().get(i);
	 
	 for( int j=0; j<sensinact.getEca().getResources().size();j++){
	   DSL_Resource dsl_resource=sensinact.getEca().getResources().get(j) ;

			if (dsl_cond.getRef().getName().equals(dsl_resource.getName())) 
			{ 
				port+="s.NOTIFY_TASK_"+filename+"_"+dsl_resource.getGatewayID() +"_" +dsl_resource.getDeviceID()+"_" + dsl_resource.getServiceID()+"_" +dsl_resource.getResourceID()+" = " + "m.NOTIFY_TASK_"+filename+"_"+dsl_resource.getGatewayID() +"_" +dsl_resource.getDeviceID()+"_" + dsl_resource.getServiceID()+"_" +dsl_resource.getResourceID() + ";\n";
			}

	 }
	 //port = port.substring(0, port.lastIndexOf(","));
	 }
	
	
	 port = port + expressionPortToBip(sensinact.getEca().getEca().getIfdo().getCondition(),  sensinact);

	 
			for (int i=0;i< sensinact.getEca().getEca().getElseIfdo().size();i++){
				
				DSL_ElseIfDo elseifdo= sensinact.getEca().getEca().getElseIfdo().get(i);
				
				 port += expressionPortToBip(elseifdo.getCondition(),  sensinact);				
			}
	
	port = port + setIfElseActions(sensinact);
	
	return port;
}

public static String setIfElseActions(Sensinact sensinact){
	String actions ="";	

	actions = actions +getifelsePortsactions(sensinact.getEca().getEca().getIfdo().getActions(), sensinact) ;

	 

	 if(sensinact.getEca().getEca().getElseIfdo().size()==0) {
		 if(sensinact.getEca().getEca().getElsedo().getActions().getActionList().size()!=0){
			 actions = actions + getifelsePortsactions(sensinact.getEca().getEca().getElsedo().getActions(), sensinact) ;
		 }
	 			 
	 }
	 else{
			for (int i=0;i< sensinact.getEca().getEca().getElseIfdo().size();i++){
				
				actions = actions + getifelsePortsactions(sensinact.getEca().getEca().getElsedo().getActions(), sensinact);
				
			}
				 if(sensinact.getEca().getEca().getElsedo().getActions().getActionList().size()!=0){
					 actions = actions + getifelsePortsactions(sensinact.getEca().getEca().getElsedo().getActions(), sensinact) ;
				 }	
	 }

	 	return actions;			
}

public static String getifelsePortsactions(DSL_ListActions dsl_ListActions, Sensinact sensinact){
	
	String doactions="";
	
	for (int i=0;i< dsl_ListActions.getActionList().size();i++){
		DSL_ResourceAction ressource = dsl_ListActions.getActionList().get(i);
		doactions = doactions + "m."+getRessourcesFromRef(ressource.getRef().getName(), sensinact)+ "=" +"s."+getRessourcesFromRef(ressource.getRef().getName(), sensinact)+"; \n";
		
	}
	
	return doactions;
	
}

public static String getsettersactions(DSL_ListActions dsl_ListActions, Sensinact sensinact){
	
	String doactions="";
	
	for (int i=0;i< dsl_ListActions.getActionList().size();i++){
		DSL_ResourceAction ressource = dsl_ListActions.getActionList().get(i);
		
		 
		doactions = doactions + "export port PORT_" + getRessourcesFromRef(ressource.getRef().getName(), sensinact)+ "_SET" +" set" + getRessourcesFromRef(ressource.getRef().getName(), sensinact) +"("+getRessourcesFromRef(ressource.getRef().getName(), sensinact) + ") \n";
		 
		 
				
	}
	
	//doactions = doactions.substring(0, doactions.lastIndexOf(",")) ;
	return doactions;
	
}
public static String getgettersactions(DSL_ListActions dsl_ListActions, Sensinact sensinact){
	
	String doactions="";
	
	for (int i=0;i< dsl_ListActions.getActionList().size();i++){// get getters from actions
		DSL_ResourceAction ressource = dsl_ListActions.getActionList().get(i);
		
		
		if(ressource.getListParam()!=null){
			
		
		for (int j=0;j< ressource.getListParam().getParam().size();j++){
			DSL_Expression exp = ressource.getListParam().getParam().get(j);
			
			
			doactions = doactions + "" + notIn(expressionGetToBip(exp, sensinact),doactions);
			
			
		}
		}
		
		//doactions = doactions + "" + expressionGetToBip(exp, sensinact)+ ",";
		
		
	}


	return doactions;
	
}
static String txt="";

static String notIn(String str, String action){
	String stri="";
	List<String> strs = Arrays.asList(str.split("\\s*,\\s*"));	
	System.out.println(strs+ "-----" + action);
		for(int j=0 ; j<strs.size();j++ ){
			if (!action.contains(strs.get(j)))
			{
				if(action.length()==0){stri =stri+strs.get(j);}
				else{stri =stri+","+strs.get(j);}
				
			}
		}
		System.out.println(strs+ "||||||||||||||||||" + stri);	

return stri;
}
////////////////////////////////////////////////////

public static String expressionToBip(DSL_Expression dsl_expression, Sensinact sensinact){
	String str = "";
	if ( dsl_expression instanceof DSL_Expression_Division){
		
		DSL_Expression left =  ((DSL_Expression_Division) dsl_expression).getLeft();
		
		if(left !=null){ str= str+ expressionToBip(left,sensinact);}
		str = str +" / ";
		
		DSL_Expression right = ((DSL_Expression_Division) dsl_expression).getRight() ;
	
		if(right !=null){str= str +expressionToBip(right,sensinact);}
		
	}else{
		if ( dsl_expression instanceof DSL_Object_Number){
			
			str=  str+ ((DSL_Object_Number) dsl_expression).getValue();
			
		}
		else{
			if ( dsl_expression instanceof DSL_Object_Ref){
				
				str= str+ getRessourcesFromRef(((DSL_Object_Ref) dsl_expression).getValue().getName(),  sensinact);
				
			}
			else{
				if ( dsl_expression instanceof DSL_Expression_Multiplication){
					
					DSL_Expression left =  ((DSL_Expression_Multiplication) dsl_expression).getLeft();
					
					if(left !=null){ str= str+ expressionToBip(left,sensinact);}
					str = str +" * ";
					
					DSL_Expression right = ((DSL_Expression_Multiplication) dsl_expression).getRight() ;
				
					if(right !=null){str= str +expressionToBip(right,sensinact);}
					
				}
				else{
					if ( dsl_expression instanceof DSL_Expression_Modulo){
						
						DSL_Expression left =  ((DSL_Expression_Modulo) dsl_expression).getLeft();
						
						if(left !=null){ str= str+ expressionToBip(left,sensinact);}
						str = str +" % ";
						
						DSL_Expression right = ((DSL_Expression_Modulo) dsl_expression).getRight() ;
					
						if(right !=null){str= str +expressionToBip(right,sensinact);}
						
					}
					else{
						if ( dsl_expression instanceof DSL_Expression_Plus){
							
							DSL_Expression left =  ((DSL_Expression_Plus) dsl_expression).getLeft();
							
							if(left !=null){ str= str+ expressionToBip(left,sensinact);}
							str = str +" + ";
							
							DSL_Expression right = ((DSL_Expression_Plus) dsl_expression).getRight() ;
						
							if(right !=null){str= str +expressionToBip(right,sensinact);}
							
						}
						else{
							if ( dsl_expression instanceof DSL_Expression_Minus){
								
								DSL_Expression left =  ((DSL_Expression_Minus) dsl_expression).getLeft();
								
								if(left !=null){ str= str+ expressionToBip(left,sensinact);}
								str = str +" - ";
								
								DSL_Expression right = ((DSL_Expression_Minus) dsl_expression).getRight() ;
							
								if(right !=null){str= str +expressionToBip(right,sensinact);}
								
							}
							else{
								if ( dsl_expression instanceof DSL_Expression_And){
									
									DSL_Expression left =  ((DSL_Expression_And) dsl_expression).getLeft();
									
									if(left !=null){ str= str+ expressionToBip(left,sensinact);}
									str = str +" && ";
									
									DSL_Expression right = ((DSL_Expression_And) dsl_expression).getRight() ;
								
									if(right !=null){str= str +expressionToBip(right,sensinact);}
									
								}
								else{
									if ( dsl_expression instanceof DSL_Expression_Or){
										
										DSL_Expression left =  ((DSL_Expression_Or) dsl_expression).getLeft();
										
										if(left !=null){ str= str+ expressionToBip(left,sensinact);}
										str = str +" || ";
										
										DSL_Expression right = ((DSL_Expression_Or) dsl_expression).getRight() ;
									
										if(right !=null){str= str +expressionToBip(right,sensinact);}
										
									}
									else{
										if ( dsl_expression instanceof DSL_Expression_Diff){
											
											DSL_Expression left =  ((DSL_Expression_Diff) dsl_expression).getLeft();
											
											if(left !=null){ str= str+ expressionToBip(left,sensinact);}
											str = str +" != ";
											
											DSL_Expression right = ((DSL_Expression_Diff) dsl_expression).getRight() ;
										
											if(right !=null){str= str +expressionToBip(right,sensinact);}
											
										}
										else{
											if ( dsl_expression instanceof DSL_Expression_Equal){
												
												DSL_Expression left =  ((DSL_Expression_Equal) dsl_expression).getLeft();
												
												if(left !=null){ str= str+ expressionToBip(left,sensinact);}
												str = str +" == ";
												
												DSL_Expression right = ((DSL_Expression_Equal) dsl_expression).getRight() ;
											
												if(right !=null){str= str +expressionToBip(right,sensinact);}
												
											}
											else{
												if ( dsl_expression instanceof DSL_Expression_Larger){
													
													DSL_Expression left =  ((DSL_Expression_Larger) dsl_expression).getLeft();
													
													if(left !=null){ str= str+ expressionToBip(left,sensinact);}
													str = str +" > ";
													
													DSL_Expression right = ((DSL_Expression_Larger) dsl_expression).getRight() ;
												
													if(right !=null){str= str +expressionToBip(right,sensinact);}
													
												}
												else{
													if ( dsl_expression instanceof DSL_Expression_Larger_Equal){
														
														DSL_Expression left =  ((DSL_Expression_Larger_Equal) dsl_expression).getLeft();
														
														if(left !=null){ str= str+ expressionToBip(left,sensinact);}
														str = str +" >= ";
														
														DSL_Expression right = ((DSL_Expression_Larger_Equal) dsl_expression).getRight() ;
													
														if(right !=null){str= str +expressionToBip(right,sensinact);}
														
													}
													else{
														if ( dsl_expression instanceof DSL_Expression_Smaller){
															
															DSL_Expression left =  ((DSL_Expression_Smaller) dsl_expression).getLeft();
															
															if(left !=null){ str= str+ expressionToBip(left,sensinact);}
															str = str +" < ";
															
															DSL_Expression right = ((DSL_Expression_Smaller) dsl_expression).getRight() ;
														
															if(right !=null){str= str +expressionToBip(right,sensinact);}
															
														}
														else{
															if ( dsl_expression instanceof DSL_Expression_Smaller_Equal){
																
																DSL_Expression left =  ((DSL_Expression_Smaller_Equal) dsl_expression).getLeft();
																
																if(left !=null){ str= str+ expressionToBip(left,sensinact);}
																str = str +" <= ";
																
																DSL_Expression right = ((DSL_Expression_Smaller_Equal) dsl_expression).getRight() ;
															
																if(right !=null){str= str +expressionToBip(right,sensinact);}
																
															}
															else{
																if ( dsl_expression instanceof DSL_Object_Boolean){
																	
																	if (((DSL_Object_Boolean) dsl_expression).isValue()==true){str=  str+ "1";}else{str=  str+ "0";};
																	
																	
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		}
		

	}
	
	
	return str;
	
}




public static String expressionPortToBip(DSL_Expression dsl_expression, Sensinact sensinact){
	String str = "";
	if ( dsl_expression instanceof DSL_Expression_Division){
		
		DSL_Expression left =  ((DSL_Expression_Division) dsl_expression).getLeft();
		
		if(left !=null){ str= str+ expressionPortToBip(left,sensinact);}
		
		DSL_Expression right = ((DSL_Expression_Division) dsl_expression).getRight() ;
	
		if(right !=null){str= str +expressionPortToBip(right,sensinact);}
		
	}else{
			if ( dsl_expression instanceof DSL_Object_Ref){
				
				str= str+  "s."+getRessourcesFromRef(((DSL_Object_Ref) dsl_expression).getValue().getName(),  sensinact)+" = m."+getRessourcesFromRef(((DSL_Object_Ref) dsl_expression).getValue().getName(),  sensinact) + "; \n";
				
			}
			else{
				if ( dsl_expression instanceof DSL_Expression_Multiplication){
					
					DSL_Expression left =  ((DSL_Expression_Multiplication) dsl_expression).getLeft();
					
					if(left !=null){ str= str+ expressionPortToBip(left,sensinact);}
				
					
					DSL_Expression right = ((DSL_Expression_Multiplication) dsl_expression).getRight() ;
				
					if(right !=null){str= str +expressionPortToBip(right,sensinact);}
					
				}
				else{
					if ( dsl_expression instanceof DSL_Expression_Modulo){
						
						DSL_Expression left =  ((DSL_Expression_Modulo) dsl_expression).getLeft();
						
						if(left !=null){ str= str+ expressionPortToBip(left,sensinact);}
						
						DSL_Expression right = ((DSL_Expression_Modulo) dsl_expression).getRight() ;
					
						if(right !=null){str= str +expressionPortToBip(right,sensinact);}
						
					}
					else{
						if ( dsl_expression instanceof DSL_Expression_Plus){
							
							DSL_Expression left =  ((DSL_Expression_Plus) dsl_expression).getLeft();
							
							if(left !=null){ str= str+ expressionPortToBip(left,sensinact);}
							
							DSL_Expression right = ((DSL_Expression_Plus) dsl_expression).getRight() ;
						
							if(right !=null){str= str +expressionPortToBip(right,sensinact);}
							
						}
						else{
							if ( dsl_expression instanceof DSL_Expression_Minus){
								
								DSL_Expression left =  ((DSL_Expression_Minus) dsl_expression).getLeft();
								
								if(left !=null){ str= str+ expressionPortToBip(left,sensinact);}
								
								DSL_Expression right = ((DSL_Expression_Minus) dsl_expression).getRight() ;
							
								if(right !=null){str= str +expressionPortToBip(right,sensinact);}
								
							}
							else{
								if ( dsl_expression instanceof DSL_Expression_And){
									
									DSL_Expression left =  ((DSL_Expression_And) dsl_expression).getLeft();
									
									if(left !=null){ str= str+ expressionPortToBip(left,sensinact);}
									
									DSL_Expression right = ((DSL_Expression_And) dsl_expression).getRight() ;
								
									if(right !=null){str= str +expressionPortToBip(right,sensinact);}
									
								}
								else{
									if ( dsl_expression instanceof DSL_Expression_Or){
										
										DSL_Expression left =  ((DSL_Expression_Or) dsl_expression).getLeft();
										
										if(left !=null){ str= str+ expressionPortToBip(left,sensinact);}
										
										DSL_Expression right = ((DSL_Expression_Or) dsl_expression).getRight() ;
									
										if(right !=null){str= str +expressionPortToBip(right,sensinact);}
										
									}
									else{
										if ( dsl_expression instanceof DSL_Expression_Diff){
											
											DSL_Expression left =  ((DSL_Expression_Diff) dsl_expression).getLeft();
											
											if(left !=null){ str= str+ expressionPortToBip(left,sensinact);}
											
											DSL_Expression right = ((DSL_Expression_Diff) dsl_expression).getRight() ;
										
											if(right !=null){str= str +expressionPortToBip(right,sensinact);}
											
										}
										else{
											if ( dsl_expression instanceof DSL_Expression_Equal){
												
												DSL_Expression left =  ((DSL_Expression_Equal) dsl_expression).getLeft();
												
												if(left !=null){ str= str+ expressionPortToBip(left,sensinact);}
												
												DSL_Expression right = ((DSL_Expression_Equal) dsl_expression).getRight() ;
											
												if(right !=null){str= str +expressionPortToBip(right,sensinact);}
												
											}
											else{
												if ( dsl_expression instanceof DSL_Expression_Larger){
													
													DSL_Expression left =  ((DSL_Expression_Larger) dsl_expression).getLeft();
													
													if(left !=null){ str= str+ expressionPortToBip(left,sensinact);}
													
													DSL_Expression right = ((DSL_Expression_Larger) dsl_expression).getRight() ;
												
													if(right !=null){str= str +expressionPortToBip(right,sensinact);}
													
												}
												else{
													if ( dsl_expression instanceof DSL_Expression_Larger_Equal){
														
														DSL_Expression left =  ((DSL_Expression_Larger_Equal) dsl_expression).getLeft();
														
														if(left !=null){ str= str+ expressionPortToBip(left,sensinact);}
														
														DSL_Expression right = ((DSL_Expression_Larger_Equal) dsl_expression).getRight() ;
													
														if(right !=null){str= str +expressionPortToBip(right,sensinact);}
														
													}
													else{
														if ( dsl_expression instanceof DSL_Expression_Smaller){
															
															DSL_Expression left =  ((DSL_Expression_Smaller) dsl_expression).getLeft();
															
															if(left !=null){ str= str+ expressionPortToBip(left,sensinact);}
															
															DSL_Expression right = ((DSL_Expression_Smaller) dsl_expression).getRight() ;
														
															if(right !=null){str= str +expressionPortToBip(right,sensinact);}
															
														}
														else{
															if ( dsl_expression instanceof DSL_Expression_Smaller_Equal){
																
																DSL_Expression left =  ((DSL_Expression_Smaller_Equal) dsl_expression).getLeft();
																
																if(left !=null){ str= str+ expressionPortToBip(left,sensinact);}
																
																DSL_Expression right = ((DSL_Expression_Smaller_Equal) dsl_expression).getRight() ;
															
																if(right !=null){str= str +expressionPortToBip(right,sensinact);}
																
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		
		

	}
	
	
	return str;
	
}

public static String expressionGetToBip(DSL_Expression dsl_expression, Sensinact sensinact){
	String str = "";
	if ( dsl_expression instanceof DSL_Expression_Division){
		
		DSL_Expression left =  ((DSL_Expression_Division) dsl_expression).getLeft();
		
		if(left !=null){ str= str+ expressionGetToBip(left,sensinact);}
		
		DSL_Expression right = ((DSL_Expression_Division) dsl_expression).getRight() ;
	
		if(right !=null){str= str +expressionGetToBip(right,sensinact);}
		
	}else{
			if ( dsl_expression instanceof DSL_Object_Ref){
				
				str= str+  "export port PORT_"+getRessourcesFromRef(((DSL_Object_Ref) dsl_expression).getValue().getName(),  sensinact)+"_GET get"+getRessourcesFromRef(((DSL_Object_Ref) dsl_expression).getValue().getName(),  sensinact)+"("+getRessourcesFromRef(((DSL_Object_Ref) dsl_expression).getValue().getName(),  sensinact)+ ") \n";
				
			}
			else{
				if ( dsl_expression instanceof DSL_Expression_Multiplication){
					
					DSL_Expression left =  ((DSL_Expression_Multiplication) dsl_expression).getLeft();
					
					if(left !=null){ str= str+ expressionGetToBip(left,sensinact);}
				
					
					DSL_Expression right = ((DSL_Expression_Multiplication) dsl_expression).getRight() ;
				
					if(right !=null){str= str +expressionGetToBip(right,sensinact);}
					
				}
				else{
					if ( dsl_expression instanceof DSL_Expression_Modulo){
						
						DSL_Expression left =  ((DSL_Expression_Modulo) dsl_expression).getLeft();
						
						if(left !=null){ str= str+ expressionGetToBip(left,sensinact);}
						
						DSL_Expression right = ((DSL_Expression_Modulo) dsl_expression).getRight() ;
					
						if(right !=null){str= str +expressionGetToBip(right,sensinact);}
						
					}
					else{
						if ( dsl_expression instanceof DSL_Expression_Plus){
							
							DSL_Expression left =  ((DSL_Expression_Plus) dsl_expression).getLeft();
							
							if(left !=null){ str= str+ expressionGetToBip(left,sensinact);}
							
							DSL_Expression right = ((DSL_Expression_Plus) dsl_expression).getRight() ;
						
							if(right !=null){str= str +expressionGetToBip(right,sensinact);}
							
						}
						else{
							if ( dsl_expression instanceof DSL_Expression_Minus){
								
								DSL_Expression left =  ((DSL_Expression_Minus) dsl_expression).getLeft();
								
								if(left !=null){ str= str+ expressionGetToBip(left,sensinact);}
								
								DSL_Expression right = ((DSL_Expression_Minus) dsl_expression).getRight() ;
							
								if(right !=null){str= str +expressionGetToBip(right,sensinact);}
								
							}
							else{
								if ( dsl_expression instanceof DSL_Expression_And){
									
									DSL_Expression left =  ((DSL_Expression_And) dsl_expression).getLeft();
									
									if(left !=null){ str= str+ expressionGetToBip(left,sensinact);}
									
									DSL_Expression right = ((DSL_Expression_And) dsl_expression).getRight() ;
								
									if(right !=null){str= str +expressionGetToBip(right,sensinact);}
									
								}
								else{
									if ( dsl_expression instanceof DSL_Expression_Or){
										
										DSL_Expression left =  ((DSL_Expression_Or) dsl_expression).getLeft();
										
										if(left !=null){ str= str+ expressionGetToBip(left,sensinact);}
										
										DSL_Expression right = ((DSL_Expression_Or) dsl_expression).getRight() ;
									
										if(right !=null){str= str +expressionGetToBip(right,sensinact);}
										
									}
									else{
										if ( dsl_expression instanceof DSL_Expression_Diff){
											
											DSL_Expression left =  ((DSL_Expression_Diff) dsl_expression).getLeft();
											
											if(left !=null){ str= str+ expressionGetToBip(left,sensinact);}
											
											DSL_Expression right = ((DSL_Expression_Diff) dsl_expression).getRight() ;
										
											if(right !=null){str= str +expressionGetToBip(right,sensinact);}
											
										}
										else{
											if ( dsl_expression instanceof DSL_Expression_Equal){
												
												DSL_Expression left =  ((DSL_Expression_Equal) dsl_expression).getLeft();
												
												if(left !=null){ str= str+ expressionGetToBip(left,sensinact);}
												
												DSL_Expression right = ((DSL_Expression_Equal) dsl_expression).getRight() ;
											
												if(right !=null){str= str +expressionGetToBip(right,sensinact);}
												
											}
											else{
												if ( dsl_expression instanceof DSL_Expression_Larger){
													
													DSL_Expression left =  ((DSL_Expression_Larger) dsl_expression).getLeft();
													
													if(left !=null){ str= str+ expressionGetToBip(left,sensinact);}
													
													DSL_Expression right = ((DSL_Expression_Larger) dsl_expression).getRight() ;
												
													if(right !=null){str= str +expressionGetToBip(right,sensinact);}
													
												}
												else{
													if ( dsl_expression instanceof DSL_Expression_Larger_Equal){
														
														DSL_Expression left =  ((DSL_Expression_Larger_Equal) dsl_expression).getLeft();
														
														if(left !=null){ str= str+ expressionGetToBip(left,sensinact);}
														
														DSL_Expression right = ((DSL_Expression_Larger_Equal) dsl_expression).getRight() ;
													
														if(right !=null){str= str +expressionGetToBip(right,sensinact);}
														
													}
													else{
														if ( dsl_expression instanceof DSL_Expression_Smaller){
															
															DSL_Expression left =  ((DSL_Expression_Smaller) dsl_expression).getLeft();
															
															if(left !=null){ str= str+ expressionGetToBip(left,sensinact);}
															
															DSL_Expression right = ((DSL_Expression_Smaller) dsl_expression).getRight() ;
														
															if(right !=null){str= str +expressionGetToBip(right,sensinact);}
															
														}
														else{
															if ( dsl_expression instanceof DSL_Expression_Smaller_Equal){
																
																DSL_Expression left =  ((DSL_Expression_Smaller_Equal) dsl_expression).getLeft();
																
																if(left !=null){ str= str+ expressionGetToBip(left,sensinact);}
																
																DSL_Expression right = ((DSL_Expression_Smaller_Equal) dsl_expression).getRight() ;
															
																if(right !=null){str= str +expressionGetToBip(right,sensinact);}
																
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				
			}
		
		

	}
	
	
	return str;
	
}



}
