	private  a
	private  b
	private synthetic android.widget.Spinner c
	private synthetic all d
	private synthetic java.lang.String e
	
	    public alk(com.google.android.apps.chromecast.app.DebugActivity p2, android.widget.Spinner p3, all p4, String p5)
	    {
	        this.c = p3;
	        this.d = p4;
	        this.e = p5;
	        this.a = 0;
	        this.b = this.c.getSelectedItemPosition();
	        return;
	    }
	
	
	    public final void onItemSelected(android.widget.AdapterView p4, android.view.View p5, int p6, long p7)
	    {
	        if ((this.a) || (p6 == this.b)) {
	            this.a = 0;
	        } else {
	            int v0_4 = com.google.android.apps.chromecast.app.DebugActivity.a(((String) p4.getItemAtPosition(p6)), this.d.c());
	            String[] v2_3 = this.d.d();
	            if (v0_4 < 0) {
	                v0_4 = 0;
	            }
	            int v0_5 = v2_3[v0_4];
	            if (!this.e.equals(v0_5)) {
	                this.d.a(v0_5);
	            }
	            if (android.text.TextUtils.isEmpty(v0_5)) {
	                int v0_9 = com.google.android.apps.chromecast.app.DebugActivity.a(this.d.a(), this.d.d());
	                if (v0_9 >= 0) {
	                    this.a = 1;
	                    this.c.setSelection(v0_9);
	                }
	            }
	        }
	        this.b = this.c.getSelectedItemPosition();
	        return;
	    }
	
	
	    public final void onNothingSelected(android.widget.AdapterView p1)
	    {
	        return;
	    }
	
