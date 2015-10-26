.class final Lcoc;
.super Lcoo;


# virtual methods
.method public final a(Landroid/location/Location;)V
    .locals 2

    const-string v0, "LocationClientHelper"

    const-string v1, "Received a location in client after calling removeLocationUpdates."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
