	private B a
	private [B b
	private  c
	
	    public cmx()
	    {
	        this.a = cmu.d;
	        this.b = cmu.c;
	        this.c = 0;
	        this.m = 0;
	        this.n = -1;
	        return;
	    }
	
	
	    protected final int a()
	    {
	        int v1_0 = 0;
	        int v0_0 = super.a();
	        if (!java.util.Arrays.equals(this.a, cmu.d)) {
	            v0_0 += cmk.b(1, this.a);
	        }
	        if ((this.b != null) && (this.b.length > 0)) {
	            int v2_7 = 0;
	            int v3_2 = 0;
	            while (v1_0 < this.b.length) {
	                int v4_3 = this.b[v1_0];
	                if (v4_3 != 0) {
	                    v3_2++;
	                    v2_7 += cmk.a(v4_3);
	                }
	                v1_0++;
	            }
	            v0_0 = ((v0_0 + v2_7) + (v3_2 * 1));
	        }
	        if (this.c) {
	            v0_0 += (cmk.c(3) + 1);
	        }
	        return v0_0;
	    }
	
	
	    public final synthetic cms a(cmj p5)
	    {
	        while(true) {
	            int v0_0 = p5.a();
	            switch (v0_0) {
	                case 0:
	                    break;
	                case 10:
	                    this.a = p5.d();
	                    break;
	                case 18:
	                    int v0_5;
	                    byte[][] v2_0 = cmu.a(p5, 18);
	                    if (this.b != null) {
	                        v0_5 = this.b.length;
	                    } else {
	                        v0_5 = 0;
	                    }
	                    byte[][] v2_2 = new byte[][(v2_0 + v0_5)];
	                    if (v0_5 != 0) {
	                        System.arraycopy(this.b, 0, v2_2, 0, v0_5);
	                    }
	                    while (v0_5 < (v2_2.length - 1)) {
	                        v2_2[v0_5] = p5.d();
	                        p5.a();
	                        v0_5++;
	                    }
	                    v2_2[v0_5] = p5.d();
	                    this.b = v2_2;
	                    break;
	                case 24:
	                    this.c = p5.b();
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
	        if (!java.util.Arrays.equals(this.a, cmu.d)) {
	            p4.a(1, this.a);
	        }
	        if ((this.b != null) && (this.b.length > 0)) {
	            int v0_6 = 0;
	            while (v0_6 < this.b.length) {
	                byte[] v1_6 = this.b[v0_6];
	                if (v1_6 != null) {
	                    p4.a(2, v1_6);
	                }
	                v0_6++;
	            }
	        }
	        if (this.c) {
	            p4.a(3, this.c);
	        }
	        super.a(p4);
	        return;
	    }
	
	
	    public final boolean equals(Object p4)
	    {
	        boolean v0 = 0;
	        if (p4 != this) {
	            if (((p4 instanceof cmx)) && ((java.util.Arrays.equals(this.a, ((cmx) p4).a)) && ((cmq.a(this.b, ((cmx) p4).b)) && (this.c == ((cmx) p4).c)))) {
	                v0 = this.a(((cmx) p4));
	            }
	        } else {
	            v0 = 1;
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_6;
	        int v1_2 = ((((java.util.Arrays.hashCode(this.a) + 527) * 31) + cmq.a(this.b)) * 31);
	        if (!this.c) {
	            v0_6 = 1237;
	        } else {
	            v0_6 = 1231;
	        }
	        return (((v0_6 + v1_2) * 31) + this.c());
	    }
	
