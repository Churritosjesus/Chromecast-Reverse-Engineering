.class public Lcnd;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3000
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/location/Location;
    .locals 1

    .prologue
    .line 1000
    invoke-static {p1}, Lcni;->a(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcod;

    move-result-object v0

    .line 2000
    :try_start_0
    iget-object v0, v0, Lcod;->b:Lcoa;

    invoke-virtual {v0}, Lcoa;->a()Landroid/location/Location;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 1000
    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method
