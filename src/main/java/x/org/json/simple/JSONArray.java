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

	@Selector("valueWithCollection:")
	public JSONArray valueWithCollection(java.util.Collection arg0) {
		JSONArray self = (JSONArray) JSONArray.alloc().init();
		self.original = new org.json.simple.JSONArray(arg0);
		return self;
	}

	@Selector("writeJSONStringWithCollectionWithWriter::")
	public static void writeJSONStringWithCollectionWithWriter(java.util.Collection arg0, java.io.Writer arg1) throws java.io.IOException {
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);
	}

	@Selector("writeJSONStringWithWriter:")
	public void writeJSONStringWithWriter(java.io.Writer arg0) throws java.io.IOException {
		original.writeJSONString(arg0);
	}

	@Selector("toJSONStringWithCollection:")
	public static String toJSONStringWithCollection(java.util.Collection arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);
	}

	@Selector("writeJSONStringWithByteWithWriter::")
	public static void writeJSONStringWithByteWithWriter(byte[] arg0, java.io.Writer arg1) throws java.io.IOException {
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);
	}

	@Selector("toJSONStringWithByte:")
	public static String toJSONStringWithByte(byte[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);
	}

	@Selector("writeJSONStringWithShortWithWriter::")
	public static void writeJSONStringWithShortWithWriter(short[] arg0, java.io.Writer arg1) throws java.io.IOException {
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);
	}

	@Selector("toJSONStringWithShort:")
	public static String toJSONStringWithShort(short[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);
	}

	@Selector("writeJSONStringWithIntWithWriter::")
	public static void writeJSONStringWithIntWithWriter(int[] arg0, java.io.Writer arg1) throws java.io.IOException {
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);
	}

	@Selector("toJSONStringWithInt:")
	public static String toJSONStringWithInt(int[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);
	}

	@Selector("writeJSONStringWithLongWithWriter::")
	public static void writeJSONStringWithLongWithWriter(long[] arg0, java.io.Writer arg1) throws java.io.IOException {
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);
	}

	@Selector("toJSONStringWithLong:")
	public static String toJSONStringWithLong(long[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);
	}

	@Selector("writeJSONStringWithFloatWithWriter::")
	public static void writeJSONStringWithFloatWithWriter(float[] arg0, java.io.Writer arg1) throws java.io.IOException {
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);
	}

	@Selector("toJSONStringWithFloat:")
	public static String toJSONStringWithFloat(float[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);
	}

	@Selector("writeJSONStringWithDoubleWithWriter::")
	public static void writeJSONStringWithDoubleWithWriter(double[] arg0, java.io.Writer arg1) throws java.io.IOException {
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);
	}

	@Selector("toJSONStringWithDouble:")
	public static String toJSONStringWithDouble(double[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);
	}

	@Selector("writeJSONStringWithBooleanWithWriter::")
	public static void writeJSONStringWithBooleanWithWriter(boolean[] arg0, java.io.Writer arg1) throws java.io.IOException {
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);
	}

	@Selector("toJSONStringWithBoolean:")
	public static String toJSONStringWithBoolean(boolean[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);
	}

	@Selector("writeJSONStringWithCharWithWriter::")
	public static void writeJSONStringWithCharWithWriter(char[] arg0, java.io.Writer arg1) throws java.io.IOException {
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);
	}

	@Selector("toJSONStringWithChar:")
	public static String toJSONStringWithChar(char[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);
	}

	@Selector("writeJSONStringWithObjectWithWriter::")
	public static void writeJSONStringWithObjectWithWriter(Object[] arg0, java.io.Writer arg1) throws java.io.IOException {
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);
	}

	@Selector("toJSONStringWithObject:")
	public static String toJSONStringWithObject(Object[] arg0) {
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
