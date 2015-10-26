	private synthetic android.view.View a
	private synthetic android.view.View$OnFocusChangeListener b
	private synthetic android.app.Activity c
	private synthetic android.widget.TextView d
	
	    bmc(android.view.View p1, android.view.View$OnFocusChangeListener p2, android.app.Activity p3, android.widget.TextView p4)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        this.d = p4;
	        return;
	    }
	
	
	    public final void onFocusChange(android.view.View p4, boolean p5)
	    {
	        if (p5) {
	            apg.a(129).b();
	        }
	        android.view.inputmethod.InputMethodManager v0_2;
	        if (!p5) {
	            v0_2 = 8;
	        } else {
	            v0_2 = 0;
	        }
	        this.a.setVisibility(v0_2);
	        if (this.b != null) {
	            this.b.onFocusChange(p4, p5);
	        }
	        ((android.view.inputmethod.InputMethodManager) this.c.getSystemService("input_method")).hideSoftInputFromWindow(this.d.getWindowToken(), 0);
	        return;
	    }
	
