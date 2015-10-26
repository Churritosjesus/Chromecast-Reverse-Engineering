	final synthetic acb a
	private synthetic acx b
	private synthetic aco c
	
	    acl(acb p1, acx p2, aco p3)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        return;
	    }
	
	
	    private void a(android.graphics.Bitmap p3)
	    {
	        acb.a(this.a, this.c, p3);
	        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
	            this.a.post(new acm(this));
	        } else {
	            this.a.invalidate();
	        }
	        return;
	    }
	
	
	    public final void b()
	    {
	        this.c();
	        return;
	    }
	
	
	    public final void c()
	    {
	        android.graphics.Bitmap v0_1 = this.b.a();
	        this.a(android.graphics.BitmapFactory.decodeByteArray(v0_1, 0, v0_1.length));
	        return;
	    }
	
	
	    public final void d()
	    {
	        this.a(acb.j(this.a));
	        return;
	    }
	
