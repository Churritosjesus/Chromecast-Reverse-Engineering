.class final Lcob;
.super Lcol;


# direct methods
.method private a(ILjava/lang/Object;)V
    .locals 2

    const-string v0, "LocationClientHelper"

    const-string v1, "Received a data in client after calling removeLocationUpdates."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/location/LocationAvailability;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lcob;->a(ILjava/lang/Object;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/location/LocationResult;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lcob;->a(ILjava/lang/Object;)V

    return-void
.end method
