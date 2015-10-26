	final android.os.Handler a
	 java.lang.reflect.Method b
	  c
	private final android.hardware.display.DisplayManager d
	
	    public uo(android.content.Context p4, android.os.Handler p5)
	    {
	        if (android.os.Build$VERSION.SDK_INT == 17) {
	            this.d = ((android.hardware.display.DisplayManager) p4.getSystemService("display"));
	            this.a = p5;
	            try {
	                Class[] v2_1 = new Class[0];
	                this.b = android.hardware.display.DisplayManager.getMethod("scanWifiDisplays", v2_1);
	            } catch (NoSuchMethodException v0) {
	            }
	            return;
	        } else {
	            throw new UnsupportedOperationException();
	        }
	    }
	
	
	    public final void run()
	    {
	        if (this.c) {
	            try {
	                long v2_1 = new Object[0];
	                this.b.invoke(this.d, v2_1);
	            } catch (android.os.Handler v0_3) {
	                android.util.Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays.", v0_3);
	            } catch (android.os.Handler v0_2) {
	                android.util.Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays.", v0_2);
	            }
	            this.a.postDelayed(this, 15000);
	        }
	        return;
	    }
	
