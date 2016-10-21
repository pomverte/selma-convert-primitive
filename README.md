# selma-convert-primitive
bug suspicion about a mapper from primitive type long to String

Simple Mapping from object SourceLong => DestinationString with one attribute to see primitive conversion long => String

Generated Selma Class doesn't seems to compile :
```java
@Override
public final DestinationString convertWithPrimitive(SourceLong in) {
  fr.pomverte.DestinationString out = null;
  if (in != null) {
    out = new fr.pomverte.DestinationString();
    out.setUid(in.getUid()""); // compilation error
  }
  return out;
}
```
