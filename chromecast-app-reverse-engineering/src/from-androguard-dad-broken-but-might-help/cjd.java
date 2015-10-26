	public Lcjc a
	public ciz b
	public java.lang.String c
	
	    public cjd()
	    {
	        this.a = cjc.b();
	        this.b = 0;
	        this.c = "";
	        this.m = 0;
	        this.n = -1;
	        return;
	    }
	
	
	    protected final int a()
	    {
	        int v1 = super.a();
	        if ((this.a != null) && (this.a.length > 0)) {
	            int v0_3 = 0;
	            while (v0_3 < this.a.length) {
	                int v2_6 = this.a[v0_3];
	                if (v2_6 != 0) {
	                    v1 += cmk.b(1, v2_6);
	                }
	                v0_3++;
	            }
	        }
	        if (this.b != null) {
	            v1 += cmk.b(2, this.b);
	        }
	        if (!this.c.equals("")) {
	            v1 += cmk.b(3, this.c);
	        }
	        return v1;
	    }
	
	
	    public final synthetic cms a(cmj p5)
	    {
	        while(true) {
	            cjc v0_0 = p5.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    cjc v0_9;
	                    cjc[] v2_0 = cmu.a(p5, 10);
	                    if (this.a != null) {
	                        v0_9 = this.a.length;
	                    } else {
	                        v0_9 = 0;
	                    }
	                    cjc[] v2_2 = new cjc[(v2_0 + v0_9)];
	                    if (v0_9 != null) {
	                        System.arraycopy(this.a, 0, v2_2, 0, v0_9);
	                    }
	                    while (v0_9 < (v2_2.length - 1)) {
	                        v2_2[v0_9] = new cjc();
	                        p5.a(v2_2[v0_9]);
	                        p5.a();
	                        v0_9++;
	                    }
	                    v2_2[v0_9] = new cjc();
	                    p5.a(v2_2[v0_9]);
	                    this.a = v2_2;
	                    break;
	                case 18:
	                    if (this.b == null) {
	                        this.b = new ciz();
	                    }
	                    p5.a(this.b);
	                    break;
	                case 26:
	                    this.c = p5.c();
	                    break;
	                default:
	                    if (this.a(p5, v0_0)) {
	                    } else {
	                    }
	            }
	            return this;
	        }
	    }
	
	
	    public final void a(cmk p4)
	    {
	        if ((this.a != null) && (this.a.length > 0)) {
	            int v0_3 = 0;
	            while (v0_3 < this.a.length) {
	                cjc v1_6 = this.a[v0_3];
	                if (v1_6 != null) {
	                    p4.a(1, v1_6);
	                }
	                v0_3++;
	            }
	        }
	        if (this.b != null) {
	            p4.a(2, this.b);
	        }
	        if (!this.c.equals("")) {
	            p4.a(3, this.c);
	        }
	        super.a(p4);
	        return;
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        boolean v0 = 0;
	        if (p4 != this) {
	            if (((p4 instanceof cjd)) && (cmq.a(this.a, ((cjd) p4).a))) {
	                if (this.b != null) {
	                    if (!this.b.equals(((cjd) p4).b)) {
	                        return v0;
	                    }
	                } else {
	                    if (((cjd) p4).b != null) {
	                        return v0;
	                    }
	                }
	                if (this.c != null) {
	                    if (!this.c.equals(((cjd) p4).c)) {
	                        return v0;
	                    }
	                } else {
	                    if (((cjd) p4).c != null) {
	                        return v0;
	                    }
	                }
	                v0 = this.a(((cjd) p4));
	            }
	        } else {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_5;
	        int v1_0 = 0;
	        String v2_0 = ((cmq.a(this.a) + 527) * 31);
	        if (this.b != null) {
	            v0_5 = this.b.hashCode();
	        } else {
	            v0_5 = 0;
	        }
	        int v0_7 = ((v0_5 + v2_0) * 31);
	        if (this.c != null) {
	            v1_0 = this.c.hashCode();
	        }
	        return (((v0_7 + v1_0) * 31) + this.c());
	    }
	
