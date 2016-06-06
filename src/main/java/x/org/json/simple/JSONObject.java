package x.org.json.simple;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_json_simple_JSONObject")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class JSONObject extends NSObject {	
	
	public org.json.simple.JSONObject original;	
	
	protected JSONObject(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native JSONObject alloc();

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
	
	@Selector("writeJSONStringWithMap:Writer:")	
	public static void writeJSONStringWithMapWriter(java.util.Map arg0, java.io.Writer arg1) throws java.io.IOException {		
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
	
	@Selector("toStringWithString:Object:")	
	public static String toStringWithStringObject(String arg0, Object arg1) {
		return org.json.simple.JSONObject.toString(arg0, arg1);		
	}	
	
	@Selector("escapeWithString:")	
	public static String escapeWithString(String arg0) {
		return org.json.simple.JSONObject.escape(arg0);		
	}	
	
	@Selector("size")	
	public int size() {		
		return original.size();		
	}	
	
	@Selector("isEmpty")	
	public boolean isEmpty() {		
		return original.isEmpty();		
	}	
	
	@Selector("getWithObject:")	
	public Object getWithObject(Object arg0) {
		return original.get(arg0);		
	}	
	
	@Selector("containsKeyWithObject:")	
	public boolean containsKeyWithObject(Object arg0) {
		return original.containsKey(arg0);		
	}	
	
	@Selector("putWithObject:Object:")	
	public Object putWithObjectObject(Object arg0, Object arg1) {
		return original.put(arg0, arg1);		
	}	
	
	@Selector("putAllWithMap:")	
	public void putAllWithMap(java.util.Map arg0) {		
		original.putAll(arg0);		
	}	
	
	@Selector("removeWithObject:")	
	public Object removeWithObject(Object arg0) {
		return original.remove(arg0);		
	}	
	
	@Selector("clear")	
	public void clear() {		
		original.clear();		
	}	
	
	@Selector("containsValueWithObject:")	
	public boolean containsValueWithObject(Object arg0) {
		return original.containsValue(arg0);		
	}	
	
	@Selector("keySet")	
	public java.util.Set keySet() {		
		return original.keySet();		
	}	
	
	@Selector("values")	
	public java.util.Collection values() {		
		return original.values();		
	}	
	
	@Selector("entrySet")	
	public java.util.Set entrySet() {		
		return original.entrySet();		
	}

	@Selector("clone")	
	public Object clone() {
		return original.clone();		
	}	
}
