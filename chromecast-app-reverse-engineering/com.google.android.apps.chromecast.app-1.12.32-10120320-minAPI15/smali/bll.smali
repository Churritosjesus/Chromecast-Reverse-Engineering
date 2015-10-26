.class final Lbll;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbwg;


# instance fields
.field private synthetic a:Lcom/google/android/gms/common/api/GoogleApiClient;

.field private synthetic b:Lbln;

.field private synthetic c:Lm;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/GoogleApiClient;Lbln;Lm;)V
    .locals 0

    .prologue
    .line 156
    iput-object p1, p0, Lbll;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    iput-object p2, p0, Lbll;->b:Lbln;

    iput-object p3, p0, Lbll;->c:Lm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    .prologue
    .line 181
    invoke-static {}, Lblj;->f()Lblp;

    .line 182
    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 160
    invoke-static {}, Lblj;->f()Lblp;

    .line 163
    :try_start_0
    sget-object v0, Lcni;->b:Lcnd;

    iget-object v2, p0, Lbll;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v0, v2}, Lcnd;->a(Lcom/google/android/gms/common/api/GoogleApiClient;)Landroid/location/Location;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 169
    :goto_0
    iget-object v2, p0, Lbll;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v2}, Lcom/google/android/gms/common/api/GoogleApiClient;->c()V

    .line 170
    if-nez v0, :cond_0

    .line 171
    invoke-static {}, Lblj;->f()Lblp;

    .line 172
    iget-object v0, p0, Lbll;->b:Lbln;

    invoke-interface {v0, v1}, Lbln;->a(Ljava/lang/String;)V

    .line 177
    :goto_1
    return-void

    .line 166
    :catch_0
    move-exception v0

    invoke-static {}, Lblj;->f()Lblp;

    move-object v0, v1

    goto :goto_0

    .line 175
    :cond_0
    new-instance v1, Lblo;

    iget-object v2, p0, Lbll;->c:Lm;

    iget-object v3, p0, Lbll;->b:Lbln;

    invoke-direct {v1, v2, v3}, Lblo;-><init>(Landroid/content/Context;Lbln;)V

    const/4 v2, 0x1

    new-array v2, v2, [Landroid/location/Location;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-virtual {v1, v2}, Lblo;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_1
.end method
