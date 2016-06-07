package x.org.json.simple.parser;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_json_simple_parser_JSONParser")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class JSONParser extends NSObject {	
	
	public org.json.simple.parser.JSONParser original;	
	
	protected JSONParser(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native JSONParser alloc();

	@Selector("init")
	public JSONParser init() {
		JSONParser self = (JSONParser) super.init();
		self.original = new org.json.simple.parser.JSONParser();
		return self;
	}

	@Selector("parseWithString:")
	public x.org.json.simple.JSONObject parseWithString(String arg0) throws org.json.simple.parser.ParseException {
		x.org.json.simple.JSONObject ret = (x.org.json.simple.JSONObject) x.org.json.simple.JSONObject.alloc().init();
		ret.original = (org.json.simple.JSONObject) original.parse(arg0);
		return ret;
	}

}
