package x.org.json.simple;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBJSONArray")
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
	
	@Selector("value")	
	public JSONArray value() {		
		JSONArray self = (JSONArray) JSONArray.alloc().init();		
		self.original = new org.json.simple.JSONArray();		
		return self;		
	}	
	
	@Selector("valueWithCollection:")	
	public JSONArray valueWithCollection(java.util.Collection arg0) {		
		JSONArray self = (JSONArray) JSONArray.alloc().init();		
		self.original = new org.json.simple.JSONArray(arg0);		
		return self;		
	}	
	
	@Selector("writeJSONStringWithCollection:withWriter:")	
	public static void writeJSONStringWithCollectionwithWriter(java.util.Collection arg0, java.io.Writer arg1) throws java.io.IOException {		
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
	
	@Selector("writeJSONStringWithByte:withWriter:")	
	public static void writeJSONStringWithBytewithWriter(byte[] arg0, java.io.Writer arg1) throws java.io.IOException {		
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);		
	}	
	
	@Selector("toJSONStringWithByte:")	
	public static String toJSONStringWithByte(byte[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);		
	}	
	
	@Selector("writeJSONStringWithShort:withWriter:")	
	public static void writeJSONStringWithShortwithWriter(short[] arg0, java.io.Writer arg1) throws java.io.IOException {		
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);		
	}	
	
	@Selector("toJSONStringWithShort:")	
	public static String toJSONStringWithShort(short[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);		
	}	
	
	@Selector("writeJSONStringWithInt:withWriter:")	
	public static void writeJSONStringWithIntwithWriter(int[] arg0, java.io.Writer arg1) throws java.io.IOException {		
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);		
	}	
	
	@Selector("toJSONStringWithInt:")	
	public static String toJSONStringWithInt(int[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);		
	}	
	
	@Selector("writeJSONStringWithLong:withWriter:")	
	public static void writeJSONStringWithLongwithWriter(long[] arg0, java.io.Writer arg1) throws java.io.IOException {		
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);		
	}	
	
	@Selector("toJSONStringWithLong:")	
	public static String toJSONStringWithLong(long[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);		
	}	
	
	@Selector("writeJSONStringWithFloat:withWriter:")	
	public static void writeJSONStringWithFloatwithWriter(float[] arg0, java.io.Writer arg1) throws java.io.IOException {		
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);		
	}	
	
	@Selector("toJSONStringWithFloat:")	
	public static String toJSONStringWithFloat(float[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);		
	}	
	
	@Selector("writeJSONStringWithDouble:withWriter:")	
	public static void writeJSONStringWithDoublewithWriter(double[] arg0, java.io.Writer arg1) throws java.io.IOException {		
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);		
	}	
	
	@Selector("toJSONStringWithDouble:")	
	public static String toJSONStringWithDouble(double[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);		
	}	
	
	@Selector("writeJSONStringWithBoolean:withWriter:")	
	public static void writeJSONStringWithBooleanwithWriter(boolean[] arg0, java.io.Writer arg1) throws java.io.IOException {		
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);		
	}	
	
	@Selector("toJSONStringWithBoolean:")	
	public static String toJSONStringWithBoolean(boolean[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);		
	}	
	
	@Selector("writeJSONStringWithChar:withWriter:")	
	public static void writeJSONStringWithCharwithWriter(char[] arg0, java.io.Writer arg1) throws java.io.IOException {		
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);		
	}	
	
	@Selector("toJSONStringWithChar:")	
	public static String toJSONStringWithChar(char[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);		
	}	
	
	@Selector("writeJSONStringWithObject:withWriter:")	
	public static void writeJSONStringWithObjectwithWriter(Object[] arg0, java.io.Writer arg1) throws java.io.IOException {
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
