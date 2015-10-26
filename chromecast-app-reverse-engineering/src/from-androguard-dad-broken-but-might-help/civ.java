	private static bridge Lciv b
	public I a
	private  c
	private  d
	private  e
	private  f
	
	    public civ()
	    {
	        this.a = cmu.a;
	        this.c = 0;
	        this.d = 0;
	        this.e = 0;
	        this.f = 0;
	        this.m = 0;
	        this.n = -1;
	        return;
	    }
	
	
	    public static civ[] b()
	    {
	        if (civ.b == null) {
	            if (civ.b == null) {
	                civ[] v0_3 = new civ[0];
	                civ.b = v0_3;
	            }
	        }
	        return civ.b;
	    }
	
	
	    protected final int a()
	    {
	        int v1_0 = 0;
	        int v0_0 = super.a();
	        if (this.f) {
	            v0_0 += (cmk.c(1) + 1);
	        }
	        int v0_4;
	        boolean v2_6 = (cmk.b(2, this.c) + v0_0);
	        if ((this.a == null) || (this.a.length <= 0)) {
	            v0_4 = v2_6;
	        } else {
	            int v0_5 = 0;
	            while (v0_5 < this.a.length) {
	                v1_0 += cmk.a(this.a[v0_5]);
	                v0_5++;
	            }
	            v0_4 = ((v2_6 + v1_0) + (this.a.length * 1));
	        }
	        if (this.d != 0) {
	            v0_4 += cmk.b(4, this.d);
	        }
	        if (this.e) {
	            v0_4 += (cmk.c(6) + 1);
	        }
	        return v0_4;
	    }
	
	
	    public final synthetic cms a(cmj p6)
	    {
	        while(true) {
	            int[] v0_0 = p6.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 8:
	                    this.f = p6.b();
	                    break;
	                case 16:
	                    this.c = p6.e();
	                    break;
	                case 24:
	                    int[] v0_10;
	                    int v2_4 = cmu.a(p6, 24);
	                    if (this.a != null) {
	                        v0_10 = this.a.length;
	                    } else {
	                        v0_10 = 0;
	                    }
	                    int v2_6 = new int[(v2_4 + v0_10)];
	                    if (v0_10 != null) {
	                        System.arraycopy(this.a, 0, v2_6, 0, v0_10);
	                    }
	                    while (v0_10 < (v2_6.length - 1)) {
	                        v2_6[v0_10] = p6.e();
	                        p6.a();
	                        v0_10++;
	                    }
	                    v2_6[v0_10] = p6.e();
	                    this.a = v2_6;
	                    break;
	                case 26:
	                    int v3_0 = p6.c(p6.e());
	                    int v2_0 = p6.i();
	                    int[] v0_4 = 0;
	                    while (p6.h() > 0) {
	                        p6.e();
	                        v0_4++;
	                    }
	                    int v2_3;
	                    p6.e(v2_0);
	                    if (this.a != null) {
	                        v2_3 = this.a.length;
	                    } else {
	                        v2_3 = 0;
	                    }
	                    int[] v0_6 = new int[(v0_4 + v2_3)];
	                    if (v2_3 != 0) {
	                        System.arraycopy(this.a, 0, v0_6, 0, v2_3);
	                    }
	                    while (v2_3 < v0_6.length) {
	                        v0_6[v2_3] = p6.e();
	                        v2_3++;
	                    }
	                    this.a = v0_6;
	                    p6.d(v3_0);
	                    break;
	                case 32:
	                    this.d = p6.e();
	                    break;
	                case 48:
	                    this.e = p6.b();
	                    break;
	                default:
	                    if (this.a(p6, v0_0)) {
	                    } else {
	                    }
	            }
	            return this;
	        }
	    }
	
	
	    public final void a(cmk p4)
	    {
	        if (this.f) {
	            p4.a(1, this.f);
	        }
	        p4.a(2, this.c);
	        if ((this.a != null) && (this.a.length > 0)) {
	            int v0_6 = 0;
	            while (v0_6 < this.a.length) {
	                p4.a(3, this.a[v0_6]);
	                v0_6++;
	            }
	        }
	        if (this.d != 0) {
	            p4.a(4, this.d);
	        }
	        if (this.e) {
	            p4.a(6, this.e);
	        }
	        super.a(p4);
	        return;
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        boolean v0 = 0;
	        if (p4 != this) {
	            if (((p4 instanceof civ)) && ((cmq.a(this.a, ((civ) p4).a)) && ((this.c == ((civ) p4).c) && ((this.d == ((civ) p4).d) && ((this.e == ((civ) p4).e) && (this.f == ((civ) p4).f)))))) {
	                v0 = this.a(((civ) p4));
	            }
	        } else {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_8;
	        int v1_0 = 1231;
	        boolean v3_2 = ((((((cmq.a(this.a) + 527) * 31) + this.c) * 31) + this.d) * 31);
	        if (!this.e) {
	            v0_8 = 1237;
	        } else {
	            v0_8 = 1231;
	        }
	        if (!this.f) {
	            v1_0 = 1237;
	        }
	        return (((((v0_8 + v3_2) * 31) + v1_0) * 31) + this.c());
	    }
	
