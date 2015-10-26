	private final android.content.Context a
	private final bln b
	
	    public blo(android.content.Context p1, bln p2)
	    {
	        this.a = p1;
	        this.b = p2;
	        return;
	    }
	
	
	    private varargs String a(android.location.Location[] p9)
	    {
	        String v0_1 = p9[0];
	        try {
	            String v0_5;
	            String v0_2 = new android.location.Geocoder(this.a).getFromLocation(v0_1.getLatitude(), v0_1.getLongitude(), 1);
	        } catch (String v0_3) {
	            Object[] v3_0 = new Object[0];
	            blj.f().a(v0_3, "Could not look up address - bad lat/long", v3_0);
	            v0_5 = 0;
	            return v0_5;
	        } catch (String v0_4) {
	            Object[] v3_1 = new Object[0];
	            blj.f().a(v0_4, "Failed to lookup address through geocoder", v3_1);
	        }
	        if ((v0_2 == null) || (v0_2.isEmpty())) {
	        } else {
	            v0_5 = ((android.location.Address) v0_2.get(0)).getCountryCode();
	            return v0_5;
	        }
	    }
	
	
	    protected final synthetic Object doInBackground(Object[] p2)
	    {
	        return this.a(((android.location.Location[]) p2));
	    }
	
	
	    protected final synthetic void onPostExecute(Object p4)
	    {
	        if (!android.text.TextUtils.isEmpty(((String) p4))) {
	            blj.f();
	            String v1_0 = String.valueOf(((String) p4));
	            if (v1_0.length() == 0) {
	                new String("Got country code ");
	            } else {
	                "Got country code ".concat(v1_0);
	            }
	        }
	        this.b.a(((String) p4));
	        return;
	    }
	
