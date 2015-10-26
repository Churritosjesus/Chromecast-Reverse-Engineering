import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class dfd
{
  public static final dfd a = new dfd(new dfe());
  private final Map b;
  
  dfd(dfe paramdfe)
  {
    this.b = dgs.a(paramdfe.a);
  }
  
  private static dke a(X509Certificate paramX509Certificate)
  {
    return dgs.a(dke.a(paramX509Certificate.getPublicKey().getEncoded()));
  }
  
  public static String a(Certificate paramCertificate)
  {
    if (!(paramCertificate instanceof X509Certificate)) {
      throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }
    return "sha1/" + djy.a(a((X509Certificate)paramCertificate).b);
  }
  
  public final void a(String paramString, List paramList)
  {
    Object localObject3 = null;
    Object localObject2 = (Set)this.b.get(paramString);
    int i = paramString.indexOf('.');
    if (i != paramString.lastIndexOf('.')) {}
    for (Object localObject1 = (Set)this.b.get("*." + paramString.substring(i + 1));; localObject1 = null)
    {
      if ((localObject2 == null) && (localObject1 == null)) {
        localObject1 = localObject3;
      }
      while (localObject1 == null)
      {
        return;
        if ((localObject2 != null) && (localObject1 != null))
        {
          localObject3 = new LinkedHashSet();
          ((Set)localObject3).addAll((Collection)localObject2);
          ((Set)localObject3).addAll((Collection)localObject1);
          localObject1 = localObject3;
        }
        else if (localObject2 != null)
        {
          localObject1 = localObject2;
        }
      }
      int j = paramList.size();
      for (i = 0;; i++)
      {
        if (i >= j) {
          break label194;
        }
        if (((Set)localObject1).contains(a((X509Certificate)paramList.get(i)))) {
          break;
        }
      }
      label194:
      localObject2 = new StringBuilder("Certificate pinning failure!").append("\n  Peer certificate chain:");
      j = paramList.size();
      for (i = 0; i < j; i++)
      {
        localObject3 = (X509Certificate)paramList.get(i);
        ((StringBuilder)localObject2).append("\n    ").append(a((Certificate)localObject3)).append(": ").append(((X509Certificate)localObject3).getSubjectDN().getName());
      }
      ((StringBuilder)localObject2).append("\n  Pinned certificates for ").append(paramString).append(":");
      paramList = ((Set)localObject1).iterator();
      while (paramList.hasNext())
      {
        paramString = (dke)paramList.next();
        ((StringBuilder)localObject2).append("\n    sha1/").append(djy.a(paramString.b));
      }
      throw new SSLPeerUnverifiedException(((StringBuilder)localObject2).toString());
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dfd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */