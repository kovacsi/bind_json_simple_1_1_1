package x.org.json.simple.parser;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.Owned;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("JBYytoken")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class Yytoken extends NSObject {	
	
	public org.json.simple.parser.Yytoken original;	
	
	protected Yytoken(Pointer peer) {		
		super(peer);		
	}	
	
	@Owned	
	@Selector("alloc")	
	public static native Yytoken alloc();	
	
	@Selector("valueWithInt:withObject:")	
	public Yytoken valueWithIntwithObject(int arg0, Object arg1) {
		Yytoken self = (Yytoken) Yytoken.alloc().init();		
		self.original = new org.json.simple.parser.Yytoken(arg0, arg1);		
		return self;		
	}	
	
	@Selector("toString")	
	public String toString() {
		return original.toString();		
	}	
}
