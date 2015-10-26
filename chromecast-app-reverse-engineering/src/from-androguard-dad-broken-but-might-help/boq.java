	private final blp a
	
	    public boq(android.content.Context p3)
	    {
	        this(p3, a.gV);
	        this.a = new blp("WifiNetworkAdapter");
	        return;
	    }
	
	
	    public final int a(String p3)
	    {
	        int v1 = 0;
	        while (v1 < this.getCount()) {
	            if (!((bfs) this.getItem(v1)).a.equals(p3)) {
	                v1++;
	            }
	            return v1;
	        }
	        v1 = -1;
	        return v1;
	    }
	
	
	    public final android.view.View getDropDownView(int p4, android.view.View p5, android.view.ViewGroup p6)
	    {
	        android.view.View v0 = this.getView(p4, p5, p6);
	        v0.setPadding(this.getContext().getResources().getDimensionPixelSize(a.dJ), this.getContext().getResources().getDimensionPixelSize(a.dJ), this.getContext().getResources().getDimensionPixelSize(a.dJ), this.getContext().getResources().getDimensionPixelSize(a.dJ));
	        return v0;
	    }
	
	
	    public final android.view.View getView(int p9, android.view.View p10, android.view.ViewGroup p11)
	    {
	        if (p10 == null) {
	            p10 = ((android.view.LayoutInflater) this.getContext().getSystemService("layout_inflater")).inflate(a.gV, 0);
	        }
	        int v2_3;
	        String v0_4 = ((bfs) this.getItem(p9));
	        ((android.widget.TextView) p10.findViewById(f.dY)).setText(v0_4.a);
	        android.widget.ImageView v1_7 = ((android.widget.TextView) p10.findViewById(f.u));
	        int v2_2 = v0_4.b;
	        switch (bor.a[v2_2.ordinal()]) {
	            case 1:
	                v2_3 = b.es;
	                break;
	            case 2:
	                v2_3 = b.ep;
	                break;
	            case 3:
	                v2_3 = b.eq;
	                break;
	            case 4:
	                v2_3 = b.er;
	                break;
	            case 5:
	                v2_3 = b.eo;
	                break;
	            case 6:
	                v2_3 = b.ew;
	                break;
	            case 7:
	                v2_3 = b.ev;
	                break;
	            case 8:
	                v2_3 = b.eu;
	                break;
	            case 9:
	                v2_3 = b.et;
	                break;
	            default:
	                boolean v4_2 = this.a;
	                Object[] v6_1 = new Object[1];
	                v6_1[0] = v2_2.toString();
	                v4_2.a("WpaAuthType mapping missing for %s", v6_1);
	                v2_3 = b.es;
	        }
	        int v2_8;
	        v1_7.setText(v2_3);
	        android.widget.ImageView v1_10 = ((android.widget.ImageView) p10.findViewById(f.dP));
	        if (v0_4.h == 0) {
	            v2_8 = 0;
	        } else {
	            boolean v4_4 = v0_4.b.k;
	            switch (android.net.wifi.WifiManager.calculateSignalLevel(v0_4.h, 4)) {
	                case 0:
	                    if (!v4_4) {
	                        v2_8 = a.eR;
	                    } else {
	                        v2_8 = a.eN;
	                    }
	                    break;
	                case 1:
	                    if (!v4_4) {
	                        v2_8 = a.eS;
	                    } else {
	                        v2_8 = a.eO;
	                    }
	                    break;
	                case 2:
	                    if (!v4_4) {
	                        v2_8 = a.eT;
	                    } else {
	                        v2_8 = a.eP;
	                    }
	                    break;
	                case 3:
	                    if (!v4_4) {
	                        v2_8 = a.eU;
	                    } else {
	                        v2_8 = a.eQ;
	                    }
	                    break;
	                default:
	            }
	        }
	        String v0_8;
	        v1_10.setImageResource(v2_8);
	        if (v0_4.h == 0) {
	            v0_8 = this.getContext().getString(b.ej);
	        } else {
	            switch (android.net.wifi.WifiManager.calculateSignalLevel(v0_4.h, 4)) {
	                case 0:
	                    v0_8 = this.getContext().getString(b.ef);
	                    break;
	                case 1:
	                    v0_8 = this.getContext().getString(b.eg);
	                    break;
	                case 2:
	                    v0_8 = this.getContext().getString(b.eh);
	                    break;
	                case 3:
	                    v0_8 = this.getContext().getString(b.ei);
	                    break;
	                default:
	            }
	        }
	        v1_10.setContentDescription(v0_8);
	        return p10;
	    }
	
