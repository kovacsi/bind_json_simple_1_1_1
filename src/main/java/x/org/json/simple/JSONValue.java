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
	
	public org.json.simple.JSONValue original;	
	
	protected JSONValue(Pointer peer) {		
		super(peer);		
	}	
	
	@Selector("value")	
	public JSONValue value() {		
		JSONValue self = (JSONValue) JSONValue.alloc().init();		
		self.original = new org.json.simple.JSONValue();		
		return self;		
	}	
	
	@Selector("parseWithReader:")	
	public static Object parse(java.io.Reader arg0) {
		return org.json.simple.JSONValue.parse(arg0);		
	}	
	
	@Selector("parseWithString:")	
	public static Object parse(String arg0) {
		return org.json.simple.JSONValue.parse(arg0);		
	}	
	
	@Selector("parseWithExceptionWithReader:")	
	public static Object parseWithException(java.io.Reader arg0) throws java.io.IOException, org.json.simple.parser.ParseException {
		return org.json.simple.JSONValue.parseWithException(arg0);		
	}	
	
	@Selector("parseWithExceptionWithString:")	
	public static Object parseWithException(String arg0) throws org.json.simple.parser.ParseException {
		return org.json.simple.JSONValue.parseWithException(arg0);		
	}	
	
	@Selector("writeJSONStringWithObject:withWriter:")	
	public static void writeJSONString(Object arg0, java.io.Writer arg1) throws java.io.IOException {
		org.json.simple.JSONValue.writeJSONString(arg0, arg1);		
	}	
	
	@Selector("toJSONStringWithObject:")	
	public static String toJSONString(Object arg0) {
		return org.json.simple.JSONValue.toJSONString(arg0);		
	}	
	
	@Selector("escapeWithString:")	
	public static String escape(String arg0) {
		return org.json.simple.JSONValue.escape(arg0);		
	}	
}
