	final  a
	 aq b
	 bi c
	  d
	  e
	 java.lang.Object f
	  g
	  h
	  i
	  j
	 as k
	private android.os.Bundle l
	private  m
	private  n
	private synthetic ar o
	
	    public as(ar p1, int p2, android.os.Bundle p3, aq p4)
	    {
	        this.o = p1;
	        this.a = p2;
	        this.l = p3;
	        this.b = p4;
	        return;
	    }
	
	
	    final void a()
	    {
	        if ((!this.h) || (!this.i)) {
	            if (!this.g) {
	                this.g = 1;
	                if (ar.a) {
	                    new StringBuilder("  Starting: ").append(this);
	                }
	                if ((this.c == null) && (this.b != null)) {
	                    this.c = this.b.c_(this.a);
	                }
	                if (this.c != null) {
	                    if ((!this.c.getClass().isMemberClass()) || (reflect.Modifier.isStatic(this.c.getClass().getModifiers()))) {
	                        if (!this.n) {
	                            IllegalStateException v0_19 = this.c;
	                            String v1_2 = this.a;
	                            if (v0_19.b == null) {
	                                v0_19.b = this;
	                                v0_19.a = v1_2;
	                                this.n = 1;
	                            } else {
	                                throw new IllegalStateException("There is already a listener registered");
	                            }
	                        }
	                        this.c.a();
	                    } else {
	                        throw new IllegalArgumentException(new StringBuilder("Object returned from onCreateLoader must not be a non-static inner member class: ").append(this.c).toString());
	                    }
	                }
	            }
	        } else {
	            this.g = 1;
	        }
	        return;
	    }
	
	
	    public final void a(bi p6, Object p7)
	    {
	        if (ar.a) {
	            new StringBuilder("onLoadComplete: ").append(this);
	        }
	        if ((!this.m) && (this.o.b.a(this.a) == this)) {
	            t v0_7 = this.k;
	            if (v0_7 == null) {
	                if ((this.f != p7) || (!this.d)) {
	                    this.f = p7;
	                    this.d = 1;
	                    if (this.g) {
	                        this.b(p6, p7);
	                    }
	                }
	                t v0_14 = ((as) this.o.c.a(this.a));
	                if ((v0_14 != null) && (v0_14 != this)) {
	                    v0_14.e = 0;
	                    v0_14.c();
	                    t v0_16 = this.o.c;
	                    int v1_5 = ef.a(v0_16.c, v0_16.e, this.a);
	                    if ((v1_5 >= 0) && (v0_16.d[v1_5] != eq.a)) {
	                        v0_16.d[v1_5] = eq.a;
	                        v0_16.b = 1;
	                    }
	                }
	                if ((this.o.e != null) && (!this.o.a())) {
	                    this.o.e.b.g();
	                }
	            } else {
	                if (ar.a) {
	                    new StringBuilder("  Switching to pending loader: ").append(v0_7);
	                }
	                this.k = 0;
	                this.o.b.a(this.a, 0);
	                this.c();
	                this.o.a(v0_7);
	            }
	        }
	        return;
	    }
	
	
	    public final void a(String p4, java.io.FileDescriptor p5, java.io.PrintWriter p6, String[] p7)
	    {
	        while(true) {
	            p6.print(p4);
	            p6.print("mId=");
	            p6.print(this.a);
	            p6.print(" mArgs=");
	            p6.println(this.l);
	            p6.print(p4);
	            p6.print("mCallbacks=");
	            p6.println(this.b);
	            p6.print(p4);
	            p6.print("mLoader=");
	            p6.println(this.c);
	            if (this.c != null) {
	                this.c.a(new StringBuilder().append(p4).append("  ").toString(), p5, p6, p7);
	            }
	            if ((this.d) || (this.e)) {
	                p6.print(p4);
	                p6.print("mHaveData=");
	                p6.print(this.d);
	                p6.print("  mDeliveredData=");
	                p6.println(this.e);
	                p6.print(p4);
	                p6.print("mData=");
	                p6.println(this.f);
	            }
	            p6.print(p4);
	            p6.print("mStarted=");
	            p6.print(this.g);
	            p6.print(" mReportNextStart=");
	            p6.print(this.j);
	            p6.print(" mDestroyed=");
	            p6.println(this.m);
	            p6.print(p4);
	            p6.print("mRetaining=");
	            p6.print(this.h);
	            p6.print(" mRetainingStarted=");
	            p6.print(this.i);
	            p6.print(" mListenerRegistered=");
	            p6.println(this.n);
	            if (this.k == null) {
	                break;
	            }
	            p6.print(p4);
	            p6.println("Pending Loader ");
	            p6.print(this.k);
	            p6.println(":");
	            this = this.k;
	            p4 = new StringBuilder().append(p4).append("  ").toString();
	        }
	        return;
	    }
	
	
	    final void b()
	    {
	        if (ar.a) {
	            new StringBuilder("  Stopping: ").append(this);
	        }
	        this.g = 0;
	        if ((!this.h) && ((this.c != null) && (this.n))) {
	            this.n = 0;
	            this.c.a(this);
	            this.c.c();
	        }
	        return;
	    }
	
	
	    final void b(bi p5, Object p6)
	    {
	        if (this.b != null) {
	            String v1_2;
	            if (this.o.e == null) {
	                v1_2 = 0;
	            } else {
	                int v0_5 = this.o.e.b.k;
	                this.o.e.b.k = "onLoadFinished";
	                v1_2 = v0_5;
	            }
	            try {
	                if (ar.a) {
	                    int v0_10 = new StringBuilder("  onLoadFinished in ").append(p5).append(": ");
	                    t v2_4 = new StringBuilder(64);
	                    a.a(p6, v2_4);
	                    v2_4.append("}");
	                    v0_10.append(v2_4.toString());
	                }
	            } catch (int v0_11) {
	                if (this.o.e != null) {
	                    this.o.e.b.k = v1_2;
	                }
	                throw v0_11;
	            }
	            this.b.a(p5, p6);
	            if (this.o.e != null) {
	                this.o.e.b.k = v1_2;
	            }
	            this.e = 1;
	        }
	        return;
	    }
	
	
	    final void c()
	    {
	        while(true) {
	            if (ar.a) {
	                new StringBuilder("  Destroying: ").append(this);
	            }
	            this.m = 1;
	            int v0_4 = this.e;
	            this.e = 0;
	            if ((this.b != null) && ((this.c != null) && ((this.d) && (v0_4 != 0)))) {
	                if (ar.a) {
	                    new StringBuilder("  Reseting: ").append(this);
	                }
	                int v0_10;
	                if (this.o.e == null) {
	                    v0_10 = 0;
	                } else {
	                    v0_10 = this.o.e.b.k;
	                    this.o.e.b.k = "onLoaderReset";
	                }
	                if (this.o.e != null) {
	                    this.o.e.b.k = v0_10;
	                }
	            }
	            this.b = 0;
	            this.f = 0;
	            this.d = 0;
	            if (this.c != null) {
	                if (this.n) {
	                    this.n = 0;
	                    this.c.a(this);
	                }
	                this.c.e();
	            }
	            if (this.k == null) {
	                break;
	            }
	            this = this.k;
	        }
	        return;
	    }
	
	
	    public final String toString()
	    {
	        String v0_1 = new StringBuilder(64);
	        v0_1.append("LoaderInfo{");
	        v0_1.append(Integer.toHexString(System.identityHashCode(this)));
	        v0_1.append(" #");
	        v0_1.append(this.a);
	        v0_1.append(" : ");
	        a.a(this.c, v0_1);
	        v0_1.append("}}");
	        return v0_1.toString();
	    }
	
