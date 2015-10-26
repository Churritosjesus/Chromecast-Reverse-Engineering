package com.google.android.apps.chromecast.app.backdrop;

import acb;
import acx;
import ada;
import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import asw;
import java.util.ArrayList;
import java.util.List;

public class PeoplePickerRecipientView
  extends acb
{
  private Handler d = new Handler();
  
  public PeoplePickerRecipientView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void i()
  {
    ada[] arrayOfada = (ada[])getText().getSpans(0, getText().length(), ada.class);
    ArrayList localArrayList = new ArrayList();
    if (arrayOfada != null)
    {
      int j = arrayOfada.length;
      for (int i = 0; i < j; i++) {
        localArrayList.add(arrayOfada[i].g());
      }
    }
    if (localArrayList.size() > 1) {
      b((acx)localArrayList.get(0));
    }
  }
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 6) {
      i();
    }
    return super.onEditorAction(paramTextView, paramInt, paramKeyEvent);
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    super.onItemClick(paramAdapterView, paramView, paramInt, paramLong);
    i();
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramCharSequence.length() > 1)
    {
      this.d.removeMessages(0);
      this.d.postDelayed(new asw(this, paramCharSequence, paramInt1, paramInt2, paramInt3), 500L);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\apps\chromecast\app\backdrop\PeoplePickerRecipientView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */