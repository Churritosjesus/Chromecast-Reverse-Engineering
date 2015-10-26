.class final Laqs;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Laqj;


# direct methods
.method constructor <init>(Laqj;)V
    .locals 0

    .prologue
    .line 361
    iput-object p1, p0, Laqs;->a:Laqj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 365
    :try_start_0
    iget-object v0, p0, Laqs;->a:Laqj;

    invoke-static {v0}, Laqj;->b(Laqj;)Laow;

    move-result-object v0

    sget-object v1, Lbsr;->b:Lbsu;

    iget-object v2, p0, Laqs;->a:Laqj;

    iget-object v2, v2, Laqj;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-virtual {v1, v2}, Lbsu;->c(Lcom/google/android/gms/common/api/GoogleApiClient;)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Laow;->a(D)V

    .line 366
    invoke-static {}, Laqj;->h()Lblp;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Laqs;->a:Laqj;

    .line 367
    invoke-static {v2}, Laqj;->b(Laqj;)Laow;

    move-result-object v2

    invoke-virtual {v2}, Laow;->g()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Laqs;->a:Laqj;

    invoke-static {v2}, Laqj;->b(Laqj;)Laow;

    move-result-object v2

    invoke-virtual {v2}, Laow;->o()Latu;

    move-result-object v2

    invoke-virtual {v2}, Latu;->a()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 372
    :goto_0
    return-void

    .line 368
    :catch_0
    move-exception v0

    .line 370
    invoke-static {}, Laqj;->h()Lblp;

    move-result-object v1

    const-string v2, "Got unexpected error calling getVolume: %s"

    new-array v3, v5, [Ljava/lang/Object;

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
