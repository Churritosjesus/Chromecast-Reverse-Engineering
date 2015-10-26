	private synthetic java.lang.reflect.Field a
	private synthetic android.widget.PopupWindow b
	private synthetic android.view.ViewTreeObserver$OnScrollChangedListener c
	
	    sc(reflect.Field p1, android.widget.PopupWindow p2, android.view.ViewTreeObserver$OnScrollChangedListener p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    public final void onScrollChanged()
	    {
	        try {
	            android.view.ViewTreeObserver$OnScrollChangedListener v0_2 = ((ref.WeakReference) this.a.get(this.b));
	        } catch (android.view.ViewTreeObserver$OnScrollChangedListener v0) {
	            return;
	        }
	        if ((v0_2 != null) && (v0_2.get() != null)) {
	            this.c.onScrollChanged();
	            return;
	        } else {
	            return;
	        }
	    }
	
