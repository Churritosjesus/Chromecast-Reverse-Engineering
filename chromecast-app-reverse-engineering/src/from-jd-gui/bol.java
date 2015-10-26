import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;

public final class bol
  extends i
{
  private apd Z;
  
  public static void a(mm parammm)
  {
    parammm = parammm.b;
    if (parammm.a("termsDialog") != null) {}
    for (;;)
    {
      return;
      bol localbol = new bol();
      localbol.b(false);
      localbol.a(parammm, "termsDialog");
    }
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    this.Z = new apd(5);
    boolean bool = blj.d();
    String str2 = a(b.dJ);
    String str1;
    if (bool)
    {
      i = b.cR;
      str1 = a(i);
      if (!bool) {
        break label180;
      }
    }
    label180:
    for (int i = b.dM;; i = b.dL)
    {
      paramBundle = a(i, new Object[] { str2, str1 });
      paramBundle = blx.a(this.y, a.gQ, paramBundle, new String[] { str2, blx.b(this.y), str1, blx.a(this.y) });
      return new AlertDialog.Builder(this.y).setTitle(b.dN).setView(paramBundle).setPositiveButton(b.dH, new bon(this)).setNegativeButton(a(b.dI), new bom(this)).create();
      i = b.cQ;
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bol.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */