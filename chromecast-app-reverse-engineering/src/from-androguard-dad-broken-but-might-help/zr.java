	public final android.view.View a
	public  b
	public  c
	  d
	public  e
	  f
	public zr g
	public zr h
	  i
	 zl j
	private  k
	
	    public zr(android.view.View p5)
	    {
	        this.b = -1;
	        this.c = -1;
	        this.d = -1;
	        this.e = -1;
	        this.f = -1;
	        this.g = 0;
	        this.h = 0;
	        this.k = 0;
	        this.j = 0;
	        if (p5 != null) {
	            this.a = p5;
	            return;
	        } else {
	            throw new IllegalArgumentException("itemView may not be null");
	        }
	    }
	
	
	    static synthetic boolean a(zr p1)
	    {
	        int v0_2;
	        if ((p1.i & 16) == 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final void a()
	    {
	        this.c = -1;
	        this.f = -1;
	        return;
	    }
	
	
	    public final void a(int p2)
	    {
	        this.i = (this.i | p2);
	        return;
	    }
	
	
	    final void a(int p3, int p4)
	    {
	        this.i = ((this.i & (p4 ^ -1)) | (p3 & p4));
	        return;
	    }
	
	
	    public final void a(int p3, boolean p4)
	    {
	        if (this.c == -1) {
	            this.c = this.b;
	        }
	        if (this.f == -1) {
	            this.f = this.b;
	        }
	        if (p4) {
	            this.f = (this.f + p3);
	        }
	        this.b = (this.b + p3);
	        if (this.a.getLayoutParams() != null) {
	            ((zi) this.a.getLayoutParams()).e = 1;
	        }
	        return;
	    }
	
	
	    public final void a(boolean p4)
	    {
	        int v0_1;
	        if (!p4) {
	            v0_1 = (this.k + 1);
	        } else {
	            v0_1 = (this.k - 1);
	        }
	        this.k = v0_1;
	        if (this.k >= 0) {
	            if ((p4) || (this.k != 1)) {
	                if ((p4) && (this.k == 0)) {
	                    this.i = (this.i & -17);
	                }
	            } else {
	                this.i = (this.i | 16);
	            }
	        } else {
	            this.k = 0;
	            android.util.Log.e("View", new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ").append(this).toString());
	        }
	        return;
	    }
	
	
	    public final boolean b()
	    {
	        int v0_2;
	        if ((this.i & 128) == 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final int c()
	    {
	        int v0_1;
	        if (this.f != -1) {
	            v0_1 = this.f;
	        } else {
	            v0_1 = this.b;
	        }
	        return v0_1;
	    }
	
	
	    public final int d()
	    {
	        int v0_1;
	        if (this.f != -1) {
	            v0_1 = this.f;
	        } else {
	            v0_1 = this.b;
	        }
	        return v0_1;
	    }
	
	
	    final boolean e()
	    {
	        int v0_1;
	        if (this.j == null) {
	            v0_1 = 0;
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    final void f()
	    {
	        this.j.b(this);
	        return;
	    }
	
	
	    final boolean g()
	    {
	        int v0_2;
	        if ((this.i & 32) == 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    final void h()
	    {
	        this.i = (this.i & -33);
	        return;
	    }
	
	
	    public final void i()
	    {
	        this.i = (this.i & -257);
	        return;
	    }
	
	
	    public final boolean j()
	    {
	        int v0_2;
	        if ((this.i & 4) == 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    final boolean k()
	    {
	        int v0_2;
	        if ((this.i & 2) == 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean l()
	    {
	        int v0_2;
	        if ((this.i & 64) == 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    final boolean m()
	    {
	        int v0_2;
	        if ((this.i & 1) == 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean n()
	    {
	        int v0_2;
	        if ((this.i & 8) == 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final boolean o()
	    {
	        int v0_2;
	        if ((this.i & 256) == 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    final void p()
	    {
	        this.i = 0;
	        this.b = -1;
	        this.c = -1;
	        this.d = -1;
	        this.f = -1;
	        this.k = 0;
	        this.g = 0;
	        this.h = 0;
	        return;
	    }
	
	
	    public final boolean q()
	    {
	        if (((this.i & 16) != 0) || (gt.c(this.a))) {
	            int v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
	
	    public String toString()
	    {
	        StringBuilder v1_1 = new StringBuilder(new StringBuilder("ViewHolder{").append(Integer.toHexString(this.hashCode())).append(" position=").append(this.b).append(" id=").append(this.d).append(", oldPos=").append(this.c).append(", pLpos:").append(this.f).toString());
	        if (this.e()) {
	            v1_1.append(" scrap");
	        }
	        if (this.j()) {
	            v1_1.append(" invalid");
	        }
	        if (!this.m()) {
	            v1_1.append(" unbound");
	        }
	        if (this.k()) {
	            v1_1.append(" update");
	        }
	        if (this.n()) {
	            v1_1.append(" removed");
	        }
	        if (this.b()) {
	            v1_1.append(" ignored");
	        }
	        if (this.l()) {
	            v1_1.append(" changed");
	        }
	        if (this.o()) {
	            v1_1.append(" tmpDetached");
	        }
	        if (!this.q()) {
	            v1_1.append(new StringBuilder(" not recyclable(").append(this.k).append(")").toString());
	        }
	        if (((this.i & 512) == 0) && (!this.j())) {
	            String v0_37 = 0;
	        } else {
	            v0_37 = 1;
	        }
	        if (v0_37 != null) {
	            v1_1.append("undefined adapter position");
	        }
	        if (this.a.getParent() == null) {
	            v1_1.append(" no parent");
	        }
	        v1_1.append("}");
	        return v1_1.toString();
	    }
	
