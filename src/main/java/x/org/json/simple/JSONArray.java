package x.org.json.simple;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_json_simple_JSONArray")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class JSONArray extends NSObject {	
	
	public org.json.simple.JSONArray original;	
	
	protected JSONArray(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native JSONArray alloc();

	@Selector("init")
	public JSONArray init() {
		JSONArray self = (JSONArray) super.init();
		self.original = new org.json.simple.JSONArray();
		return self;
	}

	@Selector("toJSONString")	
	public String toJSONString() {
		return original.toJSONString();		
	}	

}
