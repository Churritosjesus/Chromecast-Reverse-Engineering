.class final Laqp;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Z

.field private synthetic b:Laqj;


# direct methods
.method constructor <init>(Laqj;Z)V
    .locals 0

    .prologue
    .line 317
    iput-object p1, p0, Laqp;->b:Laqj;

    iput-boolean p2, p0, Laqp;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 321
    iget-boolean v0, p0, Laqp;->a:Z

    if-eqz v0, :cond_0

    .line 322
    iget-object v0, p0, Laqp;->b:Laqj;

    invoke-static {v0}, Laqj;->c(Laqj;)Lbtl;

    move-result-object v0

    iget-object v1, p0, Laqp;->b:Laqj;

    iget-object v1, v1, Laqj;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 2000
    new-instance v2, Lbtp;

    invoke-direct {v2, v0, v1, v1, v3}, Lbtp;-><init>(Lbtl;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lbwp;)Lbwp;

    move-result-object v0

    .line 326
    :goto_0
    new-instance v1, Laqq;

    invoke-direct {v1, p0}, Laqq;-><init>(Laqp;)V

    invoke-interface {v0, v1}, Lbwj;->a(Lbwn;)V

    .line 339
    return-void

    .line 324
    :cond_0
    iget-object v0, p0, Laqp;->b:Laqj;

    invoke-static {v0}, Laqj;->c(Laqj;)Lbtl;

    move-result-object v0

    iget-object v1, p0, Laqp;->b:Laqj;

    iget-object v1, v1, Laqj;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 4000
    new-instance v2, Lbto;

    invoke-direct {v2, v0, v1, v1, v3}, Lbto;-><init>(Lbtl;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lbwp;)Lbwp;

    move-result-object v0

    goto :goto_0
.end method
