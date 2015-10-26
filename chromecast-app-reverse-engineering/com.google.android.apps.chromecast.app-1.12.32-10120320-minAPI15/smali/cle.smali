.class public final Lcle;
.super Lcqb;


# instance fields
.field private synthetic a:Lcpq;


# direct methods
.method public constructor <init>(Lcpp;Lcom/google/android/gms/common/api/GoogleApiClient;Lcpq;)V
    .locals 0

    iput-object p3, p0, Lcle;->a:Lcpq;

    invoke-direct {p0, p2}, Lcqb;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected final synthetic a(Lcom/google/android/gms/common/api/Status;)Lbwm;
    .locals 1

    .prologue
    .line 0
    .line 4000
    new-instance v0, Lclf;

    invoke-direct {v0, p0, p1}, Lclf;-><init>(Lcle;Lcom/google/android/gms/common/api/Status;)V

    .line 0
    return-object v0
.end method

.method protected final synthetic a(Lbwc;)V
    .locals 7

    .prologue
    const/4 v4, 0x0

    const/4 v2, 0x0

    .line 0
    move-object v0, p1

    check-cast v0, Lcsa;

    .line 1000
    iget-object v1, p0, Lcle;->a:Lcpq;

    iget-object v1, p0, Lcle;->a:Lcpq;

    move-object v1, p0

    move v3, v2

    move-object v5, v4

    move v6, v2

    invoke-virtual/range {v0 .. v6}, Lcsa;->a(Lbwq;ZZLjava/lang/String;Ljava/lang/String;I)V

    .line 0
    return-void
.end method
