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

	@Selector("init")
	public JSONObject init() {
		JSONObject self = (JSONObject) super.init();
		self.original = new org.json.simple.JSONObject();
		return self;
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

	@Selector("toJSONString")
	public String toJSONString() {
		return original.toJSONString();
	}

}
