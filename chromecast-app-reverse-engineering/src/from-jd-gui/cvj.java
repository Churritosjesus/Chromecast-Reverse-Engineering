import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

final class cvj
  extends cvf
{
  private static final String b = cip.x.toString();
  private static final String c = cit.f.toString();
  private static final String d = cit.c.toString();
  private static final String e = cit.t.toString();
  
  public cvj()
  {
    super(b, new String[] { c });
  }
  
  public final cje a(Map paramMap)
  {
    Object localObject1 = (cje)paramMap.get(c);
    if ((localObject1 == null) || (localObject1 == cyh.f())) {
      paramMap = cyh.f();
    }
    for (;;)
    {
      return paramMap;
      Object localObject2 = cyh.a((cje)localObject1);
      localObject1 = (cje)paramMap.get(d);
      if (localObject1 == null)
      {
        localObject1 = "MD5";
        label55:
        paramMap = (cje)paramMap.get(e);
        if (paramMap != null) {
          break label121;
        }
        paramMap = "text";
        label75:
        if (!"text".equals(paramMap)) {
          break label129;
        }
      }
      for (paramMap = ((String)localObject2).getBytes();; paramMap = a.m((String)localObject2))
      {
        try
        {
          localObject2 = MessageDigest.getInstance((String)localObject1);
          ((MessageDigest)localObject2).update(paramMap);
          paramMap = cyh.a(a.b(((MessageDigest)localObject2).digest()));
        }
        catch (NoSuchAlgorithmException paramMap)
        {
          label121:
          label129:
          cuh.a("Hash: unknown algorithm: " + (String)localObject1);
          paramMap = cyh.f();
        }
        localObject1 = cyh.a((cje)localObject1);
        break label55;
        paramMap = cyh.a(paramMap);
        break label75;
        if (!"base16".equals(paramMap)) {
          break label146;
        }
      }
      label146:
      cuh.a("Hash: unknown input format: " + paramMap);
      paramMap = cyh.f();
    }
  }
  
  public final boolean a()
  {
    return true;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cvj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */