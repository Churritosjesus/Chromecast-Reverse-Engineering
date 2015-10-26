import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;

public final class bkc
  extends j
  implements ats
{
  private ImageView a;
  
  public static bkc a(String paramString1, String paramString2, String paramString3)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("tutorialTitle", paramString1);
    localBundle.putString("tutorialDescription", paramString2);
    localBundle.putString("tutorialImageUrl", paramString3);
    paramString1 = new bkc();
    paramString1.f(localBundle);
    return paramString1;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(a.gR, paramViewGroup, false);
    ((TextView)paramLayoutInflater.findViewById(f.em)).setText(this.m.getString("tutorialTitle"));
    ((TextView)paramLayoutInflater.findViewById(f.aq)).setText(this.m.getString("tutorialDescription"));
    this.a = ((ImageView)paramLayoutInflater.findViewById(f.bw));
    if (this.a != null) {
      this.a.getViewTreeObserver().addOnPreDrawListener(new bkd(this));
    }
    return paramLayoutInflater;
  }
  
  public final void a(Bitmap paramBitmap)
  {
    this.a.setImageBitmap(paramBitmap);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bkc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */