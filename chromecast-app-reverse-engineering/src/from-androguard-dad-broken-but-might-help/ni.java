	final android.content.Context a
	final android.view.Window b
	final android.view.Window$Callback c
	final android.view.Window$Callback d
	final ng e
	 mj f
	  g
	  h
	  i
	  j
	  k
	 java.lang.CharSequence l
	  m
	private android.view.MenuInflater n
	
	    ni(android.content.Context p3, android.view.Window p4, ng p5)
	    {
	        this.a = p3;
	        this.b = p4;
	        this.e = p5;
	        this.c = this.b.getCallback();
	        if (!(this.c instanceof nk)) {
	            this.d = this.a(this.c);
	            this.b.setCallback(this.d);
	            return;
	        } else {
	            throw new IllegalStateException("AppCompat has already installed itself into the Window");
	        }
	    }
	
	
	    android.view.Window$Callback a(android.view.Window$Callback p2)
	    {
	        return new nk(this, p2);
	    }
	
	
	    public final mj a()
	    {
	        if (!this.g) {
	            if ((this.f instanceof pb)) {
	                this.f = 0;
	            }
	        } else {
	            if (this.f == null) {
	                this.f = this.j();
	            }
	        }
	        return this.f;
	    }
	
	
	    public void a(android.os.Bundle p5)
	    {
	        IllegalStateException v0_1 = this.a.obtainStyledAttributes(oq.bN);
	        if (v0_1.hasValue(oq.bR)) {
	            if (v0_1.getBoolean(oq.bR, 0)) {
	                this.g = 1;
	            }
	            if (v0_1.getBoolean(oq.bS, 0)) {
	                this.h = 1;
	            }
	            if (v0_1.getBoolean(oq.bT, 0)) {
	                this.i = 1;
	            }
	            this.j = v0_1.getBoolean(oq.bP, 0);
	            this.k = v0_1.getBoolean(oq.ca, 0);
	            v0_1.recycle();
	            return;
	        } else {
	            v0_1.recycle();
	            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
	        }
	    }
	
	
	    public final void a(CharSequence p1)
	    {
	        this.l = p1;
	        this.b(p1);
	        return;
	    }
	
	
	    public final android.view.MenuInflater b()
	    {
	        if (this.n == null) {
	            this.n = new pm(this.k());
	        }
	        return this.n;
	    }
	
	
	    public final void g()
	    {
	        this.m = 1;
	        return;
	    }
	
	
	    public final mo h()
	    {
	        return new nj(this);
	    }
	
	
	    final android.content.Context k()
	    {
	        android.content.Context v0 = 0;
	        mj v1 = this.a();
	        if (v1 != null) {
	            v0 = v1.e();
	        }
	        if (v0 == null) {
	            v0 = this.a;
	        }
	        return v0;
	    }
	
