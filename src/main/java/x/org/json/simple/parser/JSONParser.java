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
	
	@Selector("value")	
	public JSONParser value() {		
		JSONParser self = (JSONParser) JSONParser.alloc().init();		
		self.original = new org.json.simple.parser.JSONParser();		
		return self;		
	}	
	
	@Selector("reset")	
	public void reset() {		
		original.reset();		
	}	
	
	@Selector("resetWithReader:")	
	public void resetWithReader(java.io.Reader arg0) {		
		original.reset(arg0);		
	}	
	
	@Selector("getPosition")	
	public int getPosition() {		
		return original.getPosition();		
	}	
	
	@Selector("parseWithString:")	
	public Object parseWithString(String arg0) throws org.json.simple.parser.ParseException {
		return original.parse(arg0);		
	}	
	
	@Selector("parseWithString:ContainerFactory:")	
	public Object parseWithStringContainerFactory(String arg0, Object arg1) throws org.json.simple.parser.ParseException {
		return original.parse(arg0, (org.json.simple.parser.ContainerFactory) arg1);		
	}	
	
	@Selector("parseWithReader:")	
	public Object parseWithReader(java.io.Reader arg0) throws java.io.IOException, org.json.simple.parser.ParseException {
		return original.parse(arg0);		
	}	
	
	@Selector("parseWithReader:ContainerFactory:")	
	public Object parseWithReaderContainerFactory(java.io.Reader arg0, Object arg1) throws java.io.IOException, org.json.simple.parser.ParseException {
		return original.parse(arg0, (org.json.simple.parser.ContainerFactory) arg1);		
	}	
	
	@Selector("parseWithString:ContentHandler:")	
	public void parseWithStringContentHandler(String arg0, Object arg1) throws org.json.simple.parser.ParseException {
		original.parse(arg0, (org.json.simple.parser.ContentHandler) arg1);		
	}	
	
	@Selector("parseWithString:ContentHandler:Boolean:")	
	public void parseWithStringContentHandlerBoolean(String arg0, Object arg1, boolean arg2) throws org.json.simple.parser.ParseException {
		original.parse(arg0, (org.json.simple.parser.ContentHandler) arg1, arg2);		
	}	
	
	@Selector("parseWithReader:ContentHandler:")	
	public void parseWithReaderContentHandler(java.io.Reader arg0, Object arg1) throws java.io.IOException, org.json.simple.parser.ParseException {
		original.parse(arg0, (org.json.simple.parser.ContentHandler) arg1);		
	}	
	
	@Selector("parseWithReader:ContentHandler:Boolean:")	
	public void parseWithReaderContentHandlerBoolean(java.io.Reader arg0, Object arg1, boolean arg2) throws java.io.IOException, org.json.simple.parser.ParseException {
		original.parse(arg0, (org.json.simple.parser.ContentHandler) arg1, arg2);		
	}	
	
	@Selector("hashCode")	
	public int hashCode() {		
		return original.hashCode();		
	}	
	
	@Selector("equalsWithObject:")	
	public boolean equalsWithObject(Object arg0) {
		return original.equals(arg0);		
	}	
	
	@Selector("toString")	
	public String toString() {
		return original.toString();		
	}	
}
