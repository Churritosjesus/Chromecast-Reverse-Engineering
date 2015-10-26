	private synthetic aor a
	
	    aot(aor p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void run()
	    {
	        aor.a(this.a);
	        if (aor.b(this.a) == 0) {
	            aor.a();
	            ape.a().b(109);
	            java.util.Set v0_4 = ape.a();
	            v0_4.e.c.a(v0_4.d);
	            if (aor.c(this.a) != null) {
	                aor.c(this.a).cancel(0);
	            }
	            aor.a(this.a, aor.c().schedule(aor.b(), aor.d(this.a), java.util.concurrent.TimeUnit.MILLISECONDS));
	            java.util.Iterator v1_6 = aor.e(this.a).iterator();
	            while (v1_6.hasNext()) {
	                ((Runnable) v1_6.next()).run();
	            }
	            aor.e(this.a).clear();
	        }
	        return;
	    }
	
