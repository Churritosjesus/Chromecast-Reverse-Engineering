import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

final class dig
{
  private static final die[] a;
  private static final Map b;
  
  static
  {
    int i = 0;
    a = new die[] { new die(die.e, ""), new die(die.b, "GET"), new die(die.b, "POST"), new die(die.c, "/"), new die(die.c, "/index.html"), new die(die.d, "http"), new die(die.d, "https"), new die(die.a, "200"), new die(die.a, "204"), new die(die.a, "206"), new die(die.a, "304"), new die(die.a, "400"), new die(die.a, "404"), new die(die.a, "500"), new die("accept-charset", ""), new die("accept-encoding", "gzip, deflate"), new die("accept-language", ""), new die("accept-ranges", ""), new die("accept", ""), new die("access-control-allow-origin", ""), new die("age", ""), new die("allow", ""), new die("authorization", ""), new die("cache-control", ""), new die("content-disposition", ""), new die("content-encoding", ""), new die("content-language", ""), new die("content-length", ""), new die("content-location", ""), new die("content-range", ""), new die("content-type", ""), new die("cookie", ""), new die("date", ""), new die("etag", ""), new die("expect", ""), new die("expires", ""), new die("from", ""), new die("host", ""), new die("if-match", ""), new die("if-modified-since", ""), new die("if-none-match", ""), new die("if-range", ""), new die("if-unmodified-since", ""), new die("last-modified", ""), new die("link", ""), new die("location", ""), new die("max-forwards", ""), new die("proxy-authenticate", ""), new die("proxy-authorization", ""), new die("range", ""), new die("referer", ""), new die("refresh", ""), new die("retry-after", ""), new die("server", ""), new die("set-cookie", ""), new die("strict-transport-security", ""), new die("transfer-encoding", ""), new die("user-agent", ""), new die("vary", ""), new die("via", ""), new die("www-authenticate", "") };
    LinkedHashMap localLinkedHashMap = new LinkedHashMap(a.length);
    while (i < a.length)
    {
      if (!localLinkedHashMap.containsKey(a[i].h)) {
        localLinkedHashMap.put(a[i].h, Integer.valueOf(i));
      }
      i++;
    }
    b = Collections.unmodifiableMap(localLinkedHashMap);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */