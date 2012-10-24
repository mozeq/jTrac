classes:
	javac -d "bin" -classpath "bin" "src/org/mozeq/Trac/Ticket.java"
	javac -d "bin" -classpath "bin:jars/commons-logging-1.1.jar:jars/ws-commons-util-1.0.2.jar:jars/xmlrpc-client-3.1.3.jar:jars/xmlrpc-common-3.1.3.jar:jars/xmlrpc-server-3.1.3.jar" "src/org/mozeq/Trac/TracProxy.java"

test: classes
	javac -d "bin" -classpath "bin:jars/commons-logging-1.1.jar:jars/ws-commons-util-1.0.2.jar:jars/xmlrpc-client-3.1.3.jar:jars/xmlrpc-common-3.1.3.jar:jars/xmlrpc-server-3.1.3.jar" "src/org/mozeq/Trac/jTracTest.java"

jar: classes
	jar cvf jTrac.jar -C bin org

clean:
	rm -rf `find bin -name ".class"`

default: classes
