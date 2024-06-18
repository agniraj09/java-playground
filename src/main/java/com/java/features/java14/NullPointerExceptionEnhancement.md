1. Previously, the stack trace for a NullPointerException didn’t have much of a story to tell except that some value was null at a given line in a given file.
2. Though useful, this information only suggested a line to debug instead of painting the whole picture for a developer to understand, just by looking at the log.
3. Now Java has made this easier by adding the capability to point out what exactly was null in a given line of code.

For example, consider this simple snippet:

>int[] arr = null;\
arr[0] = 1;

Earlier, on running this code, the log would say:

>Exception in thread "main" java.lang.NullPointerException\
at com.baeldung.MyClass.main(MyClass.java:27)

But now, given the same scenario, the log might say:

>java.lang.NullPointerException: Cannot store to int array because "a" is null

As we can see, now we know precisely which variable caused the exception.