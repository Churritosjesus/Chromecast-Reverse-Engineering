import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.StateListDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.util.Rfc822Token;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;

public final class abj
{
  abo a;
  abp b;
  abw c;
  private final LayoutInflater d;
  private final Context e;
  private int f;
  
  public abj(LayoutInflater paramLayoutInflater, Context paramContext)
  {
    this.d = paramLayoutInflater;
    this.e = paramContext;
    this.f = paramContext.getResources().getDimensionPixelOffset(a.cC);
  }
  
  private static void a(View paramView, int paramInt)
  {
    if (paramView != null) {
      paramView.setVisibility(paramInt);
    }
  }
  
  private static void a(CharSequence paramCharSequence, TextView paramTextView)
  {
    if (paramTextView == null) {}
    for (;;)
    {
      return;
      if (paramCharSequence != null)
      {
        paramTextView.setText(paramCharSequence);
        paramTextView.setVisibility(0);
      }
      else
      {
        paramTextView.setVisibility(8);
      }
    }
  }
  
  protected static int b(int paramInt)
  {
    switch (abm.a[(paramInt - 1)])
    {
    default: 
      paramInt = a.cO;
    }
    for (;;)
    {
      return paramInt;
      paramInt = a.cN;
      continue;
      paramInt = a.cO;
    }
  }
  
  private static int c(int paramInt)
  {
    switch (abm.a[(paramInt - 1)])
    {
    default: 
      paramInt = a.cO;
    }
    for (;;)
    {
      return paramInt;
      paramInt = a.cN;
      continue;
      paramInt = a.cO;
    }
  }
  
  public final View a(int paramInt)
  {
    return this.d.inflate(c(paramInt), null);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, acx paramacx, int paramInt1, int paramInt2, String paramString, StateListDrawable paramStateListDrawable)
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = paramacx.c;
    arrayOfString[1] = paramacx.d;
    int i;
    label33:
    label59:
    label68:
    int k;
    int j;
    Object localObject1;
    if (!TextUtils.isEmpty(paramString))
    {
      i = 0;
      if (i < paramString.length()) {
        if (!Character.isWhitespace(paramString.charAt(i)))
        {
          i = 0;
          if (i == 0) {
            break label439;
          }
          paramString = arrayOfString;
          arrayOfString = paramString[0];
          paramString = paramString[1];
          k = 1;
          j = 1;
          localObject1 = this.c.a(this.e.getResources(), paramacx.e, paramacx.f).toString().toUpperCase();
          int m = c(paramInt2);
          i = m;
          switch (abm.a[(paramInt2 - 1)])
          {
          default: 
            i = m;
          case 1: 
          case 2: 
            label168:
            if (paramView == null) {
              break;
            }
          }
        }
      }
    }
    abq localabq;
    for (Object localObject2 = paramView;; localObject2 = this.d.inflate(i, paramViewGroup, false))
    {
      localabq = new abq(this, (View)localObject2);
      switch (abm.a[(paramInt2 - 1)])
      {
      default: 
        paramViewGroup = paramString;
        paramView = (View)localObject1;
        paramString = arrayOfString;
        i = j;
        label234:
        a(paramString, localabq.b);
        a(paramViewGroup, localabq.c);
        a(paramView, localabq.d);
        paramView = localabq.f;
        if (paramView != null) {
          if (i == 0) {
            break label850;
          }
        }
        switch (abm.a[(paramInt2 - 1)])
        {
        default: 
          label308:
          paramView.setVisibility(0);
          label313:
          paramViewGroup = paramacx.c;
          paramString = localabq.g;
          if (paramString != null)
          {
            if (paramStateListDrawable != null) {
              break label859;
            }
            paramString.setVisibility(8);
          }
          label342:
          paramView = localabq.e;
          if (paramView != null)
          {
            if (0 != 0) {
              break label919;
            }
            paramView.setVisibility(8);
          }
          label362:
          paramView = localabq.l;
          if (paramView != null) {
            paramView.setOnClickListener(new abl(this));
          }
          paramInt1 = paramacx.a;
          if (paramInt1 != 0) {
            break label940;
          }
          a(localabq.a, 0);
          a(localabq.k, 8);
          a(localabq.j, 8);
          label424:
          return (View)localObject2;
          i++;
          break label33;
          i = 1;
          break label59;
          label439:
          localObject1 = new CharSequence[2];
          j = 0;
          i = 0;
          if (i < 2)
          {
            localObject2 = arrayOfString[i];
            k = j;
            if (localObject2 != null)
            {
              if (j != 0) {
                break label563;
              }
              k = ((String)localObject2).toLowerCase().indexOf(paramString.toLowerCase());
              if (k == -1) {
                break label563;
              }
              localObject2 = SpannableStringBuilder.valueOf((CharSequence)localObject2);
              ((SpannableStringBuilder)localObject2).setSpan(new ForegroundColorSpan(this.e.getResources().getColor(a.cw)), k, paramString.length() + k, 33);
              localObject1[i] = localObject2;
            }
            for (k = 1;; k = j)
            {
              i++;
              j = k;
              break;
              label563:
              localObject1[i] = localObject2;
            }
          }
          paramString = (String)localObject1;
          break label68;
          i = b(paramInt2);
          break label168;
        }
        break;
      }
    }
    if ((TextUtils.isEmpty(arrayOfString)) || (TextUtils.equals(arrayOfString, paramString))) {
      if (paramacx.b) {
        paramViewGroup = null;
      }
    }
    for (;;)
    {
      if (!paramacx.b) {
        paramString = null;
      }
      for (i = 0;; i = k)
      {
        if (localabq.h != null)
        {
          paramView = localabq.h;
          if (paramInt1 != 0) {
            break label728;
          }
        }
        label728:
        for (paramInt1 = 0;; paramInt1 = 8)
        {
          paramView.setVisibility(paramInt1);
          ft.a((ViewGroup.MarginLayoutParams)localabq.h.getLayoutParams(), this.f);
          if (localabq.i == null) {
            break label977;
          }
          ft.a((ViewGroup.MarginLayoutParams)localabq.i.getLayoutParams(), this.f);
          paramView = (View)localObject1;
          break;
        }
        if (paramInt1 == 0) {
          break;
        }
        i = 0;
        arrayOfString = null;
        paramViewGroup = paramString;
        paramView = (View)localObject1;
        paramString = arrayOfString;
        break label234;
        paramViewGroup = android.text.util.Rfc822Tokenizer.tokenize(paramacx.d)[0].getAddress();
        paramView = null;
        paramString = arrayOfString;
        i = j;
        break label234;
        paramViewGroup = paramacx.a();
        if ((paramViewGroup != null) && (paramViewGroup.length > 0))
        {
          paramView.setImageBitmap(BitmapFactory.decodeByteArray(paramViewGroup, 0, paramViewGroup.length));
          break label308;
        }
        paramView.setImageResource(a.cF);
        break label308;
        paramViewGroup = paramacx.j;
        if (paramViewGroup != null)
        {
          paramView.setImageURI(paramViewGroup);
          break label308;
        }
        paramView.setImageResource(a.cF);
        break label308;
        label850:
        paramView.setVisibility(8);
        break label313;
        label859:
        paramView = this.e.getResources();
        paramString.setImageDrawable(paramStateListDrawable);
        paramString.setContentDescription(paramView.getString(a.cU, new Object[] { paramViewGroup }));
        if (this.a == null) {
          break label342;
        }
        paramString.setOnClickListener(new abk(this, paramStateListDrawable));
        break label342;
        label919:
        paramView.setText(null);
        paramView.setVisibility(0);
        paramView.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, null, null);
        break label362;
        label940:
        if (paramInt1 != 1) {
          break label424;
        }
        a(localabq.a, 8);
        a(localabq.k, 0);
        a(localabq.j, 0);
        break label424;
        label977:
        paramView = (View)localObject1;
        break label234;
      }
      paramViewGroup = paramString;
      continue;
      paramViewGroup = paramString;
      paramString = arrayOfString;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\abj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */