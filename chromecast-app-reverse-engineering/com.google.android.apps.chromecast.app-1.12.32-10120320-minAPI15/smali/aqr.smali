.class final Laqr;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:D

.field private synthetic b:Laqj;


# direct methods
.method constructor <init>(Laqj;D)V
    .locals 0

    .prologue
    .line 347
    iput-object p1, p0, Laqr;->b:Laqj;

    iput-wide p2, p0, Laqr;->a:D

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 351
    :try_start_0
    sget-object v0, Lbsr;->b:Lbsu;

    iget-object v1, p0, Laqr;->b:Laqj;

    iget-object v1, v1, Laqj;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    iget-wide v2, p0, Laqr;->a:D

    invoke-virtual {v0, v1, v2, v3}, Lbsu;->a(Lcom/google/android/gms/common/api/GoogleApiClient;D)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 355
    :goto_0
    return-void

    .line 352
    :catch_0
    move-exception v0

    .line 353
    invoke-static {}, Laqj;->h()Lblp;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    goto :goto_0
.end method
