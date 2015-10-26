	private static cvm d
	private final java.util.concurrent.LinkedBlockingQueue a
	private bridge  b
	private bridge  c
	private bridge cvo e
	private final android.content.Context f
	
	    private cvm(android.content.Context p3)
	    {
	        this("GAThread");
	        this.a = new java.util.concurrent.LinkedBlockingQueue();
	        this.b = 0;
	        this.c = 0;
	        if (p3 == null) {
	            this.f = p3;
	        } else {
	            this.f = p3.getApplicationContext();
	        }
	        this.start();
	        return;
	    }
	
	
	    static cvm a(android.content.Context p1)
	    {
	        if (cvm.d == null) {
	            cvm.d = new cvm(p1);
	        }
	        return cvm.d;
	    }
	
	
	    static synthetic cvo a(cvm p1)
	    {
	        return p1.e;
	    }
	
	
	    static synthetic cvo a(cvm p0, cvo p1)
	    {
	        p0.e = p1;
	        return p1;
	    }
	
	
	    static synthetic android.content.Context b(cvm p1)
	    {
	        return p1.f;
	    }
	
	
	    public final void a(Runnable p2)
	    {
	        this.a.add(p2);
	        return;
	    }
	
	
	    public final void a(String p8)
	    {
	        this.a(new cvn(this, this, System.currentTimeMillis(), p8));
	        return;
	    }
	
	
	    public final void run()
	    {
	        try {
	            while(true) {
	                if (this.b) {
	                } else {
	                    ((Runnable) this.a.take()).run();
	                }
	                cuh.c(String v0_3.toString());
	            }
	        } catch (String v0_3) {
	        } catch (String v0_5) {
	            StringBuilder v1_2 = new StringBuilder("Error on Google TagManager Thread: ");
	            byte[] v2_2 = new java.io.ByteArrayOutputStream();
	            java.io.PrintStream v3_1 = new java.io.PrintStream(v2_2);
	            v0_5.printStackTrace(v3_1);
	            v3_1.flush();
	            cuh.a(v1_2.append(new String(v2_2.toByteArray())).toString());
	            cuh.a("Google TagManager is shutting down.");
	            this.b = 1;
	        }
	    }
	
