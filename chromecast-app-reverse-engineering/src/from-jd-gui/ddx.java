import java.io.IOException;

public final class ddx
  extends IOException
{
  private static final long serialVersionUID = -1616151763072450476L;
  public dea a = null;
  
  public ddx(String paramString)
  {
    super(paramString);
  }
  
  static ddx a()
  {
    return new ddx("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
  }
  
  static ddx b()
  {
    return new ddx("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
  }
  
  static ddx c()
  {
    return new ddx("CodedInputStream encountered a malformed varint.");
  }
  
  static ddx d()
  {
    return new ddx("Protocol message contained an invalid tag (zero).");
  }
  
  static ddx e()
  {
    return new ddx("Protocol message end-group tag did not match expected tag.");
  }
  
  static ddx f()
  {
    return new ddx("Protocol message tag had invalid wire type.");
  }
  
  static ddx g()
  {
    return new ddx("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ddx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */