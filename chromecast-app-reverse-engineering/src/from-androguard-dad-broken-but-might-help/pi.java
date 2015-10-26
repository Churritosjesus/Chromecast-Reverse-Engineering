	public  a
	private android.content.res.Resources$Theme b
	private android.view.LayoutInflater c
	
	    public pi(android.content.Context p1, int p2)
	    {
	        this(p1);
	        this.a = p2;
	        return;
	    }
	
	
	    private void a()
	    {
	        android.content.res.Resources$Theme v0_1;
	        if (this.b != null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        if (v0_1 != null) {
	            this.b = this.getResources().newTheme();
	            android.content.res.Resources$Theme v0_5 = this.getBaseContext().getTheme();
	            if (v0_5 != null) {
	                this.b.setTo(v0_5);
	            }
	        }
	        this.b.applyStyle(this.a, 1);
	        return;
	    }
	
	
	    public final Object getSystemService(String p2)
	    {
	        android.view.LayoutInflater v0_3;
	        if (!"layout_inflater".equals(p2)) {
	            v0_3 = this.getBaseContext().getSystemService(p2);
	        } else {
	            if (this.c == null) {
	                this.c = android.view.LayoutInflater.from(this.getBaseContext()).cloneInContext(this);
	            }
	            v0_3 = this.c;
	        }
	        return v0_3;
	    }
	
	
	    public final android.content.res.Resources$Theme getTheme()
	    {
	        android.content.res.Resources$Theme v0_3;
	        if (this.b == null) {
	            if (this.a == 0) {
	                this.a = a.ca;
	            }
	            this.a();
	            v0_3 = this.b;
	        } else {
	            v0_3 = this.b;
	        }
	        return v0_3;
	    }
	
	
	    public final void setTheme(int p1)
	    {
	        this.a = p1;
	        this.a();
	        return;
	    }
	
