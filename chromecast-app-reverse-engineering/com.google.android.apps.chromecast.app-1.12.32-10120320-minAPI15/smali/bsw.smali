.class final Lbsw;
.super Lbte;


# instance fields
.field private synthetic a:Ljava/lang/String;


# direct methods
.method constructor <init>(Lbsu;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;)V
    .locals 0

    iput-object p3, p0, Lbsw;->a:Ljava/lang/String;

    invoke-direct {p0, p2}, Lbte;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected final synthetic a(Lbwc;)V
    .locals 3

    .prologue
    .line 0
    check-cast p1, Lbue;

    .line 1000
    :try_start_0
    iget-object v1, p0, Lbsw;->a:Ljava/lang/String;

    .line 2000
    invoke-virtual {p1, p0}, Lbue;->a(Lbwq;)V

    invoke-virtual {p1}, Lbue;->o()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lbuo;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lbuo;->a(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1000
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const/16 v0, 0x7d1

    invoke-virtual {p0, v0}, Lbsw;->a(I)V

    goto :goto_0
.end method
