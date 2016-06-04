package x.org.json.simple;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("org_json_simple_ItemList")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class ItemList extends NSObject {	
	
	public org.json.simple.ItemList original;	
	
	protected ItemList(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native ItemList alloc();	
	
	@Selector("value")	
	public ItemList value() {		
		ItemList self = (ItemList) ItemList.alloc().init();		
		self.original = new org.json.simple.ItemList();		
		return self;		
	}	
	
	@Selector("valueWithString:")	
	public ItemList valueWithString(String arg0) {
		ItemList self = (ItemList) ItemList.alloc().init();		
		self.original = new org.json.simple.ItemList(arg0);		
		return self;		
	}	
	
	@Selector("valueWithString:String:")	
	public ItemList valueWithStringString(String arg0, String arg1) {
		ItemList self = (ItemList) ItemList.alloc().init();		
		self.original = new org.json.simple.ItemList(arg0, arg1);		
		return self;		
	}	
	
	@Selector("valueWithString:String:Boolean:")	
	public ItemList valueWithStringStringBoolean(String arg0, String arg1, boolean arg2) {
		ItemList self = (ItemList) ItemList.alloc().init();		
		self.original = new org.json.simple.ItemList(arg0, arg1, arg2);		
		return self;		
	}	
	
	@Selector("getItems")	
	public java.util.List getItems() {		
		return original.getItems();		
	}	
	
	@Selector("getArray")	
	public String[] getArray() {
		return original.getArray();		
	}	
	
	@Selector("splitWithString:String:List:Boolean:")	
	public void splitWithStringStringListBoolean(String arg0, String arg1, java.util.List arg2, boolean arg3) {
		original.split(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("splitWithString:String:List:")	
	public void splitWithStringStringList(String arg0, String arg1, java.util.List arg2) {
		original.split(arg0, arg1, arg2);		
	}	
	
	@Selector("setSPWithString:")	
	public void setSPWithString(String arg0) {
		original.setSP(arg0);		
	}	
	
	@Selector("addWithInt:String:")	
	public void addWithIntString(int arg0, String arg1) {
		original.add(arg0, arg1);		
	}	
	
	@Selector("addWithString:")	
	public void addWithString(String arg0) {
		original.add(arg0);		
	}	
	
	@Selector("addAllWithItemList:")	
	public void addAllWithItemList(ItemList arg0) {
		original.addAll(arg0.original);		
	}	
	
	@Selector("addAllWithString:")	
	public void addAllWithString(String arg0) {
		original.addAll(arg0);		
	}	
	
	@Selector("addAllWithString:String:")	
	public void addAllWithStringString(String arg0, String arg1) {
		original.addAll(arg0, arg1);		
	}	
	
	@Selector("addAllWithString:String:Boolean:")	
	public void addAllWithStringStringBoolean(String arg0, String arg1, boolean arg2) {
		original.addAll(arg0, arg1, arg2);		
	}	
	
	@Selector("getWithInt:")	
	public String getWithInt(int arg0) {
		return original.get(arg0);		
	}	
	
	@Selector("size")	
	public int size() {		
		return original.size();		
	}	
	
	@Selector("toString")	
	public String toString() {
		return original.toString();		
	}	
	
	@Selector("toStringWithString:")	
	public String toStringWithString(String arg0) {
		return original.toString(arg0);		
	}	
	
	@Selector("clear")	
	public void clear() {		
		original.clear();		
	}	
	
	@Selector("reset")	
	public void reset() {		
		original.reset();		
	}	
	
	@Selector("hashCode")	
	public int hashCode() {		
		return original.hashCode();		
	}	
	
	@Selector("equalsWithObject:")	
	public boolean equalsWithObject(Object arg0) {
		return original.equals(arg0);		
	}	
}
