package x.org.json.simple;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("ItemList")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class ItemList extends NSObject {	
	
	public org.json.simple.ItemList original;	
	
	protected ItemList(Pointer peer) {		
		super(peer);		
	}	
	
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
	
	@Selector("valueWithString:withString:")	
	public ItemList valueWithStringwithString(String arg0, String arg1) {
		ItemList self = (ItemList) ItemList.alloc().init();		
		self.original = new org.json.simple.ItemList(arg0, arg1);		
		return self;		
	}	
	
	@Selector("valueWithString:withString:withBoolean:")	
	public ItemList valueWithStringwithStringwithBoolean(String arg0, String arg1, boolean arg2) {
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
	
	@Selector("splitWithString:withString:withList:withBoolean:")	
	public void splitWithStringwithStringwithListwithBoolean(String arg0, String arg1, java.util.List arg2, boolean arg3) {
		original.split(arg0, arg1, arg2, arg3);		
	}	
	
	@Selector("splitWithString:withString:withList:")	
	public void splitWithStringwithStringwithList(String arg0, String arg1, java.util.List arg2) {
		original.split(arg0, arg1, arg2);		
	}	
	
	@Selector("setSPWithString:")	
	public void setSPWithString(String arg0) {
		original.setSP(arg0);		
	}	
	
	@Selector("addWithInt:withString:")	
	public void addWithIntwithString(int arg0, String arg1) {
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
	
	@Selector("addAllWithString:withString:")	
	public void addAllWithStringwithString(String arg0, String arg1) {
		original.addAll(arg0, arg1);		
	}	
	
	@Selector("addAllWithString:withString:withBoolean:")	
	public void addAllWithStringwithStringwithBoolean(String arg0, String arg1, boolean arg2) {
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
}
