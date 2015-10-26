	private java.lang.reflect.Method a
	private  b
	
	    public ur()
	    {
	        if (android.os.Build$VERSION.SDK_INT == 17) {
	            try {
	                this.b = android.media.MediaRouter$RouteInfo.getField("STATUS_CONNECTING").getInt(0);
	                Class[] v2_1 = new Class[0];
	                this.a = android.media.MediaRouter$RouteInfo.getMethod("getStatusCode", v2_1);
	            } catch (IllegalAccessException v0) {
	            } catch (IllegalAccessException v0) {
	            } catch (IllegalAccessException v0) {
	            }
	            return;
	        } else {
	            throw new UnsupportedOperationException();
	        }
	    }
	
	
	    public final boolean a(Object p4)
	    {
	        int v0_5;
	        if (this.a == null) {
	            v0_5 = 0;
	        } else {
	            try {
	                int v2_1 = new Object[0];
	            } catch (int v0) {
	            } catch (int v0) {
	            }
	            if (((Integer) this.a.invoke(((android.media.MediaRouter$RouteInfo) p4), v2_1)).intValue() != this.b) {
	                v0_5 = 0;
	            } else {
	                v0_5 = 1;
	            }
	        }
	        return v0_5;
	    }
	
