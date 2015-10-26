	  a
	  b
	  c
	final I d
	
	    public dix()
	    {
	        int[] v0_1 = new int[10];
	        this.d = v0_1;
	        return;
	    }
	
	
	    final int a()
	    {
	        int v0_2;
	        if ((this.a & 2) == 0) {
	            v0_2 = -1;
	        } else {
	            v0_2 = this.d[1];
	        }
	        return v0_2;
	    }
	
	
	    final dix a(int p4, int p5, int p6)
	    {
	        if (p4 < this.d.length) {
	            int[] v0_3 = (1 << p4);
	            this.a = (this.a | v0_3);
	            if ((p5 & 1) == 0) {
	                this.b = (this.b & (v0_3 ^ -1));
	            } else {
	                this.b = (this.b | v0_3);
	            }
	            if ((p5 & 2) == 0) {
	                this.c = ((v0_3 ^ -1) & this.c);
	            } else {
	                this.c = (v0_3 | this.c);
	            }
	            this.d[p4] = p6;
	        }
	        return this;
	    }
	
	
	    final boolean a(int p4)
	    {
	        int v0 = 1;
	        if (((1 << p4) & this.a) == 0) {
	            v0 = 0;
	        }
	        return v0;
	    }
	
	
	    final int b(int p6)
	    {
	        int v0_2;
	        int v1 = 0;
	        if (((1 << p6) & this.c) == 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        int v0_3;
	        if (v0_2 == 0) {
	            v0_3 = 0;
	        } else {
	            v0_3 = 2;
	        }
	        if (((1 << p6) & this.b) != 0) {
	            v1 = 1;
	        }
	        if (v1 != 0) {
	            v0_3 |= 1;
	        }
	        return v0_3;
	    }
	
	
	    public final int c(int p3)
	    {
	        int v0_2;
	        if ((this.a & 128) == 0) {
	            v0_2 = 65536;
	        } else {
	            v0_2 = this.d[7];
	        }
	        return v0_2;
	    }
	
