package x.org.json.simple.parser;

import com.intel.moe.natj.general.Pointer;
import com.intel.moe.natj.general.ann.RegisterOnStartup;
import com.intel.moe.natj.objc.ObjCRuntime;
import com.intel.moe.natj.objc.ann.ObjCClassName;
import com.intel.moe.natj.objc.ann.Selector;
import ios.NSObject;

@ObjCClassName("x_org_json_simple_parser_JSONParser")
@RegisterOnStartup
@com.intel.moe.natj.general.ann.Runtime(ObjCRuntime.class)
public class JSONParser extends NSObject {

	private org.json.simple.parser.JSONParser original;

	protected JSONParser(Pointer peer) {
		super(peer);
	}

	@Selector("reset")
	public void reset() {
		original.reset();
	}

	@Selector("reset:")
	public void reset(java.io.Reader arg0) {
		original.reset(arg0);
	}

	@Selector("getPosition")
	public int getPosition() {
		return original.getPosition();
	}

	@Selector("parse:")
	public Object parse(String arg0) throws org.json.simple.parser.ParseException {
		return original.parse(arg0);
	}

	@Selector("parse::")
	public Object parse(String arg0, org.json.simple.parser.ContainerFactory arg1) throws org.json.simple.parser.ParseException {
		return original.parse(arg0, arg1);
	}

	@Selector("parse:")
	public Object parse(java.io.Reader arg0) throws java.io.IOException, org.json.simple.parser.ParseException {
		return original.parse(arg0);
	}

	@Selector("parse::")
	public Object parse(java.io.Reader arg0, org.json.simple.parser.ContainerFactory arg1) throws java.io.IOException, org.json.simple.parser.ParseException {
		return original.parse(arg0, arg1);
	}

	@Selector("parse::")
	public void parse(String arg0, org.json.simple.parser.ContentHandler arg1) throws org.json.simple.parser.ParseException {
		original.parse(arg0, arg1);
	}

	@Selector("parse:::")
	public void parse(String arg0, org.json.simple.parser.ContentHandler arg1, boolean arg2) throws org.json.simple.parser.ParseException {
		original.parse(arg0, arg1, arg2);
	}

	@Selector("parse::")
	public void parse(java.io.Reader arg0, org.json.simple.parser.ContentHandler arg1) throws java.io.IOException, org.json.simple.parser.ParseException {
		original.parse(arg0, arg1);
	}

	@Selector("parse:::")
	public void parse(java.io.Reader arg0, org.json.simple.parser.ContentHandler arg1, boolean arg2) throws java.io.IOException, org.json.simple.parser.ParseException {
		original.parse(arg0, arg1, arg2);
	}

}
