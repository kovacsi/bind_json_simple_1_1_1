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
		if (self != null) {
			self.original = new org.json.simple.JSONArray();
		}
		return self;
	}

	@Selector("value")
	public JSONArray value() {
		return (JSONArray) JSONArray.alloc().init();
	}

	@Selector("valueWithCollection:")	
	public JSONArray valueWithCollection(java.util.Collection arg0) {		
		JSONArray self = (JSONArray) JSONArray.alloc().init();		
		self.original = new org.json.simple.JSONArray(arg0);		
		return self;		
	}	
	
	@Selector("writeJSONStringWithCollection:Writer:")	
	public static void writeJSONStringWithCollectionWriter(java.util.Collection arg0, java.io.Writer arg1) throws java.io.IOException {		
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
	
	@Selector("writeJSONStringWithByte_array:Writer:")	
	public static void writeJSONStringWithByte_arrayWriter(byte[] arg0, java.io.Writer arg1) throws java.io.IOException {		
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);		
	}	
	
	@Selector("toJSONStringWithByte_array:")	
	public static String toJSONStringWithByte_array(byte[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);		
	}	
	
	@Selector("writeJSONStringWithShort_array:Writer:")	
	public static void writeJSONStringWithShort_arrayWriter(short[] arg0, java.io.Writer arg1) throws java.io.IOException {		
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);		
	}	
	
	@Selector("toJSONStringWithShort_array:")	
	public static String toJSONStringWithShort_array(short[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);		
	}	
	
	@Selector("writeJSONStringWithInt_array:Writer:")	
	public static void writeJSONStringWithInt_arrayWriter(int[] arg0, java.io.Writer arg1) throws java.io.IOException {		
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);		
	}	
	
	@Selector("toJSONStringWithInt_array:")	
	public static String toJSONStringWithInt_array(int[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);		
	}	
	
	@Selector("writeJSONStringWithLong_array:Writer:")	
	public static void writeJSONStringWithLong_arrayWriter(long[] arg0, java.io.Writer arg1) throws java.io.IOException {		
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);		
	}	
	
	@Selector("toJSONStringWithLong_array:")	
	public static String toJSONStringWithLong_array(long[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);		
	}	
	
	@Selector("writeJSONStringWithFloat_array:Writer:")	
	public static void writeJSONStringWithFloat_arrayWriter(float[] arg0, java.io.Writer arg1) throws java.io.IOException {		
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);		
	}	
	
	@Selector("toJSONStringWithFloat_array:")	
	public static String toJSONStringWithFloat_array(float[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);		
	}	
	
	@Selector("writeJSONStringWithDouble_array:Writer:")	
	public static void writeJSONStringWithDouble_arrayWriter(double[] arg0, java.io.Writer arg1) throws java.io.IOException {		
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);		
	}	
	
	@Selector("toJSONStringWithDouble_array:")	
	public static String toJSONStringWithDouble_array(double[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);		
	}	
	
	@Selector("writeJSONStringWithBoolean_array:Writer:")	
	public static void writeJSONStringWithBoolean_arrayWriter(boolean[] arg0, java.io.Writer arg1) throws java.io.IOException {		
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);		
	}	
	
	@Selector("toJSONStringWithBoolean_array:")	
	public static String toJSONStringWithBoolean_array(boolean[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);		
	}	
	
	@Selector("writeJSONStringWithChar_array:Writer:")	
	public static void writeJSONStringWithChar_arrayWriter(char[] arg0, java.io.Writer arg1) throws java.io.IOException {		
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);		
	}	
	
	@Selector("toJSONStringWithChar_array:")	
	public static String toJSONStringWithChar_array(char[] arg0) {
		return org.json.simple.JSONArray.toJSONString(arg0);		
	}	
	
	@Selector("writeJSONStringWithObject_array:Writer:")	
	public static void writeJSONStringWithObject_arrayWriter(Object[] arg0, java.io.Writer arg1) throws java.io.IOException {
		org.json.simple.JSONArray.writeJSONString(arg0, arg1);		
	}	
	
	@Selector("toJSONStringWithObject_array:")	
	public static String toJSONStringWithObject_array(Object[] arg0) {
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
	
	@Selector("trimToSize")	
	public void trimToSize() {		
		original.trimToSize();		
	}	
	
	@Selector("ensureCapacityWithInt:")	
	public void ensureCapacityWithInt(int arg0) {		
		original.ensureCapacity(arg0);		
	}	
	
	@Selector("size")	
	public int size() {		
		return original.size();		
	}	
	
	@Selector("isEmpty")	
	public boolean isEmpty() {		
		return original.isEmpty();		
	}	
	
	@Selector("containsWithObject:")	
	public boolean containsWithObject(Object arg0) {
		return original.contains(arg0);		
	}	
	
	@Selector("indexOfWithObject:")	
	public int indexOfWithObject(Object arg0) {
		return original.indexOf(arg0);		
	}	
	
	@Selector("lastIndexOfWithObject:")	
	public int lastIndexOfWithObject(Object arg0) {
		return original.lastIndexOf(arg0);		
	}	
	
	@Selector("clone")	
	public Object clone() {
		return original.clone();		
	}	
	
	@Selector("toArray")	
	public Object[] toArray() {
		return original.toArray();		
	}	
	
	@Selector("toArrayWithObject_array:")	
	public Object[] toArrayWithObject_array(Object[] arg0) {
		return original.toArray(arg0);		
	}	
	
	@Selector("getWithInt:")	
	public Object getWithInt(int arg0) {
		return original.get(arg0);		
	}	
	
	@Selector("setWithInt:Object:")	
	public Object setWithIntObject(int arg0, Object arg1) {
		return original.set(arg0, arg1);		
	}	
	
	@Selector("addWithObject:")	
	public boolean addWithObject(Object arg0) {
		return original.add(arg0);		
	}	
	
	@Selector("addWithInt:Object:")	
	public void addWithIntObject(int arg0, Object arg1) {
		original.add(arg0, arg1);		
	}	
	
	@Selector("removeWithInt:")	
	public Object removeWithInt(int arg0) {
		return original.remove(arg0);		
	}	
	
	@Selector("removeWithObject:")	
	public boolean removeWithObject(Object arg0) {
		return original.remove(arg0);		
	}	
	
	@Selector("clear")	
	public void clear() {		
		original.clear();		
	}	
	
	@Selector("addAllWithCollection:")	
	public boolean addAllWithCollection(java.util.Collection arg0) {		
		return original.addAll(arg0);		
	}	
	
	@Selector("addAllWithInt:Collection:")	
	public boolean addAllWithIntCollection(int arg0, java.util.Collection arg1) {		
		return original.addAll(arg0, arg1);		
	}	
	
	@Selector("removeAllWithCollection:")	
	public boolean removeAllWithCollection(java.util.Collection arg0) {		
		return original.removeAll(arg0);		
	}	
	
	@Selector("retainAllWithCollection:")	
	public boolean retainAllWithCollection(java.util.Collection arg0) {		
		return original.retainAll(arg0);		
	}	
	
	@Selector("listIteratorWithInt:")	
	public java.util.ListIterator listIteratorWithInt(int arg0) {		
		return original.listIterator(arg0);		
	}	
	
	@Selector("listIterator")	
	public java.util.ListIterator listIterator() {		
		return original.listIterator();		
	}	
	
	@Selector("iterator")	
	public java.util.Iterator iterator() {		
		return original.iterator();		
	}	
	
	@Selector("subListWithInt:Int:")	
	public java.util.List subListWithIntInt(int arg0, int arg1) {		
		return original.subList(arg0, arg1);		
	}	

}
