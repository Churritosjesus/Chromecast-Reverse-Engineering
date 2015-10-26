.class final Lbsy;
.super Lbun;


# direct methods
.method constructor <init>(Lbsu;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 0

    invoke-direct {p0, p2}, Lbun;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected final synthetic a(Lbwc;)V
    .locals 1

    .prologue
    .line 0
    check-cast p1, Lbue;

    .line 2000
    :try_start_0
    invoke-virtual {p1, p0}, Lbue;->b(Lbwq;)V

    invoke-virtual {p1}, Lbue;->o()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lbuo;

    invoke-interface {v0}, Lbuo;->b()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1000
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const/16 v0, 0x7d1

    invoke-virtual {p0, v0}, Lbsy;->a(I)V

    goto :goto_0
.end method
