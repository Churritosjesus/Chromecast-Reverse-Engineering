.class public final Lcji;
.super Lcjl;


# direct methods
.method public constructor <init>(Lbvf;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcjl;-><init>(Lbvf;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected final synthetic a(Lbwc;)V
    .locals 2

    .prologue
    .line 0
    check-cast p1, Lcjr;

    .line 1000
    new-instance v1, Lcjn;

    invoke-direct {v1, p0}, Lcjn;-><init>(Lcjl;)V

    .line 2000
    invoke-virtual {p1}, Lcjr;->o()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcjw;

    invoke-interface {v0, v1}, Lcjw;->a(Lcjt;)V

    .line 0
    return-void
.end method
