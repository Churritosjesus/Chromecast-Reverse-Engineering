	private synthetic android.support.v7.widget.SearchView a
	
	    public zx(android.support.v7.widget.SearchView p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void run()
	    {
	        android.view.inputmethod.InputMethodManager v0_3 = ((android.view.inputmethod.InputMethodManager) this.a.getContext().getSystemService("input_method"));
	        if (v0_3 != null) {
	            Exception v1_1 = android.support.v7.widget.SearchView.m;
	            android.support.v7.widget.SearchView v2 = this.a;
	            if (v1_1.c != null) {
	                try {
	                    Exception v1_2 = v1_1.c;
	                    Object[] v3_2 = new Object[2];
	                    v3_2[0] = Integer.valueOf(0);
	                    v3_2[1] = 0;
	                    v1_2.invoke(v0_3, v3_2);
	                } catch (Exception v1) {
	                }
	                return;
	            }
	            v0_3.showSoftInput(v2, 0);
	        }
	        return;
	    }
	
