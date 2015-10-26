	public Lcje a
	public Lcje b
	public Lciw c
	
	    public cix()
	    {
	        this.a = cje.b();
	        this.b = cje.b();
	        this.c = ciw.b();
	        this.m = 0;
	        this.n = -1;
	        return;
	    }
	
	
	    protected final int a()
	    {
	        int v1 = 0;
	        int v0_0 = super.a();
	        if ((this.a != null) && (this.a.length > 0)) {
	            int v2_3 = v0_0;
	            int v0_1 = 0;
	            while (v0_1 < this.a.length) {
	                int v3_9 = this.a[v0_1];
	                if (v3_9 != 0) {
	                    v2_3 += cmk.b(1, v3_9);
	                }
	                v0_1++;
	            }
	            v0_0 = v2_3;
	        }
	        if ((this.b != null) && (this.b.length > 0)) {
	            int v2_7 = v0_0;
	            int v0_2 = 0;
	            while (v0_2 < this.b.length) {
	                int v3_6 = this.b[v0_2];
	                if (v3_6 != 0) {
	                    v2_7 += cmk.b(2, v3_6);
	                }
	                v0_2++;
	            }
	            v0_0 = v2_7;
	        }
	        if ((this.c != null) && (this.c.length > 0)) {
	            while (v1 < this.c.length) {
	                int v2_14 = this.c[v1];
	                if (v2_14 != 0) {
	                    v0_0 += cmk.b(3, v2_14);
	                }
	                v1++;
	            }
	        }
	        return v0_0;
	    }
	
	
	    public final synthetic cms a(cmj p5)
	    {
	        while(true) {
	            ciw v0_0 = p5.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    ciw v0_14;
	                    ciw[] v2_6 = cmu.a(p5, 10);
	                    if (this.a != null) {
	                        v0_14 = this.a.length;
	                    } else {
	                        v0_14 = 0;
	                    }
	                    ciw[] v2_8 = new cje[(v2_6 + v0_14)];
	                    if (v0_14 != null) {
	                        System.arraycopy(this.a, 0, v2_8, 0, v0_14);
	                    }
	                    while (v0_14 < (v2_8.length - 1)) {
	                        v2_8[v0_14] = new cje();
	                        p5.a(v2_8[v0_14]);
	                        p5.a();
	                        v0_14++;
	                    }
	                    v2_8[v0_14] = new cje();
	                    p5.a(v2_8[v0_14]);
	                    this.a = v2_8;
	                    break;
	                case 18:
	                    ciw v0_9;
	                    ciw[] v2_3 = cmu.a(p5, 18);
	                    if (this.b != null) {
	                        v0_9 = this.b.length;
	                    } else {
	                        v0_9 = 0;
	                    }
	                    ciw[] v2_5 = new cje[(v2_3 + v0_9)];
	                    if (v0_9 != null) {
	                        System.arraycopy(this.b, 0, v2_5, 0, v0_9);
	                    }
	                    while (v0_9 < (v2_5.length - 1)) {
	                        v2_5[v0_9] = new cje();
	                        p5.a(v2_5[v0_9]);
	                        p5.a();
	                        v0_9++;
	                    }
	                    v2_5[v0_9] = new cje();
	                    p5.a(v2_5[v0_9]);
	                    this.b = v2_5;
	                    break;
	                case 26:
	                    ciw v0_4;
	                    ciw[] v2_0 = cmu.a(p5, 26);
	                    if (this.c != null) {
	                        v0_4 = this.c.length;
	                    } else {
	                        v0_4 = 0;
	                    }
	                    ciw[] v2_2 = new ciw[(v2_0 + v0_4)];
	                    if (v0_4 != null) {
	                        System.arraycopy(this.c, 0, v2_2, 0, v0_4);
	                    }
	                    while (v0_4 < (v2_2.length - 1)) {
	                        v2_2[v0_4] = new ciw();
	                        p5.a(v2_2[v0_4]);
	                        p5.a();
	                        v0_4++;
	                    }
	                    v2_2[v0_4] = new ciw();
	                    p5.a(v2_2[v0_4]);
	                    this.c = v2_2;
	                    break;
	                default:
	                    if (this.a(p5, v0_0)) {
	                    } else {
	                    }
	            }
	            return this;
	        }
	    }
	
	
	    public final void a(cmk p5)
	    {
	        int v1 = 0;
	        if ((this.a != null) && (this.a.length > 0)) {
	            int v0_3 = 0;
	            while (v0_3 < this.a.length) {
	                int v2_8 = this.a[v0_3];
	                if (v2_8 != 0) {
	                    p5.a(1, v2_8);
	                }
	                v0_3++;
	            }
	        }
	        if ((this.b != null) && (this.b.length > 0)) {
	            int v0_7 = 0;
	            while (v0_7 < this.b.length) {
	                int v2_6 = this.b[v0_7];
	                if (v2_6 != 0) {
	                    p5.a(2, v2_6);
	                }
	                v0_7++;
	            }
	        }
	        if ((this.c != null) && (this.c.length > 0)) {
	            while (v1 < this.c.length) {
	                int v0_14 = this.c[v1];
	                if (v0_14 != 0) {
	                    p5.a(3, v0_14);
	                }
	                v1++;
	            }
	        }
	        super.a(p5);
	        return;
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        boolean v0 = 0;
	        if (p4 != this) {
	            if (((p4 instanceof cix)) && ((cmq.a(this.a, ((cix) p4).a)) && ((cmq.a(this.b, ((cix) p4).b)) && (cmq.a(this.c, ((cix) p4).c))))) {
	                v0 = this.a(((cix) p4));
	            }
	        } else {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        return (((((((cmq.a(this.a) + 527) * 31) + cmq.a(this.b)) * 31) + cmq.a(this.c)) * 31) + this.c());
	    }
	
