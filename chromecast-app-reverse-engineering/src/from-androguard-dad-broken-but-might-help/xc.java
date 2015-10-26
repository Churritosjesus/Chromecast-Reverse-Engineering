	private  a
	private xc b
	
	    xc()
	    {
	        this.a = 0;
	        return;
	    }
	
	
	    private void b()
	    {
	        if (this.b == null) {
	            this.b = new xc();
	        }
	        return;
	    }
	
	
	    private void e(int p7)
	    {
	        if (p7 < 64) {
	            this.a = (this.a & ((1 << p7) ^ -1));
	        } else {
	            if (this.b != null) {
	                this.b.e((p7 - 64));
	            }
	        }
	        return;
	    }
	
	
	    public final void a()
	    {
	        while(true) {
	            this.a = 0;
	            if (this.b == null) {
	                break;
	            }
	            this = this.b;
	        }
	        return;
	    }
	
	
	    public final void a(int p5)
	    {
	        if (p5 < 64) {
	            this.a = (this.a | (1 << p5));
	        } else {
	            this.b();
	            this.b.a((p5 - 64));
	        }
	        return;
	    }
	
	
	    final void a(int p11, boolean p12)
	    {
	        while (p11 < 64) {
	            int v0_4;
	            if ((this.a & -0.0) == 0) {
	                v0_4 = 0;
	            } else {
	                v0_4 = 1;
	            }
	            long v2_4 = ((1 << p11) - 1);
	            this.a = ((((v2_4 ^ -1) & this.a) << 1) | (this.a & v2_4));
	            if (p12 == 0) {
	                this.e(p11);
	            } else {
	                this.a(p11);
	            }
	            if ((v0_4 != 0) || (this.b != null)) {
	                this.b();
	                this = this.b;
	                p11 = 0;
	                p12 = v0_4;
	            }
	            return;
	        }
	        this.b();
	        this.b.a((p11 - 64), p12);
	        return;
	    }
	
	
	    public final boolean b(int p5)
	    {
	        while (p5 >= 64) {
	            this.b();
	            this = this.b;
	            p5 -= 64;
	        }
	        int v0_4;
	        if ((this.a & (1 << p5)) == 0) {
	            v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
	
	    public final boolean c(int p15)
	    {
	        while (p15 >= 64) {
	            this.b();
	            this = this.b;
	            p15 -= 64;
	        }
	        int v0_2;
	        long v4_0 = (1 << p15);
	        if ((this.a & v4_0) == 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        this.a = (this.a & (v4_0 ^ -1));
	        long v4_1 = (v4_0 - 1);
	        this.a = (Long.rotateRight(((v4_1 ^ -1) & this.a), 1) | (this.a & v4_1));
	        if (this.b != null) {
	            if (this.b.b(0)) {
	                this.a(63);
	            }
	            this.b.c(0);
	        }
	        return v0_2;
	    }
	
	
	    final int d(int p7)
	    {
	        int v0_3;
	        if (this.b != null) {
	            if (p7 >= 64) {
	                v0_3 = (this.b.d((p7 - 64)) + Long.bitCount(this.a));
	            } else {
	                v0_3 = Long.bitCount((this.a & ((1 << p7) - 1)));
	            }
	        } else {
	            if (p7 < 64) {
	                v0_3 = Long.bitCount((this.a & ((1 << p7) - 1)));
	            } else {
	                v0_3 = Long.bitCount(this.a);
	            }
	        }
	        return v0_3;
	    }
	
	
	    public final String toString()
	    {
	        String v0_6;
	        if (this.b != null) {
	            v0_6 = new StringBuilder().append(this.b.toString()).append("xx").append(Long.toBinaryString(this.a)).toString();
	        } else {
	            v0_6 = Long.toBinaryString(this.a);
	        }
	        return v0_6;
	    }
	
