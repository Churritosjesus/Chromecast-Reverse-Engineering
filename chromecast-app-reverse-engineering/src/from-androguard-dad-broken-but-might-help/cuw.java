	private synthetic cuv a
	
	    cuw(cuv p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final bpb a()
	    {
	        try {
	            bpb v0 = bpa.a(cuv.a(this.a));
	        } catch (String v1) {
	            cuh.b("GooglePlayServicesNotAvailableException getting Advertising Id Info");
	        } catch (String v1) {
	            cuh.b("IllegalStateException getting Advertising Id Info");
	        } catch (String v1) {
	            cuh.b("IOException getting Ad Id Info");
	        } catch (String v1) {
	            cuh.b("GooglePlayServicesRepairableException getting Advertising Id Info");
	        } catch (String v1) {
	            cuh.b("Unknown exception. Could not get the Advertising Id Info.");
	        }
	        return v0;
	    }
	
