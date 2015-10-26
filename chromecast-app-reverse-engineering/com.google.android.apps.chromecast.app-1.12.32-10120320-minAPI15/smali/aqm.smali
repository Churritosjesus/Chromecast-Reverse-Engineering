.class final Laqm;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Laqj;


# direct methods
.method constructor <init>(Laqj;)V
    .locals 0

    .prologue
    .line 262
    iput-object p1, p0, Laqm;->a:Laqj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 265
    invoke-static {}, Laqj;->h()Lblp;

    new-array v0, v6, [Ljava/lang/Object;

    iget-object v1, p0, Laqm;->a:Laqj;

    invoke-static {v1}, Laqj;->b(Laqj;)Laow;

    move-result-object v1

    invoke-virtual {v1}, Laow;->g()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v5

    .line 268
    :try_start_0
    sget-object v0, Lbsr;->b:Lbsu;

    iget-object v1, p0, Laqm;->a:Laqj;

    iget-object v1, v1, Laqj;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    iget-object v2, p0, Laqm;->a:Laqj;

    .line 269
    invoke-static {v2}, Laqj;->c(Laqj;)Lbtl;

    move-result-object v2

    invoke-virtual {v2}, Lbtl;->c()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Laqm;->a:Laqj;

    invoke-static {v3}, Laqj;->c(Laqj;)Lbtl;

    move-result-object v3

    .line 268
    invoke-virtual {v0, v1, v2, v3}, Lbsu;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Lbtd;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 274
    :goto_0
    iget-object v0, p0, Laqm;->a:Laqj;

    invoke-static {v0}, Laqj;->c(Laqj;)Lbtl;

    move-result-object v0

    new-instance v1, Laqn;

    invoke-direct {v1, p0}, Laqn;-><init>(Laqm;)V

    .line 1000
    iput-object v1, v0, Lbtl;->d:Lbtq;

    .line 288
    iget-object v0, p0, Laqm;->a:Laqj;

    invoke-static {v0}, Laqj;->c(Laqj;)Lbtl;

    move-result-object v0

    new-instance v1, Laqo;

    invoke-direct {v1, p0}, Laqo;-><init>(Laqm;)V

    .line 2000
    iput-object v1, v0, Lbtl;->e:Lbtr;

    .line 302
    iget-object v0, p0, Laqm;->a:Laqj;

    invoke-static {v0}, Laqj;->c(Laqj;)Lbtl;

    move-result-object v0

    iget-object v1, p0, Laqm;->a:Laqj;

    iget-object v1, v1, Laqj;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 3000
    new-instance v2, Lbtn;

    invoke-direct {v2, v0, v1, v1}, Lbtn;-><init>(Lbtl;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lbwp;)Lbwp;

    .line 303
    return-void

    .line 270
    :catch_0
    move-exception v0

    .line 271
    invoke-static {}, Laqj;->h()Lblp;

    move-result-object v1

    const-string v2, "Exception while creating media channel for %s: %s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Laqm;->a:Laqj;

    .line 272
    invoke-static {v4}, Laqj;->b(Laqj;)Laow;

    move-result-object v4

    invoke-virtual {v4}, Laow;->g()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    aput-object v0, v3, v6

    .line 271
    invoke-virtual {v1, v2, v3}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
