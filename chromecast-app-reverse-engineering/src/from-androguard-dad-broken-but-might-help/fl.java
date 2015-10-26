	
	    fl()
	    {
	        return;
	    }
	
	
	    static int a(int p5, int p6, int p7, int p8, int p9)
	    {
	        int v2_1;
	        int v0_0 = 1;
	        if ((p6 & p7) == 0) {
	            v2_1 = 0;
	        } else {
	            v2_1 = 1;
	        }
	        int v3 = (p8 | p9);
	        if ((p6 & v3) == 0) {
	            v0_0 = 0;
	        }
	        if (v2_1 == 0) {
	            if (v0_0 != 0) {
	                p5 &= (p7 ^ -1);
	            }
	        } else {
	            if (v0_0 == 0) {
	                p5 &= (v3 ^ -1);
	            } else {
	                throw new IllegalArgumentException("bad arguments");
	            }
	        }
	        return p5;
	    }
	
	
	    public int a(int p3)
	    {
	        int v0_1;
	        if ((p3 & 192) == 0) {
	            v0_1 = p3;
	        } else {
	            v0_1 = (p3 | 1);
	        }
	        if ((v0_1 & 48) != 0) {
	            v0_1 |= 2;
	        }
	        return (v0_1 & 247);
	    }
	
	
	    public void a(android.view.KeyEvent p1)
	    {
	        return;
	    }
	
	
	    public boolean a(int p6, int p7)
	    {
	        int v0 = 1;
	        if (fl.a(fl.a((this.a(p6) & 247), p7, 1, 64, 128), p7, 2, 16, 32) != p7) {
	            v0 = 0;
	        }
	        return v0;
	    }
	
	
	    public boolean b(int p2)
	    {
	        int v0_2;
	        if ((this.a(p2) & 247) != 0) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
