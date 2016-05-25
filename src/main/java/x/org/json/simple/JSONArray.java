package x.org.json.simple;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_json_simple_JSONArray")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class JSONArray extends NSObject {

	private org.json.simple.JSONArray original;

	protected JSONArray(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithId:")
	public JSONArray valueWithId(java.util.Collection arg0) {
		JSONArray self = (JSONArray) JSONArray.alloc().init();
		self.original = new org.json.simple.JSONArray(arg0);
		return self;
	}

	@Selector("writeJSONString::")
	public static void writeJSONString(java.util.Collection arg0, java.io.Writer arg1) throws java.io.IOException {
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);
	}

	@Selector("writeJSONString:")
	public void writeJSONString(java.io.Writer arg0) throws java.io.IOException {
		original.writeJSONString(arg0);
	}

	@Selector("toJSONString:")
	public static String toJSONString(java.util.Collection arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);
	}

	@Selector("writeJSONString::")
	public static void writeJSONString(byte[] arg0, java.io.Writer arg1) throws java.io.IOException {
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);
	}

	@Selector("toJSONString:")
	public static String toJSONString(byte[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);
	}

	@Selector("writeJSONString::")
	public static void writeJSONString(short[] arg0, java.io.Writer arg1) throws java.io.IOException {
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);
	}

	@Selector("toJSONString:")
	public static String toJSONString(short[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);
	}

	@Selector("writeJSONString::")
	public static void writeJSONString(int[] arg0, java.io.Writer arg1) throws java.io.IOException {
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);
	}

	@Selector("toJSONString:")
	public static String toJSONString(int[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);
	}

	@Selector("writeJSONString::")
	public static void writeJSONString(long[] arg0, java.io.Writer arg1) throws java.io.IOException {
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);
	}

	@Selector("toJSONString:")
	public static String toJSONString(long[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);
	}

	@Selector("writeJSONString::")
	public static void writeJSONString(float[] arg0, java.io.Writer arg1) throws java.io.IOException {
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);
	}

	@Selector("toJSONString:")
	public static String toJSONString(float[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);
	}

	@Selector("writeJSONString::")
	public static void writeJSONString(double[] arg0, java.io.Writer arg1) throws java.io.IOException {
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);
	}

	@Selector("toJSONString:")
	public static String toJSONString(double[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);
	}

	@Selector("writeJSONString::")
	public static void writeJSONString(boolean[] arg0, java.io.Writer arg1) throws java.io.IOException {
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);
	}

	@Selector("toJSONString:")
	public static String toJSONString(boolean[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);
	}

	@Selector("writeJSONString::")
	public static void writeJSONString(char[] arg0, java.io.Writer arg1) throws java.io.IOException {
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);
	}

	@Selector("toJSONString:")
	public static String toJSONString(char[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);
	}

	@Selector("writeJSONString::")
	public static void writeJSONString(Object[] arg0, java.io.Writer arg1) throws java.io.IOException {
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);
	}

	@Selector("toJSONString:")
	public static String toJSONString(Object[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);
	}

	@Selector("toJSONString")
	public String toJSONString() {
		return original.toJSONString();
	}

	@Selector("toString")
	public String toString() {
		return original.toString();
	}

}
