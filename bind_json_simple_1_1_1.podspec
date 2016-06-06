Pod::Spec.new do |spec|
  spec.name                 = 'bind_json_simple_1_1_1'
  spec.version              = '2.0.3'
  spec.homepage             = "https://github.com/kovacsi/bind_json_simple_1_1_1/"
  spec.license              = { :type => 'EPL', :file => 'LICENSE.txt' }
  spec.author               = { "Migeran" => "support@migeran.com" }
  spec.summary              = 'Bind test for the json-simple-1.1.1.jar'
  spec.platform             = :ios, "8.4"
  spec.source               = { :git => 'https://github.com/kovacsi/bind_json_simple_1_1_1.git', :tag => '2.0.3'}
  spec.source_files         = ['xcode/bind_json_simple_1_1_1/**/*.{h,m}', 'src/main/java/**/*.java', 'lib/*.jar']
  spec.exclude_files        = ['**/AppViewController.java', '**/AppDelegate.{h,m}', '**/main.cpp']
  spec.requires_arc         = true
end
