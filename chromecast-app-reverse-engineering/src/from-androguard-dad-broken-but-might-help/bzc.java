	final bzd a
	final java.util.Set b
	  c
	  d
	 android.os.IBinder e
	final bzb f
	 android.content.ComponentName g
	final synthetic bza h
	
	    public bzc(bza p2, bzb p3)
	    {
	        this.h = p2;
	        this.f = p3;
	        this.a = new bzd(this);
	        this.b = new java.util.HashSet();
	        this.c = 2;
	        return;
	    }
	
	
	    public final void a(android.content.ServiceConnection p7, String p8)
	    {
	        bza.c(this.h).a(bza.b(this.h), p7, p8, this.f.a(), "CONNECT");
	        this.b.add(p7);
	        return;
	    }
	
	
	    public final void a(String p7)
	    {
	        this.d = bza.c(this.h).a(bza.b(this.h), p7, this.f.a(), this.a, 129);
	        if (!this.d) {
	            bza.c(this.h).a(bza.b(this.h), this.a);
	        } else {
	            this.c = 3;
	        }
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        return this.b.isEmpty();
	    }
	
	
	    public final boolean a(android.content.ServiceConnection p2)
	    {
	        return this.b.contains(p2);
	    }
	
