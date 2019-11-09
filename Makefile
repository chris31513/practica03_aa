all:
	javac src/*.java
	java src/Main

clean:
	rm -r src/*.class