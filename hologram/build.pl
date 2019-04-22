#src dst
if((!exists $ARGV[0] && exists $ARGV[1])){

	print "Set source and destination\n";
	exit;
}
$args=`find $ARGV[0] -name *.java`;
$args=~s/\n/ /g;

system "javac ".$args." -d $ARGV[1]";
