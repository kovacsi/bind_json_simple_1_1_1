package x.org.json.simple;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_json_simple_ItemList")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class ItemList extends NSObject {

	private org.json.simple.ItemList original;

	protected ItemList(Pointer peer) {
		super(peer);
	}

	@Selector("valueWithString:")
	public ItemList valueWithString(String arg0) {
		ItemList self = (ItemList) ItemList.alloc().init();
		self.original = new org.json.simple.ItemList(arg0);
		return self;
	}

	@Selector("valueWithStringWithString::")
	public ItemList valueWithStringWithString(String arg0, String arg1) {
		ItemList self = (ItemList) ItemList.alloc().init();
		self.original = new org.json.simple.ItemList(arg0, arg1);
		return self;
	}

	@Selector("valueWithStringWithStringWithBool:::")
	public ItemList valueWithStringWithStringWithBool(String arg0, String arg1, boolean arg2) {
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

	@Selector("split::::")
	public void split(String arg0, String arg1, java.util.List arg2, boolean arg3) {
		original.split(arg0, arg1, arg2, arg3);
	}

	@Selector("split:::")
	public void split(String arg0, String arg1, java.util.List arg2) {
		original.split(arg0, arg1, arg2);
	}

	@Selector("setSP:")
	public void setSP(String arg0) {
		original.setSP(arg0);
	}

	@Selector("add::")
	public void add(int arg0, String arg1) {
		original.add(arg0, arg1);
	}

	@Selector("add:")
	public void add(String arg0) {
		original.add(arg0);
	}

	@Selector("addAll:")
	public void addAll(org.json.simple.ItemList arg0) {
		original.addAll(arg0);
	}

	@Selector("addAll:")
	public void addAll(String arg0) {
		original.addAll(arg0);
	}

	@Selector("addAll::")
	public void addAll(String arg0, String arg1) {
		original.addAll(arg0, arg1);
	}

	@Selector("addAll:::")
	public void addAll(String arg0, String arg1, boolean arg2) {
		original.addAll(arg0, arg1, arg2);
	}

	@Selector("get:")
	public String get(int arg0) {
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

	@Selector("toString:")
	public String toString(String arg0) {
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
