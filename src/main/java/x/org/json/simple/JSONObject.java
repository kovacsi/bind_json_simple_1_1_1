package x.org.json.simple;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JSONObject")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class JSONObject extends NSObject {	
	
	public org.json.simple.JSONObject original;	
	
	protected JSONObject(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("value")	
	public JSONObject value() {		
		JSONObject self = (JSONObject) JSONObject.alloc().init();		
		self.original = new org.json.simple.JSONObject();		
		return self;		
	}	
	
	@Selector("valueWithMap:")	
	public JSONObject valueWithMap(java.util.Map arg0) {		
		JSONObject self = (JSONObject) JSONObject.alloc().init();		
		self.original = new org.json.simple.JSONObject(arg0);		
		return self;		
	}	
	
	@Selector("writeJSONStringWithMap:withWriter:")	
	public static void writeJSONStringWithMapwithWriter(java.util.Map arg0, java.io.Writer arg1) throws java.io.IOException {		
		org.json.simple.JSONObject.writeJSONString(arg0, arg1);		
	}	
	
	@Selector("writeJSONStringWithWriter:")	
	public void writeJSONStringWithWriter(java.io.Writer arg0) throws java.io.IOException {		
		original.writeJSONString(arg0);		
	}	
	
	@Selector("toJSONStringWithMap:")	
	public static String toJSONStringWithMap(java.util.Map arg0) {
		return org.json.simple.JSONObject.toJSONString(arg0);		
	}	
	
	@Selector("toJSONString")	
	public String toJSONString() {
		return original.toJSONString();		
	}	
	
	@Selector("toString")	
	public String toString() {
		return original.toString();		
	}	
	
	@Selector("toStringWithString:withObject:")	
	public static String toStringWithStringwithObject(String arg0, Object arg1) {
		return org.json.simple.JSONObject.toString(arg0, arg1);		
	}	
	
	@Selector("escapeWithString:")	
	public static String escapeWithString(String arg0) {
		return org.json.simple.JSONObject.escape(arg0);		
	}	
}
