	public java.lang.reflect.Method a
	public java.lang.reflect.Method b
	 java.lang.reflect.Method c
	private java.lang.reflect.Method d
	
	    public aaj()
	    {
	        try {
	            Class[] v2_1 = new Class[0];
	            this.a = android.widget.AutoCompleteTextView.getDeclaredMethod("doBeforeTextChanged", v2_1);
	            this.a.setAccessible(1);
	        } catch (NoSuchMethodException v0) {
	        }
	        try {
	            Class[] v2_3 = new Class[0];
	            this.b = android.widget.AutoCompleteTextView.getDeclaredMethod("doAfterTextChanged", v2_3);
	            this.b.setAccessible(1);
	        } catch (NoSuchMethodException v0) {
	        }
	        try {
	            Class[] v2_5 = new Class[1];
	            v2_5[0] = Boolean.TYPE;
	            this.d = android.widget.AutoCompleteTextView.getMethod("ensureImeVisible", v2_5);
	            this.d.setAccessible(1);
	        } catch (NoSuchMethodException v0) {
	        }
	        try {
	            Class[] v2_7 = new Class[2];
	            v2_7[0] = Integer.TYPE;
	            v2_7[1] = android.os.ResultReceiver;
	            this.c = android.view.inputmethod.InputMethodManager.getMethod("showSoftInputUnchecked", v2_7);
	            this.c.setAccessible(1);
	        } catch (NoSuchMethodException v0) {
	        }
	        return;
	    }
	
	
	    public final void a(android.widget.AutoCompleteTextView p5, boolean p6)
	    {
	        if (this.d != null) {
	            try {
	                Exception v0_1 = this.d;
	                Object[] v1_1 = new Object[1];
	                v1_1[0] = Boolean.valueOf(1);
	                v0_1.invoke(p5, v1_1);
	            } catch (Exception v0) {
	            }
	        }
	        return;
	    }
	
