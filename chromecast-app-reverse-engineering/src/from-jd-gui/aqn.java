import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.images.WebImage;
import java.util.ArrayList;
import java.util.List;

final class aqn
  implements btq
{
  aqn(aqm paramaqm) {}
  
  public final void a()
  {
    Object localObject1 = aqj.c(this.a.a).b();
    aow localaow;
    Object localObject2;
    atu localatu;
    Object localObject3;
    if ((localObject1 != null) && (((btg)localObject1).a != null))
    {
      localaow = aqj.b(this.a.a);
      localObject1 = ((btg)localObject1).a;
      localObject2 = aqj.d(this.a.a);
      localatu = localaow.o();
      localObject3 = ((bth)localObject1).b("com.google.android.gms.cast.metadata.TITLE");
      if (TextUtils.equals(localatu.f, (CharSequence)localObject3)) {
        break label535;
      }
      localatu.f = ((String)localObject3);
    }
    label530:
    label535:
    for (int i = 1;; i = 0)
    {
      localObject3 = new ArrayList(2);
      switch (((bth)localObject1).c)
      {
      default: 
        if ((((List)localObject3).size() < 2) && (localatu.a != null) && (!TextUtils.isEmpty(localatu.f))) {
          ((List)localObject3).add(localatu.a);
        }
        localObject2 = TextUtils.join("\n", (Iterable)localObject3);
        if (!TextUtils.equals((CharSequence)localObject2, localatu.g))
        {
          localatu.g = ((String)localObject2);
          i = 1;
        }
        break;
      }
      for (;;)
      {
        if (((bth)localObject1).a.isEmpty())
        {
          if (localatu.h != null) {
            i = 1;
          }
          localatu.h = null;
        }
        for (;;)
        {
          if ((localatu.b != null) || (localatu.c != null) || (localatu.e == null) || (localatu.i != null)) {
            i = 1;
          }
          localatu.b = null;
          localatu.c = null;
          localatu.e = null;
          localatu.i = null;
          if (i != 0) {
            localaow.p();
          }
          return;
          if (((bth)localObject1).a("com.google.android.gms.cast.metadata.SUBTITLE")) {
            ((List)localObject3).add(((bth)localObject1).b("com.google.android.gms.cast.metadata.SUBTITLE"));
          }
          if (!((bth)localObject1).a("com.google.android.gms.cast.metadata.ARTIST")) {
            break;
          }
          ((List)localObject3).add(((bth)localObject1).b("com.google.android.gms.cast.metadata.ARTIST"));
          break;
          if (!((bth)localObject1).a("com.google.android.gms.cast.metadata.SUBTITLE")) {
            break;
          }
          ((List)localObject3).add(((bth)localObject1).b("com.google.android.gms.cast.metadata.SUBTITLE"));
          break;
          if ((!((bth)localObject1).a("com.google.android.gms.cast.metadata.SERIES_TITLE")) || (!((bth)localObject1).a("com.google.android.gms.cast.metadata.SEASON_NUMBER")) || (!((bth)localObject1).a("com.google.android.gms.cast.metadata.EPISODE_NUMBER"))) {
            break;
          }
          ((List)localObject3).add(((Context)localObject2).getString(b.dR, new Object[] { ((bth)localObject1).b("com.google.android.gms.cast.metadata.SERIES_TITLE"), Integer.valueOf(((bth)localObject1).c("com.google.android.gms.cast.metadata.SEASON_NUMBER")), Integer.valueOf(((bth)localObject1).c("com.google.android.gms.cast.metadata.EPISODE_NUMBER")) }));
          break;
          if (!((bth)localObject1).a("com.google.android.gms.cast.metadata.ARTIST")) {
            break;
          }
          ((List)localObject3).add(((bth)localObject1).b("com.google.android.gms.cast.metadata.ARTIST"));
          break;
          localObject1 = ((WebImage)((bth)localObject1).a.get(0)).b;
          if (localObject1 == null) {}
          for (localObject1 = "";; localObject1 = ((Uri)localObject1).toString())
          {
            if (TextUtils.equals((CharSequence)localObject1, localatu.h)) {
              break label530;
            }
            localatu.h = ((String)localObject1);
            i = 1;
            break;
          }
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aqn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */