package x.org.json.simple;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;

import ios.NSObject;

@ObjCClassName("org_json_simple_JSONValue")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class JSONValue extends NSObject {	

	protected JSONValue(Pointer peer) {
		super(peer);
	}

	@Selector("escapeWithString:")	
	public static String escapeWithString(String arg0) {
		return org.json.simple.JSONValue.escape(arg0);		
	}	

}
