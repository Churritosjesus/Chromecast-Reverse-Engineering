	private android.app.AlertDialog a
	private android.widget.ListAdapter b
	private java.lang.CharSequence c
	private synthetic sr d
	
	    su(sr p1)
	    {
	        this.d = p1;
	        return;
	    }
	
	
	    public final void a()
	    {
	        if (this.a != null) {
	            this.a.dismiss();
	            this.a = 0;
	        }
	        return;
	    }
	
	
	    public final void a(android.widget.ListAdapter p1)
	    {
	        this.b = p1;
	        return;
	    }
	
	
	    public final void a(CharSequence p1)
	    {
	        this.c = p1;
	        return;
	    }
	
	
	    public final boolean b()
	    {
	        int v0_1;
	        if (this.a == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = this.a.isShowing();
	        }
	        return v0_1;
	    }
	
	
	    public final void c()
	    {
	        if (this.b != null) {
	            android.app.AlertDialog v0_2 = new android.app.AlertDialog$Builder(this.d.getContext());
	            if (this.c != null) {
	                v0_2.setTitle(this.c);
	            }
	            this.a = v0_2.setSingleChoiceItems(this.b, this.d.n, this).create();
	            this.a.show();
	        }
	        return;
	    }
	
	
	    public final void onClick(android.content.DialogInterface p5, int p6)
	    {
	        this.d.a(p6);
	        if (this.d.l != null) {
	            this.d.a(0, p6, this.b.getItemId(p6));
	        }
	        this.a();
	        return;
	    }
	
