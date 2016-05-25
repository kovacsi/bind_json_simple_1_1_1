package x.org.json.simple;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_json_simple_JSONValue")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class JSONValue extends NSObject {

	private org.json.simple.JSONValue original;

	protected JSONValue(Pointer peer) {
		super(peer);
	}

	@Selector("parse:")
	public static Object parse(java.io.Reader arg0) {
		return org.json.simple.JSONValue.parse(arg0);
	}

	@Selector("parse:")
	public static Object parse(String arg0) {
		return org.json.simple.JSONValue.parse(arg0);
	}

	@Selector("parseWithException:")
	public static Object parseWithException(java.io.Reader arg0) throws java.io.IOException, org.json.simple.parser.ParseException {
		return org.json.simple.JSONValue.parseWithException(arg0);
	}

	@Selector("parseWithException:")
	public static Object parseWithException(String arg0) throws org.json.simple.parser.ParseException {
		return org.json.simple.JSONValue.parseWithException(arg0);
	}

	@Selector("writeJSONString::")
	public static void writeJSONString(Object arg0, java.io.Writer arg1) throws java.io.IOException {
		org.json.simple.JSONValue.writeJSONString(arg0, arg1);
	}

	@Selector("toJSONString:")
	public static String toJSONString(Object arg0) {
		return org.json.simple.JSONValue.toJSONString(arg0);
	}

	@Selector("escape:")
	public static String escape(String arg0) {
		return org.json.simple.JSONValue.escape(arg0);
	}

}
