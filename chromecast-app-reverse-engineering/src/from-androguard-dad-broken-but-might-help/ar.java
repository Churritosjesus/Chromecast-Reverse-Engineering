	public static  a
	final eq b
	final eq c
	final java.lang.String d
	 m e
	  f
	  g
	private  h
	
	    static ar()
	    {
	        ar.a = 0;
	        return;
	    }
	
	
	    ar(String p2, m p3, boolean p4)
	    {
	        this.b = new eq();
	        this.c = new eq();
	        this.d = p2;
	        this.e = p3;
	        this.f = p4;
	        return;
	    }
	
	
	    private as c(int p3, android.os.Bundle p4, aq p5)
	    {
	        as v0_1 = new as(this, p3, p4, p5);
	        v0_1.c = p5.c_(p3);
	        return v0_1;
	    }
	
	
	    private as d(int p3, android.os.Bundle p4, aq p5)
	    {
	        try {
	            this.h = 1;
	            Throwable v0_1 = this.c(p3, p4, p5);
	            this.a(v0_1);
	            this.h = 0;
	            return v0_1;
	        } catch (Throwable v0_2) {
	            this.h = 0;
	            throw v0_2;
	        }
	    }
	
	
	    public final bi a(int p5, android.os.Bundle p6, aq p7)
	    {
	        if (!this.h) {
	            bi v0_3 = ((as) this.b.a(p5));
	            if (ar.a) {
	                new StringBuilder("initLoader in ").append(this).append(": args=").append(0);
	            }
	            if (v0_3 != null) {
	                if (ar.a) {
	                    new StringBuilder("  Re-using existing loader ").append(v0_3);
	                }
	                v0_3.b = p7;
	            } else {
	                v0_3 = this.d(p5, 0, p7);
	                if (ar.a) {
	                    new StringBuilder("  Created new loader ").append(v0_3);
	                }
	            }
	            if ((v0_3.d) && (this.f)) {
	                v0_3.b(v0_3.c, v0_3.f);
	            }
	            return v0_3.c;
	        } else {
	            throw new IllegalStateException("Called while creating a loader");
	        }
	    }
	
	
	    public final void a(int p4)
	    {
	        if (!this.h) {
	            if (ar.a) {
	                new StringBuilder("destroyLoader in ").append(this).append(" of ").append(p4);
	            }
	            int v1_2 = this.b.e(p4);
	            if (v1_2 >= 0) {
	                t v0_9 = ((as) this.b.d(v1_2));
	                this.b.b(v1_2);
	                v0_9.c();
	            }
	            int v1_3 = this.c.e(p4);
	            if (v1_3 >= 0) {
	                t v0_13 = ((as) this.c.d(v1_3));
	                this.c.b(v1_3);
	                v0_13.c();
	            }
	            if ((this.e != null) && (!this.a())) {
	                this.e.b.g();
	            }
	            return;
	        } else {
	            throw new IllegalStateException("Called while creating a loader");
	        }
	    }
	
	
	    final void a(as p3)
	    {
	        this.b.a(p3.a, p3);
	        if (this.f) {
	            p3.a();
	        }
	        return;
	    }
	
	
	    public final void a(String p6, java.io.FileDescriptor p7, java.io.PrintWriter p8, String[] p9)
	    {
	        int v2 = 0;
	        if (this.b.a() > 0) {
	            p8.print(p6);
	            p8.println("Active Loaders:");
	            String v3_0 = new StringBuilder().append(p6).append("    ").toString();
	            int v1_1 = 0;
	            while (v1_1 < this.b.a()) {
	                as v0_23 = ((as) this.b.d(v1_1));
	                p8.print(p6);
	                p8.print("  #");
	                p8.print(this.b.c(v1_1));
	                p8.print(": ");
	                p8.println(v0_23.toString());
	                v0_23.a(v3_0, p7, p8, p9);
	                v1_1++;
	            }
	        }
	        if (this.c.a() > 0) {
	            p8.print(p6);
	            p8.println("Inactive Loaders:");
	            int v1_3 = new StringBuilder().append(p6).append("    ").toString();
	            while (v2 < this.c.a()) {
	                as v0_20 = ((as) this.c.d(v2));
	                p8.print(p6);
	                p8.print("  #");
	                p8.print(this.c.c(v2));
	                p8.print(": ");
	                p8.println(v0_20.toString());
	                v0_20.a(v1_3, p7, p8, p9);
	                v2++;
	            }
	        }
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        int v4 = this.b.a();
	        int v2 = 0;
	        int v3 = 0;
	        while (v2 < v4) {
	            int v0_5;
	            int v0_3 = ((as) this.b.d(v2));
	            if ((!v0_3.g) || (v0_3.e)) {
	                v0_5 = 0;
	            } else {
	                v0_5 = 1;
	            }
	            v3 |= v0_5;
	            v2++;
	        }
	        return v3;
	    }
	
	
	    public final bi b(int p3)
	    {
	        if (!this.h) {
	            bi v0_4;
	            bi v0_3 = ((as) this.b.a(p3));
	            if (v0_3 == null) {
	                v0_4 = 0;
	            } else {
	                if (v0_3.k == null) {
	                    v0_4 = v0_3.c;
	                } else {
	                    v0_4 = v0_3.k.c;
	                }
	            }
	            return v0_4;
	        } else {
	            throw new IllegalStateException("Called while creating a loader");
	        }
	    }
	
	
	    public final bi b(int p6, android.os.Bundle p7, aq p8)
	    {
	        if (!this.h) {
	            bi v0_3 = ((as) this.b.a(p6));
	            if (ar.a) {
	                new StringBuilder("restartLoader in ").append(this).append(": args=").append(0);
	            }
	            bi v0_5;
	            if (v0_3 == null) {
	                v0_5 = this.d(p6, 0, p8).c;
	            } else {
	                as v1_7 = ((as) this.c.a(p6));
	                if (v1_7 == null) {
	                    if (ar.a) {
	                        new StringBuilder("  Making last loader inactive: ").append(v0_3);
	                    }
	                } else {
	                    if (!v0_3.d) {
	                        if (v0_3.g) {
	                            if (v0_3.k != null) {
	                                if (ar.a) {
	                                    new StringBuilder("  Removing pending loader: ").append(v0_3.k);
	                                }
	                                v0_3.k.c();
	                                v0_3.k = 0;
	                            }
	                            v0_3.k = this.c(p6, 0, p8);
	                            v0_5 = v0_3.k.c;
	                            return v0_5;
	                        } else {
	                            this.b.a(p6, 0);
	                            v0_3.c();
	                        }
	                    } else {
	                        if (ar.a) {
	                            new StringBuilder("  Removing last inactive loader: ").append(v0_3);
	                        }
	                        v1_7.e = 0;
	                        v1_7.c();
	                    }
	                }
	                v0_3.c.d = 1;
	                this.c.a(p6, v0_3);
	            }
	            return v0_5;
	        } else {
	            throw new IllegalStateException("Called while creating a loader");
	        }
	    }
	
	
	    final void b()
	    {
	        if (ar.a) {
	            new StringBuilder("Starting in ").append(this);
	        }
	        if (!this.f) {
	            this.f = 1;
	            int v1_1 = (this.b.a() - 1);
	            while (v1_1 >= 0) {
	                ((as) this.b.d(v1_1)).a();
	                v1_1--;
	            }
	        } else {
	            int v0_13 = new RuntimeException("here");
	            v0_13.fillInStackTrace();
	            android.util.Log.w("LoaderManager", new StringBuilder("Called doStart when already started: ").append(this).toString(), v0_13);
	        }
	        return;
	    }
	
	
	    final void c()
	    {
	        if (ar.a) {
	            new StringBuilder("Stopping in ").append(this);
	        }
	        if (this.f) {
	            int v1_1 = (this.b.a() - 1);
	            while (v1_1 >= 0) {
	                ((as) this.b.d(v1_1)).b();
	                v1_1--;
	            }
	            this.f = 0;
	        } else {
	            int v0_13 = new RuntimeException("here");
	            v0_13.fillInStackTrace();
	            android.util.Log.w("LoaderManager", new StringBuilder("Called doStop when not started: ").append(this).toString(), v0_13);
	        }
	        return;
	    }
	
	
	    final void d()
	    {
	        if (ar.a) {
	            new StringBuilder("Retaining in ").append(this);
	        }
	        if (this.f) {
	            this.g = 1;
	            this.f = 0;
	            int v1_1 = (this.b.a() - 1);
	            while (v1_1 >= 0) {
	                int v0_9 = ((as) this.b.d(v1_1));
	                if (ar.a) {
	                    new StringBuilder("  Retaining: ").append(v0_9);
	                }
	                v0_9.h = 1;
	                v0_9.i = v0_9.g;
	                v0_9.g = 0;
	                v0_9.b = 0;
	                v1_1--;
	            }
	        } else {
	            int v0_12 = new RuntimeException("here");
	            v0_12.fillInStackTrace();
	            android.util.Log.w("LoaderManager", new StringBuilder("Called doRetain when not started: ").append(this).toString(), v0_12);
	        }
	        return;
	    }
	
	
	    final void e()
	    {
	        int v1 = (this.b.a() - 1);
	        while (v1 >= 0) {
	            ((as) this.b.d(v1)).j = 1;
	            v1--;
	        }
	        return;
	    }
	
	
	    final void f()
	    {
	        int v1 = (this.b.a() - 1);
	        while (v1 >= 0) {
	            int v0_5 = ((as) this.b.d(v1));
	            if ((v0_5.g) && (v0_5.j)) {
	                v0_5.j = 0;
	                if (v0_5.d) {
	                    v0_5.b(v0_5.c, v0_5.f);
	                }
	            }
	            v1--;
	        }
	        return;
	    }
	
	
	    final void g()
	    {
	        if (!this.g) {
	            if (ar.a) {
	                new StringBuilder("Destroying Active in ").append(this);
	            }
	            int v1_1 = (this.b.a() - 1);
	            while (v1_1 >= 0) {
	                ((as) this.b.d(v1_1)).c();
	                v1_1--;
	            }
	            this.b.b();
	        }
	        if (ar.a) {
	            new StringBuilder("Destroying Inactive in ").append(this);
	        }
	        int v1_3 = (this.c.a() - 1);
	        while (v1_3 >= 0) {
	            ((as) this.c.d(v1_3)).c();
	            v1_3--;
	        }
	        this.c.b();
	        return;
	    }
	
	
	    public final String toString()
	    {
	        String v0_1 = new StringBuilder(128);
	        v0_1.append("LoaderManager{");
	        v0_1.append(Integer.toHexString(System.identityHashCode(this)));
	        v0_1.append(" in ");
	        a.a(this.e, v0_1);
	        v0_1.append("}}");
	        return v0_1.toString();
	    }
	
