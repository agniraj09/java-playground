strip()
---
**Difference between trim() and strip()**

>In Java, both strip() and trim() methods are used to remove leading and trailing whitespace from strings, but there are some important differences in how they operate and their compatibility with different versions of Java.

**trim()**\
Java Version : Available since Java 1.0, making it compatible with all Java versions

Whitespace Definition: The trim() method removes characters that have a codepoint value less than or equal to U+0020 (the space character in ASCII). This includes the standard ASCII whitespace characters such as space, tab, line feed, and carriage return.

Limitation: It does not remove non-breaking spaces (like U+00A0) or any whitespace characters that are part of the Unicode standard but not in the ASCII set.

**Example of trim()**
> String example = "\t hello world \n";\
System.out.println("Trimmed: '" + example.trim() + "'");\
// Output: 'hello world'\
Notice that trim() removes the tab and newline characters but would not handle other Unicode whitespaces.

**strip()**

Java Version: Introduced in Java 11 as part of enhancing the String class to support Unicode better.

Whitespace Definition: The strip() method uses the Character.isWhitespace method to check if a character is whitespace according to Unicode standards. It removes all Unicode whitespaces, not just those in the ASCII set.

Advantage: More versatile in applications where the text includes non-ASCII whitespace characters.

**Example of strip()**
>String example = "\u2000\u2003 hello world \u202F"; // Using different Unicode spaces\
System.out.println("Stripped: '" + example.strip() + "'");\
// Output: 'hello world'\
Here, strip() effectively removes Unicode spaces that trim() would not.

**Summary**

>1. Use trim() when working with older Java versions or when you are sure that your strings will only contain ASCII characters.
> 2. Use strip() for a more comprehensive whitespace removal that adheres to Unicode standards, especially when dealing with modern, internationalized text content.
> 3. The choice between strip() and trim() will largely depend on your application’s requirements and the Java version you are using. If you're using Java 11 or later, strip() is generally the better choice for dealing with diverse and international text data.