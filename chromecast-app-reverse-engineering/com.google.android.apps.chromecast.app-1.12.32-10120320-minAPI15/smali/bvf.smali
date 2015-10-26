.class public Lbvf;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 5000
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/GoogleApiClient;)Lbwj;
    .locals 1

    .prologue
    .line 2000
    new-instance v0, Lcji;

    invoke-direct {v0, p0, p1}, Lcji;-><init>(Lbvf;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lbwp;)Lbwp;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/GoogleApiClient;Lbve;)V
    .locals 1

    .prologue
    .line 4000
    new-instance v0, Lcjh;

    invoke-direct {v0, p0, p1, p2}, Lcjh;-><init>(Lbvf;Lcom/google/android/gms/common/api/GoogleApiClient;Lbve;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lbwp;)Lbwp;

    return-void
.end method

.method public b(Lcom/google/android/gms/common/api/GoogleApiClient;)Lbwj;
    .locals 1

    .prologue
    .line 3000
    new-instance v0, Lcjj;

    invoke-direct {v0, p0, p1}, Lcjj;-><init>(Lbvf;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lbwp;)Lbwp;

    move-result-object v0

    return-object v0
.end method

.method public startMirroring(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Landroid/app/PendingIntent;)Lbwj;
    .locals 1

    .prologue
    .line 1000
    new-instance v0, Lcjg;

    invoke-direct {v0, p0, p1, p2, p3}, Lcjg;-><init>(Lbvf;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Landroid/app/PendingIntent;)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lbwp;)Lbwp;

    move-result-object v0

    return-object v0
.end method
