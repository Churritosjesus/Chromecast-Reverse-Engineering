	private static final ka a
	private final java.lang.Object b
	
	    static jx()
	    {
	        if (android.os.Build$VERSION.SDK_INT < 16) {
	            if (android.os.Build$VERSION.SDK_INT < 15) {
	                if (android.os.Build$VERSION.SDK_INT < 14) {
	                    jx.a = new ka();
	                } else {
	                    jx.a = new jy();
	                }
	            } else {
	                jx.a = new jz();
	            }
	        } else {
	            jx.a = new kb();
	        }
	        return;
	    }
	
	
	    public jx(Object p1)
	    {
	        this.b = p1;
	        return;
	    }
	
	
	    public static jx a()
	    {
	        return new jx(jx.a.a());
	    }
	
	
	    public final void a(int p3)
	    {
	        jx.a.b(this.b, p3);
	        return;
	    }
	
	
	    public final void a(boolean p3)
	    {
	        jx.a.a(this.b, p3);
	        return;
	    }
	
	
	    public final void b(int p3)
	    {
	        jx.a.a(this.b, p3);
	        return;
	    }
	
	
	    public final void c(int p3)
	    {
	        jx.a.c(this.b, p3);
	        return;
	    }
	
	
	    public final boolean equals(Object p5)
	    {
	        int v0 = 1;
	        if (this != p5) {
	            if (p5 != null) {
	                if (this.getClass() == p5.getClass()) {
	                    if (this.b != null) {
	                        if (!this.b.equals(((jx) p5).b)) {
	                            v0 = 0;
	                        }
	                    } else {
	                        if (((jx) p5).b != null) {
	                            v0 = 0;
	                        }
	                    }
	                } else {
	                    v0 = 0;
	                }
	            } else {
	                v0 = 0;
	            }
	        }
	        return v0;
	    }
	
	
	    public final int hashCode()
	    {
	        int v0_2;
	        if (this.b != null) {
	            v0_2 = this.b.hashCode();
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
